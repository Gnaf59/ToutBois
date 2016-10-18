/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import com.gauthier_matthieu.interBDD.RequeteRepresentant;
import com.gauthier_matthieu.metier.Representants;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;
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
    private Object[][] resultatRequete;
    //private GestionDonnees gd = new GestionDonnees();
    //ResultSet rs;

    public Model_Table_Representants() {

        try {
            RequeteRepresentant bddRepresentant = new RequeteRepresentant();
            resultatRequete = bddRepresentant.lectureBDDrepresentant();
            tableData = new Object[resultatRequete.length][getColumnCount()];
            try {
                int index = 0;
                while (index < resultatRequete.length) {
                    tableData[index][0] = resultatRequete[index][0]; //rep.getNumeroRepresentant();
                    tableData[index][1] = resultatRequete[index][1];//rep.getNom();
                    tableData[index][2] = resultatRequete[index][2];//rep.getPrenom();
                    tableData[index][3] = resultatRequete[index][3] + " " + resultatRequete[index][4];//rep.getNumeroVoie()+" "+rep.getAdresse();
                    tableData[index][4] = resultatRequete[index][5];//rep.getComplementAdresse();
                    tableData[index][5] = resultatRequete[index][6];//rep.getVille();
                    tableData[index][6] = resultatRequete[index][7];//rep.getCodePostal();
                    tableData[index][7] = resultatRequete[index][8];//rep.getPays();
                    tableData[index][8] = resultatRequete[index][9];//rep.getMail();
                    tableData[index][9] = resultatRequete[index][10];//rep.getNumerotel();
                    tableData[index][10] = resultatRequete[index][11];//rep.getSalaireBrut();
                    tableData[index][11] = resultatRequete[index][12];//rep.getTauxCommission();

                    index++;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erreur affichage requête jTable", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERREUR SQL", JOptionPane.ERROR_MESSAGE);
        }

        //Charge le contenu du Hashmap Representants pour remplir un objet tableData pour l'affichage.
        /* this.representants=this.gd.getRepresentants();
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
        }*/
    }

    @Override
    public int getRowCount() {
        //return representants.size();
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
