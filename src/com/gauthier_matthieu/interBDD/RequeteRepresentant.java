/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.interBDD;

import com.gauthier_matthieu.metier.Representants;

/**
 *
 * @author Dev
 */
public class RequeteRepresentant extends GestionBaseDeDonnees{
    
    public void insertBDDRepresentant(Representants representant)
    {
        String requete;
        requete="INSERT INTO representants (nomRepresentant, prenomRepresentant, numeroVoieRepresentant, adresseRepresentant, complementAdresseRepresentant, villeRepresentant, mailRepresentant, numerotelRepresentant, paysRepresentant, codePostalRepresentant, salaireBrutRepresentant, tauxComissionRepresentant) "
                + "VALUES ('"+representant.getNom()+"',"
                + " '"+representant.getPrenom()+"',"
                + " "+representant.getNumeroVoie()+","
                + " '"+representant.getAdresse()+"',"
                + " '"+representant.getComplementAdresse()+"',"
                + " '"+representant.getVille()+"',"
                + " '"+representant.getMail()+"',"
                + " '"+representant.getNumerotel()+"',"
                + " '"+representant.getPays()+"',"
                + " '"+representant.getCodePostal()+"',"
                + " "+representant.getSalaireBrut()+","
                + " "+representant.getTauxCommission()+");";
        
        realiserRequeteInsert(requete);
        
         
    }
    public Object[][] lectureBDDrepresentant()
    {
        String requete;
        requete= "SELECT * FROM representants;";
        
        return realiserRequeteSelect(requete);
    }
    public Representants rechercheRepresentant(int numeroRepresentant)
    {
        String requete;
        requete= "SELECT * FROM representants WHERE `numeroRepresentant` = "+numeroRepresentant+";";
        
        objetResultat=realiserRequeteSelect(requete);
        
        return new Representants(Integer.parseInt(objetResultat[0][0].toString()), objetResultat[0][1].toString(), objetResultat[0][2].toString(), Integer.parseInt(objetResultat[0][3].toString()), objetResultat[0][4].toString(), objetResultat[0][5].toString(), objetResultat[0][6].toString(), objetResultat[0][7].toString(), objetResultat[0][8].toString(), objetResultat[0][9].toString(), objetResultat[0][10].toString(), Double.parseDouble(objetResultat[0][11].toString()),Double.parseDouble(objetResultat[0][12].toString()));
    }
    
    public void updateBDDRepresentants(Representants representant)
    {
        String requete;
        
        
        requete="UPDATE `representants` "
                + "SET `nomRepresentant`=\""+representant.getNom()+"\","
                + "`prenomRepresentant`=\""+representant.getPrenom()+"\","
                + "`numeroVoieRepresentant`="+representant.getNumeroVoie()+","
                + "`adresseRepresentant`=\""+representant.getAdresse()+"\","
                + "`complementAdresseRepresentant`=\""+representant.getComplementAdresse()+"\","
                + "`villeRepresentant`=\""+representant.getVille()+"\","
                + "`mailRepresentant`=\""+representant.getMail()+"\","
                + "`numerotelRepresentant`=\""+representant.getNumerotel()+"\","
                + "`paysRepresentant`=\""+representant.getPays()+"\","
                + "`codePostalRepresentant`=\""+representant.getCodePostal()+"\","
                + "`salaireBrutRepresentant`="+representant.getSalaireBrut()+","
                + "`tauxComissionRepresentant`="+representant.getTauxCommission()+" "
                + "WHERE `numeroRepresentant`= "+representant.getNumeroRepresentant()+";";
        
      
        realiserRequeteUpdate(requete);
    }
    public void deleteBDDRepresentants(int numeroRepresentant)
    {
        String requete="DELETE FROM `representants` WHERE `numeroRepresentant`="+numeroRepresentant+";";
        realiserRequeteDelete(requete);
    }
    
}
