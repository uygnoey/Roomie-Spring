/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is Agreement.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 16, 2016
 */
package com.faveroomies.DTO;

/**
 * <P>
 * Agreement DTO<br>
 * aNum INT NOT NULL AUTO_INCREMENT, -- 계약서번호<br>
 * cNum INT NOT NULL, -- 계약번호<br>
 * aAgreement VARCHAR(100) NOT NULL, -- 계약서<br>
 * aDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP -- 날짜<br>
 * 
 * @author YeonGyu Yang
 * @Since Mar 16, 2016
 *
 */
public class AgreementImpl implements Agreement{

	private int aNum, cNum;
	private String aAgreement, aDate;

	/**
	 * @return the aNum
	 */
	public int getaNum() {
		return aNum;
	}

	/**
	 * @param aNum
	 *            the aNum to set
	 */
	public void setaNum(int aNum) {
		this.aNum = aNum;
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
	 * @return the aAgreement
	 */
	public String getaAgreement() {
		return aAgreement;
	}

	/**
	 * @param aAgreement
	 *            the aAgreement to set
	 */
	public void setaAgreement(String aAgreement) {
		this.aAgreement = aAgreement;
	}

	/**
	 * @return the aDate
	 */
	public String getaDate() {
		return aDate;
	}

	/**
	 * @param aDate
	 *            the aDate to set
	 */
	public void setaDate(String aDate) {
		this.aDate = aDate;
	}

}
