/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.configration<br>
 * File name is SecurityConfig.java<br>
 *
 * @author YeonGyu Yang
 * @since 2016. 2. 6.
 */
package com.faveroomies.configration;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 
 * @author YeonGyu Yang
 * @Since 2016. 2. 6.
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/", "/register/**").permitAll().anyRequest().authenticated().and()
				.formLogin().loginPage("/login").defaultSuccessUrl("/").permitAll().and().logout().logoutSuccessUrl("/")
				.permitAll().and().csrf().disable();

	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder())
				.usersByUsernameQuery("select username, password, enabled from auth where username = ?")
				.authoritiesByUsernameQuery("select username, role from auth where username = ?");

	}

	@Bean
	public PasswordEncoder passwordEncoder() {

		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;

	}
}