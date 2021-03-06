/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.application;

import com.gauthier_matthieu.old.GestionDonnees;
import javax.swing.JTable;
import com.gauthier_matthieu.entities.*;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import com.gauthier_matthieu.interBDD.*;
import java.sql.SQLException;

/**
 * Cette fenêtre s'occupe de la gestion du fichier client.
 * Par l'intermédiaire des boutons nouveau, modifier, consulter ou supprimer 
 * l'utilisateur à la possibilité de créer un nouveau client en lançant la fenêtre Nouveau_Client,
 * modifier un client déjà existant et préalablement sélectionné sur la jTable en ouvrant la fenêtre Modification_client,
 * voir les informations du Client sélectionné sur l'écran Consultation_Client ou
 * supprimer un client sélectionné directement dans la fenêtre Gestion_Clients.
 * @author glantoine
 */
public class Gestion_Clients extends javax.swing.JFrame {

    private fenetre_applications fa=new fenetre_applications();
    
    
    /**
     * Génère la fenêtre et initialise ces composants
     * @param fa Nécessite en paramêtre la fenetre_applications afin de gérer son affichage
     */
    public Gestion_Clients(fenetre_applications fa) {
        this.fa=fa;
        initComponents();
        setLocationRelativeTo(null);
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
        BT_Modifier = new javax.swing.JButton();
        BT_Supprimer = new javax.swing.JButton();
        BT_Consulter = new javax.swing.JButton();
        BT_Ajouter = new javax.swing.JButton();
        BT_Aide = new javax.swing.JButton();
        BT_Quitter = new javax.swing.JButton();
        Lb_Titre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Fichier Clients");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("..//image//logo-02.png")));
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(975, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(975, 550));
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
        });

        BT_Modifier.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/edit.png"))); // NOI18N
        BT_Modifier.setText("Modifier");
        BT_Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ModifierActionPerformed(evt);
            }
        });

        BT_Supprimer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/subtract-sign.png"))); // NOI18N
        BT_Supprimer.setText("Supprimer");
        BT_Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SupprimerActionPerformed(evt);
            }
        });

        BT_Consulter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Consulter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/magnifier-tool.png"))); // NOI18N
        BT_Consulter.setText("Consulter");
        BT_Consulter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ConsulterActionPerformed(evt);
            }
        });

        BT_Ajouter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/plus-black-symbol.png"))); // NOI18N
        BT_Ajouter.setText("Nouveau");
        BT_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AjouterActionPerformed(evt);
            }
        });

        BT_Aide.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Aide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/question-mark.png"))); // NOI18N
        BT_Aide.setText("Aide");
        BT_Aide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AideActionPerformed(evt);
            }
        });

        BT_Quitter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/go-back-arrow.png"))); // NOI18N
        BT_Quitter.setText("Retour");
        BT_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_QuitterActionPerformed(evt);
            }
        });

        Lb_Titre.setFont(new java.awt.Font("Gill Sans MT", 3, 48)); // NOI18N
        Lb_Titre.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Titre.setText("Fichier Clients");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/logo-02.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/logo-03.png"))); // NOI18N

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Gill Sans MT", 1, 10)); // NOI18N
        label1.setForeground(new java.awt.Color(153, 153, 153));
        label1.setText("Création Software SSII MGc all rights reserved 2016");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BT_Modifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT_Ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT_Consulter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT_Supprimer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BT_Aide, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(BT_Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Lb_Titre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Titre)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BT_Ajouter)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Modifier)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Consulter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_Supprimer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BT_Aide)
                        .addComponent(BT_Quitter))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //Actualise la jTable
        jTable1.setModel(new Model_Table_Client());
    }//GEN-LAST:event_formComponentShown

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded

    }//GEN-LAST:event_jPanel1ComponentAdded

    private void BT_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_QuitterActionPerformed
        //réaffiche la fenêtre fenetre_application
        fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_QuitterActionPerformed

    private void BT_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AjouterActionPerformed
        //Ouvre une fenêtre Nouveau client et masque la fenêtre de gestion client
        Nouveau_Client nc = new Nouveau_Client(this);
        nc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BT_AjouterActionPerformed

    private void BT_AideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AideActionPerformed
        JOptionPane.showMessageDialog(null, "Utiliser le manuel de l'utilisateur \n Pour plus d'information,\n "
                + "contacter le SAV au 06/0010020 \n"
                + "ou sur info@toutbois.fr\n\n\n"
                + "Création Software SSII MGc \n"
                + "all rights reserved 2016", "Aide", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BT_AideActionPerformed

    private void BT_ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ModifierActionPerformed
      try
        {
            Modification_Clients mc = new Modification_Clients(this,jTable1);
            mc.setVisible(true);
            this.setVisible(false);
        }
        catch(IndexOutOfBoundsException iobe)
        {
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner une ligne à consulter", "Attention", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BT_ModifierActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fa.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_formWindowClosing

    private void BT_ConsulterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ConsulterActionPerformed
        try
        {
            Consultation_Client cc = new Consultation_Client(jTable1,this);
            cc.setVisible(true);
            this.setVisible(false);
        }
        catch(IndexOutOfBoundsException iobe)
        {
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner une ligne à consulter", "Attention", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BT_ConsulterActionPerformed

    private void BT_SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SupprimerActionPerformed
        try
        {
            RequeteClient bddClient = new RequeteClient();
            int numeroClient=Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            int selectedOption = JOptionPane.showConfirmDialog(null,"Voulez vous supprimer ce Client ?", "INFORMATION",JOptionPane.YES_NO_OPTION);    
            
            if (selectedOption == JOptionPane.YES_OPTION) 
            {
                bddClient.deleteBDDClients(numeroClient);
                jTable1.setModel(new Model_Table_Client());
                JOptionPane.showMessageDialog(null, "Suppresion client effectuée", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERREUR SQL", JOptionPane.ERROR_MESSAGE);
        }
        catch(IndexOutOfBoundsException iobe)
        {
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner une ligne à supprimer", "Attention", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_BT_SupprimerActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Aide;
    private javax.swing.JButton BT_Ajouter;
    private javax.swing.JButton BT_Consulter;
    private javax.swing.JButton BT_Modifier;
    private javax.swing.JButton BT_Quitter;
    private javax.swing.JButton BT_Supprimer;
    private javax.swing.JLabel Lb_Titre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
