/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.entities;
import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;


/**
 *
 * @author glantoine
 */
public class GestionBaseDeDonnees {
    
   private String url="jdbc:mysql://127.0.0.1:3306/toutbois";
   private String user = "root";
   private String password = "";
   private Connection connection=null;
   private ResultSet resultat;
   private int statut;
   
   public static final int SELECT=0;
   public static final int INSERT=1;
   public static final int UPDATE=2;
   public static final int DELETE=3;
   
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
   
    private void realiserRequete(String requete,int typeRequete)
   {       
       try
       {
           connection = DriverManager.getConnection(url,user,password);
           Statement statement = connection.createStatement();
           if(typeRequete==0)
           {
               this.resultat = statement.executeQuery(requete);
           }
           if(typeRequete>0 && typeRequete<=3)
           {
               this.statut = statement.executeUpdate(requete);
           }
           
       }
       catch(SQLException ex)
       {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Ouverture de connection impossible", JOptionPane.ERROR_MESSAGE);
           
       }
       finally {
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
    public ResultSet realiserRequeteSelect(String requete)
    {
        realiserRequete(requete, SELECT);
        return this.resultat;
    }
    public int realiserRequeteInsert(String requete)
    {
        realiserRequete(requete, INSERT);
        return this.statut;
    }
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
    public ResultSet lectureBDDrepresentant()
    {
        String requete;
        requete= "SELECT * FROM representants;";
        
        return realiserRequeteSelect(requete);
    }
            

    
}
