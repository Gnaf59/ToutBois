/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.application;

import com.gauthier_matthieu.entities.Clients;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author glantoine
 */
public class Consultation_Client extends javax.swing.JFrame implements Printable {

    public Consultation_Client() {
        initComponents();
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lb_Fenetre = new javax.swing.JLabel();
        Bt_Valider = new javax.swing.JButton();
        Bt_Annuler = new javax.swing.JButton();
        Bt_Aide = new javax.swing.JButton();
        jPanel_Entreprise = new javax.swing.JPanel();
        Lb_NomContact = new javax.swing.JLabel();
        Lb_PrenomContact = new javax.swing.JLabel();
        Lb_Mail = new javax.swing.JLabel();
        Lb_Telephone = new javax.swing.JLabel();
        Lb_NomContact_Entree = new javax.swing.JLabel();
        Lb_PrenomContact_Entree = new javax.swing.JLabel();
        Lb_Telephone_Entree = new javax.swing.JLabel();
        Lb_Mail_Entree = new javax.swing.JLabel();
        jPanel_Adresse = new javax.swing.JPanel();
        Lb_Ville = new javax.swing.JLabel();
        Lb_CodePostal = new javax.swing.JLabel();
        Lb_Pays = new javax.swing.JLabel();
        Lb_Rue = new javax.swing.JLabel();
        Lb_NumRue = new javax.swing.JLabel();
        TF_NumRue = new javax.swing.JTextField();
        TF_Rue = new javax.swing.JTextField();
        TF_Complement = new javax.swing.JTextField();
        TF_Ville = new javax.swing.JTextField();
        TF_codePostal = new javax.swing.JTextField();
        Lb_Complement = new javax.swing.JLabel();
        Lb_Boite = new javax.swing.JLabel();
        TF_Boite = new javax.swing.JTextField();
        CB_Pays = new javax.swing.JComboBox();
        jPanel_Entreprise1 = new javax.swing.JPanel();
        Lb_Societe = new javax.swing.JLabel();
        TF_Societe = new javax.swing.JTextField();
        TF_Siret = new javax.swing.JTextField();
        Lb_Siret = new javax.swing.JLabel();
        jPanel_Entreprise2 = new javax.swing.JPanel();
        Lb_RepresentantNomPrenom = new javax.swing.JLabel();
        CB_Repres = new javax.swing.JComboBox();
        logo = new javax.swing.JLabel();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultation Clients");
        setName("Création Client"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 640));

