package com.techsquad.ekyc.Models;

import org.springframework.data.annotation.Id;

public class User {
	@Id
	private String userId;
	private String password;
	private boolean isKYCCompleted;
	private String userName;
	private String email;
	private long mobile;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isKYCCompleted() {
		return isKYCCompleted;
	}
	public void setKYCCompleted(boolean isKYCCompleted) {
		this.isKYCCompleted = isKYCCompleted;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}
