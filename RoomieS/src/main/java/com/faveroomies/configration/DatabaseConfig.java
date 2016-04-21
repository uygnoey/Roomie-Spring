/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.configration<br>
 * File name is DatabaseConfig.java<br>
 *
 * @author YeonGyu Yang
 * @since 2016. 2. 6.
 */
package com.faveroomies.configration;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 
 * @author YeonGyu Yang
 * @Since 2016. 2. 6.
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class DatabaseConfig extends WebMvcConfigurerAdapter {

	@Value("${spring.datasource.driver-class-name}")
	private String dbDriverClassName;

	@Value("${spring.datasource.url}")
	private String dbUrl;

	@Value("${spring.datasource.username}")
	private String dbUsername;

	@Value("${spring.datasource.password}")
	private String dbPassword;

	@Bean
	public DataSource datasource() {

		DataSource dataSource = new DataSource();
		dataSource.setDriverClassName(dbDriverClassName);
		dataSource.setUrl(dbUrl);
		dataSource.setUsername(dbUsername);
		dataSource.setPassword(dbPassword);

		return dataSource;
	}

}
