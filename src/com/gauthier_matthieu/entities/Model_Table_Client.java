/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import java.io.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;

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
    
    private HashMap<Integer,Clients> clients=new HashMap<>();
    private GestionDonnees donnees;
    private Object[][] tableData = new Object[clients.keySet().size()][getColumnCount()];
    
    public Model_Table_Client() {
        donnees=new GestionDonnees();
        
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
        /*switch (columnIndex) {
            case 0:
                return clients.get(rowIndex).getNumeroClient();
            case 1:
                return clients.get(rowIndex).getNom();
            case 2:
                return clients.get(rowIndex).getPrenom();
            case 3:
                return clients.get(rowIndex).getEntreprise();
            case 4:
                return clients.get(rowIndex).getSiret();
            case 5:
                return clients.get(rowIndex).getAdresse();
            case 6:
                return clients.get(rowIndex).getComplementAdresse();
            case 7:
                return clients.get(rowIndex).getVille();
            case 8:
                return clients.get(rowIndex).getCodePostal();
            case 9:
                return clients.get(rowIndex).getPays();
            case 10:
                return clients.get(rowIndex).getMail();
            case 11:
                return clients.get(rowIndex).getNumerotel();
            case 12:
                return clients.get(rowIndex).getNbrCommande();
            case 13:
                return clients.get(rowIndex).getNumeroRepresentant();
            default:
                return null;
        }*/
        int index=0;
        for (int key : clients.keySet())
{
            Clients cli = clients.get(key);
            tableData[index][0] = cli.getNumeroClient();
            tableData[index][1] = cli.getNumeroClient();
            tableData[index][2] = cli.getNumeroClient();
            tableData[index][3] = cli.getNumeroClient();
            tableData[index][4] = cli.getNumeroClient();
            tableData[index][5] = cli.getNumeroClient();
            tableData[index][6] = cli.getNumeroClient();
            tableData[index][7] = cli.getNumeroClient();
            tableData[index][8] = cli.getNumeroClient();
            tableData[index][9] = cli.getNumeroClient();
            tableData[index][10] = cli.getNumeroClient();
            tableData[index][11] = cli.getNumeroClient();
            tableData[index][12] = cli.getNumeroClient();
            tableData[index][13] = cli.getNumeroClient();
            
            // and so forth
            index++;
}
        return tableData[rowIndex][columnIndex];
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }
}
