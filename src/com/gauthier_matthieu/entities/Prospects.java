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
    private String nomEntreprise,siret;
    private Date derniereVisite;
    private int numeroProspect,numeroRepresentant;
    private static int increment=1;

    public Prospects(String nomEntreprise,String siret, int numeroRepresentant, String nom, String prenom,int numeroVoie, String adresse,String complementAdresse, String ville, String mail, String numerotel, String pays, String codePostal) {
        super(nom, prenom, numeroVoie, adresse,complementAdresse, ville,mail,numerotel, pays, codePostal);
        this.nomEntreprise=nomEntreprise;
        this.siret = siret;
        this.numeroRepresentant = numeroRepresentant;
        numeroProspect= increment;
        increment ++;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public Date getDerniereVisite() {
        return derniereVisite;
    }

    public void setDerniereVisite(Date derniereVisite) {
        this.derniereVisite = derniereVisite;
    }

    public int getNumeroProspect() {
        return numeroProspect;
    }

    public void setNumeroProspect(int numeroProspect) {
        this.numeroProspect = numeroProspect;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public int getNumeroRepresentant() {
        return numeroRepresentant;
    }

    public void setNumeroRepresentant(int numeroRepresentant) {
        this.numeroRepresentant = numeroRepresentant;
    }

    public static int getIncrement() {
        return increment;
    }

    public static void setIncrement(int increment) {
        Prospects.increment = increment;
    }
    
}
