package com.mouad.E_Bank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouad.E_Bank.model.Compte;
import com.mouad.E_Bank.service.CompteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/compte")
public class CompteController {

	@Autowired
	CompteService compteService;
	
	@PostMapping
	public Compte addAccount(@RequestBody Compte compte) {
		return compteService.addAccount(compte);
	}
	
	@GetMapping
	public List<Compte> getAllComptes() {
		return compteService.getAllAccounts();
	}
	
	@GetMapping("/account/{id}")
	public Optional<Compte> getCompteById(@PathVariable Long id){
		return compteService.getCompteById(id);
	}

}
