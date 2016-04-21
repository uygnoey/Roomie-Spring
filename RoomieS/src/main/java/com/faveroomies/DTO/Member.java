/**
 * <p>Project name is RoomieS<br>
 * Package name is life.theroomie.DTO<br>
 * File name is Member.java<br>
 *
 * @author YeonGyu Yang
 * @since Apr 14, 2016
 */
package com.faveroomies.DTO;

import com.faveroomies.security.Encrypt;

/**
 * 
 * @author YeonGyu Yang
 * @Since Apr 14, 2016
 * 
 *        'mNum','int(11)','NO','','0',''</br>
 *        'mUser','varchar(30)','NO','',NULL,''</br>
 *        'mName','varchar(100)','YES','',NULL,''</br>
 *        'mPhone','varchar(20)','YES','',NULL,''</br>
 *        'mEmail','varchar(200)','NO','',NULL,''</br>
 *        'aNum','int(11)','NO','','0',''</br>
 *        'aAuth','varchar(100)','NO','',NULL,''</br>
 *        'mDate','timestamp','NO','','0000-00-00 00:00:00',''</br>
 *        'mEnabled','varchar(8)','NO','','',''</br>
 *
 * 
 */
public class Member implements RoomieInterface, AuthenticatedInterface {

	private int aNum, mNum;
	private String aAuth, mUser, mName, mPhone, mEmail, mDate, mPassword;
	private boolean mEnabled;
	private Encrypt encrypt = new Encrypt();

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.AuthenticatedInterface#getaAuth()
	 */
	@Override
	public String getaAuth() {
		return aAuth;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @param aAuth
	 * @see com.faveroomies.DTO.AuthenticatedInterface#setaAuth(java.lang.String)
	 */
	@Override
	public void setaAuth(String aAuth) {
		this.aAuth = aAuth;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.RoomieInterface#getmNum()
	 */
	@Override
	public int getmNum() {
		return mNum;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @param mNum
	 * @see com.faveroomies.DTO.RoomieInterface#setmNum(int)
	 */
	@Override
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.RoomieInterface#getaNum()
	 */
	@Override
	public int getaNum() {
		return aNum;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @param aNum
	 * @see com.faveroomies.DTO.RoomieInterface#setaNum(int)
	 */
	@Override
	public void setaNum(int aNum) {
		this.aNum = aNum;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.RoomieInterface#getmUser()
	 */
	@Override
	public String getmUser() {
		return mUser;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @param mUser
	 * @see com.faveroomies.DTO.RoomieInterface#setmUser(java.lang.String)
	 */
	@Override
	public void setmUser(String mUser) {
		this.mUser = mUser;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.RoomieInterface#getmName()
	 */
	@Override
	public String getmName() {
		return mName;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @param mName
	 * @see com.faveroomies.DTO.RoomieInterface#setmName(java.lang.String)
	 */
	@Override
	public void setmName(String mName) {
		this.mName = mName;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.RoomieInterface#getmPhone()
	 */
	@Override
	public String getmPhone() {
		return mPhone;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @param mPhone
	 * @see com.faveroomies.DTO.RoomieInterface#setmPhone(java.lang.String)
	 */
	@Override
	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.RoomieInterface#getmEmail()
	 */
	@Override
	public String getmEmail() {
		return mEmail;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @param mEmail
	 * @see com.faveroomies.DTO.RoomieInterface#setmEmail(java.lang.String)
	 */
	@Override
	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.RoomieInterface#getmPassword()
	 */
	@Override
	public String getmPassword() {
		return mPassword;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @param mPassword
	 * @see com.faveroomies.DTO.RoomieInterface#setmPassword(java.lang.String)
	 */
	@Override
	public void setmPassword(String mPassword) {
		this.mPassword = encrypt.encrypt(mPassword);
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.RoomieInterface#getmDate()
	 */
	@Override
	public String getmDate() {
		return mDate;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @param mDate
	 * @see com.faveroomies.DTO.RoomieInterface#setmDate(java.lang.String)
	 */
	@Override
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @return
	 * @see com.faveroomies.DTO.RoomieInterface#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		return mEnabled;
	}

	/**
	 * @author YeonGyu Yang
	 * @Since Apr 14, 2016
	 *
	 * @param enabled
	 * @see com.faveroomies.DTO.RoomieInterface#setEnabled(boolean)
	 */
	@Override
	public void setEnabled(boolean mEnabled) {
		this.mEnabled = mEnabled;
	}

}
