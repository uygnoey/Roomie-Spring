/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is HomeRateInterface.java<br>
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
public interface HomeRateInterface {

	/**
	 * @return the hrNum
	 */
	public int getHrNum();

	/**
	 * @param hrNum
	 *            the hrNum to set
	 */
	public void setHrNum(int hrNum);

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
	 * @return the cNum
	 */
	public int getcNum();

	/**
	 * @param cNum
	 *            the cNum to set
	 */
	public void setcNum(int cNum);

	/**
	 * @return the hrRate
	 */
	public int getHrRate();

	/**
	 * @param hrRate
	 *            the hrRate to set
	 */
	public void setHrRate(int hrRate);

	/**
	 * @return the hrReason
	 */
	public String getHrReason();

	/**
	 * @param hrReason
	 *            the hrReason to set
	 */
	public void setHrReason(String hrReason);

}
