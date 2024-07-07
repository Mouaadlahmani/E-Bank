package com.mouad.E_Bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouad.E_Bank.model.Compte;
import com.mouad.E_Bank.repository.CompteRepository;


@Service
public class CompteServiceImpl implements CompteService{
	
	@Autowired
	CompteRepository compteRepository;

	@Override
	public Compte addAccount(Compte compte) {
		return compteRepository.save(compte);
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
