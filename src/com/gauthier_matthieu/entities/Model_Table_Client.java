/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import com.gauthier_matthieu.interBDD.RequeteClient;
import com.gauthier_matthieu.metier.Clients;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *  
 * @author glantoine,mdeschamps
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
        "Numéro de Tel", /*"Nombre de commande"*/};

    
    private Object[][] tableData; 
    private Object[][] resultatRequete;
    
    

    public Model_Table_Client() {
    
        
        
        RequeteClient bddClient = new RequeteClient();
        resultatRequete=bddClient.lectureBDDClients();
        tableData=new Object[resultatRequete.length][getColumnCount()];
        
        try
        {
            int index=0;
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
