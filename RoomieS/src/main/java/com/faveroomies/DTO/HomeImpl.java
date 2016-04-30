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
	private String hName, hAddrSt1, hAddrSt2, hCity, hState, hZipcode;

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.Home#gethNum()
	 */
	@Override
	public int gethNum() {
		return hNum;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @param hNum
	 * @see com.faveroomies.DTO.Home#sethNum(int)
	 */
	@Override
	public void sethNum(int hNum) {
		this.hNum = hNum;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.Home#getmNum()
	 */
	@Override
	public int getmNum() {
		return mNum;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @param mNum
	 * @see com.faveroomies.DTO.Home#setmNum(int)
	 */
	@Override
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.Home#gethRoom()
	 */
	@Override
	public int gethRoom() {
		return hRoom;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @param hRoom
	 * @see com.faveroomies.DTO.Home#sethRoom(int)
	 */
	@Override
	public void sethRoom(int hRoom) {
		this.hRoom = hRoom;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.Home#gethName()
	 */
	@Override
	public String gethName() {
		return hName;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @param hName
	 * @see com.faveroomies.DTO.Home#sethName(java.lang.String)
	 */
	@Override
	public void sethName(String hName) {
		this.hName = hName;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.Home#gethAddrSt1()
	 */
	@Override
	public String gethAddrSt1() {
		return hAddrSt1;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @param hAddrSt1
	 * @see com.faveroomies.DTO.Home#sethAddrSt1(java.lang.String)
	 */
	@Override
	public void sethAddrSt1(String hAddrSt1) {
		this.hAddrSt1 = hAddrSt1;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.Home#gethAddrSt2()
	 */
	@Override
	public String gethAddrSt2() {
		return hAddrSt2;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @param hAddrSt2
	 * @see com.faveroomies.DTO.Home#sethAddrSt2(java.lang.String)
	 */
	@Override
	public void sethAddrSt2(String hAddrSt2) {
		this.hAddrSt2 = hAddrSt2;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.Home#gethCity()
	 */
	@Override
	public String gethCity() {
		return hCity;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @param hCity
	 * @see com.faveroomies.DTO.Home#sethCity(java.lang.String)
	 */
	@Override
	public void sethCity(String hCity) {
		this.hCity = hCity;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.Home#gethState()
	 */
	@Override
	public String gethState() {
		return hState;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @param hState
	 * @see com.faveroomies.DTO.Home#sethState(java.lang.String)
	 */
	@Override
	public void sethState(String hState) {
		this.hState = hState;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.Home#gethZipcode()
	 */
	@Override
	public String gethZipcode() {
		return hZipcode;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 4, 2016
	 *
	 * @param hZipcode
	 * @see com.faveroomies.DTO.Home#sethZipcode(java.lang.String)
	 */
	@Override
	public void sethZipcode(String hZipcode) {
		this.hZipcode = hZipcode;
	}

}
