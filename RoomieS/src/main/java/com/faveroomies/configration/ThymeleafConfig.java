/**
 * <p>Project name is RoomieS<br>
 * Package name is com.faveroomies.configration<br>
 * File name is ThymeleafConfig.java<br>
 *
 * @author YeonGyu Yang
 * @since May 6, 2016
 */
package com.faveroomies.configration;

import static com.faveroomies.configration.SpringWebInitializer.ENCODING;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.messageresolver.IMessageResolver;
import org.thymeleaf.messageresolver.StandardMessageResolver;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * 
 * @author YeonGyu Yang
 * @Since May 6, 2016
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.faveroomies")
public class ThymeleafConfig extends WebMvcConfigurerAdapter {
	
	/**
	 * THYMELEAF: View Resolver - implementation of Spring's ViewResolver
	 * interface. (we would not need this if our app was not web)
	 */
	/*@Bean
	public ViewResolver viewResolver() {
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine());
		viewResolver.setCharacterEncoding(ENCODING);
		return viewResolver;
	}*/

	/**
	 * THYMELEAF: Template Engine (Spring4-specific version).
	 */
	/*@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.addTemplateResolver(emailTemplateResolver());
		//templateEngine.addTemplateResolver(webTemplateResolver());
		return templateEngine;
	}*/

	/**
	 * THYMELEAF: Template Resolver for email templates.
	 */
	/*private TemplateResolver emailTemplateResolver() {
		TemplateResolver templateResolver = new ClassLoaderTemplateResolver();
		templateResolver.setPrefix("classpath:mail/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML5");
		templateResolver.setCharacterEncoding(ENCODING);
		templateResolver.setOrder(1);
		// Template cache is true by default. Set to false if you want
		// templates to be automatically updated when modified.
		templateResolver.setCacheable(false);
		
		return templateResolver;
	}*/

	/**
	 * THYMELEAF: Template Resolver for webapp pages. (we would not need this if
	 * our app was not web)
	 * 
	 * spring.thymeleaf.cache=true spring.thymeleaf.check-template-location=true
	 * spring.thymeleaf.content-type=text/html spring.thymeleaf.enabled=true
	 * spring.thymeleaf.encoding=UTF-8 spring.thymeleaf.mode=HTML5
	 * spring.thymeleaf.prefix=classpath:/templates/
	 * spring.thymeleaf.suffix=.html
	 */
	/*private TemplateResolver webTemplateResolver() {
		TemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setPrefix("classpath:templates/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML5");
		templateResolver.setCharacterEncoding(ENCODING);
		templateResolver.setOrder(2);
		// Template cache is true by default. Set to false if you want
		// templates to be automatically updated when modified.
		templateResolver.setCacheable(false);
		
		return templateResolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// Use Spring servlet to serve static resources
		registry.addResourceHandler("/**").addResourceLocations("/");
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		registry.addResourceHandler("/swf/**").addResourceLocations("/swf/");
	}

	@Bean
	public IMessageResolver messageResolver() {
		return new StandardMessageResolver();
	}*/

}
