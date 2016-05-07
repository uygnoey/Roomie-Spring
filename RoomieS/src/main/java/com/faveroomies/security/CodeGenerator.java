/**
 * <p>Project name is RoomieS<br>
 * Package name is com.faveroomies.security<br>
 * File name is ConfirmationCode.java<br>
 *
 * @author YeonGyu Yang
 * @since May 6, 2016
 */
package com.faveroomies.security;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author YeonGyu Yang
 * @Since May 6, 2016
 *
 */
public class CodeGenerator {

	private Logger logger = LoggerFactory.getLogger(CodeGenerator.class);

	private Random r = new Random();
	private StringBuffer code = new StringBuffer();

	public String generator() {

		logger.info("Code Generator");

		int type = 0;

		for (int i = 0; i <= 12; i++) {
			type = r.nextInt(3);

			// Upper
			if (type == 0) {
				logger.info("Type : Upper letters");
				code.append((char) (65 + r.nextInt(25)));
			} else if (type == 1) { // Lower
				logger.info("Type : Lower letters");
				code.append((char) (97 + r.nextInt(25)));
			} else if (type == 2) {// Number
				logger.info("Type : Number");
				code.append(r.nextInt(10));
			}
			
			logger.info("Code : " + code.toString());
		}
		
		return code.toString();

	}

}
