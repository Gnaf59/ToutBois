/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.metier;

import java.util.Date;

/**
 * Contient toutes les données relative aux Prospects et fourni les accesseurs
 * et mutateurs pour chacune de ses données.
 *
 * @author glantoine
 */
public class Prospects extends Personnes {

    private String nomEntreprise, siret;
    private Date derniereVisite;
    private int numeroProspect, numeroRepresentant;

    /**
     * Constructeur initialisant toute les données du Prospect
     *
     * @param nom nom du Prospect
     * @param prenom prenom du Prospect
     * @param numeroVoie numero de la voie
     * @param adresse adresse de l'entreprise prospect
     * @param complementAdresse complément d'adresse
     * @param ville ville de l'entreprise prospect
     * @param mail mail du contact prospect
     * @param numerotel numéro de télephone du contact prospect
     * @param pays pays ou est situé l'entreprise du prospect
     * @param codePostal code postal de l'entreprise du prospect
     * @param nomEntreprise nom de l'entreprise du prospect
     * @param siret numéro de siret de l'entreprise
     * @param numeroRepresentant numéro du représentant qui suit le représentant
     * @param derniereVisite date de dernière visite par le représentant
     */
    public Prospects(String nom, String prenom, int numeroVoie, String adresse, String complementAdresse, String ville, String mail, String numerotel, String pays, String codePostal, String nomEntreprise, String siret, int numeroRepresentant, Date derniereVisite) {
        super(nom, prenom, numeroVoie, adresse, complementAdresse, ville, mail, numerotel, pays, codePostal);
        this.nomEntreprise = nomEntreprise;
        this.siret = siret;
        this.numeroRepresentant = numeroRepresentant;
        this.derniereVisite = derniereVisite;

    }

    /**
     * Constructeur initialisant toute les données du Prospect
     *
     * @param numeroProspect numéro de prospect
     * @param nom nom du Prospect
     * @param prenom prenom du Prospect
     * @param numeroVoie numero de la voie
     * @param adresse adresse de l'entreprise prospect
     * @param complementAdresse complément d'adresse
     * @param ville ville de l'entreprise prospect
     * @param mail mail du contact prospect
     * @param numerotel numéro de télephone du contact prospect
     * @param pays pays ou est situé l'entreprise du prospect
     * @param codePostal code postal de l'entreprise du prospect
     * @param nomEntreprise nom de l'entreprise du prospect
     * @param siret numéro de siret de l'entreprise
     * @param numeroRepresentant numéro du représentant qui suit le représentant
     * @param derniereVisite date de dernière visite par le représentant
     */
    public Prospects(int numeroProspect, String nom, String prenom, String nomEntreprise, String siret, int numeroVoie, String adresse, String complementAdresse, String ville, String codePostal, String pays, String mail, String numerotel, int numeroRepresentant, Date derniereVisite) {
        super(nom, prenom, numeroVoie, adresse, complementAdresse, ville, mail, numerotel, pays, codePostal);
        this.nomEntreprise = nomEntreprise;
        this.siret = siret;
        this.numeroRepresentant = numeroRepresentant;
        this.derniereVisite = derniereVisite;

        this.numeroProspect = numeroProspect;

    }

    /**
     * Permet d'obtenir le nom de l'entreprise du prospect
     *
     * @return le nom de l'entreprise
     */
    public String getNomEntreprise() {
        return nomEntreprise;
    }

    /**
     * Permet de modifier le nom de l'entreprise du prospect
     *
     * @param nomEntreprise nom de l'entreprise
     */
    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    /**
     * Permet d'obtenir la date de dernière visite du représentant
     *
     * @return date de dernière visite du représentant
     */
    public Date getDerniereVisite() {
        return derniereVisite;
    }

    /**
     * Permet de modifier la date de dernière visite du représentant
     *
     * @param derniereVisite
     */
    public void setDerniereVisite(Date derniereVisite) {
        this.derniereVisite = derniereVisite;
    }

    /**
     * Permet d'obtenir le numéro de prospect
     *
     * @return numéro du prospect
     */
    public int getNumeroProspect() {
        return numeroProspect;
    }

    /**
     * Permet de modifier ole numéro du prospect
     *
     * @param numeroProspect numéro du prospect
     */
    public void setNumeroProspect(int numeroProspect) {
        this.numeroProspect = numeroProspect;
    }

    /**
     * permet d'obtenir le numéro de SIRET de l'entreprise du prospect
     *
     * @return le numéro de SIRET
     */
    public String getSiret() {
        return siret;
    }

    /**
     * Permet de modifier le numéro du siret
     *
     * @param siret
     */
    public void setSiret(String siret) {
        this.siret = siret;
    }

    /**
     * permet d'obtenir le numéro de représentant qui suis le prospect
     *
     * @return le numéro du représentant
     */
    public int getNumeroRepresentant() {
        return numeroRepresentant;
    }

    /**
     * permet de changer le numéro de représentant qui suis le prospect
     *
     * @param numeroRepresentant
     */
    public void setNumeroRepresentant(int numeroRepresentant) {
        this.numeroRepresentant = numeroRepresentant;
    }

}
