/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.security<br>
 * File name is EncryptSth.java<br>
 *
 * @author YeonGyu Yang
 * @since 2016. 2. 6.
 */
package com.faveroomies.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 
 * @author YeonGyu Yang
 * @Since 2016. 2. 6.
 *
 */
public class Encrypt {

	public String encrypt(String string) {

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

		return passwordEncoder.encode(string);

	}
}
