/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.interBDD;

import static com.gauthier_matthieu.interBDD.GestionBaseDeDonnees.INSERT;
import com.gauthier_matthieu.metier.Prospects;

/**
 *
 * @author Dev
 */
public class RequeteProspect extends GestionBaseDeDonnees{
    
    public  Object[][] lectureBDDprospect()
    {
        String requete;
        requete = "SELECT *FROM prospect;";
        return realiserRequeteSelect(requete);
    }
//-------------------------------------------------------------------------------   
    public void insertBDDprospect(Prospects prospect)
    {
        String requete;
        requete = "INSERT INTO `prospect`(`nomEntrepriseProspect`, `siretProspect`, "
                + "`numeroRepresProspect`, `nomProspect`, `prenomProspect`, `numVoieProspect`, `adresseProspect`, "
                + "`complementProspect`, `villeProspect`, `mailProspect`, `numerotelProspect`, `paysProspect`, `codePostaleProspect`, "
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
                +"'"+prospect.getDerniereVisite()+");";
        realiserRequeteInsert(requete);
    }
    
    public void updateBDDProspect(Prospects prospect)
    {
        String requete;
        
        
        requete="UPDATE `representants` "
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
                + "`codePostaleProspect`="+prospect.getCodePostal()+","
                + "`derniereVisiteProspect`="+prospect.getDerniereVisite()+" "
                + "WHERE `numeroProspect`= "+prospect.getNumeroProspect()+";";
        
      
        realiserRequeteUpdate(requete);
    }
    
}
