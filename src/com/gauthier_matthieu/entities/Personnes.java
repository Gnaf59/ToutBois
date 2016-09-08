/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

/**
 * Contient toutes les données relative aux personnes et fourni les accesseurs et mutateurs pour chacune de ses données.
 * @author glantoine
 */
public class Personnes {
    private String nom,prenom,adresse,complementAdresse,ville,mail,numerotel,pays,codePostal;
    private int numeroVoie;
    /**
     * Constructeur initialisant toute les données obligatoires des personnes
     * 
     * @param nom : nom de la personne
     * @param prenom : prenom de la personne
     * @param numeroVoie : numéro de la voie de la personne
     * @param adresse : Adresse de la personne
     * @param complementAdresse : Complement d'adresse de la personne
     * @param ville : Ville de la personne
     * @param mail : mail de la personne
     * @param numerotel : numéro de téléphone de la personne
     * @param pays : pays de la personne
     * @param codePostal : code postal de la personne
     */
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
    /**
    * Permet d'obtenir le complément d'adresse de la personne
     * @return le complément d'adresse
    */
    public String getComplementAdresse() {
        return complementAdresse;
    }
    /**
    * Permet de modifier le complément d'adresse de la personne
    * @param complementAdresse Complément d'adresse
    */
    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }
    /**
    * Permet d'obtenir le numéro de voie de la personne
     * @return le numéro de voie
    */
    public int getNumeroVoie() {
        return numeroVoie;
    }
    /**
    * Permet de modifier le numéro de voie de la personne
    * @param numeroVoie Numéro de la voie
    */
    public void setNumeroVoie(int numeroVoie) {
        this.numeroVoie = numeroVoie;
    }
    /**
    * Permet d'obtenir le nom de la personne
     * @return le nom
    */
    public String getNom() {
        return nom;
    }
    /**
    * Permet de modifier le nom de la personne
    * @param nom Nom de la personne
    */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
    * Permet d'obtenir le prénom de la personne
     * @return le prénom
    */
    public String getPrenom() {
        return prenom;
    }
    /**
    * Permet de modifier le prénom de la personne
     * @param prenom Prénom de la personne
    */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    /**
    * Permet d'obtenir l'adresse de la personne
     * @return l'adresse
    */
    public String getAdresse() {
        return adresse;
    }
    /**
    * Permet de modifier l'adresse de la personne
    * @param adresse Adresse de la personne
    */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    /**
    * Permet d'obtenir la ville de la personne
     * @return La ville
    */
    public String getVille() {
        return ville;
    }
    /**
    * Permet de modifier la ville de la personne
    * @param ville Ville de la personne
    */
    public void setVille(String ville) {
        this.ville = ville;
    }
    /**
    * Permet d'obtenir le mail de la personne
     * @return Le mail
    */
    public String getMail() {
        return mail;
    }
    /**
    * Permet de modifier le mail de la personne
    * @param mail Email de la personne
    */
    public void setMail(String mail) {
        this.mail = mail;
    }
    /**
    * Permet d'obtenir le numéro de téléphone de la personne
    * @return le numéro de téléphone
    */
    public String getNumerotel() {
        return numerotel;
    }
    /**
    * Permet de modifier le numéro de téléphone de la personne
     * @param numerotel numéro de téléphone
    */
    public void setNumerotel(String numerotel) {
        this.numerotel = numerotel;
    }
    /**
    * Permet d'obtenir le pays de la personne
     * @return Le pays
    */
    public String getPays() {
        return pays;
    }
    /**
    * Permet de modifier le pays de la personne
    * @param pays Pays
    */
    public void setPays(String pays) {
        this.pays = pays;
    }
    /**
    * Permet d'obtenir le Code postal la personne
     * @return Le code postal
    */
    public String getCodePostal() {
        return codePostal;
    }
    /**
    * Permet de modifier le Code postal de la personne
    * @param codePostal Code postal
    */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    
    
    
    
}
