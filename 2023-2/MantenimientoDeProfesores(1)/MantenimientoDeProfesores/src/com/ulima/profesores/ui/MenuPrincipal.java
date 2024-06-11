/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulima.profesores.ui;

import com.ulima.profesores.controlador.GestionProfesor;

/**
 *
 * @author profl3302
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    private GestionProfesor objGestionProfesor;
    
    public MenuPrincipal() {
        this.objGestionProfesor = new GestionProfesor();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuItemMantProfesor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Mantenimiento");

        mnuItemMantProfesor.setText("Profesor");
        mnuItemMantProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemMantProfesorActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItemMantProfesor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca De");

        mnuItemAcercaDe.setText("Este programa...");
        mnuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(mnuItemAcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemAcercaDeActionPerformed
        // TODO add your handling code here:
        AcercaDe frmAcercaDe = new AcercaDe();
        
        frmAcercaDe.setVisible(true);
        
    }//GEN-LAST:event_mnuItemAcercaDeActionPerformed

    private void mnuItemMantProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemMantProfesorActionPerformed
        // TODO add your handling code here:
        
        MantenimientoDeProfesoresVista objMantProfesores = new MantenimientoDeProfesoresVista(this.objGestionProfesor);
        
        objMantProfesores.setVisible(true);
    }//GEN-LAST:event_mnuItemMantProfesorActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuItemAcercaDe;
    private javax.swing.JMenuItem mnuItemMantProfesor;
    // End of variables declaration//GEN-END:variables
}
