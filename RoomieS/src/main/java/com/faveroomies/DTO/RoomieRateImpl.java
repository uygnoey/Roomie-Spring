/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is RoomieRate.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 16, 2016
 */
package com.faveroomies.DTO;

/**
 * <p>
 * RoomieRate DTO<br>
 * rrNum INT NOT NULL AUTO_INCREMENT, -- 룸메평가번호<br>
 * mNum INT NULL, -- 회원번호<br>
 * cNum INT NULL, -- 계약번호<br>
 * rrRate INT NOT NULL, -- 룸메평가<br>
 * rrReason VARCHAR(300) NOT NULL, -- 평가사유<br>
 * rrDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP -- 평가일<br>
 * 
 * @author YeonGyu Yang
 * @Since Mar 16, 2016
 *
 */
public class RoomieRateImpl {

	private int rrNum, mNum, cNum, rrRate;
	private String rrReason, rrDate;

	/**
	 * @return the rrNum
	 */
	public int getRrNum() {
		return rrNum;
	}

	/**
	 * @param rrNum
	 *            the rrNum to set
	 */
	public void setRrNum(int rrNum) {
		this.rrNum = rrNum;
	}

	/**
	 * @return the mNum
	 */
	public int getmNum() {
		return mNum;
	}

	/**
	 * @param mNum
	 *            the mNum to set
	 */
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}

	/**
	 * @return the cNum
	 */
	public int getcNum() {
		return cNum;
	}

	/**
	 * @param cNum
	 *            the cNum to set
	 */
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}

	/**
	 * @return the rrRate
	 */
	public int getRrRate() {
		return rrRate;
	}

	/**
	 * @param rrRate
	 *            the rrRate to set
	 */
	public void setRrRate(int rrRate) {
		this.rrRate = rrRate;
	}

	/**
	 * @return the rrReason
	 */
	public String getRrReason() {
		return rrReason;
	}

	/**
	 * @param rrReason
	 *            the rrReason to set
	 */
	public void setRrReason(String rrReason) {
		this.rrReason = rrReason;
	}

	/**
	 * @return the rrDate
	 */
	public String getRrDate() {
		return rrDate;
	}

	/**
	 * @param rrDate
	 *            the rrDate to set
	 */
	public void setRrDate(String rrDate) {
		this.rrDate = rrDate;
	}

}
