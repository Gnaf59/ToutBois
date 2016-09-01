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
public class GestionDonnees {
    
    private HashMap<Integer,Clients> clients;
    private HashMap<Integer,Representant> representants;
    private HashMap<Integer,Prospect> prospects;

    public HashMap<Integer, Clients> getClients() {
        return clients;
    }

    public void setClients(HashMap<Integer, Clients> clients) {
        this.clients = clients;
    }

    public HashMap<Integer, Representant> getRepresentants() {
        return representants;
    }

    public void setRepresentants(HashMap<Integer, Representant> representants) {
        this.representants = representants;
    }

    public HashMap<Integer, Prospect> getProspects() {
        return prospects;
    }

    public void setProspects(HashMap<Integer, Prospect> prospects) {
        this.prospects = prospects;
    }

    
   
    
}
