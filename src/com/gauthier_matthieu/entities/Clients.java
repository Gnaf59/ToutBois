/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

/**
 *
 * @author glantoine
 */
public class Clients extends Personnes {
    
    private String nomEntreprise;
    private int siret,numeroClient,nbrCommande,numeroRepresentant;
    private static int increment=1;

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public void setNumeroClient(int numeroClient) {
        this.numeroClient = numeroClient;
    }
    

    public Clients(String nomEntreprise,int siret, int numeroRepresentant,String nom, String prenom,int numeroVoie, String adresse,String complementAdresse, String ville,String mail,String numerotel, String pays, String codePostal) {
        super(nom, prenom,numeroVoie, adresse,complementAdresse, ville,mail,numerotel, pays, codePostal);
        this.nomEntreprise=nomEntreprise;
        this.siret = siret;
        this.numeroRepresentant = numeroRepresentant;
        this.numeroClient=increment;
        increment++;
        this.nbrCommande=0;
    }

    public static int getIncrement() {
        return increment;
    }

    public static void setIncrement(int increment) {
        Clients.increment = increment;
    }

    public int getSiret() {
        return siret;
    }

    public void setSiret(int siret) {
        this.siret = siret;
    }

    public int getNbrCommande() {
        return nbrCommande;
    }

    public void setNbrCommande(int nbrCommande) {
        this.nbrCommande = nbrCommande;
    }

    public int getNumeroRepresentant() {
        return numeroRepresentant;
    }

    public void setNumeroRepresentant(int numeroRepresentant) {
        this.numeroRepresentant = numeroRepresentant;
    }

    public int getNumeroClient() {
        return numeroClient;
    }


    
}
