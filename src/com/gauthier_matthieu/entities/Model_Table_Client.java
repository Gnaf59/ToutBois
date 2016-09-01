/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author glantoine
 */
public class Model_Table_Client extends AbstractTableModel {

    private String[] columnNames = {"Nom contact",
        "Prénom contact",
        "Société",
        "Adresse",
        "Ville",
        "Mail",
        "Numéro de Tel", 
        "Pays", 
        "Code postal", 
        "Siret", 
        "Nombre de commande", 
        "Nom du représantant", 
        "Prenom du représentant"};
    
    
    ArrayList<Clients> data = new ArrayList<>();

    public Model_Table_Client() {

        /*
        // lire le fichier client et remplir data avec
        try {
                InputStream ips = new FileInputStream("Clients.txt");
                InputStreamReader ipsr = new InputStreamReader(ips,"UTF-8");
            try (BufferedReader br = new BufferedReader(ipsr)) {
                
                String ligne;
                String[] enregistrement;
                
                
                //parcours toutes les lignes du fichier Clients.txt
                while ((ligne = br.readLine()) != null)
                {
                    //décompose une ligne du fichier Clients.txt en 
                    enregistrement=ligne.split(";");
                    
                    //Ajoute dans l'Arraylist data le Client    
                    data.add(new Clients(Integer.parseInt(enregistrement[9]),
                            Integer.parseInt(enregistrement[10]),
                            Integer.parseInt(enregistrement[11]),
                            Integer.parseInt(enregistrement[12]),
                            enregistrement[0],
                            enregistrement[1],
                            enregistrement[2],
                            enregistrement[3],
                            enregistrement[4],
                            enregistrement[5],
                            enregistrement[6],
                            enregistrement[7],
                            enregistrement[8]));
                }
            }
        }     
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage(), "Erreur Jtable", JOptionPane.ERROR_MESSAGE);
            
        } */
        
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return data.get(rowIndex).getNom();
            case 1:
                return data.get(rowIndex).getPrenom();
            case 2:
                return data.get(rowIndex).getEntreprise();
            case 3:
                return data.get(rowIndex).getAdresse();
            case 4:
                return data.get(rowIndex).getVille();
            case 5:
                return data.get(rowIndex).getMail();
            case 6:
                return data.get(rowIndex).getNumerotel();
            case 7:
                return data.get(rowIndex).getPays();
            case 8:
                return data.get(rowIndex).getCodePostal();
            case 9:
                return data.get(rowIndex).getSiret();
            case 10:
                return data.get(rowIndex).getNbrCommande();
            case 11:
                return data.get(rowIndex).getNumeroRepresentant();
            case 12:
                return data.get(rowIndex).getNumeroRepresentant();
            default:
                return null;
        }
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }
    public void removeAmi(int rowIndex) {
        data.remove(rowIndex);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

}
