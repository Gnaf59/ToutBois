/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import java.util.Date;

/**
 *
 * @author glantoine
 */
public class Prospects extends Personnes{
    private Date derniereVisite;
    private int numeroProspect,siret,numeroRepresentant;
    private static int increment=1;

    public Prospects(Date derniereVisite, int siret, int numeroRepresentant, String nom, String prenom, String entreprise, String adresse, String ville, String mail, String numerotel, String pays, String codePostal) {
        super(nom, prenom, entreprise, adresse, ville, mail, numerotel, pays, codePostal);
        this.derniereVisite = derniereVisite;
        this.siret = siret;
        this.numeroRepresentant = numeroRepresentant;
        numeroProspect= increment;
        increment ++;
    }

    
        
        
    
    
    
}
