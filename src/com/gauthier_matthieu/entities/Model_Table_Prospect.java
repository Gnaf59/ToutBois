/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import com.gauthier_matthieu.interBDD.*;
import com.gauthier_matthieu.old.GestionDonnees;
import com.gauthier_matthieu.metier.Prospects;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.Locale;
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

    private HashMap<Integer, Prospects> prospects;
    private Object[][] tableData;
    private Object[][] resultatRequete;
    private GestionDonnees gd = new GestionDonnees();
    private DateFormat sdf = DateFormat.getDateInstance(DateFormat.SHORT, Locale.getDefault());

    public Model_Table_Prospect() {

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
                tableData[index][5] = resultatRequete[index][5];
                tableData[index][6] = resultatRequete[index][6] + " " + resultatRequete[index][7];
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

        /*
        //Charge le contenu du Hashmap Clients pour remplir un objet tableData pour l'affichage.
        this.prospects=this.gd.getProspects();
        this.tableData= new Object[prospects.keySet().size()][getColumnCount()];
        int index = 0;
        for (int key : prospects.keySet()) {
            Prospects pro = prospects.get(key);
            tableData[index][0] = pro.getNumeroProspect();
            tableData[index][1] = pro.getNom();
            tableData[index][2] = pro.getPrenom();
            tableData[index][3] = pro.getNomEntreprise();
            tableData[index][4] = pro.getSiret();
            tableData[index][5] = pro.getNumeroVoie()+" "+pro.getAdresse();
            tableData[index][6] = pro.getComplementAdresse();
            tableData[index][7] = pro.getVille();
            tableData[index][8] = pro.getCodePostal();
            tableData[index][9] = pro.getPays();
            tableData[index][10] = pro.getMail();
            tableData[index][11] = pro.getNumerotel();
            tableData[index][12] = pro.getNumeroRepresentant();
            tableData[index][13] = sdf.format(pro.getDerniereVisite());
           
            index++;
        }*/
    }

    @Override
    public int getRowCount() {
        //return prospects.size();
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

    public String getColumnName(int col) {
        return nomColonne[col];
    }
}
