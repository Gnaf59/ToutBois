/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.interBDD;

import com.gauthier_matthieu.metier.Clients;
import java.sql.SQLException;

/**
 * Classe réalisant toute les requêtes pour gérer la base de donnée clients
 *
 * @author Dev
 */
public class RequeteClient extends GestionBaseDeDonnees {

    /**
     * Requête permettant d'obtenir toutes les données des clients
     *
     * @return tous les clients de la base de données sous forme de matrice
     * objet
     * @throws SQLException
     */
    public Object[][] lectureBDDClients() throws SQLException {
        String requete;
        requete = "SELECT * FROM clients;";
        return realiserRequeteSelect(requete);
    }

    /**
     * Requête permettant d'enregistrer les nouveaux clients
     *
     * @param client Client à ajouter dans la base de donnée
     * @throws SQLException
     */
    public void insertBDDClients(Clients client) throws SQLException {
        String requete;
        requete = "INSERT INTO clients (nomEntrepriseClient, siretClient, numeroRepresClient, nomClient, prenomClient, "
                + "numVoieClient, adresseClient, complementClient, villeClient, "
                + "mailClient, numeroTelClient, paysClient, codePostalClient)"
                + "VALUES ('" + client.getNomEntreprise() + "',"
                + " '" + client.getSiret() + "',"
                + " " + client.getNumeroRepresentant() + ","
                + " '" + client.getNom() + "',"
                + " '" + client.getPrenom() + "',"
                + " " + client.getNumeroVoie() + ","
                + " '" + client.getAdresse() + "',"
                + " '" + client.getComplementAdresse() + "',"
                + " '" + client.getVille() + "',"
                + " '" + client.getMail() + "',"
                + " '" + client.getNumerotel() + "',"
                + " '" + client.getPays() + "',"
                + " '" + client.getCodePostal() + "');";

        realiserRequeteInsert(requete);
    }

    /**
     * Requête permettant de rechercher un client a partir du numéro de client
     *
     * @param numeroClient numéro du client
     * @return un objet Client
     * @throws SQLException
     */
    public Clients rechercheClients(int numeroClient) throws SQLException {
        String requete;
        requete = "SELECT * FROM clients WHERE `numeroClient` = " + numeroClient + ";";

        objetResultat = realiserRequeteSelect(requete);
        return new Clients(
                Integer.parseInt(objetResultat[0][0].toString()),
                objetResultat[0][1].toString(),
                objetResultat[0][2].toString(),
                Integer.parseInt(objetResultat[0][3].toString()),
                objetResultat[0][4].toString(),
                objetResultat[0][5].toString(),
                Integer.parseInt(objetResultat[0][6].toString()),
                objetResultat[0][7].toString(),
                objetResultat[0][8].toString(),
                objetResultat[0][9].toString(),
                objetResultat[0][10].toString(),
                objetResultat[0][11].toString(),
                objetResultat[0][12].toString(),
                objetResultat[0][13].toString());
    }

    /**
     * Requête permettant de modifier les clients existants
     *
     * @param client Client à modifier dans la base de données
     * @throws SQLException
     */
    public void updateBDDClients(Clients client) throws SQLException {
        String requete;
        requete = "UPDATE `clients` "
                + "SET `nomEntrepriseClient`=\"" + client.getNomEntreprise() + "\","
                + "`siretClient`=\"" + client.getSiret() + "\","
                + "`numeroRepresClient`=" + client.getNumeroRepresentant() + ","
                + "`nomClient`=\"" + client.getNom() + "\","
                + "`prenomClient`=\"" + client.getPrenom() + "\","
                + "`numVoieClient`=" + client.getNumeroVoie() + ","
                + "`adresseClient`=\"" + client.getAdresse() + "\","
                + "`complementClient`=\"" + client.getComplementAdresse() + "\","
                + "`villeClient`=\"" + client.getVille() + "\","
                + "`mailClient`=\"" + client.getMail() + "\","
                + "`numerotelClient`=\"" + client.getNumerotel() + "\","
                + "`paysClient`=\"" + client.getPays() + "\","
                + "`codePostalClient`=\"" + client.getCodePostal() + "\" "
                + "WHERE `numeroClient`= " + client.getNumeroClient() + ";";
        realiserRequeteUpdate(requete);
    }

    /**
     * Requête permettant de supprimer un client
     *
     * @param numeroClient numéro du client
     * @throws SQLException
     */

    public void deleteBDDClients(int numeroClient) throws SQLException {
        String requete = "DELETE FROM `clients` WHERE `numeroClient`=" + numeroClient + ";";
        realiserRequeteDelete(requete);
    }

}
