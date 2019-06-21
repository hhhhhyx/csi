package com.cqut.model;

import java.sql.Timestamp;

public class User {
	
	private int userId;//USER_ID
	private String loginName;//USER_LOGINNAME
	private String passWord;//USER_PASSWORD
	private int status;//USER_STATUS
	private Timestamp userCreateDate;//USER_CREATEDATE
	private String userName;//USER_NAME 
	public int getUserId() {
		return userId;
	}
	public void setUserID(int userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Timestamp getUserCreateDate() {
		return userCreateDate;
	}
	public void setUserCreateDate(Timestamp userCreateDate) {
		this.userCreateDate = userCreateDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
