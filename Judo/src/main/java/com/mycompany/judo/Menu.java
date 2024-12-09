/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.judo;

/**
 *
 * @author Alumno Mañana
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        usuario = new javax.swing.JButton();
        clubs = new javax.swing.JButton();
        rankings = new javax.swing.JButton();
        competir = new javax.swing.JButton();
        competiciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Verdana Pro Cond Light", 1, 10)); // NOI18N
        usuario.setText("USUARIO");
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 6, -1, 24));

        clubs.setFont(new java.awt.Font("Verdana Pro Cond Light", 1, 14)); // NOI18N
        clubs.setText("CLUBS");
        clubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubsActionPerformed(evt);
            }
        });
        jPanel1.add(clubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        rankings.setFont(new java.awt.Font("Verdana Pro Cond Light", 1, 14)); // NOI18N
        rankings.setText("RANKIN");
        rankings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingsActionPerformed(evt);
            }
        });
        jPanel1.add(rankings, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        competir.setFont(new java.awt.Font("Verdana Pro Cond Light", 1, 14)); // NOI18N
        competir.setText("COMPETIR");
        competir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                competirActionPerformed(evt);
            }
        });
        jPanel1.add(competir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        competiciones.setFont(new java.awt.Font("Verdana Pro Cond Light", 1, 14)); // NOI18N
        competiciones.setText("COMPETICIONES");
        competiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                competicionesActionPerformed(evt);
            }
        });
        jPanel1.add(competiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana Pro Cond Black", 3, 36)); // NOI18N
        jLabel1.setText("MENU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 48, 114, 51));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void competicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_competicionesActionPerformed
        // TODO add your handling code here:
        
         this.setVisible(false);
            Competiciones ventana = new Competiciones();
            ventana.setVisible(true);
        
    }//GEN-LAST:event_competicionesActionPerformed

    private void rankingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingsActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
            Rankings ventana = new Rankings();
            ventana.setVisible(true);
        
    }//GEN-LAST:event_rankingsActionPerformed

    private void clubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubsActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
            Clubs ventana = new Clubs();
            ventana.setVisible(true);
        
    }//GEN-LAST:event_clubsActionPerformed

    private void competirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_competirActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
            Competir ventana = new Competir();
            ventana.setVisible(true);
        
    }//GEN-LAST:event_competirActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
        
            this.setVisible(false);
            Usuario ventana = new Usuario();
            ventana.setVisible(true);
    }//GEN-LAST:event_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clubs;
    private javax.swing.JButton competiciones;
    private javax.swing.JButton competir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rankings;
    private javax.swing.JButton usuario;
    // End of variables declaration//GEN-END:variables
}