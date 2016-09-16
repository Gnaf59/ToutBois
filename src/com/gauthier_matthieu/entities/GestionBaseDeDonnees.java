/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;
import com.gauthier_matthieu.entities.*;

/**
 *
 * @author glantoine
 */
public class GestionBaseDeDonnees {
   //url du serveur mySQL
   private String url="jdbc:mysql://127.0.0.1:3306/toutbois";
   //nom d'utilisateur mySQL
   private String user = "root";
   //mot de passe de la base mySQL
   private String password = "";
   //connection à la base de donnée
   private Connection connection=null;
   //Résultat de la requête SQL SELECT
   private ResultSet resultat;
   private Object[][] objetResultat;
   //private ArrayList listeResultat;
   private int statut;
   
   //type de requête et valeur int attribué
   public static final int SELECT=0;
   public static final int INSERT=1;
   public static final int UPDATE=2;
   public static final int DELETE=3;
   
   /**
    * Chargement du driver jdbc
    */
   public GestionBaseDeDonnees() 
   {       
        try 
        {
            Class.forName( "com.mysql.jdbc.Driver" );
        } 
        catch ( ClassNotFoundException e ) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur chargement driver jdbc", JOptionPane.ERROR_MESSAGE);
        }
   }
   /**
    * Méthode privée s'occupant de réaliser tout type de requête en fonction de la valeur du type de la requête
    */
    private void realiserRequete(String requete,int typeRequete)
   {       
       try
       {
           connection = DriverManager.getConnection(url,user,password);
           Statement statement = connection.createStatement();
           //si c'est une requête Select le resultat sera stocké dans la variable d'instance resultat
           if(typeRequete==0)
           {
               this.resultat = statement.executeQuery(requete);
               ResultSetMetaData metadata = resultat.getMetaData();
               int nombreColonnes = metadata.getColumnCount();
               
               resultat.last();
               int nombreLigne=resultat.getRow();
               resultat.beforeFirst();
               
               objetResultat=new Object[nombreLigne][nombreColonnes];
               int index=0;
               while(resultat.next())
               {
                    for (int i=0;i<nombreColonnes;i++)
                    {
                        objetResultat[index][i]=resultat.getObject(i+1);
                    }
                    index++;
               }
               
               
               
           }
           //Si il s'agit d'une requête INSERT, UPDATE, DELETE on stock le statut de la requête dans la variable d'instance statut.
           if(typeRequete>0 && typeRequete<=3)
           {
               this.statut = statement.executeUpdate(requete);
           }
           
       }
       catch(SQLException ex)
       {
           //gère l'exception en cas d'ouverture de la connection impossible
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Ouverture de connection impossible", JOptionPane.ERROR_MESSAGE);
           
       }
       finally {
                    //Dans tous les cas ferme la connection si elle existe
                    if ( connection != null )
                    try {
                            
                            connection.close();
                        } 
                    catch ( SQLException ignore ) 
                        {
                            /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
                        }   
                }
   }
    /**
    * Méthode s'occupant d'exécuter la requête SQL select
    * @param requete requête SQL SELECT à traiter
    * @return Le résultat de la requête sous forme de ResultSet
    */
    public Object[][] realiserRequeteSelect(String requete)
    {
        realiserRequete(requete, SELECT);
        return this.objetResultat;
    }
    /**
    * Méthode s'occupant d'exécuter la requête SQL INSERT
    * 
     * @param requete requête SQL d'insertion dans la base de donnée (INSERT) à traiter
     * @return le statut d'éxécution de la requête
    */
    public int realiserRequeteInsert(String requete)
    {
        realiserRequete(requete, INSERT);
        return this.statut;
    }
    /**
    * Méthode s'occupant d'exécuter la requête SQL UPDATE
    * 
     * @param requete requête SQL d'insertion dans la base de donnée (INSERT) à traiter
     * @return le statut d'éxécution de la requête
    */
    public int realiserRequeteUpdate(String requete)
    {
        realiserRequete(requete, UPDATE);
        return this.statut;
    }
    public int realiserRequeteDelete(String requete)
    {
        realiserRequete(requete, DELETE);
        return this.statut;
    }

   
    public void insertBDDRepresentant(String nomRepresentant,String prenomRepresentant,int numeroVoie,String adresse,String complementAdresse,String ville,String codePostal,String pays,String mail,String numerotel,double salaireBrut,double tauxCommission)
    {
        String requete;
        requete="INSERT INTO representants (nomRepresentant, prenomRepresentant, numeroVoieRepresentant, adresseRepresentant, complementAdresseRepresentant, villeRepresentant, mailRepresentant, numerotelRepresentant, paysRepresentant, codePostalRepresentant, salaireBrutRepresentant, tauxComissionRepresentant) "
                + "VALUES ('"+nomRepresentant+"',"
                + " '"+prenomRepresentant+"',"
                + " "+numeroVoie+","
                + " '"+adresse+"',"
                + " '"+complementAdresse+"',"
                + " '"+ville+"',"
                + " '"+mail+"',"
                + " '"+numerotel+"',"
                + " '"+pays+"',"
                + " '"+codePostal+"',"
                + " "+salaireBrut+","
                + " "+tauxCommission+");";
        
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
        requete= "SELECT * FROM representants WHERE 'numeroRepresentant'= "+numeroRepresentant+";";
        
        objetResultat=realiserRequeteSelect(requete);
        
        return new Representants(Integer.parseInt(objetResultat[0][0].toString()), objetResultat[0][1].toString(), objetResultat[0][2].toString(), Integer.parseInt(objetResultat[0][3].toString()), objetResultat[0][4].toString(), objetResultat[0][5].toString(), objetResultat[0][6].toString(), objetResultat[0][7].toString(), objetResultat[0][8].toString(), objetResultat[0][9].toString(), objetResultat[0][10].toString(), Double.parseDouble(objetResultat[0][11].toString()),Double.parseDouble(objetResultat[0][12].toString()));
    }
            

    
}
