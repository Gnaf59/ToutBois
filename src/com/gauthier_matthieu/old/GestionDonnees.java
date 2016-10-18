/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.old;

import com.gauthier_matthieu.metier.Representants;
import com.gauthier_matthieu.metier.Prospects;
import com.gauthier_matthieu.metier.Clients;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JComboBox;
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
     * Methode retournant le Hashmap contenant les Clients
     * @return la liste des Clients
     */
    public HashMap<Integer, Clients> getClients() {
        return clients;
    }
    /**
     * Methode retournant le Hashmap contenant les Representants
     * @return la liste des Representants
     */
    public HashMap<Integer, Representants> getRepresentants() {
        return representants;
    }
    /**
     * Methode retournant le Hashmap contenant les Prospects
     * @return la liste des Prospects
     */
    public HashMap<Integer, Prospects> getProspects() {
        return prospects;
    }
    /**
     * Methode Permettant de charger le fichier texte Clients.txt dans le hashmap clients
     */
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
    /**
     * Methode Permettant d'initialiser l'incrément du numéro de Client.
     */
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
                
                if (Clients.getIncrement()<=valeur.getNumeroClient())
                {
                    Clients.setIncrement(valeur.getNumeroClient()+1);
                }
            }
        
    }
    /**
     * Methode Permettant de supprimer un Client à partir de son numéro de client
     * @param numClient
     */
    public void SupprimerClientsCollection (int numClient)
    {
        GestionDonnees.clients.remove(numClient);
        
    }
    /**
     * Methode Permettant d'enregistrer un client dans la collection clients en associant le numéro de client avec l'objet client
     * 
     * @param nomContact
     * @param prenomContact
     * @param societe
     * @param siret
     * @param numeroVoie
     * @param adresse
     * @param complementAdresse
     * @param ville
     * @param pays
     * @param codePostal
     * @param mail
     * @param telephone
     * @param nbrCommande
     * @param numeroRepresentant
     */
    public void EnregistrerClientsCollection(String nomContact,String prenomContact,String societe,String siret,int numeroVoie,
            String adresse,String complementAdresse,String ville,String codePostal,String pays,String mail,String telephone,
            int nbrCommande,int numeroRepresentant)
    {
        //Enregistre le client dans la collection
        Clients objetClient=new Clients(societe,siret , numeroRepresentant, nomContact, prenomContact, numeroVoie, adresse, complementAdresse, ville, mail, telephone, pays, codePostal);
        GestionDonnees.clients.put(objetClient.getNumeroClient(), objetClient);
    
    }
    /**
     * Methode Permettant d'enregistrer un client dans la collection clients lors du chargement du fichier clients.txt
     * 
     * @param numeroClient
     * @param nomContact
     * @param prenomContact
     * @param societe
     * @param siret
     * @param numeroVoie
     * @param adresse
     * @param complementAdresse
     * @param ville
     * @param pays
     * @param codePostal
     * @param mail
     * @param telephone
     * @param nbrCommande
     * @param numeroRepresentant
     */
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
    /**
     * Methode Permettant d'enregistrer un client dans le fichier clients.txt
     */
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
    /**
     * Methode Permettant d'initialiser l'incrément du numéro de Prospect.
     */
    private void InitialisationIncrementNumeroProspect()
    {
        Iterator i = this.prospects.keySet().iterator();
        int clef;
        Prospects valeur;
        Prospects.setIncrement(1);
        while (i.hasNext())
            {
                clef = (int)i.next();
                valeur = (Prospects)prospects.get(clef);
                
                if (valeur.getIncrement()<=valeur.getNumeroProspect())
                {
                    Prospects.setIncrement(valeur.getNumeroProspect()+1);
                }
            }
        
    }
    //-------------------------------------------------------------------------------------------------------------------------
    /**
     * Methode Permettant de charger le fichier texte Prospects.txt dans le hashmap prospects
     */
    public void ChargerDonneesProspect()
    {
       
            try {
                InputStream ips = new FileInputStream("Prospects.txt");
                InputStreamReader ipsr = new InputStreamReader(ips,"UTF-8");
                BufferedReader br = new BufferedReader(ipsr); 
                
                String ligne;
                String[] enregistrement;
                DateFormat sdf =DateFormat.getDateInstance(DateFormat.SHORT,Locale.getDefault());
                
                //parcours toutes les lignes du fichier Prospect.txt
                while ((ligne = br.readLine()) != null)
                {
                   enregistrement=ligne.split(";");
                   EnregistrerProspectsExistantCollection(Integer.parseInt(enregistrement[0]),enregistrement[1],
                           enregistrement[2],enregistrement[3],enregistrement[4],
                           Integer.parseInt(enregistrement[5]),enregistrement[6],enregistrement[7],
                           enregistrement[8],enregistrement[9],enregistrement[10],enregistrement[11],
                           enregistrement[12],Integer.parseInt(enregistrement[13]),sdf.parse(enregistrement[14]));
                }
            
            //Met l'incrément de La classe prospect à la valeur du plus haut numéro de prospect inclus 
            InitialisationIncrementNumeroProspect();
        }     
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage(), "Erreur Chargement des données", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    //-------------------------------------------------------------------------------------------------------------------------   
    /**
     * Methode Permettant d'enregistrer un Prospect dans la collection prospects en associant le numéro de prospect avec l'objet prospect sert pour charger le fichier prospects.txt
     * 
     * @param numeroProspect
     * @param nomContact
     * @param prenomContact
     * @param societe
     * @param siret
     * @param numeroVoie
     * @param adresse
     * @param complementAdresse
     * @param ville
     * @param pays
     * @param codePostal
     * @param mail
     * @param telephone
     * @param numeroRepresentant
     * @param derniereVisite
     */
    public void EnregistrerProspectsExistantCollection(int numeroProspect,String nomContact,String prenomContact,String societe,
            String siret,int numeroVoie,String adresse,String complementAdresse,String ville,
            String codePostal,String pays,String mail,String telephone,int numeroRepresentant,Date derniereVisite)
    {
        /*try
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
        }*/
         
    }
    //-------------------------------------------------------------------------------------------------------------------------
     /**
     * Methode Permettant d'enregistrer un Prospect dans la collection prospects en associant le numéro de prospect avec l'objet prospect pour l'ajout d'un nouveau prospect
     * 
     * @param nomContact
     * @param prenomContact
     * @param societe
     * @param siret
     * @param numeroVoie
     * @param adresse
     * @param complementAdresse
     * @param ville
     * @param pays
     * @param codePostal
     * @param mail
     * @param telephone
     * @param numeroRepresentant
     * @param derniereVisite
     */
    public void EnregistrerNouveauProspectsCollection(String nomContact,String prenomContact,String societe,
            String siret,int numeroVoie,String adresse,String complementAdresse,String ville,
            String codePostal,String pays,String mail,String telephone,int numeroRepresentant,Date derniereVisite)
    {
       /* //Enregistre le Prospect dans la collection
        Prospects objetProspect=new Prospects(societe,siret,numeroRepresentant,nomContact,prenomContact, numeroVoie, adresse, complementAdresse, ville, mail, telephone, pays, codePostal);
        objetProspect.setDerniereVisite(derniereVisite);
        // on prend le numero de client existant dans l'objet prospect 
        GestionDonnees.prospects.put(objetProspect.getNumeroProspect(),objetProspect);*/
    }
    //-------------------------------------------------------------------------------------------------------------------------
    /**
     * Methode Permettant d'enregistrer les prospects de la collection dans le fichier prospects.txt
     */
    public void EnregistrerProspectsFichier()
    {
        Iterator i = GestionDonnees.prospects.keySet().iterator();
        int clef;
        Prospects valeur; // valeur à l'indice ou clef 
        String chaineEnregistrement;
        
         try
         {
            File ff = new File("Prospects.txt");
            
            ff.createNewFile();
            PrintWriter ffw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ff),"utf8")));
            
            while (i.hasNext())
            {
                clef = (int)i.next();
                valeur = (Prospects)prospects.get(clef);
                
                
                        SimpleDateFormat df=new SimpleDateFormat();
                        String dateString= df.format(valeur.getDerniereVisite());
                                      
                chaineEnregistrement= Integer.toString(valeur.getNumeroProspect())+";"
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
                                      +Integer.toString(valeur.getNumeroRepresentant())+";"
                                      +dateString;
                
                ffw.write(chaineEnregistrement+"\n");
            }
            ffw.close();            
            } 
            catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
            }
    }
    //-------------------------------------------------------------------------------------------------------------------------
    /**
     * Methode Permettant de supprimer un Prospect à partir de son numéro de prospect
     * @param numProspect
     */
    public void SupprimerProspectsCollection (int numProspect)
    {
        GestionDonnees.prospects.remove(numProspect);
    }
    
    //-------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------
    /**
     * Methode Permettant d'initialiser l'incrément du numéro de Représentant.
     */
    private void InitialisationIncrementNumeroRepresentants()
    {
        Iterator i = GestionDonnees.representants.keySet().iterator();
        int clef;
        Representants valeur;
        Representants.setIncrement(1);
        while (i.hasNext())
            {
                clef = (int)i.next();
                valeur = (Representants)representants.get(clef);
                
                if (Representants.getIncrement()<=valeur.getNumeroRepresentant())
                {
                    Representants.setIncrement(valeur.getNumeroRepresentant()+1);
                }
            }
        
    }
    /**
     * Methode Permettant de charger le fichier texte Representants.txt dans le hashmap representants
     */
    public void ChargerDonneesRepresentants()
    {
       
            try {
                InputStream ips = new FileInputStream("Representants.txt");
                InputStreamReader ipsr = new InputStreamReader(ips,"UTF-8");
                BufferedReader br = new BufferedReader(ipsr); 
                
                String ligne;
                String[] enregistrement;               
                
                //parcours toutes les lignes du fichier Representants.txt
                while ((ligne = br.readLine()) != null)
                {
                   enregistrement=ligne.split(";");
                   EnregistrerRepresentantsCollection(Integer.parseInt(enregistrement[0]),enregistrement[1],
                           enregistrement[2],Integer.parseInt(enregistrement[3]),enregistrement[4],
                           enregistrement[5],enregistrement[6],enregistrement[7],
                           enregistrement[8],enregistrement[9],enregistrement[10],Double.parseDouble(enregistrement[11]),
                           Double.parseDouble(enregistrement[12]));
                }
            
            //Met l'incrément de La classe Representants à la valeur du plus haut numéro de prospect inclus 
            InitialisationIncrementNumeroRepresentants();
        }     
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage(), "Erreur Chargement des données", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    /**
     * Methode Permettant d'enregistrer un Representant dans la collection representants en associant le numéro de Representant avec l'objet Representant pour l'ajout d'un nouveau prospect
     * 
     * @param nomRepresentant
     * @param numeroVoie
     * @param prenomRepresentant
     * @param adresse
     * @param complementAdresse
     * @param ville
     * @param pays
     * @param codePostal
     * @param mail
     * @param numerotel
     * @param salaireBrut
     * @param tauxCommission
     */
    public void EnregistrerRepresentantsCollection(String nomRepresentant,String prenomRepresentant,int numeroVoie,String adresse,String complementAdresse,String ville,String codePostal,String pays,String mail,String numerotel,double salaireBrut,double tauxCommission)
    {
        //Enregistre le Prospect dans la collection
        Representants objetRepresentants=new Representants(salaireBrut,tauxCommission,nomRepresentant,prenomRepresentant,numeroVoie,adresse,complementAdresse,ville,mail,numerotel,pays,codePostal);
        
        // on prend le numero de Representant existant dans l'objet prospect 
        GestionDonnees.representants.put(objetRepresentants.getNumeroRepresentant(),objetRepresentants);
    
    }
    /**
     * Methode Permettant d'enregistrer un Representant dans la collection representants en associant le numéro de Representant avec l'objet Representant pour l'ajout des prospects dans la collection
     * 
     * @param numeroRepresentant
     * @param nomRepresentant
     * @param numeroVoie
     * @param prenomRepresentant
     * @param adresse
     * @param complementAdresse
     * @param ville
     * @param pays
     * @param codePostal
     * @param mail
     * @param numerotel
     * @param salaireBrut
     * @param tauxCommission
     */
    public void EnregistrerRepresentantsCollection(int numeroRepresentant,String nomRepresentant,String prenomRepresentant,int numeroVoie,String adresse,String complementAdresse,String ville,String codePostal,String pays,String mail,String numerotel,double salaireBrut,double tauxCommission)
    {
        //Enregistre le Prospect dans la collection
        Representants objetRepresentants=new Representants(salaireBrut,tauxCommission,nomRepresentant,prenomRepresentant,numeroVoie,adresse,complementAdresse,ville,mail,numerotel,pays,codePostal);
        objetRepresentants.setNumeroRepresentant(numeroRepresentant);
        // on prend le numero de Representant existant dans l'objet prospect 
        GestionDonnees.representants.put(objetRepresentants.getNumeroRepresentant(),objetRepresentants);
   
    }
    /**
     * Methode Permettant d'enregistrer les Representant de la collection dans le fichier Representant.txt
     */
    public void EnregistrerRepresentantsFichier()
    {
        Iterator i = GestionDonnees.representants.keySet().iterator();
        int clef;
        Representants valeur; // valeur à l'indice ou clef 
        String chaineEnregistrement;
        
         try
         {
            File ff = new File("Representants.txt");
            
            ff.createNewFile();
            PrintWriter ffw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ff),"utf8")));
            
            while (i.hasNext())
            {
                clef = (int)i.next();
                valeur = (Representants)representants.get(clef);
                
                
                        
                                      
                chaineEnregistrement= Integer.toString(valeur.getNumeroRepresentant())+";"
                                      +valeur.getNom()+";"
                                      +valeur.getPrenom()+";"
                                      +Integer.toString(valeur.getNumeroVoie())+";"
                                      +valeur.getAdresse()+";"
                                      +valeur.getComplementAdresse()+";"
                                      +valeur.getVille()+";"
                                      +valeur.getCodePostal()+";"
                                      +valeur.getPays()+";"
                                      +valeur.getMail()+";"
                                      +valeur.getNumerotel()+";"
                                      +Double.toString(valeur.getSalaireBrut())+";"
                                      +Double.toString(valeur.getTauxCommission());
                
                ffw.write(chaineEnregistrement+"\n");
            }
            ffw.close();            
            } 
            catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);
            }
    
    }
    /**
     * Methode Permettant de supprimer un Representants à partir de son numéro de Representants 
     * @param numRepresentants
     */
    public void SupprimerRepresentantsCollection (int numRepresentants)
    {
        GestionDonnees.representants.remove(numRepresentants);
    }
    /**
     * Methode Permettant de Charger les représentants dans la JcomboBox
     * @param combobox
     */
    public void ChargementComboBoxRepresentant(JComboBox combobox)
    {      
        Iterator i = getRepresentants().keySet().iterator();
        int clef,index=0;
        Representants valeur;
        String[] representantCombobox = new String[representants.size()+1];
        representantCombobox[0]="Sélection";
        
        while (i.hasNext())
            {
                clef = (int)i.next();
                valeur = (Representants)representants.get(clef);
                
                representantCombobox[index+1]=valeur.toString();
                //tableauRepresentant[index]=valeur;
                index++;
            }
        
        combobox.setModel(new javax.swing.DefaultComboBoxModel(representantCombobox));
    }
            
}
