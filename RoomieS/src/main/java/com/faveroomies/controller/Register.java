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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.faveroomies.DTO.RoomieImpl;
import com.faveroomies.mail.EmailNotificationService;
import com.faveroomies.mapper.RegisterMapper;
import com.faveroomies.security.CodeGenerator;
import com.faveroomies.security.Encrypt;

/**
 * 
 * @author YeonGyu Yang
 * @Since Mar 4, 2016
 *
 */
@Controller
@MapperScan("com.faveroomies.mapper")
public class Register {

	@Autowired
	private RegisterMapper registerMapper;

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
	public String register(RoomieImpl roomie, Model model) {

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
	public String regProcess(@Validated RoomieImpl roomie, BindingResult bindingResult, Locale locale,
			ModelMap modelMap, HttpServletRequest req) {

		logger.info("Register Process");
		logger.info(roomie.getmUser() + " // " + roomie.getmEmail() + " // " + encrypt.encrypt(roomie.getmPassword()));

		HttpSession session = req.getSession();

		logger.info(session.getAttributeNames().toString());

		if (bindingResult.hasErrors()) {
			return "register";
		} else if (registerMapper.insertRoomie(roomie.getmUser().trim(), roomie.getmEmail().trim(),

				encrypt.encrypt(roomie.getmPassword().trim())) > 0) {

			String regiCode = codeGenerator.generator();

			session.setAttribute(roomie.getmUser().trim(), regiCode);

			logger.info("Roomie : " + roomie + " roomie values " + roomie.getmUser().trim() + " // "
					+ roomie.getmEmail().trim() + " code : " + regiCode);

			emailNotification.register(roomie, regiCode, locale);

			modelMap.addAttribute("userinfo", roomie);
			return "register_s";

		} else {
			return "register";
		}

	}

	/**
	 * 
	 * 아이디 회원가입 후 이메일 인증 UR 인증 성공 시 성공 페이지 띄우고 로그인 페이지로 리다이렉트<br>
	 * 실패시 인증 실패 메세지 표시와 함께 인증코드 입력란 표시 및 인증코드 재발송
	 * 
	 * @author YeonGyu Yang
	 * @Since Jun 18, 2016
	 *
	 * @param code
	 * @param id
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "/confirm/{code}/{id}", method = RequestMethod.GET)
	public String confirm(@PathVariable("code") String code, @PathVariable("id") String id, HttpServletRequest req) {

		logger.info("Confirm Page");

		HttpSession session = req.getSession();

		String sessionCode = session.getAttribute(id).toString();

		if (sessionCode == code) {
			
			registerMapper.updateConfirm(id);

			return "confirm_s";

		} else
			return "confirm_f";

	}

}