/**
 * <p>Project name is RoomieS<br>
 * Package name is com.faveroomies.configration<br>
 * File name is MailConfig.java<br>
 *
 * @author YeonGyu Yang
 * @since May 4, 2016
 */
package com.faveroomies.configration;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * 
 * @author YeonGyu Yang
 * @Since May 4, 2016
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MailConfig {

	@Value("${spring.mail.host")
	String host;
	@Value("${spring.mail.protocol}")
	String protocol;
	@Value("${spring.mail.username}")
	String username;
	@Value("${spring.mail.password}")
	String password;
	@Value("${spring.mail.port}")
	int port;
	@Value("${spring.mail.default-encoding}")
	String encoding;

	@Bean
	public JavaMailSender javaMailSender() {

		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", true);
		
		mailSender.setJavaMailProperties(properties);
		mailSender.setDefaultEncoding(encoding);
		mailSender.setHost(host);
		mailSender.setPort(port);
		mailSender.setProtocol(protocol);
		mailSender.setUsername(username);
		mailSender.setPassword(password);
		
		return mailSender;
		
	}

}