        Lb_Fenetre.setFont(new java.awt.Font("Gill Sans MT", 3, 30)); // NOI18N
        Lb_Fenetre.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Fenetre.setText("CONSULTATION CLIENTS");
        Lb_Fenetre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Bt_Valider.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bt_Valider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/icon.png"))); // NOI18N
        Bt_Valider.setText("VALIDER");
        Bt_Valider.setMaximumSize(new java.awt.Dimension(80, 23));
        Bt_Valider.setMinimumSize(new java.awt.Dimension(80, 23));
        Bt_Valider.setPreferredSize(new java.awt.Dimension(80, 23));
        Bt_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_ValiderActionPerformed(evt);
            }
        });

        Bt_Annuler.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bt_Annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/cross-circular-button.png"))); // NOI18N
        Bt_Annuler.setText("QUITTER");
        Bt_Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AnnulerActionPerformed(evt);
            }
        });

        Bt_Aide.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bt_Aide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/question-mark.png"))); // NOI18N
        Bt_Aide.setText("AIDE");
        Bt_Aide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AideActionPerformed(evt);
            }
        });

        jPanel_Entreprise.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Entreprise.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTACT", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 2, 24), new java.awt.Color(102, 102, 102))); // NOI18N

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

        Lb_NomContact_Entree.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_NomContact_Entree.setForeground(new java.awt.Color(102, 102, 102));

        Lb_PrenomContact_Entree.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_PrenomContact_Entree.setForeground(new java.awt.Color(102, 102, 102));

        Lb_Telephone_Entree.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Telephone_Entree.setForeground(new java.awt.Color(102, 102, 102));

        Lb_Mail_Entree.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Mail_Entree.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel_EntrepriseLayout = new javax.swing.GroupLayout(jPanel_Entreprise);
        jPanel_Entreprise.setLayout(jPanel_EntrepriseLayout);
        jPanel_EntrepriseLayout.setHorizontalGroup(
            jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EntrepriseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_NomContact)
                    .addComponent(Lb_PrenomContact)
                    .addComponent(Lb_Telephone)
                    .addComponent(Lb_Mail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_NomContact_Entree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_PrenomContact_Entree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Telephone_Entree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Mail_Entree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel_EntrepriseLayout.setVerticalGroup(
            jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EntrepriseLayout.createSequentialGroup()
                .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_NomContact)
                    .addComponent(Lb_NomContact_Entree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_PrenomContact)
                    .addComponent(Lb_PrenomContact_Entree))
                .addGap(15, 15, 15)
                .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Telephone)
                    .addComponent(Lb_Telephone_Entree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Mail)
                    .addComponent(Lb_Mail_Entree))
                .addContainerGap(13, Short.MAX_VALUE))
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

        Lb_Rue.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Rue.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Rue.setText("Adresse :");

        Lb_NumRue.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_NumRue.setForeground(new java.awt.Color(102, 102, 102));
        Lb_NumRue.setText("Numéro :");

        Lb_Complement.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Complement.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Complement.setText("Complement :");

        Lb_Boite.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Boite.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Boite.setText("Bte :");

        CB_Pays.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Allemagne", "Autriche", "Belgique", "Bulgarie", "Chypre", "Croatie", "Danemark", "Espagne", "Estonie", "Finlande", "France", "Grèce", "Hongrie", "Irlande", "Italie", "Lettonie", "Lituanie", "Luxembourg", "Malte", "Pays-Bas", "Pologne", "Portugal", "République tchèque", "Roumanie", "Royaume-Uni", "Slovaquie", "Slovénie", "Suède" }));

        javax.swing.GroupLayout jPanel_AdresseLayout = new javax.swing.GroupLayout(jPanel_Adresse);
        jPanel_Adresse.setLayout(jPanel_AdresseLayout);
        jPanel_AdresseLayout.setHorizontalGroup(
            jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AdresseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AdresseLayout.createSequentialGroup()
                        .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_Rue)
                            .addComponent(Lb_NumRue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_AdresseLayout.createSequentialGroup()
                                .addComponent(TF_NumRue, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Lb_Boite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_Boite, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lb_CodePostal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_codePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TF_Rue)))
                    .addGroup(jPanel_AdresseLayout.createSequentialGroup()
                        .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_Complement)
                            .addComponent(Lb_Ville)
                            .addComponent(Lb_Pays))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_Ville)
                            .addComponent(TF_Complement)
                            .addComponent(CB_Pays, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        jPanel_AdresseLayout.setVerticalGroup(
            jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AdresseLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Rue)
                    .addComponent(TF_Rue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_NumRue)
                    .addComponent(TF_NumRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_CodePostal)
                    .addComponent(TF_codePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Boite)
                    .addComponent(TF_Boite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Complement)
                    .addComponent(TF_Complement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Ville)
                    .addComponent(TF_Ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Pays)
                    .addComponent(CB_Pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel_Entreprise1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Entreprise1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENTREPRISE", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 2, 24), new java.awt.Color(102, 102, 102))); // NOI18N

        Lb_Societe.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Societe.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Societe.setText("Société : ");

        Lb_Siret.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Siret.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Siret.setText("Siret : ");

        javax.swing.GroupLayout jPanel_Entreprise1Layout = new javax.swing.GroupLayout(jPanel_Entreprise1);
        jPanel_Entreprise1.setLayout(jPanel_Entreprise1Layout);
        jPanel_Entreprise1Layout.setHorizontalGroup(
            jPanel_Entreprise1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Entreprise1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Entreprise1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_Societe)
                    .addComponent(Lb_Siret))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Entreprise1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_Siret, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(TF_Societe))
                .addGap(30, 30, 30))
        );
        jPanel_Entreprise1Layout.setVerticalGroup(
            jPanel_Entreprise1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Entreprise1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Entreprise1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Societe)
                    .addComponent(TF_Societe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Entreprise1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Siret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Siret))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Entreprise2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Entreprise2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPRESENTANT", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 2, 24), new java.awt.Color(102, 102, 102))); // NOI18N

        Lb_RepresentantNomPrenom.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_RepresentantNomPrenom.setForeground(new java.awt.Color(102, 102, 102));
        Lb_RepresentantNomPrenom.setText("Nom, Prénom :");

        CB_Repres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel_Entreprise2Layout = new javax.swing.GroupLayout(jPanel_Entreprise2);
        jPanel_Entreprise2.setLayout(jPanel_Entreprise2Layout);
        jPanel_Entreprise2Layout.setHorizontalGroup(
            jPanel_Entreprise2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Entreprise2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Lb_RepresentantNomPrenom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CB_Repres, 0, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_Entreprise2Layout.setVerticalGroup(
            jPanel_Entreprise2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Entreprise2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel_Entreprise2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_RepresentantNomPrenom)
                    .addComponent(CB_Repres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/logo-02.png"))); // NOI18N

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Gill Sans MT", 1, 10)); // NOI18N
        label1.setForeground(new java.awt.Color(153, 153, 153));
        label1.setText("Création Software SSII MGc all rights reserved 2016");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_Entreprise1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_Entreprise2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_Entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Bt_Valider, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bt_Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bt_Aide, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Lb_Fenetre, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Lb_Fenetre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_Entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bt_Valider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt_Annuler)
                            .addComponent(Bt_Aide)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_Entreprise1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_Entreprise2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_ValiderActionPerformed
        

    }//GEN-LAST:event_Bt_ValiderActionPerformed

    private void Bt_AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AnnulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_Bt_AnnulerActionPerformed


    private void Bt_AideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AideActionPerformed
        JOptionPane.showMessageDialog(null, "Cliquez sur \"Valider\" ou sur \"Annuler\" \n Pour plus d'information, "
                + "contacter le SAV au 06/0010020 \n"
                + "ou sur info@toutbois.fr", "Aide", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Bt_AideActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Nouveau_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nouveau_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nouveau_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nouveau_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultation_Client().pack();
                new Consultation_Client().setLocationRelativeTo(null);
                new Consultation_Client().setVisible(true);
                PrinterJob job = PrinterJob.getPrinterJob();
                job.setPrintable(new Consultation_Client());
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Aide;
    private javax.swing.JButton Bt_Annuler;
    private javax.swing.JButton Bt_Valider;
    private javax.swing.JComboBox CB_Pays;
    private javax.swing.JComboBox CB_Repres;
    private javax.swing.JLabel Lb_Boite;
    private javax.swing.JLabel Lb_CodePostal;
    private javax.swing.JLabel Lb_Complement;
    private javax.swing.JLabel Lb_Fenetre;
    private javax.swing.JLabel Lb_Mail;
    private javax.swing.JLabel Lb_Mail_Entree;
    private javax.swing.JLabel Lb_NomContact;
    private javax.swing.JLabel Lb_NomContact_Entree;
    private javax.swing.JLabel Lb_NumRue;
    private javax.swing.JLabel Lb_Pays;
    private javax.swing.JLabel Lb_PrenomContact;
    private javax.swing.JLabel Lb_PrenomContact_Entree;
    private javax.swing.JLabel Lb_RepresentantNomPrenom;
    private javax.swing.JLabel Lb_Rue;
    private javax.swing.JLabel Lb_Siret;
    private javax.swing.JLabel Lb_Societe;
    private javax.swing.JLabel Lb_Telephone;
    private javax.swing.JLabel Lb_Telephone_Entree;
    private javax.swing.JLabel Lb_Ville;
    private javax.swing.JTextField TF_Boite;
    private javax.swing.JTextField TF_Complement;
    private javax.swing.JTextField TF_NumRue;
    private javax.swing.JTextField TF_Rue;
    private javax.swing.JTextField TF_Siret;
    private javax.swing.JTextField TF_Societe;
    private javax.swing.JTextField TF_Ville;
    private javax.swing.JTextField TF_codePostal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Adresse;
    private javax.swing.JPanel jPanel_Entreprise;
    private javax.swing.JPanel jPanel_Entreprise1;
    private javax.swing.JPanel jPanel_Entreprise2;
    private java.awt.Label label1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
