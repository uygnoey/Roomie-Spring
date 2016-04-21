/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is HomeRate.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 16, 2016
 */
package com.faveroomies.DTO;

/**
 * <p>
 * HomeRate DTO<br>
 * hrNum INT NOT NULL AUTO_INCREMENT, -- 집평가번호<br>
 * hNum INT NOT NULL, -- 집번호<br>
 * cNum INT NOT NULL, -- 계약번호<br>
 * hrRate INT NOT NULL, -- 집 평가<br>
 * hrReason VARCHAR(300) NOT NULL -- 평가 사유<br>
 * 
 * @author YeonGyu Yang
 * @Since Mar 16, 2016
 *
 */
public class HomeRate implements HomeRateInterface {

	private int hrNum, hNum, cNum, hrRate;
	private String hrReason;

	/**
	 * @return the hrNum
	 */
	@Override
	public int getHrNum() {
		return hrNum;
	}

	/**
	 * @param hrNum
	 *            the hrNum to set
	 */
	@Override
	public void setHrNum(int hrNum) {
		this.hrNum = hrNum;
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
	 * @return the hrRate
	 */
	@Override
	public int getHrRate() {
		return hrRate;
	}

	/**
	 * @param hrRate
	 *            the hrRate to set
	 */
	@Override
	public void setHrRate(int hrRate) {
		this.hrRate = hrRate;
	}

	/**
	 * @return the hrReason
	 */
	@Override
	public String getHrReason() {
		return hrReason;
	}

	/**
	 * @param hrReason
	 *            the hrReason to set
	 */
	@Override
	public void setHrReason(String hrReason) {
		this.hrReason = hrReason;
	}

}
