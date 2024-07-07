package com.mouad.E_Bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouad.E_Bank.model.CarteBancaire;
import com.mouad.E_Bank.model.Compte;
import com.mouad.E_Bank.repository.CarteBancaireRepository;
import com.mouad.E_Bank.repository.CompteRepository;

@Service
public class CarteBancaireServiceImpl implements CarteBancaireService{

	@Autowired
	CarteBancaireRepository bancaireRepository;
	@Autowired
	CompteRepository compteRepository;
	
	@Override
	public CarteBancaire addCarte(CarteBancaire carte) {
		Optional<Compte> checkCompte = compteRepository.findById(carte.getCompte().getCompteId());
		if(checkCompte.isPresent()) {
			return bancaireRepository.save(carte);
		}else {
			throw new IllegalArgumentException("Compte with ID " + carte.getCompte().getCompteId() + " not found.");
		}
		
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
