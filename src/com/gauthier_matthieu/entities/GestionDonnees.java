/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author glantoine
 */
public class GestionDonnees {
    
    private HashMap<Integer,Clients> clients;
    private HashMap<Integer,Representants> representants;
    private HashMap<Integer,Prospects> prospects;

    public HashMap<Integer, Clients> getClients() {
        return clients;
    }

    public void setClients(HashMap<Integer, Clients> clients) {
        this.clients = clients;
    }

    public HashMap<Integer, Representants> getRepresentants() {
        return representants;
    }

    public void setRepresentants(HashMap<Integer, Representants> representants) {
        this.representants = representants;
    }

    public HashMap<Integer, Prospects> getProspects() {
        return prospects;
    }

    public void setProspects(HashMap<Integer, Prospects> prospects) {
        this.prospects = prospects;
    }

    public void ChargerDoneesClients()
    {
        
    // lire le fichier client et remplir data avec
        try {
                InputStream ips = new FileInputStream("Clients.txt");
                InputStreamReader ipsr = new InputStreamReader(ips,"UTF-8");
            try (BufferedReader br = new BufferedReader(ipsr)) {
                
                String ligne;
                String[] enregistrement;
                
                
                //parcours toutes les lignes du fichier Clients.txt
                while ((ligne = br.readLine()) != null)
                {
                    //décompose une ligne du fichier Clients.txt en 
                    enregistrement=ligne.split(";");
                    
                    
                    Clients client=new Clients(
                            Integer.parseInt(enregistrement[9]),
                            Integer.parseInt(enregistrement[10]),
                            Integer.parseInt(enregistrement[11]),
                            Integer.parseInt(enregistrement[12]),
                            enregistrement[0],
                            enregistrement[1],
                            enregistrement[2],
                            enregistrement[3],
                            enregistrement[4],
                            enregistrement[5],
                            enregistrement[6],
                            enregistrement[7],
                            enregistrement[8]);
                }
            }
        }     
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage(), "Erreur Chargement des données", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    /*public HashMap<Integer,Clients> EnregistrerClientsCollection()
    {
    
    
    }*/
    
    public void EnregistrerClientsFichier()
    {
    
    
    }
    
    /*public HashMap<Integer,Prospects> EnregistrerProspectsCollection()
    {
    
    
    }*/
    
    public void EnregistrerProspectsFichier()
    {
    
    
    }
    
    /*public HashMap<Integer,Representants> EnregistrerRepresentantsCollection()
    {
    
    
    }*/
    
    public void EnregistrerRepresentantsFichier()
    {
    
    
    }
}
