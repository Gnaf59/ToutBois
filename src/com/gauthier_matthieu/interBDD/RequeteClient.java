/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.interBDD;

import com.gauthier_matthieu.metier.Clients;

/**
 *
 * @author Dev
 */
public class RequeteClient extends GestionBaseDeDonnees{
    
    public Object[][] lectureBDDClients()
    {
        String requete;
        requete= "SELECT * FROM clients;";
        return realiserRequeteSelect(requete);
    }
//------------------------------------------------------------------------------    
    public void insertBDDClients(Clients client)
    {
        String requete;
        requete="INSERT INTO clients (nomEntrepriseClient, siretClient, numeroRepresClient, nomClient, prenomClient, "
                + "numVoieClient, adresseClient, complementClient, villeClient, "
                + "mailClient, numeroTelClient, paysClient, codePostalClient)"
                + "VALUES ('"+client.getNomEntreprise()+"',"
                + " '"+client.getSiret()+"',"
                + " "+client.getNumeroRepresentant()+","
                + " '"+client.getNom()+"',"
                + " '"+client.getPrenom()+"',"
                + " "+client.getNumeroVoie()+","
                + " '"+client.getAdresse()+"',"
                + " '"+client.getComplementAdresse()+"',"
                + " '"+client.getVille()+"',"
                + " '"+client.getMail()+"',"
                + " '"+client.getNumerotel()+"',"
                + " '"+client.getPays()+"',"
                + " '"+client.getCodePostal()+"');";
        
        realiserRequeteInsert(requete);
    }
//------------------------------------------------------------------------------      
    public Clients rechercheClients(int numeroClient)
    {
        String requete;
        requete= "SELECT * FROM clients WHERE `numeroClient` = "+numeroClient+";";
        
        objetResultat=realiserRequeteSelect(requete);
        return new Clients(
                 
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
//------------------------------------------------------------------------------     
    public void updateBDDClients(Clients client)
    {
        String requete;
        requete="UPDATE `clients` "
                + "SET `nomEntrepriseClient`=\""+client.getNomEntreprise()+"\","
                + "`siretClient`=\""+client.getSiret()+"\","
                + "`numeroRepresClient`="+client.getNumeroRepresentant()+","
                + "`nomClient`=\""+client.getNom()+"\","
                + "`prenomClient`=\""+client.getPrenom()+"\","
                + "`numVoieClient`="+client.getNumeroVoie()+","
                + "`adresseClient`=\""+client.getAdresse()+"\","
                + "`complementClient`=\""+client.getComplementAdresse()+"\","
                + "`villeClient`=\""+client.getVille()+"\","
                + "`mailClient`=\""+client.getMail()+"\","
                + "`numerotelClient`=\""+client.getNumerotel()+"\","
                + "`paysClient`=\""+client.getPays()+"\","
                + "`codePostalClient`=\""+client.getCodePostal()+" "
                + "WHERE `numeroClient`= "+client.getNumeroClient()+";";
        realiserRequeteUpdate(requete);
    }
//------------------------------------------------------------------------------     
    public void deleteBDDClients(int numeroClient)
    {
        String requete="DELETE FROM `clients` WHERE `numeroClient`="+numeroClient+";";
        realiserRequeteDelete(requete);
    }
    
}


