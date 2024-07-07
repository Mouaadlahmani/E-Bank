package com.mouad.E_Bank.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long compteId;
    private String accountNumber;
    private String compteType;
    private Double balance;
    private String statut;
    private String raisonCloture;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "compte")
    private List<Transfer> transfers;

    @OneToMany(mappedBy = "compte")
    private List<CarteBancaire> cartesBancaires;

    @OneToMany(mappedBy = "compte")
    private List<Beneficaire> beneficaires;
}
