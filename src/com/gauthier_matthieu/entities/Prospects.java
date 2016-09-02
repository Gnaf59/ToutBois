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
    private String nomEntreprise;
    private Date derniereVisite;
    private int numeroProspect,siret,numeroRepresentant;
    private static int increment=1;

    public Prospects(String nomEntreprise,Date derniereVisite, int siret, int numeroRepresentant, String nom, String prenom,int numeroVoie, String adresse,String complementAdresse, String ville, String mail, String numerotel, String pays, String codePostal) {
        super(nom, prenom, numeroVoie, adresse,complementAdresse, ville,mail,numerotel, pays, codePostal);
        this.nomEntreprise=nomEntreprise;
        this.derniereVisite = derniereVisite;
        this.siret = siret;
        this.numeroRepresentant = numeroRepresentant;
        numeroProspect= increment;
        increment ++;
    }

    
        
        
    
    
    
}
