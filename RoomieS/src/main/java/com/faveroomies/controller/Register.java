/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.controller<br>
 * File name is Register.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 4, 2016
 */
package com.faveroomies.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.faveroomies.form.RegisterForm;
import com.faveroomies.mail.EmailNotificationService;
import com.faveroomies.mapper.RoomieMapper;
import com.faveroomies.security.CodeGenerator;
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

	@Autowired
	private EmailNotificationService emailNotification;
	
	private CodeGenerator codeGenerator = new CodeGenerator();
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
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(RegisterForm registerForm, Model model) {

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
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String regProcess(@Validated RegisterForm registerForm, BindingResult bindingResult, ModelMap modelMap,
			HttpServletRequest req) {

		logger.info("Register Process");
		logger.info(
				registerForm.getUsername() + " // " + registerForm.getEmail() + " // " + registerForm.getPassword());

		HttpSession session = req.getSession();

		logger.info(session.getAttributeNames().toString());
		
		if (bindingResult.hasErrors()) {
            return "register";
        }else if (roomieMapper.insertRoomie(registerForm.getUsername().trim(), registerForm.getEmail().trim(),
			
			encrypt.encrypt(registerForm.getPassword().trim())) > 0) {

			String regiCode = codeGenerator.generator();

			session.setAttribute(registerForm.getUsername().trim(), regiCode);

			logger.info("Roomie : " + registerForm + "roomie values" + registerForm.getUsername().trim() + " // "
					+ registerForm.getEmail().trim() + " code : " + regiCode);

			//emailNotification.register(registerForm, regiCode, locale);

			modelMap.addAttribute("userinfo", registerForm);
			return "register_s";

		} else {
			return "register";
		}

	}

}
