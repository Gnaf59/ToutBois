/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.application;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author glantoine
 */
public class fenetre_applications extends javax.swing.JFrame {

    /**
     * Creates new form fenetre_applications
     */
    public fenetre_applications() {
        initComponents();
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
    private void initialise(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo-02.png")));
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fichier = new javax.swing.JMenu();
        quitter = new javax.swing.JMenuItem();
        gestion = new javax.swing.JMenu();
        menuClients = new javax.swing.JMenuItem();
        menuProspects = new javax.swing.JMenuItem();
        menuRepresentants = new javax.swing.JMenuItem();
        commande = new javax.swing.JMenu();
        menuConsult = new javax.swing.JMenuItem();
        menuModif = new javax.swing.JMenuItem();
        menuSupp = new javax.swing.JMenuItem();
        facturation = new javax.swing.JMenu();
        menuCréation = new javax.swing.JMenuItem();
        menuConsult1 = new javax.swing.JMenuItem();
        menuSupp1 = new javax.swing.JMenuItem();
        aPropos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ToutBois LGI 1.0");
        setIconImages(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/logo-01.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N

        fichier.setBackground(new java.awt.Color(153, 153, 153));
        fichier.setText("Fichier");

        quitter.setText("Quitter");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });
        fichier.add(quitter);

        jMenuBar1.add(fichier);

        gestion.setBackground(new java.awt.Color(153, 153, 153));
        gestion.setText("Gestion");

        menuClients.setText("Clients");
        menuClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClientsMouseClicked(evt);
            }
        });
        menuClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientsActionPerformed(evt);
            }
        });
        gestion.add(menuClients);

        menuProspects.setText("Prospects");
        menuProspects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProspectsActionPerformed(evt);
            }
        });
        gestion.add(menuProspects);

        menuRepresentants.setText("Représentants");
        menuRepresentants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRepresentantsActionPerformed(evt);
            }
        });
        gestion.add(menuRepresentants);

        jMenuBar1.add(gestion);

        commande.setBackground(new java.awt.Color(153, 153, 153));
        commande.setText("Commande");

        menuConsult.setText("Consultation");
        commande.add(menuConsult);

        menuModif.setText("Modification");
        commande.add(menuModif);

        menuSupp.setText("Suppression");
        commande.add(menuSupp);

        jMenuBar1.add(commande);

        facturation.setBackground(new java.awt.Color(153, 153, 153));
        facturation.setText("Facturation");

        menuCréation.setText("Création");
        facturation.add(menuCréation);

        menuConsult1.setText("Consultation");
        menuConsult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsult1ActionPerformed(evt);
            }
        });
        facturation.add(menuConsult1);

        menuSupp1.setText("Suppression");
        facturation.add(menuSupp1);

        jMenuBar1.add(facturation);

        aPropos.setBackground(new java.awt.Color(153, 153, 153));
        aPropos.setText("A propos");
        jMenuBar1.add(aPropos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClientsMouseClicked

    }//GEN-LAST:event_menuClientsMouseClicked

    private void menuClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientsActionPerformed
        Gestion_Clients gc = new Gestion_Clients(this);
        gc.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_menuClientsActionPerformed

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitterActionPerformed

    private void menuProspectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProspectsActionPerformed
        Gestion_Prospect gp =new Gestion_Prospect(this);
        gp.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_menuProspectsActionPerformed

    private void menuConsult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsult1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConsult1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        /*Code de gestion de fermeture de la fenêtre */
    }//GEN-LAST:event_formWindowClosing

    private void menuRepresentantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRepresentantsActionPerformed
        Gestion_Representant gr=new Gestion_Representant(this);
        gr.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_menuRepresentantsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                javax.swing.UIManager.setLookAndFeel(
                        javax.swing.UIManager.getSystemLookAndFeelClassName());

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetre_applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetre_applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetre_applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetre_applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new fenetre_applications().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aPropos;
    private javax.swing.JMenu commande;
    private javax.swing.JMenu facturation;
    private javax.swing.JMenu fichier;
    private javax.swing.JMenu gestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuClients;
    private javax.swing.JMenuItem menuConsult;
    private javax.swing.JMenuItem menuConsult1;
    private javax.swing.JMenuItem menuCréation;
    private javax.swing.JMenuItem menuModif;
    private javax.swing.JMenuItem menuProspects;
    private javax.swing.JMenuItem menuRepresentants;
    private javax.swing.JMenuItem menuSupp;
    private javax.swing.JMenuItem menuSupp1;
    private javax.swing.JMenuItem quitter;
    // End of variables declaration//GEN-END:variables
}
