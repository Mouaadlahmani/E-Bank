package com.mouad.E_Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouad.E_Bank.model.User;
import com.mouad.E_Bank.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping
	public User addUser(@RequestBody User user) {
		return service.addUser(user); 
	}
	
	@GetMapping
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}
	
	

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteUser(id);
	}
}
