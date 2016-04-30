/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is AuthenticatedInterface.java<br>
 *
 * @author YeonGyu Yang
 * @since Apr 2, 2016
 */
package com.faveroomies.DTO;

/**
 * 
 * @author YeonGyu Yang
 * @Since Apr 2, 2016
 *
 */
public interface Authenticated {

	/**
	 * @return the aNum
	 */
	public int getaNum();

	/**
	 * @param aNum
	 *            the aNum to set
	 */
	public void setaNum(int aNum);

	/**
	 * @return the aAuth
	 */
	public String getaAuth();

	/**
	 * @param aAuth
	 *            the aAuth to set
	 */
	public void setaAuth(String aAuth);
	
}
