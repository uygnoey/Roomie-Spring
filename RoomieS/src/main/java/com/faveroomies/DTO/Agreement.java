/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is AgreementInterface.java<br>
 *
 * @author YeonGyu Yang
 * @since Apr 1, 2016
 */
package com.faveroomies.DTO;

/**
 * 
 * @author YeonGyu Yang
 * @Since Apr 1, 2016
 *
 */
public interface Agreement {

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
	 * @return the cNum
	 */
	public int getcNum();

	/**
	 * @param cNum
	 *            the cNum to set
	 */
	public void setcNum(int cNum);

	/**
	 * @return the aAgreement
	 */
	public String getaAgreement();

	/**
	 * @param aAgreement
	 *            the aAgreement to set
	 */
	public void setaAgreement(String aAgreement);

	/**
	 * @return the aDate
	 */
	public String getaDate();

	/**
	 * @param aDate
	 *            the aDate to set
	 */
	public void setaDate(String aDate);
	
}
