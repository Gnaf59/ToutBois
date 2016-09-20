/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

/**
 *
 * @author mdeschamps
 */
public class Articles {
    private String nom,type,genre,reference,couleur;
    private int numeroArticle,stock;
    private double hauteur,longueur,largeur,prixHt,tva,poids;

    public Articles(int numeroArticle,String nom, String type, String genre, String reference, 
            String couleur,  int stock, double hauteur, double longueur, double largeur, 
            double prixHt, double tva, double poids) {
        this.numeroArticle = numeroArticle;
        this.nom = nom;
        this.type = type;
        this.genre = genre;
        this.reference = reference;
        this.couleur = couleur;
        this.stock = stock;
        this.hauteur = hauteur;
        this.longueur = longueur;
        this.largeur = largeur;
        this.prixHt = prixHt;
        this.tva = tva;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNumeroArticle() {
        return numeroArticle;
    }

    public void setNumeroArticle(int numeroArticle) {
        this.numeroArticle = numeroArticle;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getPrixHt() {
        return prixHt;
    }

    public void setPrixHt(double prixHt) {
        this.prixHt = prixHt;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    

      
    /**
     * Constructeur initialisant toute les données obligatoires pour les Articles
     * 
     * @param nom : nom de l'article
     * @param type : type d'article
     * @param genre : genre d'article
     * @param reference : reference d'article
     * @param couleur : couleur d'article
     * @param dimension : dimension d'article
     * @param prixHtHt : prixHtHt d'article
     * @param tva : tva de l'article
     * @param codeBarre : codeBarre de l'article
     */

    
    
    /**
    * Permet d'obtenir le nom de l'article
    * @return le nom de l'article
    */
   
    
    
    
    /**
    * Permet de modifier nom de l'article
    * @param nom nom
    */    

    
    
    
    
    
    
    
}


