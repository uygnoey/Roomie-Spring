/**
 * <p>Project name is RoomieS<br>
 * Package name is com.faveroomies.configration<br>
 * File name is SpringWebInitializer.java<br>
 *
 * @author YeonGyu Yang
 * @since May 6, 2016
 */
package com.faveroomies.configration;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 
 * @author YeonGyu Yang
 * @Since May 6, 2016
 *
 */
public class SpringWebInitializer implements WebApplicationInitializer {

    public static final String ENCODING = "UTF-8";

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(ThymeleafConfig.class);
		context.register(WebConfig.class);
		context.setServletContext(servletContext);
        configureSpringMvcFrontController(servletContext, context);
        configureEncodingFilter(servletContext);
	}
    
    private void configureSpringMvcFrontController(ServletContext servletContext, WebApplicationContext context) {
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
    }

    private void configureEncodingFilter(ServletContext servletContext) {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding(ENCODING);
        encodingFilter.setForceEncoding(true);
        FilterRegistration.Dynamic filterRegistration = servletContext.addFilter("encodingFilter", encodingFilter);
        filterRegistration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
   }

}
