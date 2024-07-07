package com.mouad.E_Bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouad.E_Bank.model.Compte;
import com.mouad.E_Bank.model.User;
import com.mouad.E_Bank.repository.CompteRepository;
import com.mouad.E_Bank.repository.UserRepository;
import java.lang.IllegalArgumentException;



@Service
public class CompteServiceImpl implements CompteService{
	
	@Autowired
	CompteRepository compteRepository;
	@Autowired
	UserRepository userrepository;
	

	@Override
	public Compte addAccount(Compte compte) {
		Optional<User> checkUser = userrepository.findById(compte.getUser().getUserId());
		if(checkUser.isPresent()) {
			return compteRepository.save(compte);
		}else {
			throw new IllegalArgumentException("User with ID" + compte.getUser().getUserId() + " not found.");
		}
		
	}

	@Override
	public List<Compte> getAllAccounts() {
		return compteRepository.findAll();
	}

	@Override
	public Optional<Compte> getCompteById(Long id) {
		return compteRepository.findById(id);
	}

	

}
