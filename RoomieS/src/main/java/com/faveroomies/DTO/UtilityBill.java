/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is UtilityBill.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 16, 2016
 */
package com.faveroomies.DTO;

/**
 * <p>
 * UtilityBill DTO<br>
 * ubNum INT NOT NULL AUTO_INCREMENT, -- 유틸번호<br>
 * hNum INT NOT NULL, -- 집번호<br>
 * ubBill INT NOT NULL, -- 유틸비<br>
 * ubDate TIMESTAMP NOT NULL, -- 유틸비 월<br>
 * 
 * @author YeonGyu Yang
 * @Since Mar 16, 2016
 *
 */
public class UtilityBill {

	private int ubNum, hNum, ubBill;
	private String ubDate;

	/**
	 * @return the ubNum
	 */
	public int getUbNum() {
		return ubNum;
	}

	/**
	 * @param ubNum
	 *            the ubNum to set
	 */
	public void setUbNum(int ubNum) {
		this.ubNum = ubNum;
	}

	/**
	 * @return the hNum
	 */
	public int gethNum() {
		return hNum;
	}

	/**
	 * @param hNum
	 *            the hNum to set
	 */
	public void sethNum(int hNum) {
		this.hNum = hNum;
	}

	/**
	 * @return the ubBill
	 */
	public int getUbBill() {
		return ubBill;
	}

	/**
	 * @param ubBill
	 *            the ubBill to set
	 */
	public void setUbBill(int ubBill) {
		this.ubBill = ubBill;
	}

	/**
	 * @return the ubDate
	 */
	public String getUbDate() {
		return ubDate;
	}

	/**
	 * @param ubDate
	 *            the ubDate to set
	 */
	public void setUbDate(String ubDate) {
		this.ubDate = ubDate;
	}

}
