/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is RoomContract.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 16, 2016
 */
package com.faveroomies.DTO;

/**
 * <p>
 * RoomContract DTO<br>
 * cNum INT NOT NULL AUTO_INCREMENT, -- 계약번호<br>
 * rNum INT NOT NULL, -- 방번호<br>
 * mNum INT NOT NULL, -- 회원번호<br>
 * cStartDate TIMESTAMP NOT NULL, -- 계약일<br>
 * cEndDate TIMESTAMP NOT NULL, -- 계약만료일<br>
 * cDeposit INT NOT NULL DEFAULT 0, -- 방계약금<br>
 * cRental INT NOT NULL DEFAULT 0 -- 방렌트비<br>
 * 
 * @author YeonGyu Yang
 * @Since Mar 16, 2016
 *
 */
public class RoomContract implements RoomContractInterface {

	private int cNum, rNum, mNum, cDeposit, cRental;
	private String cStartDate, cEndDate;

	/**
	 * @return the cNum
	 */
	@Override
	public int getcNum() {
		return cNum;
	}

	/**
	 * @param cNum
	 *            the cNum to set
	 */
	@Override
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}

	/**
	 * @return the rNum
	 */
	@Override
	public int getrNum() {
		return rNum;
	}

	/**
	 * @param rNum
	 *            the rNum to set
	 */
	@Override
	public void setrNum(int rNum) {
		this.rNum = rNum;
	}

	/**
	 * @return the mNum
	 */
	@Override
	public int getmNum() {
		return mNum;
	}

	/**
	 * @param mNum
	 *            the mNum to set
	 */
	@Override
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}

	/**
	 * @return the cDeposit
	 */
	@Override
	public int getcDeposit() {
		return cDeposit;
	}

	/**
	 * @param cDeposit
	 *            the cDeposit to set
	 */
	@Override
	public void setcDeposit(int cDeposit) {
		this.cDeposit = cDeposit;
	}

	/**
	 * @return the cRental
	 */
	@Override
	public int getcRental() {
		return cRental;
	}

	/**
	 * @param cRental
	 *            the cRental to set
	 */
	@Override
	public void setcRental(int cRental) {
		this.cRental = cRental;
	}

	/**
	 * @return the cStartDate
	 */
	@Override
	public String getcStartDate() {
		return cStartDate;
	}

	/**
	 * @param cStartDate
	 *            the cStartDate to set
	 */
	@Override
	public void setcStartDate(String cStartDate) {
		this.cStartDate = cStartDate;
	}

	/**
	 * @return the cEndDate
	 */
	@Override
	public String getcEndDate() {
		return cEndDate;
	}

	/**
	 * @param cEndDate
	 *            the cEndDate to set
	 */
	@Override
	public void setcEndDate(String cEndDate) {
		this.cEndDate = cEndDate;
	}

}
