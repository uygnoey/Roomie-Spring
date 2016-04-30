/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is RoomContractInterface.java<br>
 *
 * @author YeonGyu Yang
 * @since Apr 4, 2016
 */
package com.faveroomies.DTO;

/**
 * 
 * @author YeonGyu Yang
 * @Since Apr 4, 2016
 *
 */
public interface RoomContract {

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
	 * @return the rNum
	 */
	public int getrNum();

	/**
	 * @param rNum
	 *            the rNum to set
	 */
	public void setrNum(int rNum);

	/**
	 * @return the mNum
	 */
	public int getmNum();

	/**
	 * @param mNum
	 *            the mNum to set
	 */
	public void setmNum(int mNum);

	/**
	 * @return the cDeposit
	 */
	public int getcDeposit();

	/**
	 * @param cDeposit
	 *            the cDeposit to set
	 */
	public void setcDeposit(int cDeposit);

	/**
	 * @return the cRental
	 */
	public int getcRental();

	/**
	 * @param cRental
	 *            the cRental to set
	 */
	public void setcRental(int cRental);

	/**
	 * @return the cStartDate
	 */
	public String getcStartDate();

	/**
	 * @param cStartDate
	 *            the cStartDate to set
	 */
	public void setcStartDate(String cStartDate);

	/**
	 * @return the cEndDate
	 */
	public String getcEndDate();

	/**
	 * @param cEndDate
	 *            the cEndDate to set
	 */
	public void setcEndDate(String cEndDate);

}
