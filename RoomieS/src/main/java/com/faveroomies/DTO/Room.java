/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is Room.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 16, 2016
 */
package com.faveroomies.DTO;

/**
 * <p>
 * Room DTO<br>
 * rNum INT NOT NULL AUTO_INCREMENT, -- 방번호<br>
 * hNum INT NOT NULL, -- 집번호<br>
 * rName VARCHAR(100) NOT NULL, -- 방이름<br>
 * rMaster BOOLEAN NOT NULL DEFAULT 0, -- 마스터룸<br>
 * rDeposit INT NOT NULL DEFAULT 0, -- 방계약금<br>
 * rRental INT NOT NULL DEFAULT 0, -- 방렌트비<br>
 * 
 * @author YeonGyu Yang
 * @Since Mar 16, 2016
 *
 */
public class Room implements RoomInterface {

	private int rNum, hNum, rDeposit, rRental;
	private String rName;
	private boolean rMaster;

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
	 * @return the hNum
	 */
	@Override
	public int gethNum() {
		return hNum;
	}

	/**
	 * @param hNum
	 *            the hNum to set
	 */
	@Override
	public void sethNum(int hNum) {
		this.hNum = hNum;
	}

	/**
	 * @return the rDeposit
	 */
	@Override
	public int getrDeposit() {
		return rDeposit;
	}

	/**
	 * @param rDeposit
	 *            the rDeposit to set
	 */
	@Override
	public void setrDeposit(int rDeposit) {
		this.rDeposit = rDeposit;
	}

	/**
	 * @return the rRental
	 */
	@Override
	public int getrRental() {
		return rRental;
	}

	/**
	 * @param rRental
	 *            the rRental to set
	 */
	@Override
	public void setrRental(int rRental) {
		this.rRental = rRental;
	}

	/**
	 * @return the rName
	 */
	@Override
	public String getrName() {
		return rName;
	}

	/**
	 * @param rName
	 *            the rName to set
	 */
	@Override
	public void setrName(String rName) {
		this.rName = rName;
	}

	/**
	 * @return the rMaster
	 */
	@Override
	public boolean isrMaster() {
		return rMaster;
	}

	/**
	 * @param rMaster
	 *            the rMaster to set
	 */
	@Override
	public void setrMaster(boolean rMaster) {
		this.rMaster = rMaster;
	}

}