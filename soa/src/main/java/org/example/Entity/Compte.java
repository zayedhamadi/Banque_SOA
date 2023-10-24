package org.example.Entity;


import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Compte {
    private Long code;
    private Date dateCreation;
    private Double solde;
    private String mdp;



}
