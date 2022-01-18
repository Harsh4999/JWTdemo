package com.jwtdemo.entity;

import lombok.Data;

@Data
public class AuthReq {
	private String userName;
	private String password;
	public AuthReq() {}
	public AuthReq(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
