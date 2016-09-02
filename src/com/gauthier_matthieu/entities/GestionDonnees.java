/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
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
        
    // lire le fichier client 
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
                    
                    this.clients= this.EnregistrerClientsCollection(Integer.parseInt(enregistrement[0]),enregistrement[1], enregistrement[2], enregistrement[3], Integer.parseInt(enregistrement[4]), Integer.parseInt(enregistrement[5]), enregistrement[6], enregistrement[7],enregistrement[8], enregistrement[9], enregistrement[10], enregistrement[11], enregistrement[12], Integer.parseInt(enregistrement[13]),Integer.parseInt(enregistrement[14]));
                }
            }
        }     
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage(), "Erreur Chargement des données", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    public HashMap<Integer,Clients> EnregistrerClientsCollection(String nomContact,String prenomContact,String societe,int siret,int numeroVoie,String adresse,String complementAdresse,String ville,String codePostal,String pays,int numeroRepresentant,String telephone,String mail)
    {
        //Enregistre le client dans la collection
        Clients objetClient=new Clients(societe,siret , numeroRepresentant, nomContact, prenomContact, numeroVoie, adresse, complementAdresse, ville, mail, telephone, pays, codePostal);
        this.clients.put(objetClient.getNumeroClient(), objetClient);
        return this.clients;
    }
    //Sert pour charger les données du fichier Clients.txt
    public HashMap<Integer,Clients> EnregistrerClientsCollection(int numeroClient,String nomContact,String prenomContact,String societe,int siret,int numeroVoie,String adresse,String complementAdresse,String ville,String codePostal,String pays,String mail,String telephone,int nbrCommande,int numeroRepresentant)
    {
        //Enregistre le client dans la collection
        Clients objetClient=new Clients(societe,siret , numeroRepresentant, nomContact, prenomContact, numeroVoie, adresse, complementAdresse, ville, mail, telephone, pays, codePostal);
        objetClient.setNumeroClient(numeroClient);
        objetClient.setNbrCommande(nbrCommande);
        this.clients.put(objetClient.getNumeroClient(), objetClient);
        return this.clients;
    }
    
    public void EnregistrerClientsFichier()
    {
        Iterator i = this.clients.keySet().iterator();
        int clef;
        Clients valeur;
        String chaineEnregistrement;
        
        
        try{
            File ff = new File("Clients.txt");
            
            ff.createNewFile();
            BufferedWriter ffw = new BufferedWriter(new FileWriter(ff));
            
            
            while (i.hasNext())
            {
                clef = (int)i.next();
                valeur = (Clients)clients.get(clef);

                chaineEnregistrement= Integer.toString(valeur.getNumeroClient())+";"
                                      +valeur.getNom()+";"
                                      +valeur.getPrenom()+";"
                                      +valeur.getEntreprise()+";"
                                      +Integer.toString(valeur.getSiret())+";"
                                      +Integer.toString(valeur.getNumeroVoie())+";"
                                      +valeur.getAdresse()+";"
                                      +valeur.getComplementAdresse()+";"
                                      +valeur.getVille()+";"
                                      +valeur.getCodePostal()+";"
                                      +valeur.getPays()+";"
                                      +valeur.getMail()+";"
                                      +valeur.getNumerotel()+";"
                                      +Integer.toString(valeur.getNbrCommande())+";"
                                      +Integer.toString(valeur.getNumeroRepresentant());
                
                ffw.write(chaineEnregistrement);
                ffw.newLine();                
            }
            ffw.close();            
            } 
            catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
            }
                
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
