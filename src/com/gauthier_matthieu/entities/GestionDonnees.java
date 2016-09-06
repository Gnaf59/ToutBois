/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author glantoine
 */
public class GestionDonnees {

    
    
    private static HashMap<Integer,Clients> clients=new HashMap<>();
    private static HashMap<Integer,Representants> representants=new HashMap<>();
    private static HashMap<Integer,Prospects> prospects=new HashMap<>();
    
    
    public HashMap<Integer, Clients> getClients() {
        return clients;
    }

    public HashMap<Integer, Representants> getRepresentants() {
        return representants;
    }

    public HashMap<Integer, Prospects> getProspects() {
        return prospects;
    }

    public void ChargerDoneesClients() throws NullPointerException
    {
    //File ff = new File("Clients.txt");    
    // lire le fichier client 
        try {
                InputStream ips = new FileInputStream("Clients.txt");
                InputStreamReader ipsr = new InputStreamReader(ips,"UTF-8");
                BufferedReader br = new BufferedReader(ipsr); 
                
                String ligne;
                String[] enregistrement;
                
                
                //parcours toutes les lignes du fichier Clients.txt
                while ((ligne = br.readLine()) != null)
                {
                    //décompose une ligne du fichier Clients.txt en tableau de String
                    enregistrement=ligne.split(";");
                    EnregistrerClientsCollection(Integer.parseInt(enregistrement[0]),enregistrement[1], enregistrement[2], enregistrement[3], Integer.parseInt(enregistrement[4]), Integer.parseInt(enregistrement[5]), enregistrement[6], enregistrement[7],enregistrement[8], enregistrement[9], enregistrement[10], enregistrement[11], enregistrement[12], Integer.parseInt(enregistrement[13]),Integer.parseInt(enregistrement[14]));
                    //EnregistrerClientsCollection(1,"Bernard","Henri","pasunclou",222222,89,"Rue des perdu","","Ville","9999","France","bof@pasunclou.fr","0000",0,0);
                }
            
         
            //Met l'incrément de La classe client à la valeur du plus haut numéro de client inclus 
            InitialisationIncrementNumeroClient();
        }     
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage(), "Erreur Chargement des données", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    private void InitialisationIncrementNumeroClient()
    {
        Iterator i = this.clients.keySet().iterator();
        int clef;
        Clients valeur;
        Clients.setIncrement(0);
        while (i.hasNext())
            {
                clef = (int)i.next();
                valeur = (Clients)clients.get(clef);
                
                if (valeur.getIncrement()<valeur.getNumeroClient())
                {
                    Clients.setIncrement(valeur.getNumeroClient()+1);
                }
            }
        
    }
    public void SupprimerClientsCollection (int numClient)
    {
        this.clients.remove(numClient);
        
    }
    public void EnregistrerClientsCollection(String nomContact,String prenomContact,String societe,int siret,int numeroVoie,String adresse,String complementAdresse,String ville,String codePostal,String pays,String mail,String telephone,int nbrCommande,int numeroRepresentant)
    {
        //Enregistre le client dans la collection
        Clients objetClient=new Clients(societe,siret , numeroRepresentant, nomContact, prenomContact, numeroVoie, adresse, complementAdresse, ville, mail, telephone, pays, codePostal);
        this.clients.put(objetClient.getNumeroClient(), objetClient);
        
        
    }
    //Sert pour charger les données du fichier Clients.txt
    public void EnregistrerClientsCollection(int numeroClient,String nomContact,String prenomContact,String societe,int siret,int numeroVoie,String adresse,String complementAdresse,String ville,String codePostal,String pays,String mail,String telephone,int nbrCommande,int numeroRepresentant)
    {
        //Enregistre le client dans la collection
        Clients objetClient=new Clients(societe,siret , numeroRepresentant, nomContact, prenomContact, numeroVoie, adresse, complementAdresse, ville, mail, telephone, pays, codePostal);
        objetClient.setNumeroClient(numeroClient);
        objetClient.setNbrCommande(nbrCommande);
        this.clients.put(numeroClient, objetClient);
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
            //BufferedWriter ffw = new BufferedWriter(new FileWriter(ff));
            PrintWriter ffw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ff),"utf8")));
            
            while (i.hasNext())
            {
                clef = (int)i.next();
                valeur = (Clients)clients.get(clef);

                chaineEnregistrement= Integer.toString(valeur.getNumeroClient())+";"
                                      +valeur.getNom()+";"
                                      +valeur.getPrenom()+";"
                                      +valeur.getNomEntreprise()+";"
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
                
                ffw.write(chaineEnregistrement+"\n");
                //ffw.newLine();                
            }
            ffw.close();            
            } 
            catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
            }
                
    }
    
    public void EnregistrerProspectsCollection()
    {
    
    
    }
    
    public void EnregistrerProspectsFichier()
    {
    
    
    }
    
    public void EnregistrerRepresentantsCollection()
    {
    
    
    }
    
    public void EnregistrerRepresentantsFichier()
    {
    
    
    }
}