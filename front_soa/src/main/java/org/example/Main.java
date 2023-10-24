package org.example;

import service.BanqueService;
import service.Banquews;

public class Main {
    public static void main(String[] args) {

        BanqueService bs = new Banquews().getBanqueServicePort();

       try {
          // bs.add(1L, "03/03/2003", 10.0, "1234");
         //  bs.add(2L, "02/02/2002", 20.0, "0000");
           bs.add(3L, "03/03/2003", 30.0, "3333");
           System.out.println("Compte ajouté avec succès ");
       }catch (Exception e){
           System.err.println("erreur"+e.getMessage());
       }
        System.out.println();

        System.err.println(bs.afficherlisteComptes());





    }
}