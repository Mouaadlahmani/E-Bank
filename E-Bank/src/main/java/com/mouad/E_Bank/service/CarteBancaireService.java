package com.mouad.E_Bank.service;

import java.util.List;

import com.mouad.E_Bank.model.CarteBancaire;

public interface CarteBancaireService {

	public CarteBancaire addCarte (CarteBancaire carte);
	public void deleteCarte (Long id);
	public List<CarteBancaire> getAllCartes();
	
}
