/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is Authenticated.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 16, 2016
 */
package com.faveroomies.DTO;

/**
 * <p>
 * Authenticated DTO<br>
 * aNum INT NOT NULL AUTO_INCREMENT,<br>
 * aAuth VARCHAR(100) NOT NULL<br>
 * 
 * @author YeonGyu Yang
 * @Since Mar 16, 2016
 *
 */
public class AuthenticatedImpl implements Authenticated{

	private int aNum;
	private String aAuth;

	/**
	 * @return the aNum
	 */
	public int getaNum() {
		return aNum;
	}

	/**
	 * @param aNum
	 *            the aNum to set
	 */
	public void setaNum(int aNum) {
		this.aNum = aNum;
	}

	/**
	 * @return the aAuth
	 */
	public String getaAuth() {
		return aAuth;
	}

	/**
	 * @param aAuth
	 *            the aAuth to set
	 */
	public void setaAuth(String aAuth) {
		this.aAuth = aAuth;
	}
	
	
}
