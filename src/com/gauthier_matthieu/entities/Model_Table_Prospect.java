/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import com.gauthier_matthieu.interBDD.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mdeschamps
 */
public class Model_Table_Prospect extends AbstractTableModel {

    private String[] nomColonne = {
        "Numéro Prospect",
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
        "Numéro Représentant",
        "Dernière visite"};

    
    private Object[][] tableData;
    private Object[][] resultatRequete;

    public Model_Table_Prospect() {

        try {
            RequeteProspect bddProspect = new RequeteProspect();
            resultatRequete = bddProspect.lectureBDDprospect();
            tableData = new Object[resultatRequete.length][getColumnCount()];

            try {
                int index = 0;
                while (index < resultatRequete.length) {
                    tableData[index][0] = resultatRequete[index][0];
                    tableData[index][1] = resultatRequete[index][1];
                    tableData[index][2] = resultatRequete[index][2];
                    tableData[index][3] = resultatRequete[index][3];
                    tableData[index][4] = resultatRequete[index][4];
                    tableData[index][5] = resultatRequete[index][5] + " " + resultatRequete[index][6];
                    tableData[index][6] = resultatRequete[index][7];
                    tableData[index][7] = resultatRequete[index][8];
                    tableData[index][8] = resultatRequete[index][9];
                    tableData[index][9] = resultatRequete[index][10];
                    tableData[index][10] = resultatRequete[index][11];
                    tableData[index][11] = resultatRequete[index][12];
                    tableData[index][12] = resultatRequete[index][13];
                    tableData[index][13] = resultatRequete[index][14];
                    index++;
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erreur affichage de la jTable", JOptionPane.ERROR_MESSAGE);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERREUR SQL", JOptionPane.ERROR_MESSAGE);
        }

    }

    @Override
    public int getRowCount() {
        return resultatRequete.length;
    }

    @Override
    public int getColumnCount() {
        return nomColonne.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return tableData[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int col) {
        return nomColonne[col];
    }
}
