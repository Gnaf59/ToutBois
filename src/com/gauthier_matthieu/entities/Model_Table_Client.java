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
    
    private HashMap<Integer,Clients> clients;
    //ArrayList<Clients> data = new ArrayList<>();

    public Model_Table_Client() {

        
        // lire le fichier client et remplir clients avec
        try {
                InputStream ips = new FileInputStream("Clients.txt");
                InputStreamReader ipsr = new InputStreamReader(ips,"UTF-8");
            try (BufferedReader br = new BufferedReader(ipsr)) {
                
                String ligne;
                String[] enregistrement;
                
                
                //parcours toutes les lignes du fichier Clients.txt
                while ((ligne = br.readLine()) != null)
                {
                    //décompose une ligne du fichier Clients.txt 
                    enregistrement=ligne.split(";");
                   
                    //Ajoute dans l'Arraylist data le Client    
                    /*data.add(new Clients(Integer.parseInt(enregistrement[9]),
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
                            enregistrement[8]));*/
                }
            }
        }     
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage(), "Erreur Jtable", JOptionPane.ERROR_MESSAGE);
            
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
        switch (columnIndex) {
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
        }
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }
}
