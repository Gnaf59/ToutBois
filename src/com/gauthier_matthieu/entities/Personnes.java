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
public class Personnes {
    private String nom,prenom,adresse,complementAdresse,ville,mail,numerotel,pays,codePostal;
    private int numeroVoie;

    public Personnes(String nom, String prenom,int numeroVoie, String adresse,String complementAdresse, String ville,String mail,String numerotel, String pays, String codePostal) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroVoie= numeroVoie;
        this.adresse = adresse;
        this.complementAdresse=complementAdresse;
        this.ville = ville;
        this.pays = pays;
        this.codePostal = codePostal;
        this.mail=mail;
        this.numerotel=numerotel;
    }

    public String getComplementAdresse() {
        return complementAdresse;
    }

    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }

    public int getNumeroVoie() {
        return numeroVoie;
    }

    public void setNumeroVoie(int numeroVoie) {
        this.numeroVoie = numeroVoie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumerotel() {
        return numerotel;
    }

    public void setNumerotel(String numerotel) {
        this.numerotel = numerotel;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    
    
    
    
}