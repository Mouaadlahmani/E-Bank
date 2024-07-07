package com.mouad.E_Bank.service;


import java.util.List;

import com.mouad.E_Bank.model.Transfer;

public interface TransferService {

	 public Transfer transfer(Long senderCompteId, Long receiverCompteId, Double amount, String description);
	 public List<Transfer> getAllTransfers();
}
