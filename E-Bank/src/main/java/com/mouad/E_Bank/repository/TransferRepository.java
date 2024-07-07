package com.mouad.E_Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouad.E_Bank.model.Transfer;

public interface TransferRepository extends JpaRepository<Transfer, Long>{

}
