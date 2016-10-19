/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.interBDD;

import static com.gauthier_matthieu.interBDD.GestionBaseDeDonnees.INSERT;
import com.gauthier_matthieu.metier.Prospects;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dev
 */
public class RequeteProspect extends GestionBaseDeDonnees {

    public Object[][] lectureBDDprospect() throws SQLException {
        String requete;
        requete = "SELECT *FROM prospect;";
        return realiserRequeteSelect(requete);
    }
//-------------------------------------------------------------------------------   

    public void insertBDDprospect(Prospects prospect) throws SQLException {
        java.sql.Date sqlDate = new java.sql.Date(prospect.getDerniereVisite().getTime());

        String requete;
        requete = "INSERT INTO `prospect`(`nomEntrepriseProspect`, `siretProspect`, "
                + "`numeroRepresProspect`, `nomProspect`, `prenomProspect`, `numVoieProspect`, `adresseProspect`, "
                + "`complementProspect`, `villeProspect`, `mailProspect`, `numerotelProspect`, `paysProspect`, `codePostalProspect`, "
                + "`derniereVisiteProspect`)"
                + "VALUES('" + prospect.getNomEntreprise() + "',"
                + "'" + prospect.getSiret() + "',"
                + "" + prospect.getNumeroRepresentant() + ","
                + "'" + prospect.getNom() + "',"
                + "'" + prospect.getPrenom() + "',"
                + "" + prospect.getNumeroVoie() + ","
                + "'" + prospect.getAdresse() + "',"
                + "'" + prospect.getComplementAdresse() + "',"
                + "'" + prospect.getVille() + "',"
                + "'" + prospect.getMail() + "',"
                + "'" + prospect.getNumerotel() + "',"
                + "'" + prospect.getPays() + "',"
                + "'" + prospect.getCodePostal() + "',"
                + "'" + sqlDate + "');";
        realiserRequeteInsert(requete);
    }

    public void updateBDDProspect(Prospects prospect) throws SQLException {
        String requete;
        java.sql.Date sqlDate = new java.sql.Date(prospect.getDerniereVisite().getTime());

        requete = "UPDATE `prospect` "
                + "SET `nomEntrepriseProspect`=\"" + prospect.getNomEntreprise() + "\","
                + "`siretProspect`=\"" + prospect.getSiret() + "\","
                + "`numeroRepresProspect`=" + prospect.getNumeroRepresentant() + ","
                + "`nomProspect`=\"" + prospect.getNom() + "\","
                + "`prenomProspect`=\"" + prospect.getPrenom() + "\","
                + "`numVoieProspect`=\"" + prospect.getNumeroVoie() + "\","
                + "`adresseProspect`=\"" + prospect.getAdresse() + "\","
                + "`complementProspect`=\"" + prospect.getComplementAdresse() + "\","
                + "`villeProspect`=\"" + prospect.getVille() + "\","
                + "`mailProspect`=\"" + prospect.getMail() + "\","
                + "`numeroTelProspect`=\"" + prospect.getNumerotel() + "\","
                + "`paysProspect`=\"" + prospect.getPays() + "\","
                + "`codePostalProspect`=\"" + prospect.getCodePostal() + "\","
                + "`derniereVisiteProspect`='" + sqlDate + "' "
                + "WHERE `numeroProspect`= " + prospect.getNumeroProspect() + ";";

        realiserRequeteUpdate(requete);
    }

    public void deleteBDDProspect(int numeroProspect) throws SQLException {
        String requete = "DELETE FROM `prospect` WHERE `numeroProspect`=" + numeroProspect + ";";
        realiserRequeteDelete(requete);
    }

    public Prospects rechercheProspects(int numeroProspect) throws SQLException, ParseException {
        String requete;
        requete = "SELECT * FROM prospect WHERE `numeroProspect` = " + numeroProspect + ";";

        objetResultat = realiserRequeteSelect(requete);
        Prospects pro;

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(objetResultat[0][14].toString());
        pro = new Prospects(Integer.parseInt(objetResultat[0][0].toString()), objetResultat[0][1].toString(),
                objetResultat[0][2].toString(), objetResultat[0][3].toString(), objetResultat[0][4].toString(), Integer.parseInt(objetResultat[0][5].toString()), objetResultat[0][6].toString(), objetResultat[0][7].toString(), objetResultat[0][8].toString(), objetResultat[0][9].toString(), objetResultat[0][10].toString(), objetResultat[0][11].toString(), objetResultat[0][12].toString(), Integer.parseInt(objetResultat[0][13].toString()), date);
        return pro;

    }

}
