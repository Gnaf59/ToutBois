/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.interBDD;

import static com.gauthier_matthieu.interBDD.GestionBaseDeDonnees.INSERT;
import com.gauthier_matthieu.metier.Prospects;
import java.sql.SQLException;

/**
 *
 * @author Dev
 */
public class RequeteProspect extends GestionBaseDeDonnees {
    
    public  Object[][] lectureBDDprospect() throws SQLException
    {
        String requete;
        requete = "SELECT *FROM prospect;";
        return realiserRequeteSelect(requete);
    }
//-------------------------------------------------------------------------------   
    public void insertBDDprospect(Prospects prospect) throws SQLException
    {
        java.sql.Date sqlDate = new java.sql.Date(prospect.getDerniereVisite().getTime());
        
        String requete;
        requete = "INSERT INTO `prospect`(`nomEntrepriseProspect`, `siretProspect`, "
                + "`numeroRepresProspect`, `nomProspect`, `prenomProspect`, `numVoieProspect`, `adresseProspect`, "
                + "`complementProspect`, `villeProspect`, `mailProspect`, `numerotelProspect`, `paysProspect`, `codePostalProspect`, "
                + "`derniereVisiteProspect`)"
                +"VALUES('"+prospect.getNomEntreprise()+"',"
                +"'"+prospect.getSiret()+"',"
                +"" +prospect.getNumeroProspect()+","
                +"'"+prospect.getNom()+"',"
                +"'"+prospect.getPrenom()+"',"
                +"" +prospect.getNumeroVoie()+","
                +"'"+prospect.getAdresse()+"',"
                +"'"+prospect.getComplementAdresse()+"',"
                +"'"+prospect.getVille()+"',"
                +"'"+prospect.getMail()+"',"
                +"'"+prospect.getNumerotel()+"',"
                +"'"+prospect.getPays()+"',"
                +"'"+prospect.getCodePostal()+"',"
                +"'"+sqlDate+"');";
        realiserRequeteInsert(requete);
    }
    
    public void updateBDDProspect(Prospects prospect) throws SQLException
    {
        String requete;
        
        
        requete="UPDATE `prospect` "
                + "SET `nomEntrepriseProspect`=\""+prospect.getNomEntreprise()+"\","
                + "`siretProspect`=\""+prospect.getSiret()+"\","
                + "`numeroRepresProspect`="+prospect.getNumeroRepresentant()+","
                + "`nomProspect`=\""+prospect.getNom()+"\","
                + "`prenomProspect`=\""+prospect.getPrenom()+"\","
                + "`numVoieProspect`=\""+prospect.getNumeroVoie()+"\","
                + "`adresseProspect`=\""+prospect.getAdresse()+"\","
                + "`complementProspect`=\""+prospect.getComplementAdresse()+"\","
                + "`villeProspect`=\""+prospect.getVille()+"\","
                + "`mailProspect`=\""+prospect.getMail()+"\","
                + "`numeroTelProspect`="+prospect.getNumerotel()+","
                + "`paysProspect`="+prospect.getPays()+","
                + "`codePostalProspect`="+prospect.getCodePostal()+","
                + "`derniereVisiteProspect`="+prospect.getDerniereVisite()+" "
                + "WHERE `numeroProspect`= "+prospect.getNumeroProspect()+";";
        
      
        realiserRequeteUpdate(requete);
    }
    
    public void deleteBDDProspect(int numeroProspect) throws SQLException
    {
        String requete="DELETE FROM `prospect` WHERE `numeroProspect`="+numeroProspect+";";
        realiserRequeteDelete(requete);
    }
    
}
