package com.kh.data;

public class User {

	private String userId;
	private String userPw;
	private String userName;
	private String email;
	private String phone;
	private String address;
	private String inter;
	
	public User() {}
	
	public User(String userID, String userPw, String userName, String email, String phone, String address, String inter) {
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.inter = inter;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getName() {
		return userName;
	}

	public void setName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInter() {
		return inter;
	}

	public void setInter(String inter) {
		this.inter = inter;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
}
