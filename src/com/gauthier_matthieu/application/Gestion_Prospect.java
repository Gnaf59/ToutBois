/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.application;

import com.gauthier_matthieu.entities.*;
import com.gauthier_matthieu.interBDD.RequeteProspect;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;

  /**
 * Cette fenêtre s'occupe de la gestion de la table prospect.
 * Par l'intermédiaire des boutons nouveau, modifier, consulter ou supprimer 
 * l'utilisateur à la possibilité de créer un nouveau client en lançant la fenêtre Nouveau_Prospect,
 * modifier un client déjà existant et préalablement sélectionné sur la jTable en ouvrant la fenêtre Modification_Prospect,
 * voir les informations du Prospect sélectionné sur l'écran Consultation_Prospect ou
 * supprimer un Prospect sélectionné directement dans la fenêtre Gestion_Prospect.
 * 
 * @author glantoine
 */
public class Gestion_Prospect extends javax.swing.JFrame {
    
    private fenetre_applications fa=new fenetre_applications();
    /**
     * Génère la fenêtre et initialise ces composants
     * @param fa Nécessite en paramêtre la fenetre_applications afin de gérer son affichage
     */
    public Gestion_Prospect(fenetre_applications fa) {
        this.fa=fa;
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("..//image//logo-02.png")));
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

        jP_Prospect = new javax.swing.JPanel();
        BT_Modifier_PR = new javax.swing.JButton();
        BT_Supprimer_PR = new javax.swing.JButton();
        BT_Consulter_PR = new javax.swing.JButton();
        BT_Ajouter_PR = new javax.swing.JButton();
        BT_Quitter_PR = new javax.swing.JButton();
        BT_Aide_PR = new javax.swing.JButton();
        Lb_Titre_PR = new javax.swing.JLabel();
        image_PR = new javax.swing.JLabel();
        image_2_PR = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Fichier Prospect");
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

        jP_Prospect.setBackground(new java.awt.Color(255, 255, 255));
        jP_Prospect.setMaximumSize(new java.awt.Dimension(975, 550));
        jP_Prospect.setPreferredSize(new java.awt.Dimension(975, 550));

        BT_Modifier_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Modifier_PR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/edit.png"))); // NOI18N
        BT_Modifier_PR.setText("Modifier");
        BT_Modifier_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Modifier_PRActionPerformed(evt);
            }
        });

        BT_Supprimer_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Supprimer_PR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/subtract-sign.png"))); // NOI18N
        BT_Supprimer_PR.setText("Supprimer");
        BT_Supprimer_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Supprimer_PRActionPerformed(evt);
            }
        });

        BT_Consulter_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Consulter_PR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/magnifier-tool.png"))); // NOI18N
        BT_Consulter_PR.setText("Consulter");
        BT_Consulter_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Consulter_PRActionPerformed(evt);
            }
        });

        BT_Ajouter_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Ajouter_PR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/plus-black-symbol.png"))); // NOI18N
        BT_Ajouter_PR.setText("Nouveau");
        BT_Ajouter_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Ajouter_PRActionPerformed(evt);
            }
        });

        BT_Quitter_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Quitter_PR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/go-back-arrow.png"))); // NOI18N
        BT_Quitter_PR.setText("Retour");
        BT_Quitter_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Quitter_PRActionPerformed(evt);
            }
        });

        BT_Aide_PR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BT_Aide_PR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/question-mark.png"))); // NOI18N
        BT_Aide_PR.setText("Aide");
        BT_Aide_PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Aide_PRActionPerformed(evt);
            }
        });

        Lb_Titre_PR.setFont(new java.awt.Font("Gill Sans MT", 3, 48)); // NOI18N
        Lb_Titre_PR.setForeground(new java.awt.Color(102, 102, 102));
        Lb_Titre_PR.setText("Fichier Prospect");

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
        jTable1.setModel(new Model_Table_Prospect());
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jP_ProspectLayout = new javax.swing.GroupLayout(jP_Prospect);
        jP_Prospect.setLayout(jP_ProspectLayout);
        jP_ProspectLayout.setHorizontalGroup(
            jP_ProspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ProspectLayout.createSequentialGroup()
                .addGroup(jP_ProspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_ProspectLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jP_ProspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jP_ProspectLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(jP_ProspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BT_Modifier_PR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT_Ajouter_PR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT_Consulter_PR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT_Supprimer_PR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jP_ProspectLayout.createSequentialGroup()
                                .addGroup(jP_ProspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(image_2_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                                .addGroup(jP_ProspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jP_ProspectLayout.createSequentialGroup()
                                        .addComponent(BT_Aide_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BT_Quitter_PR, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(image_PR)))))
                    .addGroup(jP_ProspectLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Lb_Titre_PR)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jP_ProspectLayout.setVerticalGroup(
            jP_ProspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ProspectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Titre_PR)
                .addGap(20, 20, 20)
                .addGroup(jP_ProspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jP_ProspectLayout.createSequentialGroup()
                        .addComponent(BT_Ajouter_PR)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Modifier_PR)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Consulter_PR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_Supprimer_PR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_ProspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image_PR)
                    .addComponent(image_2_PR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jP_ProspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jP_ProspectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BT_Aide_PR)
                        .addComponent(BT_Quitter_PR))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Prospect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Prospect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        jTable1.setModel(new Model_Table_Prospect());
    }//GEN-LAST:event_formComponentShown

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void BT_Quitter_PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Quitter_PRActionPerformed
        fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_Quitter_PRActionPerformed

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
        try
        {
            Modification_Prospect mp = new Modification_Prospect(jTable1,this);
            mp.setVisible(true);
            this.setVisible(false);
        }catch (IndexOutOfBoundsException iobe){
            JOptionPane.showMessageDialog(null, " Veuillez selectionner une ligne à modifier ", " ERREUR ", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BT_Modifier_PRActionPerformed

    private void BT_Supprimer_PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Supprimer_PRActionPerformed
        try
        {
            RequeteProspect bddProspect= new RequeteProspect();
           
            int numeroProspect=Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
            
            int selectedOption = JOptionPane.showConfirmDialog(null,"Voulez vous supprimer ce Prospect?", "INFORMATION",JOptionPane.YES_NO_OPTION);    
            if (selectedOption == JOptionPane.YES_OPTION) 
            {
                bddProspect.deleteBDDProspect(numeroProspect);
                
                jTable1.setModel(new Model_Table_Prospect());
            }
            JOptionPane.showMessageDialog(null, " Suppression du prospect effectuée.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }catch(IndexOutOfBoundsException iobe){
            JOptionPane.showMessageDialog(null, " Veuillez selectionner une ligne à supprimer ", " ERREUR ", JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERREUR SQL", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BT_Supprimer_PRActionPerformed

    private void BT_Consulter_PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Consulter_PRActionPerformed
        try
        {
            Consultation_Prospects cp=new Consultation_Prospects(jTable1,this);
            cp.setVisible(true);
            this.setVisible(false);
        }catch (IndexOutOfBoundsException iobe){
            JOptionPane.showMessageDialog(null, " Veuillez selectionner une ligne à consulter ", " ERREUR ", JOptionPane.ERROR_MESSAGE);
        }
        
                     
    }//GEN-LAST:event_BT_Consulter_PRActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Aide_PR;
    private javax.swing.JButton BT_Ajouter_PR;
    private javax.swing.JButton BT_Consulter_PR;
    private javax.swing.JButton BT_Modifier_PR;
    private javax.swing.JButton BT_Quitter_PR;
    private javax.swing.JButton BT_Supprimer_PR;
    private javax.swing.JLabel Lb_Titre_PR;
    private javax.swing.JLabel image_2_PR;
    private javax.swing.JLabel image_PR;
    private javax.swing.JPanel jP_Prospect;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
