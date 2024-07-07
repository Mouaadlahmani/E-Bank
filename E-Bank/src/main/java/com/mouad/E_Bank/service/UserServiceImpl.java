package com.mouad.E_Bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouad.E_Bank.model.User;
import com.mouad.E_Bank.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repository;

	@Override
	public User addUser(User user) {
		return repository.save(user);
	}
	
	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}


	@Override
	public void deleteUser(Long id) {
		 repository.deleteById(id);
	}



	


}
