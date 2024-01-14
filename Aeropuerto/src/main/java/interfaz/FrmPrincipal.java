/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.util.Locale;

/**
 *
 * @author usuario
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        brnVuelosBase = new javax.swing.JButton();
        brnVuelosDiarios = new javax.swing.JButton();
        brnCompany = new javax.swing.JButton();
        brnPanel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion del Aeropuerto");
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new java.awt.GridLayout(2, 2));

        brnVuelosBase.setText("Vuelos Base");
        getContentPane().add(brnVuelosBase);

        brnVuelosDiarios.setText("Vuelos Diarios");
        getContentPane().add(brnVuelosDiarios);

        brnCompany.setText("Compañias");
        brnCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCompanyActionPerformed(evt);
            }
        });
        getContentPane().add(brnCompany);

        brnPanel.setText("Informes o paneles");
        brnPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnPanelActionPerformed(evt);
            }
        });
        getContentPane().add(brnPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brnCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCompanyActionPerformed
        //new FrmCompany().setVisible(true);
        FrmCompany.getInstance().setVisible(true);
        
    }//GEN-LAST:event_brnCompanyActionPerformed

    private void brnPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnPanelActionPerformed

        FrmRestTemp temp = new FrmRestTemp();
        temp.setVisible(true);
    }//GEN-LAST:event_brnPanelActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnCompany;
    private javax.swing.JButton brnPanel;
    private javax.swing.JButton brnVuelosBase;
    private javax.swing.JButton brnVuelosDiarios;
    // End of variables declaration//GEN-END:variables
}
