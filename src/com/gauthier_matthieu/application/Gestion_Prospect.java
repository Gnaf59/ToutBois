/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.application;

import javax.swing.JTable;
import com.gauthier_matthieu.entities.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author glantoine
 */
public class Gestion_Prospect extends javax.swing.JFrame {

    private fenetre_applications fa;
    /**
     * Creates new form Gestion_Clients
     */
    public Gestion_Prospect(fenetre_applications fa) {
        initComponents();
        setLocationRelativeTo(null);
        this.fa=fa;
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
        BT_Modifier_PR = new javax.swing.JButton();
        BT_Supprimer_PR = new javax.swing.JButton();
        BT_Consulter_PR = new javax.swing.JButton();
        BT_Ajouter_PR = new javax.swing.JButton();
        BT_Recherche_PR = new javax.swing.JButton();
        BT_Quitter_PR = new javax.swing.JButton();
        BT_Aide_PR = new javax.swing.JButton();
        Lb_Titre_PR = new javax.swing.JLabel();
        TF_FiltreClient_PR = new javax.swing.JTextField();
        image_PR = new javax.swing.JLabel();
        image_2_PR = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Fichier Prospect");
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
        jPanel1.setMaximumSize(new java.awt.Dimension(980, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(945, 600));
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
        });

        BT_Modifier_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Modifier_PR.setText("Modifier");
        BT_Modifier_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Modifier_PRActionPerformed(evt);
            }
        });

        BT_Supprimer_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Supprimer_PR.setText("Supprimer");

        BT_Consulter_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Consulter_PR.setText("Consulter");

        BT_Ajouter_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Ajouter_PR.setText("Nouveau");
        BT_Ajouter_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Ajouter_PRActionPerformed(evt);
            }
        });

        BT_Recherche_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Recherche_PR.setText("Rechercher");

        BT_Quitter_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Quitter_PR.setText("Quitter");
        BT_Quitter_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Quitter_PRActionPerformed(evt);
            }
        });

        BT_Aide_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Aide_PR.setText("Aide");
        BT_Aide_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Aide_PRActionPerformed(evt);
            }
        });

        Lb_Titre_PR.setFont(new java.awt.Font("Gill Sans MT", 3, 48)); // NOI18N
        Lb_Titre_PR.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Titre_PR.setText("Fichier Prospect");

        TF_FiltreClient_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_FiltreClient_PRActionPerformed(evt);
            }
        });

        image_PR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/logo-02.png"))); // NOI18N
        image_PR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        image_PR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        image_PR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        image_2_PR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/logo-03.png"))); // NOI18N

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Gill Sans MT", 1, 10)); // NOI18N
        label1.setForeground(new java.awt.Color(153, 153, 153));
        label1.setText("Création Software SSII MGc all rights reserved 2016");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new Model_Table_Client());
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
                                    .addComponent(BT_Modifier_PR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT_Ajouter_PR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT_Consulter_PR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT_Supprimer_PR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(image_2_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(image_PR))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BT_Aide_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BT_Quitter_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Lb_Titre_PR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TF_FiltreClient_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT_Recherche_PR)))
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_FiltreClient_PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_Recherche_PR)))
                    .addComponent(Lb_Titre_PR))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BT_Ajouter_PR)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Modifier_PR)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Consulter_PR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_Supprimer_PR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image_PR)
                    .addComponent(image_2_PR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Aide_PR)
                    .addComponent(BT_Quitter_PR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 602, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Fichier Prospect");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded

    }//GEN-LAST:event_jPanel1ComponentAdded

    private void BT_Quitter_PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Quitter_PRActionPerformed
        //fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_Quitter_PRActionPerformed

    private void TF_FiltreClient_PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_FiltreClient_PRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_FiltreClient_PRActionPerformed

    private void BT_Ajouter_PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Ajouter_PRActionPerformed
        Nouveau_Prospect np = new Nouveau_Prospect(this);
        np.setVisible(true);
        this.setVisible(false);
                  
    }//GEN-LAST:event_BT_Ajouter_PRActionPerformed

    private void BT_Aide_PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Aide_PRActionPerformed
        
        JOptionPane.showMessageDialog(null, "Utiliser le manuel de l'utilisateur \n Pour plus d'information,\n "
                + "contacter le SAV au 06/0010020 \n"
                + "ou sur info@toutbois.fr\n\n\n"
                + "Création Software SSII MGc \n"
                + "all rights reserved 2016", "Aide", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_BT_Aide_PRActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void BT_Modifier_PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Modifier_PRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_Modifier_PRActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Aide_PR;
    private javax.swing.JButton BT_Ajouter_PR;
    private javax.swing.JButton BT_Consulter_PR;
    private javax.swing.JButton BT_Modifier_PR;
    private javax.swing.JButton BT_Quitter_PR;
    private javax.swing.JButton BT_Recherche_PR;
    private javax.swing.JButton BT_Supprimer_PR;
    private javax.swing.JLabel Lb_Titre_PR;
    private javax.swing.JTextField TF_FiltreClient_PR;
    private javax.swing.JLabel image_2_PR;
    private javax.swing.JLabel image_PR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
