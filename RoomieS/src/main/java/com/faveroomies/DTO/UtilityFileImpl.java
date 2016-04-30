/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is UtilityFile.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 16, 2016
 */
package com.faveroomies.DTO;

/**
 * <p>
 * UtilityFile DTO<br>
 * ufNum INT NOT NULL AUTO_INCREMENT, -- 유틸파일번호<br>
 * ubNum INT NOT NULL, -- 유틸번호<br>
 * ufName VARCHAR(100) NOT NULL -- 유틸파일이름<br>
 * 
 * @author YeonGyu Yang
 * @Since Mar 16, 2016
 *
 */
public class UtilityFileImpl {

	private int ufNum, ubNum;
	private String nfName;

	/**
	 * @return the ufNum
	 */
	public int getUfNum() {
		return ufNum;
	}

	/**
	 * @param ufNum
	 *            the ufNum to set
	 */
	public void setUfNum(int ufNum) {
		this.ufNum = ufNum;
	}

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
	 * @return the nfName
	 */
	public String getNfName() {
		return nfName;
	}

	/**
	 * @param nfName
	 *            the nfName to set
	 */
	public void setNfName(String nfName) {
		this.nfName = nfName;
	}

}
