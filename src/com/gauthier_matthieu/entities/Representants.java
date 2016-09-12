/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author glantoine
 */
public class Representants extends Personnes{
    
    private int numeroRepresentant;
    private static int increment=1;
    private double salaireBrut,tauxCommission;
    //private HashMap<Integer,Clients> numeroClient;
    //private HashMap<Integer,Prospects> numeroProspect;
    

    public Representants(double salaireBrut, double tauxCommission,/* HashMap numeroClient, HashMap numeroProspect,*/ String nom, String prenom, int numeroVoie, String adresse,String complementAdresse, String ville, String mail, String numerotel, String pays, String codePostal) {
        super(nom, prenom, numeroVoie, adresse,complementAdresse, ville,mail,numerotel, pays, codePostal);
        this.salaireBrut = salaireBrut;
        this.tauxCommission = tauxCommission;
        //this.numeroClient = numeroClient;
        //this.numeroProspect = numeroProspect;
        numeroRepresentant=increment;
        increment++;
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
        Representants.increment = increment;
    }

    public double getSalaireBrut() {
        return salaireBrut;
    }

    public void setSalaireBrut(double salaireBrut) {
        this.salaireBrut = salaireBrut;
    }

    public double getTauxCommission() {
        return tauxCommission;
    }

    public void setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
    }
    
   
}
