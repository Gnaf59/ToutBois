/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.interBDD;

import com.gauthier_matthieu.metier.Representants;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * Classe réalisant toute les requêtes pour gérer la table representant
 *
 * @author Dev
 */
public class RequeteRepresentant extends GestionBaseDeDonnees {
    /**
     * Requête permettant d'enregistrer les nouveaux Représentants
     *
     * @param representant Représentant à ajouter dans la base de donnée
     * @throws SQLException
     */
    public void insertBDDRepresentant(Representants representant) throws SQLException {
        String requete;
        requete = "INSERT INTO representants (nomRepresentant, prenomRepresentant, numeroVoieRepresentant, adresseRepresentant, complementAdresseRepresentant, villeRepresentant, mailRepresentant, numerotelRepresentant, paysRepresentant, codePostalRepresentant, salaireBrutRepresentant, tauxComissionRepresentant) "
                + "VALUES ('" + representant.getNom() + "',"
                + " '" + representant.getPrenom() + "',"
                + " " + representant.getNumeroVoie() + ","
                + " '" + representant.getAdresse() + "',"
                + " '" + representant.getComplementAdresse() + "',"
                + " '" + representant.getVille() + "',"
                + " '" + representant.getMail() + "',"
                + " '" + representant.getNumerotel() + "',"
                + " '" + representant.getPays() + "',"
                + " '" + representant.getCodePostal() + "',"
                + " " + representant.getSalaireBrut() + ","
                + " " + representant.getTauxCommission() + ");";

        realiserRequeteInsert(requete);

    }
    /**
     * Requête permettant d'obtenir toutes les données des Représentants
     *
     * @return tous les Representants de la base de données sous forme de matrice
     * objet
     * @throws SQLException
     */
    public Object[][] lectureBDDrepresentant() throws SQLException {
        String requete;
        requete = "SELECT * FROM representants;";

        return realiserRequeteSelect(requete);
    }
    /**
     * Requête permettant de rechercher un représentant a partir du numéro de représentant
     *
     * @param numeroRepresentant numéro du Representant
     * @return un objet Representant
     * @throws SQLException
     */
    public Representants rechercheRepresentant(int numeroRepresentant) throws SQLException {
        String requete;
        requete = "SELECT * FROM representants WHERE `numeroRepresentant` = " + numeroRepresentant + ";";

        objetResultat = realiserRequeteSelect(requete);

        return new Representants(Integer.parseInt(objetResultat[0][0].toString()), objetResultat[0][1].toString(),
                objetResultat[0][2].toString(), Integer.parseInt(objetResultat[0][3].toString()), objetResultat[0][4].toString(), objetResultat[0][5].toString(), objetResultat[0][6].toString(), objetResultat[0][7].toString(), objetResultat[0][8].toString(), objetResultat[0][9].toString(), objetResultat[0][10].toString(), Double.parseDouble(objetResultat[0][11].toString()), Double.parseDouble(objetResultat[0][12].toString()));
    }
    /**
     * Requête permettant de modifier les représentants existants
     *
     * @param representant representant à modifier dans la base de données
     * @throws SQLException
     */
    public void updateBDDRepresentants(Representants representant) throws SQLException {
        String requete;

        requete = "UPDATE `representants` "
                + "SET `nomRepresentant`=\"" + representant.getNom() + "\","
                + "`prenomRepresentant`=\"" + representant.getPrenom() + "\","
                + "`numeroVoieRepresentant`=" + representant.getNumeroVoie() + ","
                + "`adresseRepresentant`=\"" + representant.getAdresse() + "\","
                + "`complementAdresseRepresentant`=\"" + representant.getComplementAdresse() + "\","
                + "`villeRepresentant`=\"" + representant.getVille() + "\","
                + "`mailRepresentant`=\"" + representant.getMail() + "\","
                + "`numerotelRepresentant`=\"" + representant.getNumerotel() + "\","
                + "`paysRepresentant`=\"" + representant.getPays() + "\","
                + "`codePostalRepresentant`=\"" + representant.getCodePostal() + "\","
                + "`salaireBrutRepresentant`=" + representant.getSalaireBrut() + ","
                + "`tauxComissionRepresentant`=" + representant.getTauxCommission() + " "
                + "WHERE `numeroRepresentant`= " + representant.getNumeroRepresentant() + ";";

        realiserRequeteUpdate(requete);
    }
    /**
     * Requête permettant de supprimer un client
     *
     * @param numeroRepresentant numéro du Représentant
     * @throws SQLException
     */
    public void deleteBDDRepresentants(int numeroRepresentant) throws SQLException {
        String requete = "DELETE FROM `representants` WHERE `numeroRepresentant`=" + numeroRepresentant + ";";
        realiserRequeteDelete(requete);
    }
    /**
     * Méthode permettant de remplir une combobox avec tous les représentants
     * 
     * @param combobox Combobox a remplir 
     */
    public void ChargementComboBoxRepresentant(JComboBox combobox) {

        try {
            objetResultat = lectureBDDrepresentant();
            String[] representantCombobox = new String[objetResultat.length + 1];
            representantCombobox[0] = "Sélection";

            for (int i = 0; i < objetResultat.length; i++) {
                Representants representant = new Representants(Integer.parseInt(objetResultat[i][0].toString()), objetResultat[i][1].toString(), objetResultat[i][2].toString(), Integer.parseInt(objetResultat[i][3].toString()), objetResultat[i][4].toString(), objetResultat[i][5].toString(), objetResultat[i][6].toString(), objetResultat[i][7].toString(), objetResultat[i][8].toString(), objetResultat[i][9].toString(), objetResultat[i][10].toString(), Double.parseDouble(objetResultat[i][11].toString()), Double.parseDouble(objetResultat[i][12].toString()));

                representantCombobox[i + 1] = representant.toString();
            }

            combobox.setModel(new javax.swing.DefaultComboBoxModel(representantCombobox));
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, sqlex.getMessage(), "Erreur de chargement des données du représentant", JOptionPane.ERROR_MESSAGE);
        }
    }

}
