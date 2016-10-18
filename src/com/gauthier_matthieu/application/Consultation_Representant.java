/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.application;


import com.gauthier_matthieu.interBDD.GestionBaseDeDonnees;
import com.gauthier_matthieu.metier.Representants;
import com.gauthier_matthieu.fonctions.MPanelPrinter;

import java.awt.*;
import com.gauthier_matthieu.entities.*;
import com.gauthier_matthieu.interBDD.RequeteRepresentant;
import java.awt.print.Printable;
import javax.swing.*;
import java.io.*;
import java.sql.SQLException;
import java.util.*;



/**
 * Fenêtre d'affichage d'un Représentant
 * sélectionné dans le tableau des Représentants de la fenêtre Gestion_Representants
 * @author glantoine
 */
public class Consultation_Representant extends javax.swing.JFrame {

    private JTable tableau;
    private Gestion_Representant gr;
    
     /**
     * Initialise tous les composants de la fenêtre
     * @param tableau Tableau des Représentants de l'écran gestion Représentants
     * @param gr Ecran Gestion_Representant
     */
    public Consultation_Representant(JTable tableau,Gestion_Representant gr) {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("..//image//logo-02.png")));
        setLocationRelativeTo(null);
        this.tableau=tableau;
        this.gr=gr;
        
        /*Lb_NumeroClient.setText("");
        Lb_Complement_Consult.setText("");
        Lb_Mail_Consult.setText("");
        Lb_NomContact_Consult.setText("");
        Lb_SalaireBrut_Consult.setText("");
        Lb_NumRue_Consult.setText("");
        Lb_Pays_Consult.setText("");
        Lb_PrenomContact_Consult.setText("");
        Lb_Rue_Consult.setText("");
        Lb_TauxComission_Consult.setText("");
        Lb_Telephone_Consult.setText("");
        Lb_Ville_Consult.setText("");
        Lb_codePostal_Consult.setText("");*/
        
        
        //GestionDonnees gd = new GestionDonnees();
        /*appel du hashMap client avec les clients*/
        //HashMap<Integer,Representants> representant= gd.getRepresentants();
        /*Création d'un objet client à partir du hashMap, ce qui permet de stocker toute les donnée de la ligne*/
        
        try{
        RequeteRepresentant bddRepresentant= new RequeteRepresentant();
        Representants representantObjet=bddRepresentant.rechercheRepresentant(Integer.parseInt(tableau.getValueAt(tableau.getSelectedRow(), 0).toString()));
        //Representants representantObjet = representant.get(Integer.parseInt(tableau.getValueAt(tableau.getSelectedRow(), 0).toString()));
        Lb_NumeroClient.setText(Integer.toString(representantObjet.getNumeroRepresentant()));
        Lb_NomContact_Consult.setText(representantObjet.getNom());
        Lb_PrenomContact_Consult.setText(representantObjet.getPrenom());
        Lb_TauxComission_Consult.setText(Double.toString(representantObjet.getTauxCommission()));
        Lb_NumRue_Consult.setText(Integer.toString(representantObjet.getNumeroVoie()));
        Lb_Rue_Consult.setText(representantObjet.getAdresse());
        Lb_Complement_Consult.setText(representantObjet.getComplementAdresse());
        Lb_Ville_Consult.setText(representantObjet.getVille());
        Lb_codePostal_Consult.setText(representantObjet.getCodePostal());
        Lb_Pays_Consult.setText(representantObjet.getPays());
        Lb_Mail_Consult.setText(representantObjet.getMail());
        Lb_Telephone_Consult.setText(representantObjet.getNumerotel());
        Lb_SalaireBrut_Consult.setText(Double.toString(representantObjet.getSalaireBrut()));}
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erreur SQL", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_ConsutationRepresentants = new javax.swing.JPanel();
        Lb_Fenetre = new javax.swing.JLabel();
        Bt_Annuler = new javax.swing.JButton();
        Bt_Aide = new javax.swing.JButton();
        Bt_Imprimer = new javax.swing.JButton();
        jPanel_Salaire = new javax.swing.JPanel();
        Lb_SalaireBrut = new javax.swing.JLabel();
        Lb_SalaireBrut_Consult = new javax.swing.JLabel();
        Lb_TauxComission = new javax.swing.JLabel();
        Lb_TauxComission_Consult = new javax.swing.JLabel();
        jPanel_Contact = new javax.swing.JPanel();
        Lb_NomContact = new javax.swing.JLabel();
        Lb_PrenomContact = new javax.swing.JLabel();
        Lb_Mail = new javax.swing.JLabel();
        Lb_Telephone = new javax.swing.JLabel();
        Lb_NomContact_Consult = new javax.swing.JLabel();
        Lb_PrenomContact_Consult = new javax.swing.JLabel();
        Lb_Telephone_Consult = new javax.swing.JLabel();
        Lb_Mail_Consult = new javax.swing.JLabel();
        jPanel_Adresse = new javax.swing.JPanel();
        Lb_Ville = new javax.swing.JLabel();
        Lb_CodePostal = new javax.swing.JLabel();
        Lb_Pays = new javax.swing.JLabel();
        Lb_Pays_Consult = new javax.swing.JLabel();
        Lb_Rue = new javax.swing.JLabel();
        Lb_NumRue = new javax.swing.JLabel();
        Lb_Complement = new javax.swing.JLabel();
        Lb_Rue_Consult = new javax.swing.JLabel();
        Lb_NumRue_Consult = new javax.swing.JLabel();
        Lb_codePostal_Consult = new javax.swing.JLabel();
        Lb_Complement_Consult = new javax.swing.JLabel();
        Lb_Ville_Consult = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        Lb_copyright = new java.awt.Label();
        Lb_NumeroClient = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Consultation Représentant");
        setMinimumSize(new java.awt.Dimension(950, 530));
        setName("Consultation Clients"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel_ConsutationRepresentants.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_ConsutationRepresentants.setMaximumSize(new java.awt.Dimension(950, 530));
        jPanel_ConsutationRepresentants.setMinimumSize(new java.awt.Dimension(950, 530));
        jPanel_ConsutationRepresentants.setPreferredSize(new java.awt.Dimension(950, 530));

        Lb_Fenetre.setFont(new java.awt.Font("Gill Sans MT", 3, 30)); // NOI18N
        Lb_Fenetre.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Fenetre.setText("CONSULTATION REPRÉSENTANT    n°");
        Lb_Fenetre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Bt_Annuler.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bt_Annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/cross-circular-button.png"))); // NOI18N
        Bt_Annuler.setText("QUITTER");
        Bt_Annuler.setPreferredSize(new java.awt.Dimension(130, 25));
        Bt_Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AnnulerActionPerformed(evt);
            }
        });

        Bt_Aide.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bt_Aide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/question-mark.png"))); // NOI18N
        Bt_Aide.setText("AIDE");
        Bt_Aide.setPreferredSize(new java.awt.Dimension(130, 25));
        Bt_Aide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AideActionPerformed(evt);
            }
        });

        Bt_Imprimer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bt_Imprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/printer (1).png"))); // NOI18N
        Bt_Imprimer.setText("IMPRESSION");
        Bt_Imprimer.setToolTipText("");
        Bt_Imprimer.setPreferredSize(new java.awt.Dimension(130, 25));
        Bt_Imprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_ImprimerActionPerformed(evt);
            }
        });

        jPanel_Salaire.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Salaire.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SALAIRE", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 2, 24), new java.awt.Color(102, 102, 102))); // NOI18N

        Lb_SalaireBrut.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_SalaireBrut.setForeground(new java.awt.Color(102, 102, 102));
        Lb_SalaireBrut.setText("Salaire Brut :");

        Lb_SalaireBrut_Consult.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_SalaireBrut_Consult.setForeground(new java.awt.Color(102, 102, 102));
        Lb_SalaireBrut_Consult.setText("zzzzz");

        Lb_TauxComission.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_TauxComission.setForeground(new java.awt.Color(102, 102, 102));
        Lb_TauxComission.setText("Taux de Comission :");

        Lb_TauxComission_Consult.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_TauxComission_Consult.setForeground(new java.awt.Color(102, 102, 102));
        Lb_TauxComission_Consult.setText("zzzzz");

        javax.swing.GroupLayout jPanel_SalaireLayout = new javax.swing.GroupLayout(jPanel_Salaire);
        jPanel_Salaire.setLayout(jPanel_SalaireLayout);
        jPanel_SalaireLayout.setHorizontalGroup(
            jPanel_SalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SalaireLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_SalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_TauxComission)
                    .addComponent(Lb_SalaireBrut))
                .addGap(18, 18, 18)
                .addGroup(jPanel_SalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_SalaireBrut_Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_TauxComission_Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel_SalaireLayout.setVerticalGroup(
            jPanel_SalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SalaireLayout.createSequentialGroup()
                .addGroup(jPanel_SalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_SalaireBrut)
                    .addComponent(Lb_SalaireBrut_Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel_SalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_TauxComission)
                    .addComponent(Lb_TauxComission_Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Contact.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Contact.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTACT", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 2, 24), new java.awt.Color(102, 102, 102))); // NOI18N

        Lb_NomContact.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_NomContact.setForeground(new java.awt.Color(102, 102, 102));
        Lb_NomContact.setText("Nom :");

        Lb_PrenomContact.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_PrenomContact.setForeground(new java.awt.Color(102, 102, 102));
        Lb_PrenomContact.setText("Prénom :");

        Lb_Mail.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Mail.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Mail.setText("Mail :");

        Lb_Telephone.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Telephone.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Telephone.setText("Téléphone :");
        Lb_Telephone.setToolTipText("");

        Lb_NomContact_Consult.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_NomContact_Consult.setForeground(new java.awt.Color(102, 102, 102));
        Lb_NomContact_Consult.setText("zzzz");
        Lb_NomContact_Consult.setToolTipText("");

        Lb_PrenomContact_Consult.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_PrenomContact_Consult.setForeground(new java.awt.Color(102, 102, 102));
        Lb_PrenomContact_Consult.setText("zzzz");
        Lb_PrenomContact_Consult.setToolTipText("");

        Lb_Telephone_Consult.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Telephone_Consult.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Telephone_Consult.setText("zzzz");
        Lb_Telephone_Consult.setToolTipText("");

        Lb_Mail_Consult.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Mail_Consult.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Mail_Consult.setText("zzzz");
        Lb_Mail_Consult.setToolTipText("");

        javax.swing.GroupLayout jPanel_ContactLayout = new javax.swing.GroupLayout(jPanel_Contact);
        jPanel_Contact.setLayout(jPanel_ContactLayout);
        jPanel_ContactLayout.setHorizontalGroup(
            jPanel_ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ContactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_Mail)
                    .addComponent(Lb_Telephone)
                    .addComponent(Lb_NomContact)
                    .addComponent(Lb_PrenomContact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_NomContact_Consult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_PrenomContact_Consult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Telephone_Consult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Mail_Consult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_ContactLayout.setVerticalGroup(
            jPanel_ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ContactLayout.createSequentialGroup()
                .addGroup(jPanel_ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_NomContact)
                    .addComponent(Lb_NomContact_Consult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_PrenomContact)
                    .addComponent(Lb_PrenomContact_Consult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Telephone)
                    .addComponent(Lb_Telephone_Consult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Mail)
                    .addComponent(Lb_Mail_Consult)))
        );

        jPanel_Adresse.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Adresse.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADRESSE", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 2, 24), new java.awt.Color(102, 102, 102))); // NOI18N

        Lb_Ville.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Ville.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Ville.setText("Ville :");

        Lb_CodePostal.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_CodePostal.setForeground(new java.awt.Color(102, 102, 102));
        Lb_CodePostal.setText("Code Postal :");

        Lb_Pays.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Pays.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Pays.setText("Pays :");

        Lb_Pays_Consult.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Pays_Consult.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Pays_Consult.setText("zzzzz");

        Lb_Rue.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Rue.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Rue.setText("Adresse :");

        Lb_NumRue.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_NumRue.setForeground(new java.awt.Color(102, 102, 102));
        Lb_NumRue.setText("Numéro :");

        Lb_Complement.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Complement.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Complement.setText("Complement :");

        Lb_Rue_Consult.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Rue_Consult.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Rue_Consult.setText("zzzz");

        Lb_NumRue_Consult.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_NumRue_Consult.setForeground(new java.awt.Color(102, 102, 102));
        Lb_NumRue_Consult.setText("zzzz");

        Lb_codePostal_Consult.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_codePostal_Consult.setForeground(new java.awt.Color(102, 102, 102));
        Lb_codePostal_Consult.setText("zzzz");

        Lb_Complement_Consult.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Complement_Consult.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Complement_Consult.setText("zzzz");

        Lb_Ville_Consult.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Ville_Consult.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Ville_Consult.setText("zzzz");

        javax.swing.GroupLayout jPanel_AdresseLayout = new javax.swing.GroupLayout(jPanel_Adresse);
        jPanel_Adresse.setLayout(jPanel_AdresseLayout);
        jPanel_AdresseLayout.setHorizontalGroup(
            jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AdresseLayout.createSequentialGroup()
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AdresseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_Complement)
                            .addComponent(Lb_NumRue)
                            .addComponent(Lb_Ville)))
                    .addGroup(jPanel_AdresseLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Lb_Pays)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_AdresseLayout.createSequentialGroup()
                        .addComponent(Lb_Pays_Consult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_AdresseLayout.createSequentialGroup()
                        .addComponent(Lb_Ville_Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lb_CodePostal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lb_codePostal_Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_AdresseLayout.createSequentialGroup()
                        .addComponent(Lb_NumRue_Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lb_Rue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lb_Rue_Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Lb_Complement_Consult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_AdresseLayout.setVerticalGroup(
            jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AdresseLayout.createSequentialGroup()
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_NumRue)
                    .addComponent(Lb_NumRue_Consult)
                    .addComponent(Lb_Rue)
                    .addComponent(Lb_Rue_Consult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Complement)
                    .addComponent(Lb_Complement_Consult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lb_Ville_Consult)
                        .addComponent(Lb_CodePostal)
                        .addComponent(Lb_codePostal_Consult))
                    .addComponent(Lb_Ville))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_Pays)
                    .addComponent(Lb_Pays_Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/logo représentant.png"))); // NOI18N

        Lb_copyright.setBackground(new java.awt.Color(255, 255, 255));
        Lb_copyright.setFont(new java.awt.Font("Gill Sans MT", 1, 10)); // NOI18N
        Lb_copyright.setForeground(new java.awt.Color(153, 153, 153));
        Lb_copyright.setText("Création Software SSII MGc all rights reserved 2016");

        Lb_NumeroClient.setBackground(new java.awt.Color(51, 51, 51));
        Lb_NumeroClient.setFont(new java.awt.Font("Gill Sans MT", 3, 36)); // NOI18N
        Lb_NumeroClient.setForeground(new java.awt.Color(51, 51, 51));
        Lb_NumeroClient.setText("*");
        Lb_NumeroClient.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel_ConsutationRepresentantsLayout = new javax.swing.GroupLayout(jPanel_ConsutationRepresentants);
        jPanel_ConsutationRepresentants.setLayout(jPanel_ConsutationRepresentantsLayout);
        jPanel_ConsutationRepresentantsLayout.setHorizontalGroup(
            jPanel_ConsutationRepresentantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ConsutationRepresentantsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Lb_Fenetre)
                .addGap(18, 18, 18)
                .addComponent(Lb_NumeroClient, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel_ConsutationRepresentantsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ConsutationRepresentantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_copyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_ConsutationRepresentantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel_Salaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel_ConsutationRepresentantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel_Contact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel_Adresse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel_ConsutationRepresentantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ConsutationRepresentantsLayout.createSequentialGroup()
                        .addComponent(Bt_Imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bt_Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bt_Aide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel_ConsutationRepresentantsLayout.setVerticalGroup(
            jPanel_ConsutationRepresentantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ConsutationRepresentantsLayout.createSequentialGroup()
                .addGroup(jPanel_ConsutationRepresentantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Fenetre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_NumeroClient, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_ConsutationRepresentantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ConsutationRepresentantsLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel_Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel_Salaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lb_copyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel_ConsutationRepresentantsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel_ConsutationRepresentantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bt_Imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt_Annuler, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(Bt_Aide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_ConsutationRepresentants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_ConsutationRepresentants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_ImprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_ImprimerActionPerformed
        MPanelPrinter fiche = new MPanelPrinter(jPanel_ConsutationRepresentants);
        fiche.initPrintablePanel();
        fiche.print();
    }//GEN-LAST:event_Bt_ImprimerActionPerformed

    private void Bt_AideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AideActionPerformed
        JOptionPane.showMessageDialog(null, "Cliquez sur \"Valider\" ou sur \"Annuler\" \n Pour plus d'information, "
            + "contacter le SAV au 06/0010020 \n"
            + "ou sur info@toutbois.fr", "Aide", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Bt_AideActionPerformed

    private void Bt_AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AnnulerActionPerformed
        gr.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_Bt_AnnulerActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       gr.setVisible(true);
       this.dispose();      
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Aide;
    private javax.swing.JButton Bt_Annuler;
    private javax.swing.JButton Bt_Imprimer;
    private javax.swing.JLabel Lb_CodePostal;
    private javax.swing.JLabel Lb_Complement;
    private javax.swing.JLabel Lb_Complement_Consult;
    private javax.swing.JLabel Lb_Fenetre;
    private javax.swing.JLabel Lb_Mail;
    private javax.swing.JLabel Lb_Mail_Consult;
    private javax.swing.JLabel Lb_NomContact;
    private javax.swing.JLabel Lb_NomContact_Consult;
    private javax.swing.JLabel Lb_NumRue;
    private javax.swing.JLabel Lb_NumRue_Consult;
    private javax.swing.JLabel Lb_NumeroClient;
    private javax.swing.JLabel Lb_Pays;
    private javax.swing.JLabel Lb_Pays_Consult;
    private javax.swing.JLabel Lb_PrenomContact;
    private javax.swing.JLabel Lb_PrenomContact_Consult;
    private javax.swing.JLabel Lb_Rue;
    private javax.swing.JLabel Lb_Rue_Consult;
    private javax.swing.JLabel Lb_SalaireBrut;
    private javax.swing.JLabel Lb_SalaireBrut_Consult;
    private javax.swing.JLabel Lb_TauxComission;
    private javax.swing.JLabel Lb_TauxComission_Consult;
    private javax.swing.JLabel Lb_Telephone;
    private javax.swing.JLabel Lb_Telephone_Consult;
    private javax.swing.JLabel Lb_Ville;
    private javax.swing.JLabel Lb_Ville_Consult;
    private javax.swing.JLabel Lb_codePostal_Consult;
    private java.awt.Label Lb_copyright;
    private javax.swing.JPanel jPanel_Adresse;
    private javax.swing.JPanel jPanel_ConsutationRepresentants;
    private javax.swing.JPanel jPanel_Contact;
    private javax.swing.JPanel jPanel_Salaire;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

    

    

}
