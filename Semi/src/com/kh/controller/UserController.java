package com.kh.controller;

import java.util.ArrayList;

import com.kh.data.User;

public class UserController {
		
	ArrayList<User> id = new ArrayList<User>();
	ArrayList<User> pw = new ArrayList<User>();

	
	public void joinUser(String userId, String userPw, String userName, String email, String phone, String address, String inter) {
		User u = new User(userId, userPw, userName, email, phone, address, inter);
		
			
	}

}
