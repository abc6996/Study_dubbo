package com.study.entity;

import java.io.Serializable;

public class UserInfo implements Serializable{
	private int userId;
	private String userName;
	private String gender;

	public UserInfo() {
	}

	public UserInfo(int userId, String userName, String gender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", gender=" + gender + "]";
	}

}
