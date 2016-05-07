/**
 * <p>Project name is RoomieS<br>
 * Package name is com.faveroomies.form<br>
 * File name is RegisterForm.java<br>
 *
 * @author YeonGyu Yang
 * @since May 5, 2016
 */
package com.faveroomies.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/**
 * 
 * @author YeonGyu Yang
 * @Since May 5, 2016
 *
 */
public class RegisterForm {
	
	@Size(min = 4, max = 30)
	@NotNull
	private String username;

	@NotNull
	@Email
	private String email;

	@NotNull
	@Size(min=6, message="{password.length.error}")
	@Pattern.List({ @Pattern(regexp = "(?=.*[0-9]).+", message = "{password.num.error}"),
			@Pattern(regexp = "(?=.*[a-z]).+", message = "{password.lower.error}"),
			@Pattern(regexp = "(?=.*[A-Z]).+", message = "{password.upper.error}"),
			@Pattern(regexp = "(?=.*[!@#$%^&*+=?-_()/\"\\.,<>~`;:]).+", message = "{password.special.error}"),
			@Pattern(regexp = "(?=\\S+$).+", message = "{password.space.error") })
	private String password;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
