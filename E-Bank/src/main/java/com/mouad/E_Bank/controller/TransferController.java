package com.mouad.E_Bank.controller;

import com.mouad.E_Bank.model.Transfer;
import com.mouad.E_Bank.service.TransferServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transfers")
public class TransferController {

    @Autowired
    TransferServiceImpl transferService;

    @PostMapping("/send/{senderCompteId}/{receiverCompteId}/{amount}/{description}")
    public Transfer createTransfer(@PathVariable Long senderCompteId,@PathVariable Long receiverCompteId,
                                   @PathVariable Double amount,@PathVariable String description) {
        return transferService.transfer(senderCompteId, receiverCompteId, amount, description);
    }
    
    @GetMapping
    public List<Transfer> getAllTransfers(){
    	return transferService.getAllTransfers();
    }
}
