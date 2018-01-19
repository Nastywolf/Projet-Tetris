package fr.formation.config;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ComponentScan({ "fr.formation.tetris_dao","fr.formation.tetris_model_tetrimino","fr.formation.tetris_model_authentification","fr.formation.tetris_model_faq"})
@PropertySource( "classpath:data-source.properties")
@EnableAspectJAutoProxy
@EnableTransactionManagement
@EnableJpaRepositories({"fr.formation.tetris_dao","fr.formation.tetris_model_tetrimino","fr.formation.tetris_model_authentification","fr.formation.tetris_model_faq"})
public class DAOConfig {
	
	@Autowired
	private Environment env;
	
	
	@Bean("dataSource")
	public BasicDataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		
		dataSource.setDriverClassName(env.getProperty("sql.driver"));
		dataSource.setUrl(env.getProperty("sql.url"));
		dataSource.setUsername(env.getProperty("sql.username"));
		dataSource.setPassword(env.getProperty("sql.password"));
		dataSource.setMaxTotal(env.getProperty("sql.maxTotal", Integer.class));
		
		return dataSource;
	}
	
	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "true");
		properties.setProperty("hibernate.cache.use_second_level_cache", "true");
		properties.setProperty("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory");
		properties.setProperty("hibernate.cache.use_query_cache", "true");
		return properties;
		}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(BasicDataSource dataSource)
	{
	LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
	emf.setDataSource(dataSource);
	emf.setPackagesToScan("fr.formation.tetris_dao","fr.formation.tetris_model_tetrimino","fr.formation.tetris_model_authentification","fr.formation.tetris_model_faq");
	JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	emf.setJpaVendorAdapter(vendorAdapter);
	emf.setJpaProperties(this.hibernateProperties());
	return emf;
	}
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
	JpaTransactionManager transactionManager = new JpaTransactionManager();
	transactionManager.setEntityManagerFactory(emf);
	return transactionManager;
	}
	
	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
	return new PersistenceExceptionTranslationPostProcessor();
	}
	
//	@Bean
//	public Connection getConn() {
//		try {
//			return this.dataSource().getConnection();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
}
