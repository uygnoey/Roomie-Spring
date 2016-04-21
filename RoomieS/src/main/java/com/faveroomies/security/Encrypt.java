/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.security<br>
 * File name is EncryptSth.java<br>
 *
 * @author YeonGyu Yang
 * @since 2016. 2. 6.
 */
package life.theroomie.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 
 * @author YeonGyu Yang
 * @Since 2016. 2. 6.
 *
 */
public class EncryptSth {

	public String encrypt(String str) {

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

		return passwordEncoder.encode(str);

	}
}
