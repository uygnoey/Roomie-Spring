/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.controller<br>
 * File name is Register.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 4, 2016
 */
package com.faveroomies.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.faveroomies.DTO.Roomie;
import com.faveroomies.mapper.RoomieMapper;
import com.faveroomies.security.Encrypt;

/**
 * 
 * @author YeonGyu Yang
 * @Since Mar 4, 2016
 *
 */
@Controller
@MapperScan("life.theroomie.mapper")
public class Register {

	@Autowired
	private RoomieMapper roomieMapper;
	
	private Encrypt encrypt = new Encrypt();

	private Logger logger = LoggerFactory.getLogger(Register.class);

	/**
	 * Register Page Contoller
	 * 
	 * @author YeonGyu Yang
	 * @Since Mar 16, 2016
	 *
	 * @param model
	 * @return {@link String}
	 */
	@RequestMapping("/register")
	public String register(Model model) {

		logger.info("Register page");

		return "register";

	}

	/**
	 * <p>
	 * Get register form informations and if register success, send a mail for
	 * confirm.
	 * 
	 * @author YeonGyu Yang
	 * @Since Mar 16, 2016
	 *
	 * @param roomie
	 * @return
	 */
	@RequestMapping(value = "/register/process")
	public String regProcess(@RequestBody Roomie roomie, ModelMap modelMap, HttpServletRequest req) {

		logger.info("Register Process");
		logger.debug(roomie.getmUser() + " // " + roomie.getmEmail() + " // " + roomie.getmPassword());

		String page = null;

		HttpSession session = req.getSession();
		
		if (roomieMapper.insertRoomie(roomie.getmUser(), roomie.getmEmail(), roomie.getmPassword()) > 0) {
			
			String regiCode = encrypt.encrypt(roomie.getmEmail()+roomie.getmUser());
			
			session.setAttribute("regiCode", regiCode);
			
			
			
			modelMap.addAttribute("userinfo", roomie);
			page = "signupssuccess";

		} else {
			page = "singupfailed";
		}

		return page;
	}

}
