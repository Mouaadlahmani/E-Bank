package com.mouad.E_Bank.service;

import com.mouad.E_Bank.model.Compte;
import com.mouad.E_Bank.model.Transfer;
import com.mouad.E_Bank.repository.CompteRepository;
import com.mouad.E_Bank.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransferServiceImpl implements TransferService{

    @Autowired
     CompteRepository compteRepository;

    @Autowired
     TransferRepository transferRepository;

    public Transfer transfer(Long senderCompteId, Long receiverCompteId, Double amount, String description) {
        Compte senderCompte = compteRepository.findById(senderCompteId).orElse(null);
        Compte receiverCompte = compteRepository.findById(receiverCompteId).orElse(null);

        if (senderCompte.getBalance() < amount) {
            throw new RuntimeException("Insufficient balance");
        }

        Transfer transfer = new Transfer();
        transfer.setMontant(amount);
        transfer.setDateHeure(LocalDateTime.now());
        transfer.setDescription(description);
        transfer.setCompte(senderCompte); 

        senderCompte.setBalance(senderCompte.getBalance() - amount);
        receiverCompte.setBalance(receiverCompte.getBalance() + amount);

        transferRepository.save(transfer);
        compteRepository.save(senderCompte);
        compteRepository.save(receiverCompte);

        return transfer;
    }

	@Override
	public List<Transfer> getAllTransfers() {
		return transferRepository.findAll();
	}
}
