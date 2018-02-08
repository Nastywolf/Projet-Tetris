package fr.formation;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class SecurityFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String myProjectPath = req.getContextPath();
		String myPath = req.getServletPath().replaceAll(myProjectPath, "/");

		
		// Si pas connecté
		if (req.getSession().getAttribute("login") == null) {
			// Si ni "assets" ni "page de login"
			if (!myPath.startsWith("/home") && !myPath.startsWith("/connexion")) {
				resp.sendRedirect(myProjectPath + "/connexion");
				return;
			}
		}

		// Si tout va bien, on autorise
		chain.doFilter(request, response);
	}
}