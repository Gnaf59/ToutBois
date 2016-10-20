/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gauthier_matthieu.application;

/**
 *
 * @author mdeschamps
 */
public class VersionToutbois extends javax.swing.JDialog {

    /**
     * Creates new form VersionToutbois
     */
    public VersionToutbois(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jp_fenetreInfo = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Lb_titre = new javax.swing.JLabel();
        Lb_version = new javax.swing.JLabel();
        Lb_Auteur = new javax.swing.JLabel();
        Lb_Compil = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        Bt_fermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Version Tout bois");

        jp_fenetreInfo.setBackground(new java.awt.Color(255, 255, 255));

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gauthier_matthieu/image/logo-02.png"))); // NOI18N

        Lb_titre.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Lb_titre.setForeground(new java.awt.Color(102, 102, 102));
        Lb_titre.setText("Tout Bois");

        Lb_version.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        Lb_version.setText("Version 0.0.2 (64 Bit)  Build (20161019)");

        Lb_Auteur.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        Lb_Auteur.setText("Auteur SSII MGc");

        Lb_Compil.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        Lb_Compil.setText("Complilée le 2016-10-19");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Java: 1.8.0_77; Java HotSpot(TM) 64-Bit Server VM 25.77-b03\nRuntime: Java(TM) SE Runtime Environment 1.8.0_77-b03\n");
        jTextArea1.setEnabled(false);

        Bt_fermer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bt_fermer.setText("Fermer");
        Bt_fermer.setPreferredSize(new java.awt.Dimension(130, 25));
        Bt_fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_fermerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_fenetreInfoLayout = new javax.swing.GroupLayout(jp_fenetreInfo);
        jp_fenetreInfo.setLayout(jp_fenetreInfoLayout);
        jp_fenetreInfoLayout.setHorizontalGroup(
            jp_fenetreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fenetreInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bt_fermer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addGroup(jp_fenetreInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_fenetreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextArea1)
                    .addGroup(jp_fenetreInfoLayout.createSequentialGroup()
                        .addComponent(Logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_fenetreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_titre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_version)
                            .addComponent(Lb_Auteur)
                            .addComponent(Lb_Compil))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_fenetreInfoLayout.setVerticalGroup(
            jp_fenetreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_fenetreInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_fenetreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_fenetreInfoLayout.createSequentialGroup()
                        .addComponent(Lb_titre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lb_version)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lb_Auteur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lb_Compil))
                    .addComponent(Logo))
                .addGap(18, 18, 18)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Bt_fermer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_fenetreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_fenetreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_fermerActionPerformed
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_Bt_fermerActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VersionToutbois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VersionToutbois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VersionToutbois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VersionToutbois.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VersionToutbois dialog = new VersionToutbois(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_fermer;
    private javax.swing.JLabel Lb_Auteur;
    private javax.swing.JLabel Lb_Compil;
    private javax.swing.JLabel Lb_titre;
    private javax.swing.JLabel Lb_version;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jp_fenetreInfo;
    // End of variables declaration//GEN-END:variables
}
