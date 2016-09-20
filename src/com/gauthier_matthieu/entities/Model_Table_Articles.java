/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;
import com.gauthier_matthieu.entities.*;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mdeschamps
 */
public class Model_Table_Articles extends AbstractTableModel{
    
    private String[] nomColonne = {
        "Numéro Article",
        "Références",
        "Nom",
        "Type d'article",
        "Genre d'article",
        "Couleur",
        "Stock"};
        
    private GestionBaseDeDonnees gBDD = new GestionBaseDeDonnees();
    private Object [][] tableData,resultatRequete;
    public Model_Table_Articles() {
        
        resultatRequete=gBDD.lectureBDDarticle();
        tableData=new Object[resultatRequete.length][getColumnCount()];
        try
        {    
            int index=0;
            while(index<resultatRequete.length)
            {   
                tableData[index][0] = resultatRequete[index][0];//numeroArt
                tableData[index][1] = resultatRequete[index][1];//ReferenceArticle
                tableData[index][2] = resultatRequete[index][2];//nomArticle
                tableData[index][3] = resultatRequete[index][3];//typeArticle
                tableData[index][4] = resultatRequete[index][5];//genreArticle
                tableData[index][5] = resultatRequete[index][6];//couleurArticle
                tableData[index][6] = resultatRequete[index][7];//StockArticle
                index++;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erreur affichage requête jTable", JOptionPane.ERROR_MESSAGE);
        }
    }
 

    @Override
    public int getRowCount() {
        return resultatRequete.length;
    }
    public int getColumnCount() {
        return nomColonne.length;
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
       return tableData[rowIndex][columnIndex];
    }
    public String getColumnName(int col) {
       return nomColonne[col];
    }
     
}
    

