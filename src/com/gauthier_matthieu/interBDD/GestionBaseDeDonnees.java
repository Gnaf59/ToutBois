/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.interBDD;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Classe permettant de se connecter à la base de données et d'exécuter des
 * requêtes non spécifique
 *
 * @author glantoine
 */
public class GestionBaseDeDonnees {
    //url du serveur mySQL

    private String url = "jdbc:mysql://127.0.0.1:3306/toutbois";
    //nom d'utilisateur mySQL
    private String user = "root";
    //mot de passe de la base mySQL
    private String password = "";
    //connection à la base de donnée
    private Connection connection = null;
    //Résultat de la requête SQL SELECT
    private ResultSet resultat;
    protected Object[][] objetResultat;
    //private ArrayList listeResultat;
    private int statut;

    //type de requête et valeur int attribué
    public static final int SELECT = 0;
    public static final int INSERT = 1;
    public static final int UPDATE = 2;
    public static final int DELETE = 3;

    /**
     * Chargement du driver jdbc
     */
    public GestionBaseDeDonnees() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur chargement driver jdbc", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * Méthode permettant de tester si la connection à la base de données est possible
     * 
     * @return un booléen représentant si la connection existe ou pas.
     */
    public boolean testerConnection() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                try {

                    connection.close();
                } catch (SQLException ignore) {
                    /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
                }
            }
        } catch (SQLException toe) {

            return false;

        }
        return true;
    }

    /**
     * Méthode privée s'occupant de réaliser tout type de requête 
     * en fonction de la valeur du type de la requête.
     * 
     * @param requete requête SQL  à traiter
     * @param typeRequete Type de requête à traiter
     * @throws java.sql.SQLException 
     */
    private void realiserRequete(String requete, int typeRequete) throws SQLException {

        connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        //si c'est une requête Select le resultat sera stocké dans la variable d'instance resultat
        if (typeRequete == 0) {
            this.resultat = statement.executeQuery(requete);
            ResultSetMetaData metadata = resultat.getMetaData();
            int nombreColonnes = metadata.getColumnCount();

            resultat.last();
            int nombreLigne = resultat.getRow();
            resultat.beforeFirst();

            objetResultat = new Object[nombreLigne][nombreColonnes];
            int index = 0;
            while (resultat.next()) {
                for (int i = 0; i < nombreColonnes; i++) {
                    objetResultat[index][i] = resultat.getObject(i + 1);
                }
                index++;
            }

        }
        //Si il s'agit d'une requête INSERT, UPDATE, DELETE on stock le statut de la requête dans la variable d'instance statut.
        if (typeRequete > 0 && typeRequete <= 3) {
            this.statut = statement.executeUpdate(requete);
        }

        //Dans tous les cas ferme la connection si elle existe
        if (connection != null) {
            try {

                connection.close();
            } catch (SQLException ignore) {
                /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
            }
        }

    }

    /**
     * Méthode s'occupant d'exécuter la requête SQL select
     *
     * @param requete requête SQL SELECT à traiter
     * @return Le résultat de la requête sous forme de ResultSet
     * @throws java.sql.SQLException
     */
    public Object[][] realiserRequeteSelect(String requete) throws SQLException {
        realiserRequete(requete, SELECT);
        return this.objetResultat;
    }

    /**
     * Méthode s'occupant d'exécuter la requête SQL INSERT
     *
     * @param requete requête SQL d'insertion dans la base de donnée (INSERT) à
     * traiter
     * @return le statut d'éxécution de la requête
     * @throws java.sql.SQLException
     */
    public int realiserRequeteInsert(String requete) throws SQLException {
        realiserRequete(requete, INSERT);
        return this.statut;
    }

    /**
     * Méthode s'occupant d'exécuter la requête SQL UPDATE
     *
     * @param requete requête SQL d'insertion dans la base de donnée (INSERT) à
     * traiter
     * @return le statut d'éxécution de la requête
     * @throws java.sql.SQLException
     */
    public int realiserRequeteUpdate(String requete) throws SQLException {
        realiserRequete(requete, UPDATE);
        return this.statut;
    }
    /**
     * Méthode permettant d'éxécuter les requêtes SQL DELETE
     * 
     * @param requete
     * @return le statut de la requête
     * @throws SQLException 
     */
    public int realiserRequeteDelete(String requete) throws SQLException {
        realiserRequete(requete, DELETE);
        return this.statut;
    }

}
