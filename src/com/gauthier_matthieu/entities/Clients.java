/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

/**
 * Contient toutes les données relative aux Clients et fourni les accesseurs et mutateurs pour chacune de ses données.
 * @author glantoine
 */
public class Clients extends Personnes {
    
    private String nomEntreprise;
    private int siret,numeroClient,nbrCommande,numeroRepresentant;
    private static int increment=1;
    
    /**
    * Permet de modifier le nom de l'entreprise client
     * @param nomEntreprise : nom de l'entreprise cliente
    */
    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }
    
    /**
    * Permet de modifier le numéro de client pour le chargement des clients du fichier clients.txt
     * @param numeroClient : Numéro de client
    */
    public void setNumeroClient(int numeroClient) {
        this.numeroClient = numeroClient;
    }
    
    /**
     * Constructeur initialisant toute les données obligatoires du client
     * 
     * @param nomEntreprise : Nom de l'entreprise cliente
     * @param siret : Numéro de SIRET de l'entreprise cliente
     * @param numeroRepresentant :Numéro du représentant suivant le client
     * @param nom : Nom du contact de l'entreprise cliente
     * @param prenom : Prénom du contact de l'entreprise cliente
     * @param numeroVoie : Numéro de la voie de l'entreprise cliente
     * @param adresse : Adresse de l'entreprise cliente
     * @param complementAdresse : complément d'adresse de l'entreprise cliente
     * @param ville : Ville ou est situé l'entreprise cliente
     * @param mail :Mail du contact au sein de l'entreprise cliente
     * @param numerotel : Numéro de ltéléphone au sein de l'entreprise cliente
     * @param pays : Pays ou est situé l'entreprise cliente
     * @param codePostal : Code postal de l'entreprise cliente
    */
    public Clients(String nomEntreprise,int siret, int numeroRepresentant,String nom, String prenom,int numeroVoie, String adresse,String complementAdresse, String ville,String mail,String numerotel, String pays, String codePostal) {
        super(nom, prenom,numeroVoie, adresse,complementAdresse, ville,mail,numerotel, pays, codePostal);
        this.nomEntreprise=nomEntreprise;
        this.siret = siret;
        this.numeroRepresentant = numeroRepresentant;
        this.numeroClient=increment;
        increment++;
        this.nbrCommande=0;
    }
    
    /**
    * Permet d'obtenir le numéro de SIRET de l'entreprise cliente
     * @return le numéro de SIRET
    */
    public int getSiret() {
        return siret;
    }
    /**
    * Permet d'obtenir l'incrément servant a donner le numéro de client.
     * @return l'incrément
    */
    public static int getIncrement() {
        return increment;
    }
    /**
    * Permet de modifier l'incrément servant a donner le numéro de client au moment du chargement du fichier clients.txt
    * afin de l'initialiser avec le plus haut numéro de client.
     * @param increment Compteur de Client
    */
    public static void setIncrement(int increment) {
        Clients.increment = increment;
    }
    /**
    * Permet de modifier le numéro de SIRET
     * @param siret Numéro de SIRET
    */
    public void setSiret(int siret) {
        this.siret = siret;
    }
    /**
    * Permet d'obtenir le nombre de commandes du client.
     * @return le nombre de commandes
    */
    public int getNbrCommande() {
        return nbrCommande;
    }
    /**
    * Permet d'obtenir le nom de l'entreprise cliente
     * @return le nom de l'entreprise 
    */
    public String getNomEntreprise() {
        return nomEntreprise;
    }
    /**
    * Permet de modifier le nombre de commande du client
     * @param nbrCommande Nombre de commande
    */
    public void setNbrCommande(int nbrCommande) {
        this.nbrCommande = nbrCommande;
    }
    /**
    * Permet d'obtenir le numéro du représentant
     * @return le numéro du représentant
    */
    public int getNumeroRepresentant() {
        return numeroRepresentant;
    }
    /**
    * Permet de modifier le numéro du représentant
     * @param numeroRepresentant Numéro de représentant
    */
    public void setNumeroRepresentant(int numeroRepresentant) {
        this.numeroRepresentant = numeroRepresentant;
    }
    /**
    * Permet d'obtenir le numéro du client.
     * @return le numéro du client 
    */
    public int getNumeroClient() {
        return numeroClient;
    }


    
}
