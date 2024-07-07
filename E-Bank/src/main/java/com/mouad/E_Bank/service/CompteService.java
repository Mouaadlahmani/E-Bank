package com.mouad.E_Bank.service;

import java.util.List;
import java.util.Optional;

import com.mouad.E_Bank.model.Compte;

public interface CompteService {
	
	public Compte addAccount(Compte compte);
	public List<Compte> getAllAccounts();
	public Optional<Compte> getCompteById(Long id);

}
