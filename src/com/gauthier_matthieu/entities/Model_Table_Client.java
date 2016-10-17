/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import com.gauthier_matthieu.interBDD.RequeteClient;
import com.gauthier_matthieu.metier.Clients;
import javax.swing.table.AbstractTableModel;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *  
 * @author glantoine
 */
public class Model_Table_Client extends AbstractTableModel {

    private String[] columnNames = {
        "Numéro Client",
        "Raison Sociale",
        "Numéro Siret",
        "Numéro Représentant",
        "Nom contact",
        "Prénom contact",
        "Adresse",
        "Complement d'adresse",
        "Ville",
        "Code postal",
        "Pays",
        "Mail",
        "Numéro de Tel",
        /*"Nombre de commande"*/};

    private HashMap<Integer, Clients> clients;
    private Object[][] tableData; 
    private Object[][] resultatRequete;
    //private GestionDonnees gd = new GestionDonnees();
    

    public Model_Table_Client() {
    
        //Charge le contenu du Hashmap Clients pour remplir un objet tableData pour l'affichage.
        
        RequeteClient bddClient = new RequeteClient();
        resultatRequete=bddClient.lectureBDDClients();
        tableData=new Object[resultatRequete.length][getColumnCount()];
        
        try
        {
            int index = 0;
            while (index<resultatRequete.length)
            {
            tableData[index][0] = resultatRequete[index][0]; // num Client
            tableData[index][1] = resultatRequete[index][1]; // raison sociale
            tableData[index][2] = resultatRequete[index][2]; // siret
            tableData[index][3] = resultatRequete[index][3]; // numrepré
            tableData[index][4] = resultatRequete[index][4]; // nomclient
            tableData[index][5] = resultatRequete[index][5]; // prénom
            tableData[index][6] = resultatRequete[index][6] + " "+resultatRequete[index][7]; // numéro voie + adresse
            tableData[index][7] = resultatRequete[index][8]; // complement
            tableData[index][8] = resultatRequete[index][9]; // ville
            tableData[index][9] = resultatRequete[index][13]; // ville
            tableData[index][10] = resultatRequete[index][12]; // mail
            tableData[index][11] = resultatRequete[index][10]; // mail
            tableData[index][12] = resultatRequete[index][11]; // pays
            //tableData[index][12] = resultatRequete[index][]; // commande
            
            index++;
            }

            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur affichage requête jTable", JOptionPane.ERROR_MESSAGE);
        }
        
        
        /*this.clients=this.gd.getClients();
        this.tableData= new Object[clients.keySet().size()][getColumnCount()];
        int index = 0;
        for (int key : clients.keySet()) {
            Clients cli = clients.get(key);
            tableData[index][0] = cli.getNumeroClient();
            tableData[index][1] = cli.getNom();
            tableData[index][2] = cli.getPrenom();
            tableData[index][3] = cli.getNomEntreprise();
            tableData[index][4] = cli.getSiret();
            tableData[index][5] = cli.getNumeroVoie()+" "+cli.getAdresse();
            tableData[index][6] = cli.getComplementAdresse();
            tableData[index][7] = cli.getVille();
            tableData[index][8] = cli.getCodePostal();
            tableData[index][9] = cli.getPays();
            tableData[index][10] = cli.getMail();
            tableData[index][11] = cli.getNumerotel();
            tableData[index][12] = cli.getNbrCommande();
            tableData[index][13] = cli.getNumeroRepresentant();
           
            index++;
        }*/
    
    }

    @Override
    public int getRowCount() {
        //return clients.size();
        return resultatRequete.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {      
        return tableData[rowIndex][columnIndex];
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }
    
}
