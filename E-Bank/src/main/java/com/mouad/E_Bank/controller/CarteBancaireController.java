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

import com.mouad.E_Bank.model.CarteBancaire;
import com.mouad.E_Bank.service.CarteBancaireService;

@RestController
@RequestMapping("/api/carte")
public class CarteBancaireController {

	@Autowired
	CarteBancaireService carteBancaireService;
	
	@PostMapping
	public CarteBancaire addCarte(@RequestBody CarteBancaire carte) {
		return carteBancaireService.addCarte(carte);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		carteBancaireService.deleteCarte(id);
	}
	
	@GetMapping
	public List<CarteBancaire> getAllCartes(){
		return carteBancaireService.getAllCartes();
		}

}
