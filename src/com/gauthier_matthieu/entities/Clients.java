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
    
    private int siret,numeroClient,nbrCommande,numeroRepresentant;
    private static int increment=1;
    

    public Clients(int siret, int numeroClient, int nbrCommande, int numeroRepresentant, String nom, String prenom, String entreprise, String adresse, String ville,String mail,String numerotel, String pays, String codePostal) {
        super(nom, prenom, entreprise, adresse, ville,mail,numerotel, pays, codePostal);
        this.siret = siret;
        this.numeroClient = numeroClient;
        this.nbrCommande = nbrCommande;
        this.numeroRepresentant = numeroRepresentant;
        this.numeroClient=increment;
        increment++;
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
