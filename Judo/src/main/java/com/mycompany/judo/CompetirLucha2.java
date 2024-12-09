/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.judo;

import com.judo.datos.CompetidorDAO;
import com.judo.datos.ICompetidorDAO;
import com.judo.dominio.Competidor;
import static com.mycompany.judo.Judo.*;
import static com.mycompany.judo.Judo.copa;
import static com.mycompany.judo.Judo.count;
import static com.mycompany.judo.Judo.pesos;
import java.awt.Image;
import java.util.List;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno Mañana
 */
public class CompetirLucha2 extends javax.swing.JFrame {

    /**
     * Creates new form CompetirLucha
     */
    public CompetirLucha2() {
        initComponents();
        this.setLocationRelativeTo(null);
        nombrecopa.setText(copa);
        tecnica1.setText(competidor.getTecnicas()[0].getNombre());
        tecnica2.setText(competidor.getTecnicas()[1].getNombre());

        combate.setText("COMBATE 2");
        competidor1.setText(competidor.getNombre());

        numero2 = (int) (Math.random() *lista.size() );
        while (numeros[0] == numero2) {
            numero2 = (int) (Math.random() * lista.size() );
        }
        numeros[1] = numero2;
        competidor2.setText(lista.get(numero2).getNombre());
        lista.remove(lista.get(numero2));

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
        foto = new javax.swing.JLabel();
        nombrecopa = new javax.swing.JLabel();
        competidor1 = new javax.swing.JLabel();
        competidor2 = new javax.swing.JLabel();
        tecnica1 = new javax.swing.JButton();
        tecnica2 = new javax.swing.JButton();
        combate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 380, 200));

        nombrecopa.setFont(new java.awt.Font("Verdana Pro Cond Black", 3, 36)); // NOI18N
        nombrecopa.setText("jLabel1");
        jPanel1.add(nombrecopa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        competidor1.setFont(new java.awt.Font("Verdana Pro Cond Light", 1, 18)); // NOI18N
        competidor1.setText("jLabel1");
        jPanel1.add(competidor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        competidor2.setFont(new java.awt.Font("Verdana Pro Cond Light", 1, 18)); // NOI18N
        competidor2.setText("jLabel2");
        jPanel1.add(competidor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        tecnica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tecnica1ActionPerformed(evt);
            }
        });
        jPanel1.add(tecnica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, 17));

        tecnica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tecnica2ActionPerformed(evt);
            }
        });
        jPanel1.add(tecnica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, 20));

        combate.setText("jLabel3");
        jPanel1.add(combate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tecnica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tecnica1ActionPerformed
        // TODO add your handling code here:

        int num = (int) (Math.random());
        int vida1 = 0, vida2 = 0, resultado = 0, resultado2 = 0;
        int danio1 = competidor.getTecnicas()[0].getProbabilidad();
        int danio2 = competidores.get(numero1).getTecnicas()[num].getProbabilidad();
        int def1 = competidor.getTecnicas()[0].getDefensa();
        int def2 = competidores.get(numero1).getTecnicas()[num].getDefensa();

        vida1 = Math.abs(def1 - danio2);
        vida2 = Math.abs(def2 - danio1);

        if (vida1 >= 0 && vida1 <= 30) {
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\ippon.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
            foto.setIcon(enemy);
            JOptionPane.showMessageDialog(null, "IPPON TUYO");
            foto.setIcon(null);
            resultado = 2;
            pts = 1;
        } else if (vida1 >= 31 && vida1 <= 60) {
            puntos3++;
            if (puntos3 == 2) {
                ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\ippon.jpg");
                Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
                foto.setIcon(enemy);
                JOptionPane.showMessageDialog(null, "WAZA-RY WAZA-TE IPPON TUYO");
                foto.setIcon(null);
                resultado = 2;
                pts = 1;
            } else {
                ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\wazary.jpg");
                Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
                foto.setIcon(enemy);
                JOptionPane.showMessageDialog(null, "WAZA-RY TUYO");
                foto.setIcon(null);
            }
        } else if (vida1 >= 61 && vida1 <= 100) {
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\nada.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
            foto.setIcon(enemy);
            JOptionPane.showMessageDialog(null, "NO HA SIDO NADA");
            foto.setIcon(null);
            competidor.relleno_tecnicas(tecnicas);
        } else if (vida2 >= 0 && vida2 <= 30) {
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\ippon2.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
            foto.setIcon(enemy);
            JOptionPane.showMessageDialog(null, "IPPON DEL CONTRINCANTE");
            foto.setIcon(null);
            resultado2 = 2;
            pts2 = 1;
        } else if (vida2 >= 31 && vida2 <= 60) {
            puntos4++;
            if (puntos4 == 2) {
                ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\ippon2.jpg");
                Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
                foto.setIcon(enemy);
                JOptionPane.showMessageDialog(null, "WAZA-RY WAZA_TE IPPONDEL CONTRINCANTE");
                foto.setIcon(null);
                resultado2 = 2;
                pts2 = 1;
            } else {
                ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\wazary2.jpg");
                Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
                foto.setIcon(enemy);
                JOptionPane.showMessageDialog(null, "WAZA-RY DEL CONTRINCANTE");
                foto.setIcon(null);
            }
        } else if (vida2 >= 61 && vida2 <= 100 && vida2 < vida1) {
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\nada2.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
            foto.setIcon(enemy);
            JOptionPane.showMessageDialog(null, "NO HA SIDO NADA");
            foto.setIcon(null);
            competidor.relleno_tecnicas(tecnicas);
        }

        if (resultado == 2) {
            count++;
            CompetirLucha3 ventana = new CompetirLucha3();
            this.setVisible(false);
            ventana.setVisible(true);
        } else if (resultado2 == 2) {
            count = 3;
            JOptionPane.showMessageDialog(null, "HAS QUEDADO 3º");

            puntos1 = 0;
            puntos2 = 0;
            puntos3 = 0;
            puntos4 = 0;
            puntos5 = 0;
            puntos6 = 0;
            lista = ilistaDAO.lista(competidor.getPeso());
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = 0;
            }

            Competidor primero = new Competidor();
            Competidor segundo = new Competidor();
            Competidor segundo2 = new Competidor();

            primero.setId_competidor(competidor.getId_competidor());
            primero.setNombre(competidor.getNombre());
            primero.setApellido(competidor.getApellido());
            primero.setUsuario(competidor.getUsuario());
            primero.setClave(competidor.getClave());
            primero.setId_club(competidor.getId_club());
            primero.setPeso(competidor.getPeso());
            primero.setPuntos(60 + competidor.getPuntos());

            competidor.setPuntos(60 +competidor.getPuntos());

            segundo.setId_competidor(lista.get(numero2).getId_competidor());
            segundo.setNombre(lista.get(numero2).getNombre());
            segundo.setApellido(lista.get(numero2).getApellido());
            segundo.setUsuario(lista.get(numero2).getUsuario());
            segundo.setClave(lista.get(numero2).getClave());
            segundo.setId_club(lista.get(numero2).getId_club());
            segundo.setPeso(lista.get(numero2).getPeso());
            segundo.setPuntos(100 + lista.get(numero2).getPuntos());

            segundo2.setId_competidor(lista.get(numero3).getId_competidor());
            segundo2.setNombre(lista.get(numero3).getNombre());
            segundo2.setApellido(lista.get(numero3).getApellido());
            segundo2.setUsuario(lista.get(numero3).getUsuario());
            segundo2.setClave(lista.get(numero3).getClave());
            segundo2.setId_club(lista.get(numero3).getId_club());
            segundo2.setPeso(lista.get(numero3).getPeso());
            segundo2.setPuntos(80 + lista.get(numero3).getPuntos());

            icompetidorDAO.actualizar(primero);
            icompetidorDAO.actualizar(segundo);
            icompetidorDAO.actualizar(segundo2);

            Menu ventana = new Menu();
            this.setVisible(false);
            ventana.setVisible(true);
        }


    }//GEN-LAST:event_tecnica1ActionPerformed

    private void tecnica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tecnica2ActionPerformed
        // TODO add your handling code here:

        int num = (int) (Math.random());
        int vida1 = 0, vida2 = 0, resultado = 0, resultado2 = 0;
        int danio1 = competidor.getTecnicas()[0].getProbabilidad();
        int danio2 = competidores.get(numero1).getTecnicas()[num].getProbabilidad();
        int def1 = competidor.getTecnicas()[0].getDefensa();
        int def2 = competidores.get(numero1).getTecnicas()[num].getDefensa();

        vida1 = Math.abs(def1 - danio2);
        vida2 = Math.abs(def2 - danio1);

        if (vida1 >= 0 && vida1 <= 30) {
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\ippon.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
            foto.setIcon(enemy);
            JOptionPane.showMessageDialog(null, "IPPON TUYO");
            foto.setIcon(null);
            resultado = 2;
            pts = 1;
        } else if (vida1 >= 31 && vida1 <= 60) {
            puntos3++;
            if (puntos3 == 2) {
                ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\ippon.jpg");
                Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
                foto.setIcon(enemy);
                JOptionPane.showMessageDialog(null, "WAZA-RY WAZA-TE IPPON TUYO");
                foto.setIcon(null);
                resultado = 2;
                pts = 1;
            } else {
                ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\wazary.jpg");
                Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
                foto.setIcon(enemy);
                JOptionPane.showMessageDialog(null, "WAZA-RY TUYO");
                foto.setIcon(null);
            }
        } else if (vida1 >= 61 && vida1 <= 100) {
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\nada.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
            foto.setIcon(enemy);
            JOptionPane.showMessageDialog(null, "NO HA SIDO NADA");
            foto.setIcon(null);
            competidor.relleno_tecnicas(tecnicas);
        } else if (vida2 >= 0 && vida2 <= 30) {
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\ippon2.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
            foto.setIcon(enemy);
            JOptionPane.showMessageDialog(null, "IPPON DEL CONTRINCANTE");
            foto.setIcon(null);
            resultado2 = 2;
            pts2 = 1;
        } else if (vida2 >= 31 && vida2 <= 60) {
            puntos4++;
            if (puntos4 == 2) {
                ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\ippon2.jpg");
                Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
                foto.setIcon(enemy);
                JOptionPane.showMessageDialog(null, "WAZA-RY WAZA_TE IPPONDEL CONTRINCANTE");
                foto.setIcon(null);
                resultado2 = 2;
                pts2 = 1;
            } else {
                ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\wazary2.jpg");
                Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
                foto.setIcon(enemy);
                JOptionPane.showMessageDialog(null, "WAZA-RY DEL CONTRINCANTE");
                foto.setIcon(null);
            }
        } else if (vida2 >= 61 && vida2 <= 100 && vida2 < vida1) {
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\img\\nada2.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
            foto.setIcon(enemy);
            JOptionPane.showMessageDialog(null, "NO HA SIDO NADA");
            foto.setIcon(null);
            competidor.relleno_tecnicas(tecnicas);
        }

        if (resultado == 2) {
            count++;
            CompetirLucha3 ventana = new CompetirLucha3();
            this.setVisible(false);
            ventana.setVisible(true);
        } else if (resultado2 == 2) {
            count = 3;
            JOptionPane.showMessageDialog(null, "HAS QUEDADO 3º");
            Menu ventana = new Menu();
            this.setVisible(false);
            ventana.setVisible(true);
            puntos1 = 0;
            puntos2 = 0;
            puntos3 = 0;
            puntos4 = 0;
            puntos5 = 0;
            puntos6 = 0;
            lista = ilistaDAO.lista(competidor.getPeso());
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = 0;
            }

            //            ########################### AÑADIDO DE PUNTOS ################################
            Competidor primero = new Competidor();
            Competidor segundo = new Competidor();
            Competidor segundo2 = new Competidor();

            primero.setId_competidor(competidor.getId_competidor());
            primero.setNombre(competidor.getNombre());
            primero.setApellido(competidor.getApellido());
            primero.setUsuario(competidor.getUsuario());
            primero.setClave(competidor.getClave());
            primero.setId_club(competidor.getId_club());
            primero.setPeso(competidor.getPeso());
            primero.setPuntos(60 + competidor.getPuntos());

            competidor.setPuntos(60 + competidor.getPuntos());

            segundo.setId_competidor(lista.get(numero2).getId_competidor());
            segundo.setNombre(lista.get(numero2).getNombre());
            segundo.setApellido(lista.get(numero2).getApellido());
            segundo.setUsuario(lista.get(numero2).getUsuario());
            segundo.setClave(lista.get(numero2).getClave());
            segundo.setId_club(lista.get(numero2).getId_club());
            segundo.setPeso(lista.get(numero2).getPeso());
            segundo.setPuntos(100 + lista.get(numero2).getPuntos());

            segundo2.setId_competidor(lista.get(numero3).getId_competidor());
            segundo2.setNombre(lista.get(numero3).getNombre());
            segundo2.setApellido(lista.get(numero3).getApellido());
            segundo2.setUsuario(lista.get(numero3).getUsuario());
            segundo2.setClave(lista.get(numero3).getClave());
            segundo2.setId_club(lista.get(numero3).getId_club());
            segundo2.setPeso(lista.get(numero3).getPeso());
            segundo2.setPuntos(80 + lista.get(numero3).getPuntos());

            icompetidorDAO.actualizar(primero);
            icompetidorDAO.actualizar(segundo);
            icompetidorDAO.actualizar(segundo2);

            this.setVisible(false);
            ventana.setVisible(true);
        }


    }//GEN-LAST:event_tecnica2ActionPerformed

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
            java.util.logging.Logger.getLogger(CompetirLucha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompetirLucha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompetirLucha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompetirLucha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompetirLucha2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel combate;
    private javax.swing.JLabel competidor1;
    private javax.swing.JLabel competidor2;
    private javax.swing.JLabel foto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombrecopa;
    private javax.swing.JButton tecnica1;
    private javax.swing.JButton tecnica2;
    // End of variables declaration//GEN-END:variables
}