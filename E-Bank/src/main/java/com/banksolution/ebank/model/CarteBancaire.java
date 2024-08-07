package com.banksolution.ebank.model;

import com.banksolution.ebank.model.enums.TypeCarte;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarteBancaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private LocalDate dateExpiration;

    @Enumerated(EnumType.STRING)
    private TypeCarte type;

    private boolean active;
    private boolean bloquee;
    private String raisonBlocage;

    @ManyToOne
    @JoinColumn(name = "compte_id")
    private Compte compte;


}






//SELECT AVG(montant) FROM Transaction
//WHERE compte_id = id AND type_transaction = 'CREDIT';


