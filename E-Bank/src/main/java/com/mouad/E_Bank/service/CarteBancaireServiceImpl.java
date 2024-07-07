package com.mouad.E_Bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouad.E_Bank.model.CarteBancaire;
import com.mouad.E_Bank.repository.CarteBancaireRepository;

@Service
public class CarteBancaireServiceImpl implements CarteBancaireService{

	@Autowired
	CarteBancaireRepository bancaireRepository;
	
	@Override
	public CarteBancaire addCarte(CarteBancaire carte) {
		return bancaireRepository.save(carte);
	}

	@Override
	public void deleteCarte(Long id) {
		bancaireRepository.deleteById(id);
		
	}

	@Override
	public List<CarteBancaire> getAllCartes() {
		return bancaireRepository.findAll();
	}

	

}
