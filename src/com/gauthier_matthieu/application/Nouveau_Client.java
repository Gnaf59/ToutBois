/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.application;

import com.gauthier_matthieu.entities.*;
import java.awt.Color;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author glantoine
 */
public class Nouveau_Client extends javax.swing.JFrame {

    private Gestion_Clients gc;
    
    public Nouveau_Client(Gestion_Clients gc) {
        initComponents();
        setLocationRelativeTo(null);
        this.gc=gc;
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
        Lb_ChampsObligatoires = new javax.swing.JLabel();
        jPanel_Entreprise = new javax.swing.JPanel();
        Lb_NomContact = new javax.swing.JLabel();
        TF_NomContact = new javax.swing.JTextField();
        Lb_PrenomContact = new javax.swing.JLabel();
        TF_PrenomContact = new javax.swing.JTextField();
        TF_Mail = new javax.swing.JTextField();
        Lb_Mail = new javax.swing.JLabel();
        Lb_Telephone = new javax.swing.JLabel();
        TF_Telephone = new javax.swing.JTextField();
        jPanel_Adresse = new javax.swing.JPanel();
        Lb_Ville = new javax.swing.JLabel();
        Lb_CodePostal = new javax.swing.JLabel();
        Lb_Pays = new javax.swing.JLabel();
        Lb_Rue = new javax.swing.JLabel();
        Lb_NumRue = new javax.swing.JLabel();
        TF_NumRue = new javax.swing.JTextField();
        TF_Complement = new javax.swing.JTextField();
        TF_Ville = new javax.swing.JTextField();
        TF_codePostal = new javax.swing.JTextField();
        Lb_Complement = new javax.swing.JLabel();
        CB_Pays = new javax.swing.JComboBox();
        TF_Rue = new javax.swing.JTextField();
        jPanel_Entreprise1 = new javax.swing.JPanel();
        Lb_Societe = new javax.swing.JLabel();
        TF_Societe = new javax.swing.JTextField();
        TF_Siret = new javax.swing.JTextField();
        Lb_Siret = new javax.swing.JLabel();
        jPanel_Entreprise2 = new javax.swing.JPanel();
        Lb_RepresentantNomPrenom = new javax.swing.JLabel();
        CB_Representant = new javax.swing.JComboBox();
        logo = new javax.swing.JLabel();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nouveau Clients");
        setName("Création Client"); // NOI18N
        setPreferredSize(new java.awt.Dimension(975, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 500));

        Lb_Fenetre.setFont(new java.awt.Font("Gill Sans MT", 3, 30)); // NOI18N
        Lb_Fenetre.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Fenetre.setText("NOUVEAU CLIENTS");
        Lb_Fenetre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Bt_Valider.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bt_Valider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/icon.png"))); // NOI18N
        Bt_Valider.setText("VALIDER");
        Bt_Valider.setMaximumSize(new java.awt.Dimension(80, 23));
        Bt_Valider.setMinimumSize(new java.awt.Dimension(80, 23));
        Bt_Valider.setPreferredSize(new java.awt.Dimension(130, 25));
        Bt_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_ValiderActionPerformed(evt);
            }
        });

        Bt_Annuler.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bt_Annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/cross-circular-button.png"))); // NOI18N
        Bt_Annuler.setText("ANNULER");
        Bt_Annuler.setMaximumSize(new java.awt.Dimension(130, 25));
        Bt_Annuler.setMinimumSize(new java.awt.Dimension(130, 25));
        Bt_Annuler.setPreferredSize(new java.awt.Dimension(130, 25));
        Bt_Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AnnulerActionPerformed(evt);
            }
        });

        Bt_Aide.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bt_Aide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/question-mark.png"))); // NOI18N
        Bt_Aide.setText("AIDE");
        Bt_Aide.setMaximumSize(new java.awt.Dimension(130, 25));
        Bt_Aide.setMinimumSize(new java.awt.Dimension(130, 25));
        Bt_Aide.setPreferredSize(new java.awt.Dimension(130, 25));
        Bt_Aide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AideActionPerformed(evt);
            }
        });

        Lb_ChampsObligatoires.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_ChampsObligatoires.setForeground(new java.awt.Color(102, 102, 102));
        Lb_ChampsObligatoires.setText("Les champs précédé d'une étoile (*) sont obligatoires");
        Lb_ChampsObligatoires.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jPanel_Entreprise.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Entreprise.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTACT", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 2, 24), new java.awt.Color(102, 102, 102))); // NOI18N

        Lb_NomContact.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_NomContact.setForeground(new java.awt.Color(102, 102, 102));
        Lb_NomContact.setText("* Nom :");

        Lb_PrenomContact.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_PrenomContact.setForeground(new java.awt.Color(102, 102, 102));
        Lb_PrenomContact.setText("* Prénom :");

        TF_Mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_MailActionPerformed(evt);
            }
        });

        Lb_Mail.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Mail.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Mail.setText("Mail :");

        Lb_Telephone.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Telephone.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Telephone.setText("Téléphone :");

        TF_Telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_TelephoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_EntrepriseLayout = new javax.swing.GroupLayout(jPanel_Entreprise);
        jPanel_Entreprise.setLayout(jPanel_EntrepriseLayout);
        jPanel_EntrepriseLayout.setHorizontalGroup(
            jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EntrepriseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_EntrepriseLayout.createSequentialGroup()
                            .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Lb_NomContact)
                                .addComponent(Lb_PrenomContact))
                            .addGap(23, 23, 23))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_EntrepriseLayout.createSequentialGroup()
                            .addComponent(Lb_Telephone)
                            .addGap(18, 18, 18)))
                    .addGroup(jPanel_EntrepriseLayout.createSequentialGroup()
                        .addComponent(Lb_Mail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TF_Telephone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(TF_PrenomContact, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_NomContact, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_Mail))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel_EntrepriseLayout.setVerticalGroup(
            jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EntrepriseLayout.createSequentialGroup()
                .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_NomContact)
                    .addComponent(TF_NomContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_PrenomContact)
                    .addComponent(TF_PrenomContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Telephone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_EntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Mail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Adresse.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Adresse.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADRESSE", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 2, 24), new java.awt.Color(102, 102, 102))); // NOI18N

        Lb_Ville.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Ville.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Ville.setText("* Ville :");

        Lb_CodePostal.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_CodePostal.setForeground(new java.awt.Color(102, 102, 102));
        Lb_CodePostal.setText("* CP :");

        Lb_Pays.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Pays.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Pays.setText("* Pays :");

        Lb_Rue.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Rue.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Rue.setText("* Adresse :");

        Lb_NumRue.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_NumRue.setForeground(new java.awt.Color(102, 102, 102));
        Lb_NumRue.setText("* Numéro :");

        Lb_Complement.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Complement.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Complement.setText("Complement :");

        CB_Pays.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selection", "Allemagne", "Autriche", "Belgique", "Bulgarie", "Chypre", "Croatie", "Danemark", "Espagne", "Estonie", "Finlande", "France", "Grèce", "Hongrie", "Irlande", "Italie", "Lettonie", "Lituanie", "Luxembourg", "Malte", "Pays-Bas", "Pologne", "Portugal", "République tchèque", "Roumanie", "Royaume-Uni", "Slovaquie", "Slovénie", "Suède" }));

        javax.swing.GroupLayout jPanel_AdresseLayout = new javax.swing.GroupLayout(jPanel_Adresse);
        jPanel_Adresse.setLayout(jPanel_AdresseLayout);
        jPanel_AdresseLayout.setHorizontalGroup(
            jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AdresseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_Complement)
                    .addComponent(Lb_NumRue)
                    .addComponent(Lb_Ville)
                    .addComponent(Lb_Pays))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AdresseLayout.createSequentialGroup()
                        .addComponent(TF_NumRue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lb_Rue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_Rue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TF_Complement)
                    .addGroup(jPanel_AdresseLayout.createSequentialGroup()
                        .addComponent(TF_Ville)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lb_CodePostal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_codePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CB_Pays, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_AdresseLayout.setVerticalGroup(
            jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AdresseLayout.createSequentialGroup()
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_NumRue)
                    .addComponent(TF_NumRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Rue)
                    .addComponent(TF_Rue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Complement)
                    .addComponent(TF_Complement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Ville)
                    .addComponent(TF_Ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_CodePostal)
                    .addComponent(TF_codePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_AdresseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_Pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Pays))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Entreprise1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Entreprise1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENTREPRISE", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 2, 24), new java.awt.Color(102, 102, 102))); // NOI18N

        Lb_Societe.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Societe.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Societe.setText("* Société : ");

        Lb_Siret.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_Siret.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Siret.setText("* Siret : ");

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
                .addGroup(jPanel_Entreprise1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_Siret)
                    .addComponent(TF_Societe))
                .addContainerGap())
        );
        jPanel_Entreprise1Layout.setVerticalGroup(
            jPanel_Entreprise1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Entreprise1Layout.createSequentialGroup()
                .addGroup(jPanel_Entreprise1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Societe)
                    .addComponent(TF_Societe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Entreprise1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Siret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Siret))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel_Entreprise2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Entreprise2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPRESENTANT", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 2, 24), new java.awt.Color(102, 102, 102))); // NOI18N

        Lb_RepresentantNomPrenom.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lb_RepresentantNomPrenom.setForeground(new java.awt.Color(102, 102, 102));
        Lb_RepresentantNomPrenom.setText("Nom, Prénom :");

        CB_Representant.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jean-Marc Delapaie", "Paul Savoure", "Marc Laville", "Paul Personne" }));

        javax.swing.GroupLayout jPanel_Entreprise2Layout = new javax.swing.GroupLayout(jPanel_Entreprise2);
        jPanel_Entreprise2.setLayout(jPanel_Entreprise2Layout);
        jPanel_Entreprise2Layout.setHorizontalGroup(
            jPanel_Entreprise2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Entreprise2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Lb_RepresentantNomPrenom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CB_Representant, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_Entreprise2Layout.setVerticalGroup(
            jPanel_Entreprise2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Entreprise2Layout.createSequentialGroup()
                .addGroup(jPanel_Entreprise2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_RepresentantNomPrenom)
                    .addComponent(CB_Representant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(10, 10, 10)
                        .addComponent(Lb_Fenetre, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel_Adresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel_Entreprise2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel_Entreprise1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lb_ChampsObligatoires, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel_Entreprise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Bt_Valider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bt_Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bt_Aide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Lb_Fenetre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_Entreprise1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Entreprise2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_Entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Lb_ChampsObligatoires)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bt_Aide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bt_Valider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bt_Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_ValiderActionPerformed
        try {
            
            //Réinitialise les couleurs des labels
            Lb_Societe.setForeground(new java.awt.Color(102, 102, 102));
            Lb_Siret.setForeground(new java.awt.Color(102, 102, 102));
            Lb_NumRue.setForeground(new java.awt.Color(102, 102, 102));
            Lb_Rue.setForeground(new java.awt.Color(102, 102, 102));
            Lb_Ville.setForeground(new java.awt.Color(102, 102, 102));
            Lb_CodePostal.setForeground(new java.awt.Color(102, 102, 102));
            Lb_Pays.setForeground(new java.awt.Color(102, 102, 102));
            Lb_NomContact.setForeground(new java.awt.Color(102, 102, 102));
            Lb_PrenomContact.setForeground(new java.awt.Color(102, 102, 102));
            
            String Verification="Veuillez remplir les champs ";
            
            if ("".equals(TF_Societe.getText())) {
                Lb_Societe.setForeground(Color.red);
                Verification+="Société, ";
            }

            if ("".equals(TF_Siret.getText())) {
                Lb_Siret.setForeground(Color.red);
                Verification+="Siret, ";
            }

            if ("".equals(TF_NumRue.getText())) {
                Lb_NumRue.setForeground(Color.red);
                Verification+="numéro de la rue, ";
            }

            if ("".equals(TF_Rue.getText())) {
                Lb_Rue.setForeground(Color.red);
                Verification+="rue, ";
            }

            if ("".equals(TF_Ville.getText())) {
                Lb_Ville.setForeground(Color.red);
                Verification+="ville, ";
            }
            
            if ("Selection".equals(CB_Pays.getSelectedItem().toString())) {
                Lb_Pays.setForeground(Color.red);
                Verification+="Pays, ";
            }

            if ("".equals(TF_codePostal.getText())) {
                Lb_CodePostal.setForeground(Color.red);
                Verification+="code postal, ";
            }


            if ("".equals(TF_NomContact.getText())) {
                Lb_NomContact.setForeground(Color.red);
                Verification+="nom du contact, ";
            }

            if ("".equals(TF_PrenomContact.getText())) {
                Lb_PrenomContact.setForeground(Color.red);
                Verification+="prenom du contact";
            }

            if ("".equals(TF_Societe.getText()) || "".equals(TF_Siret.getText()) || "".equals(TF_NumRue.getText()) || "".equals(TF_Rue.getText()) || "".equals(TF_Ville.getText()) || "Selection".equals(CB_Pays.getSelectedItem().toString()) || "".equals(TF_codePostal.getText()) || "".equals(TF_NomContact.getText()) || "".equals(TF_PrenomContact.getText())) {
                JOptionPane.showMessageDialog(null, Verification, "Attention", JOptionPane.ERROR_MESSAGE);
            } 
            else {   
                
                GestionDonnees gd=new GestionDonnees();
                gd.EnregistrerClientsCollection(TF_NomContact.getText(), TF_PrenomContact.getText(), TF_Societe.getText(), Integer.parseInt(TF_Siret.getText()), Integer.parseInt(TF_NumRue.getText()), TF_Rue.getText(), TF_Complement.getText(), TF_Ville.getText(), TF_codePostal.getText(), CB_Pays.getSelectedItem().toString(),TF_Mail.getText(), TF_Telephone.getText(), 0,1);
                
                
                //ferme la fenêtre Nouveau client et réaffiche la fenêtre gestion client
                dispose();
                gc.setVisible(true);
                
                
            
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_Bt_ValiderActionPerformed

    private void Bt_AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AnnulerActionPerformed
         //Réaffiche la fenêtre Gestion Client lorsque l'on quitte l'application
        gc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Bt_AnnulerActionPerformed


    private void Bt_AideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AideActionPerformed
        JOptionPane.showMessageDialog(null, "Cliquez sur \"Valider\" ou sur \"Annuler\" \n Pour plus d'information, "
                + "contacter le SAV au 06/0010020 \n"
                + "ou sur info@toutbois.fr", "Aide", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Bt_AideActionPerformed

    private void TF_MailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_MailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_MailActionPerformed

    private void TF_TelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_TelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_TelephoneActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Réaffiche la fenêtre Gestion Client lorsque l'on quitte l'application
        gc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Aide;
    private javax.swing.JButton Bt_Annuler;
    private javax.swing.JButton Bt_Valider;
    private javax.swing.JComboBox CB_Pays;
    private javax.swing.JComboBox CB_Representant;
    private javax.swing.JLabel Lb_ChampsObligatoires;
    private javax.swing.JLabel Lb_CodePostal;
    private javax.swing.JLabel Lb_Complement;
    private javax.swing.JLabel Lb_Fenetre;
    private javax.swing.JLabel Lb_Mail;
    private javax.swing.JLabel Lb_NomContact;
    private javax.swing.JLabel Lb_NumRue;
    private javax.swing.JLabel Lb_Pays;
    private javax.swing.JLabel Lb_PrenomContact;
    private javax.swing.JLabel Lb_RepresentantNomPrenom;
    private javax.swing.JLabel Lb_Rue;
    private javax.swing.JLabel Lb_Siret;
    private javax.swing.JLabel Lb_Societe;
    private javax.swing.JLabel Lb_Telephone;
    private javax.swing.JLabel Lb_Ville;
    private javax.swing.JTextField TF_Complement;
    private javax.swing.JTextField TF_Mail;
    private javax.swing.JTextField TF_NomContact;
    private javax.swing.JTextField TF_NumRue;
    private javax.swing.JTextField TF_PrenomContact;
    private javax.swing.JTextField TF_Rue;
    private javax.swing.JTextField TF_Siret;
    private javax.swing.JTextField TF_Societe;
    private javax.swing.JTextField TF_Telephone;
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
}
