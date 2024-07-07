package com.mouad.E_Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouad.E_Bank.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
