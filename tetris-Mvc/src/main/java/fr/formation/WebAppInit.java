package fr.formation;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import fr.formation.config.ApiConfig;
import fr.formation.config.DAOConfig;



public class WebAppInit implements WebApplicationInitializer {
	
	@Override
	public void onStartup (ServletContext container) {
		// D�claration des classes de configuration
		AnnotationConfigWebApplicationContext myContext = new AnnotationConfigWebApplicationContext();
		AnnotationConfigWebApplicationContext myWebContext = new AnnotationConfigWebApplicationContext();
		
		myContext.register(DAOConfig.class);
		myWebContext.register(WebConfig.class);
		
		// D�claration de l'�couteur Spring pour charger le context
		container.addListener(new ContextLoaderListener(myContext));
		
		// D�claration de la Servlet DispatcherServlet
		DispatcherServlet dispatcherServlet = new DispatcherServlet(myWebContext);
		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", dispatcherServlet);
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
		
		// D�claration des classes de configuration
		AnnotationConfigWebApplicationContext myApiContext = new AnnotationConfigWebApplicationContext();
		myApiContext.register(ApiConfig.class);
		// D�claration de la Servlet DispatcherServlet REST
		DispatcherServlet apiServlet = new DispatcherServlet(myApiContext);
		ServletRegistration.Dynamic api = container.addServlet("api", apiServlet);
		api.setLoadOnStartup(2);
		api.addMapping("/api/*");
	}

}
