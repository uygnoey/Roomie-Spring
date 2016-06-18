/**
 * <p>Project name is RoomieS<br>
 * Package name is com.faveroomies.DTO<br>
 * File name is EmptyRoomImpl.java<br>
 *
 * @author YeonGyu Yang
 * @since May 10, 2016
 */
package com.faveroomies.DTO;

/**
 * 
 * @author YeonGyu Yang
 * @Since May 10, 2016
 *
 */
public class EmptyRoomImpl implements Home, Room, HomeRate, Roomie {

	private int rNum, hNum, rDeposit, rRental, mNum, hRoom, aNum, hrNum, cNum, hrRate;
	private String rName, hName, hNeighborhood, hAddrSt1, hAddrSt2, hCity, hState, hZipcode, mUser, mEmail, mPassword,
			mName, mPhone, mDate, hrReason;
	private boolean rMaster, rEmpty, mEnabled, mConfirmed;

	/**
	 * @return the rNum
	 */
	public int getrNum() {
		return rNum;
	}

	/**
	 * @param rNum
	 *            the rNum to set
	 */
	public void setrNum(int rNum) {
		this.rNum = rNum;
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
	 * @return the rDeposit
	 */
	public int getrDeposit() {
		return rDeposit;
	}

	/**
	 * @param rDeposit
	 *            the rDeposit to set
	 */
	public void setrDeposit(int rDeposit) {
		this.rDeposit = rDeposit;
	}

	/**
	 * @return the rRental
	 */
	public int getrRental() {
		return rRental;
	}

	/**
	 * @param rRental
	 *            the rRental to set
	 */
	public void setrRental(int rRental) {
		this.rRental = rRental;
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
	 * @return the hrNum
	 */
	public int getHrNum() {
		return hrNum;
	}

	/**
	 * @param hrNum
	 *            the hrNum to set
	 */
	public void setHrNum(int hrNum) {
		this.hrNum = hrNum;
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
	 * @return the hrRate
	 */
	public int getHrRate() {
		return hrRate;
	}

	/**
	 * @param hrRate
	 *            the hrRate to set
	 */
	public void setHrRate(int hrRate) {
		this.hrRate = hrRate;
	}

	/**
	 * @return the rName
	 */
	public String getrName() {
		return rName;
	}

	/**
	 * @param rName
	 *            the rName to set
	 */
	public void setrName(String rName) {
		this.rName = rName;
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

	/**
	 * @return the mUser
	 */
	public String getmUser() {
		return mUser;
	}

	/**
	 * @param mUser
	 *            the mUser to set
	 */
	public void setmUser(String mUser) {
		this.mUser = mUser;
	}

	/**
	 * @return the mEmail
	 */
	public String getmEmail() {
		return mEmail;
	}

	/**
	 * @param mEmail
	 *            the mEmail to set
	 */
	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	/**
	 * @return the mPassword
	 */
	public String getmPassword() {
		return mPassword;
	}

	/**
	 * @param mPassword
	 *            the mPassword to set
	 */
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}

	/**
	 * @return the mName
	 */
	public String getmName() {
		return mName;
	}

	/**
	 * @param mName
	 *            the mName to set
	 */
	public void setmName(String mName) {
		this.mName = mName;
	}

	/**
	 * @return the mPhone
	 */
	public String getmPhone() {
		return mPhone;
	}

	/**
	 * @param mPhone
	 *            the mPhone to set
	 */
	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	/**
	 * @return the mDate
	 */
	public String getmDate() {
		return mDate;
	}

	/**
	 * @param mDate
	 *            the mDate to set
	 */
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}

	/**
	 * @return the hrReason
	 */
	public String getHrReason() {
		return hrReason;
	}

	/**
	 * @param hrReason
	 *            the hrReason to set
	 */
	public void setHrReason(String hrReason) {
		this.hrReason = hrReason;
	}

	/**
	 * @return the rMaster
	 */
	public boolean isrMaster() {
		return rMaster;
	}

	/**
	 * @param rMaster
	 *            the rMaster to set
	 */
	public void setrMaster(boolean rMaster) {
		this.rMaster = rMaster;
	}

	/**
	 * @return the rEmpty
	 */
	public boolean isrEmpty() {
		return rEmpty;
	}

	/**
	 * @param rEmpty
	 *            the rEmpty to set
	 */
	public void setrEmpty(boolean rEmpty) {
		this.rEmpty = rEmpty;
	}

	/**
	 * @return the mEnabled
	 */
	public boolean ismEnabled() {
		return mEnabled;
	}

	/**
	 * @param mEnabled
	 *            the mEnabled to set
	 */
	public void setmEnabled(boolean mEnabled) {
		this.mEnabled = mEnabled;
	}

	/**
	 * @return the mConfirmed
	 */
	public boolean ismConfirmed() {
		return mConfirmed;
	}

	/**
	 * @param mConfirmed
	 *            the mConfirmed to set
	 */
	public void setmConfirmed(boolean mConfirmed) {
		this.mConfirmed = mConfirmed;
	}

}
