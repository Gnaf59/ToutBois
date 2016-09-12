/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * Classe permettant de s'occuper de toute la gestion des données de l'application
 * comme le chargement et l'enregistrement des fichiers Clients.txt, Prospects.txt, Representant.txt et permet l'accés au données dans toute l'application.
 * @author glantoine
 */
public class GestionDonnees {

    
    
    private static HashMap<Integer,Clients> clients=new HashMap<>();
    private static HashMap<Integer,Representants> representants=new HashMap<>();
    private static HashMap<Integer,Prospects> prospects=new HashMap<>();
    
    /**
     * 
     * @return 
     */
    
    public HashMap<Integer, Clients> getClients() {
        return clients;
    }

    public HashMap<Integer, Representants> getRepresentants() {
        return representants;
    }

    public HashMap<Integer, Prospects> getProspects() {
        return prospects;
    }

    public void ChargerDonneesClients()
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
                    EnregistrerClientsCollection(Integer.parseInt(enregistrement[0]),enregistrement[1], enregistrement[2], enregistrement[3], enregistrement[4], Integer.parseInt(enregistrement[5]), enregistrement[6], enregistrement[7],enregistrement[8], enregistrement[9], enregistrement[10], enregistrement[11], enregistrement[12], Integer.parseInt(enregistrement[13]),Integer.parseInt(enregistrement[14]));
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
        Iterator i = GestionDonnees.clients.keySet().iterator();
        int clef;
        Clients valeur;
        Clients.setIncrement(1);
        while (i.hasNext())
            {
                clef = (int)i.next();
                valeur = (Clients)clients.get(clef);
                
                if (Clients.getIncrement()<valeur.getNumeroClient())
                {
                    Clients.setIncrement(valeur.getNumeroClient()+1);
                }
            }
        
    }
    public void SupprimerClientsCollection (int numClient)
    {
        GestionDonnees.clients.remove(numClient);
        
    }
    public void EnregistrerClientsCollection(String nomContact,String prenomContact,String societe,String siret,int numeroVoie,
            String adresse,String complementAdresse,String ville,String codePostal,String pays,String mail,String telephone,
            int nbrCommande,int numeroRepresentant)
    {
        //Enregistre le client dans la collection
        Clients objetClient=new Clients(societe,siret , numeroRepresentant, nomContact, prenomContact, numeroVoie, adresse, complementAdresse, ville, mail, telephone, pays, codePostal);
        GestionDonnees.clients.put(objetClient.getNumeroClient(), objetClient);
    
    }
    //Sert pour charger les données du fichier Clients.txt
    public void EnregistrerClientsCollection(int numeroClient,String nomContact,String prenomContact,String societe,String siret,
            int numeroVoie,String adresse,String complementAdresse,String ville,String codePostal,String pays,String mail,
            String telephone,int nbrCommande,int numeroRepresentant)
    {
        //Enregistre le client dans la collection
        Clients objetClient=new Clients(societe,siret , numeroRepresentant, nomContact, prenomContact, numeroVoie, adresse, complementAdresse, ville, mail, telephone, pays, codePostal);
        objetClient.setNumeroClient(numeroClient);
        objetClient.setNbrCommande(nbrCommande);
        GestionDonnees.clients.put(numeroClient, objetClient);
    }
    
    public void EnregistrerClientsFichier()
    {
        Iterator i = GestionDonnees.clients.keySet().iterator();
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
                                      +valeur.getSiret()+";"
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
    
    
    //-------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------
    
    
    public void ChargerDonneesProspect()
    {
       
            try {
                InputStream ips = new FileInputStream("Prospects.txt");
                InputStreamReader ipsr = new InputStreamReader(ips,"UTF-8");
                BufferedReader br = new BufferedReader(ipsr); 
                
                String ligne;
                String[] enregistrement;
                DateFormat sdf =DateFormat.getDateInstance(DateFormat.SHORT,Locale.getDefault());
                
                //parcours toutes les lignes du fichier Clients.txt
                while ((ligne = br.readLine()) != null)
                {
                   enregistrement=ligne.split(";");
                   EnregistrerProspectsExistantCollection(Integer.parseInt(enregistrement[0]),enregistrement[1],
                           enregistrement[2],enregistrement[3],Integer.parseInt(enregistrement[4]),
                           Integer.parseInt(enregistrement[5]),enregistrement[6],enregistrement[7],
                           enregistrement[8],enregistrement[9],enregistrement[10],enregistrement[11],
                           enregistrement[12],Integer.parseInt(enregistrement[13]),sdf.parse(enregistrement[14]));
                }
            
            //Met l'incrément de La classe client à la valeur du plus haut numéro de client inclus 
            //InitialisationIncrementNumeroClient();
        }     
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage(), "Erreur Chargement des données", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    
    
    public void EnregistrerProspectsExistantCollection(int numeroProspect,String nomContact,String prenomContact,String societe,
            int siret,int numeroVoie,String adresse,String complementAdresse,String ville,
            String codePostal,String pays,String mail,String telephone,int numeroRepresentant,Date derniereVisite)
    {
        try
        {
         
        //Enregistre le Prospect dans la collection
        Prospects objetProspect=new Prospects(societe,siret,numeroRepresentant,nomContact,prenomContact, numeroVoie, adresse, complementAdresse, ville, mail, telephone, pays, codePostal);
        objetProspect.setNumeroProspect(numeroProspect);
        objetProspect.setDerniereVisite(derniereVisite);
        
        GestionDonnees.prospects.put(numeroProspect, objetProspect);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage(), "Erreur conversion date", JOptionPane.ERROR_MESSAGE);
        }
         
    }
    
    
    public void EnregistrerNouveauProspectsCollection(String nomContact,String prenomContact,String societe,
            int siret,int numeroVoie,String adresse,String complementAdresse,String ville,
            String codePostal,String pays,String mail,String telephone,int numeroRepresentant,Date derniereVisite)
    {
        //Enregistre le Prospect dans la collection
        Prospects objetProspect=new Prospects(societe,siret,numeroRepresentant,nomContact,prenomContact, numeroVoie, adresse, complementAdresse, ville, mail, telephone, pays, codePostal);
        objetProspect.setDerniereVisite(derniereVisite);
        // on prend le numero de client existant dans l'objet prospect 
        GestionDonnees.prospects.put(objetProspect.getNumeroProspect(),objetProspect);
    }
    
    public void EnregistrerProspectsFichier()
    {
        Iterator i = GestionDonnees.prospects.keySet().iterator();
        int clef;
        Prospects valeur; // valeur à l'indice ou clef 
        String chaineEnregistrement;
        
        
        try{
            
            
            
            
            
            File ff = new File("Prospects.txt");
            
            ff.createNewFile();
            PrintWriter ffw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ff),"utf8")));
            
            while (i.hasNext())
            {
                clef = (int)i.next();
                valeur = (Prospects)prospects.get(clef);
                
                
                        SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
                        String dateString= df.format(valeur.getDerniereVisite());
                                      
                chaineEnregistrement= Integer.toString(valeur.getNumeroProspect())+";"
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
                                      +Integer.toString(valeur.getNumeroRepresentant())+";"
                                      +dateString;
                
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
    
    
    
    
    public void EnregistrerRepresentantsCollection()
    {
    
    
    }
    
    public void EnregistrerRepresentantsFichier()
    {
    
    
    }
}