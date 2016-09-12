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
public class Model_Table_Representants extends AbstractTableModel {

    private String[] columnNames = {
        "Numéro représentants",
        "Nom représentants",
        "Prénom représentants",
        "Adresse",
        "Complement d'adresse",
        "Ville",
        "Code postal",
        "Pays",
        "Mail",
        "Numéro de Tel",
        "Salaire Brut",
        "Taux commission"};

    private HashMap<Integer, Representants> representants;
    private Object[][] tableData; 
    private GestionDonnees gd = new GestionDonnees();
    

    public Model_Table_Representants() {
    
        //Charge le contenu du Hashmap Clients pour remplir un objet tableData pour l'affichage.
        this.representants=this.gd.getRepresentants();
        this.tableData= new Object[representants.keySet().size()][getColumnCount()];
        int index = 0;
        for (int key : representants.keySet()) {
            Representants rep = representants.get(key);
            tableData[index][0] = rep.getNumeroRepresentant();
            tableData[index][1] = rep.getNom();
            tableData[index][2] = rep.getPrenom();
            tableData[index][3] = rep.getNumeroVoie()+" "+rep.getAdresse();
            tableData[index][4] = rep.getComplementAdresse();
            tableData[index][5] = rep.getVille();
            tableData[index][6] = rep.getCodePostal();
            tableData[index][7] = rep.getPays();
            tableData[index][8] = rep.getMail();
            tableData[index][9] = rep.getNumerotel();
            tableData[index][10] = rep.getSalaireBrut();
            tableData[index][11] = rep.getTauxCommission();
           
            index++;
        }
    
    }

    @Override
    public int getRowCount() {
        return representants.size();
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
