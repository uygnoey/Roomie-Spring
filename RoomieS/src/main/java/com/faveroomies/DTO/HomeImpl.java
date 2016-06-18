/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is Home.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 16, 2016
 */
package com.faveroomies.DTO;

/**
 * <p>
 * Home DTO<br>
 * hNum INT NOT NULL AUTO_INCREMENT, -- 집번호<br>
 * hName VARCHAR(30) NOT NULL, -- 집이름<br>
 * mNum INT NOT NULL, -- 주인<br>
 * hRoom INT NOT NULL, -- 방 수<br>
 * hAddrSt1 VARCHAR(300) NOT NULL, -- 주소1<br>
 * hAddrSt2 VARCHAR(300) NULL, -- 주소2<br>
 * hCity VARCHAR(100) NOT NULL, -- 도시<br>
 * hState VARCHAR(100) NOT NULL, -- 주/도<br>
 * hZipcode VARCHAR(10) NOT NULL -- 우편번호<br>
 * 
 * @author YeonGyu Yang
 * @Since Mar 16, 2016
 *
 */
public class HomeImpl implements Home {

	private int hNum, mNum, hRoom;
	private String hName, hNeighborhood, hAddrSt1, hAddrSt2, hCity, hState, hZipcode;

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
	 * @return the hRoom
	 */
	public int gethRoom() {
		return hRoom;
	}

	/**
	 * @param hRoom
	 *            the hRoom to set
	 */
	public void sethRoom(int hRoom) {
		this.hRoom = hRoom;
	}

	/**
	 * @return the hName
	 */
	public String gethName() {
		return hName;
	}

	/**
	 * @param hName
	 *            the hName to set
	 */
	public void sethName(String hName) {
		this.hName = hName;
	}

	/**
	 * @return the hNeighborhood
	 */
	public String gethNeighborhood() {
		return hNeighborhood;
	}

	/**
	 * @param hNeighborhood
	 *            the hNeighborhood to set
	 */
	public void sethNeighborhood(String hNeighborhood) {
		this.hNeighborhood = hNeighborhood;
	}

	/**
	 * @return the hAddrSt1
	 */
	public String gethAddrSt1() {
		return hAddrSt1;
	}

	/**
	 * @param hAddrSt1
	 *            the hAddrSt1 to set
	 */
	public void sethAddrSt1(String hAddrSt1) {
		this.hAddrSt1 = hAddrSt1;
	}

	/**
	 * @return the hAddrSt2
	 */
	public String gethAddrSt2() {
		return hAddrSt2;
	}

	/**
	 * @param hAddrSt2
	 *            the hAddrSt2 to set
	 */
	public void sethAddrSt2(String hAddrSt2) {
		this.hAddrSt2 = hAddrSt2;
	}

	/**
	 * @return the hCity
	 */
	public String gethCity() {
		return hCity;
	}

	/**
	 * @param hCity
	 *            the hCity to set
	 */
	public void sethCity(String hCity) {
		this.hCity = hCity;
	}

	/**
	 * @return the hState
	 */
	public String gethState() {
		return hState;
	}

	/**
	 * @param hState
	 *            the hState to set
	 */
	public void sethState(String hState) {
		this.hState = hState;
	}

	/**
	 * @return the hZipcode
	 */
	public String gethZipcode() {
		return hZipcode;
	}

	/**
	 * @param hZipcode
	 *            the hZipcode to set
	 */
	public void sethZipcode(String hZipcode) {
		this.hZipcode = hZipcode;
	}

}
