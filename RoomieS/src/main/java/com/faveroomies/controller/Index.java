/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.controller<br>
 * File name is IndexCon.java<br>
 *
 * @author YeonGyu Yang
 * @since 2016. 2. 15.
 */
package com.faveroomies.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author YeonGyu Yang
 * @Since 2016. 2. 15.
 *
 */
@Controller
public class Index {

	private Logger logger = LoggerFactory.getLogger(Index.class);

	@RequestMapping("/")
	public String index(Model model) {

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			logger.info(((UserDetails) principal).getUsername() + " login success.\nPage is index");
			return "indexlogined";
		} else {
			logger.info("Page is index");
			return "index";
		}

	}
}