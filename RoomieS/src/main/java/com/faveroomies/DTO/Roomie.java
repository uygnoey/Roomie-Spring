/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is Roomie.java<br>
 *
 * @author YeonGyu Yang
 * @since Mar 7, 2016
 */
package com.faveroomies.DTO;

import com.faveroomies.security.Encrypt;

/**
 * <p>
 * Roomie DTO<br>
 * mNum INT NOT NULL AUTO_INCREMENT, -- 회원번호<br>
 * mUser VARCHAR(30) NOT NULL, -- 아이디<br>
 * mName VARCHAR(100) NULL, -- 이름<br>
 * mPhone VARCHAR(20) NULL, -- 전화번호<br>
 * mEmail VARCHAR(200) NOT NULL, -- 이메일<br>
 * mPassword VARCHAR(255) NOT NULL, -- 비밀번호<br>
 * aNum INT NOT NULL DEFAULT 1, -- 인증코드<br>
 * mDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP, -- 가입일<br>
 * mEnabled boolean NOT NULL DEFAULT 1<br>
 * 
 * @author YeonGyu Yang
 * @Since Mar 7, 2016
 *
 */
public class Roomie implements RoomieInterface {

	private int mNum, aNum;

	private String mUser, mName, mPhone, mEmail, mPassword, mDate;

	private boolean enabled;

	private Encrypt encryptSth = new Encrypt();

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
		this.mPassword = encryptSth.encrypt(mPassword);
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
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled
	 *            the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}