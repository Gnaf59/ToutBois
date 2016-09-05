/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import javax.swing.table.AbstractTableModel;
import java.io.*;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author glantoine
 */
public class Model_Table_Client extends AbstractTableModel {

    private String[] columnNames = {
        "Numéro client",
        "Nom contact",
        "Prénom contact",
        "Société",
        "Siret",
        "Adresse",
        "Complement d'adresse",
        "Ville",
        "Code postal",
        "Pays",
        "Mail",
        "Numéro de Tel",
        "Nombre de commande",
        "Numéro Représentant"};

    private HashMap<Integer, Clients> clients;
    private Object[][] tableData; 
    private GestionDonnees gd = new GestionDonnees();
    

    public Model_Table_Client() {
    
        //Charge le contenu du Hashmap Clients pour remplir un objet tableData pour l'affichage.
        this.clients=this.gd.getClients();
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
        }
    
    }

    @Override
    public int getRowCount() {
        return clients.size();
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
