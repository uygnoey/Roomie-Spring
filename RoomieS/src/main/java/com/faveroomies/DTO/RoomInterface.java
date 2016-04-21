/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is RoomInterface.java<br>
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
public interface RoomInterface {

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
	 * @return the hNum
	 */
	public int gethNum();

	/**
	 * @param hNum
	 *            the hNum to set
	 */
	public void sethNum(int hNum);

	/**
	 * @return the rDeposit
	 */
	public int getrDeposit();

	/**
	 * @param rDeposit
	 *            the rDeposit to set
	 */
	public void setrDeposit(int rDeposit);

	/**
	 * @return the rRental
	 */
	public int getrRental();

	/**
	 * @param rRental
	 *            the rRental to set
	 */
	public void setrRental(int rRental);

	/**
	 * @return the rName
	 */
	public String getrName();

	/**
	 * @param rName
	 *            the rName to set
	 */
	public void setrName(String rName);

	/**
	 * @return the rMaster
	 */
	public boolean isrMaster();

	/**
	 * @param rMaster
	 *            the rMaster to set
	 */
	public void setrMaster(boolean rMaster);
}
