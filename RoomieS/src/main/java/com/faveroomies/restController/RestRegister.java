/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.restController<br>
 * File name is Register.java<br>
 *
 * @author YeonGyu Yang
 * @since Apr 1, 2016
 */
package com.faveroomies.restController;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.faveroomies.form.RegisterForm;
import com.faveroomies.mapper.RoomieMapper;

/**
 * 
 * @author YeonGyu Yang
 * @Since Apr 1, 2016
 *
 */
@RestController
@MapperScan("life.theroomie.mapper")
public class RestRegister {

	private Logger logger = LoggerFactory.getLogger(RestRegister.class);

	@Autowired
	private RoomieMapper roomieMapper;

	@RequestMapping(value = "/register/overlap", params = "username")
	public boolean usernameOverlap(@Param("username") String username) {

		logger.info("Username Overlap Check");

		int overlapCount = roomieMapper.countUser(username);

		if (overlapCount > 0 || username.length() <= 4)
			return true;
		else
			return false;

	}

	@RequestMapping(value = "/register/overlap", params = "email")
	public boolean emailOverlap(@Validated RegisterForm registerForm, BindingResult bindingResult, ModelMap modelMap) {

		logger.info("Eamil Overlap Check");

		int overlapCount = 0;

		if (registerForm.getEmail().trim().split("[+]").length > 1 && registerForm.getEmail().trim().length() > 0) {
			logger.info(registerForm.getEmail().trim().split("[+]")[0]);
			overlapCount = roomieMapper.countEmail(registerForm.getEmail().trim().split("[+]")[0] + "%");
			logger.info(((Integer) overlapCount).toString());
		} else if (registerForm.getEmail().trim().length() > 0) {
			overlapCount = roomieMapper.countEmail(registerForm.getEmail().trim() + "%");
			logger.info(((Integer) overlapCount).toString());
		}

		if (overlapCount > 0 || registerForm.getEmail().trim().split("[@]").length <= 1)
			return true;
		else
			return false;

	}

	@RequestMapping(value = "/register/validate", method = RequestMethod.POST)
	public boolean regProcess(@Validated RegisterForm registerForm, BindingResult bindingResult) {

		logger.info("Register Validated");

		if (bindingResult.hasErrors()) {
			return false;
		} else
			return true;

	}

}
