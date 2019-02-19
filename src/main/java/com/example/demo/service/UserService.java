package com.example.demo.service;

import java.util.List;

import com.example.demo.mode.User;

public interface UserService {
	public List<User> getUserByUserName(String userName);
	public User saveUser(User user);
}
