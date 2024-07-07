package com.mouad.E_Bank.service;

import java.util.List;

import com.mouad.E_Bank.model.User;

public interface UserService {
	
	public User addUser(User user);
	public List<User> getAllUsers();
	public void deleteUser(Long id);

}
