/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 *
 * @author usuario
 */
public class FrmVuelosBase extends javax.swing.JFrame {

    // Se utiliza el patron Singleton, con el fin de que se actualice siempre la misma ventana
    //Por tanto se decalara lo siguiente
    // De esta manera si ya esta instanciada, devuelve la misma y en caso de que no este instalaciada (caso null), crearia una nueva
    
    private static FrmVuelosBase INSTANCE = null;
    
    public static FrmVuelosBase getInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new FrmVuelosBase();
        }
        return INSTANCE;
    }
    
    /**
     * Creates new form FrmVuelosBase
     */
    public FrmVuelosBase() {
        initComponents();
        fillTableVuelosBase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditar = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVuelosBase = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEditar.setText("Editar o Consultar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAnadir.setText("Añadir");
        btnAnadir.setToolTipText("");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblVuelosBase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVuelosBase);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(53, 53, 53)
                        .addComponent(btnAnadir)
                        .addGap(54, 54, 54)
                        .addComponent(btnEliminar)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnAnadir)
                    .addComponent(btnEliminar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        //Nos da dal compañia de la fila selecionada
        Company comp_select = LogicaNegocio.getAllCompany().get(tblVuelosBase.getSelectedRow());

        DlgDatosCompany dlgDatosCompany = new DlgDatosCompany(this, true, comp_select);
        dlgDatosCompany.setCompany(comp_select);
        dlgDatosCompany.setVisible(true);

        if (dlgDatosCompany.isChange()){
            LogicaNegocio.updateCompany(comp_select, dlgDatosCompany.getCompany());
            fillTableCompany();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        DlgDatosCompany dlgDatosCompany = new DlgDatosCompany(this, true, null);
        dlgDatosCompany.setVisible(true);
        // Solamente si se ha cambiado se actualiza y se añade la compañia
        if (dlgDatosCompany.isChange()){
            // Se añade la nueva compañia
            LogicaNegocio.addCompany(dlgDatosCompany.getCompany());
            // Se actualiza la tabla de la interface
            this.fillTableCompany();
        }

    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Nos da dal compañia de la fila selecionada
        Company comp_select = LogicaNegocio.getAllCompany().get(tblVuelosBase.getSelectedRow());
        int respuesta_borrado =JOptionPane.showConfirmDialog(this, "¿Desea borrar la fila seleciona? "+comp_select.getCodigo(),
            "Borrado de compañia ", JOptionPane.YES_NO_OPTION);
        if(respuesta_borrado ==JOptionPane.OK_OPTION){
            LogicaNegocio.deleteCompany(comp_select.getPrefijo());
        }
        //con el fin de que refrescar la tabla
        fillTableCompany();
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVuelosBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVuelosBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVuelosBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVuelosBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVuelosBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVuelosBase;
    // End of variables declaration//GEN-END:variables
 
    private void fillTableVuelosBase() {
        tblVuelosBase.setModel(new CompanyModelTable(LogicaNegocio.getAllCompany()));
        
    }

}
