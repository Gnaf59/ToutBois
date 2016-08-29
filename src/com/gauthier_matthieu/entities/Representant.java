/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import java.util.ArrayList;

/**
 *
 * @author glantoine
 */
public class Representant extends Personne{
    
    private int numeroRepresantant;
    private static int increment=1;
    private double salaireBrut,tauxCommission;
    private ArrayList numeroClient,numeroProspect;

    

    public Representant(double salaireBrut, double tauxCommission, ArrayList numeroClient, ArrayList numeroProspect, String nom, String prenom, String entreprise, String adresse, String ville, String mail, String numerotel, String pays, String codePostal) {
        super(nom, prenom, entreprise, adresse, ville, mail, numerotel, pays, codePostal);
        this.salaireBrut = salaireBrut;
        this.tauxCommission = tauxCommission;
        this.numeroClient = numeroClient;
        this.numeroProspect = numeroProspect;
        numeroRepresantant=increment;
        increment++;
    }
    
    
}