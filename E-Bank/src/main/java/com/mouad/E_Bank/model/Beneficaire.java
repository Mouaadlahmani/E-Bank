package com.mouad.E_Bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Beneficaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long beneficaireId;
    private String name;
    private String accountNumber;
    private String bankName;

    @ManyToOne
    private User user;

    @ManyToOne
    private Compte compte;
}
