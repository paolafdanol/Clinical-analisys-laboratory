
package visual;
import logica.personal;
import javax.swing.JOptionPane;
import BaseDatos.BD;

public class VtnPersonal extends javax.swing.JFrame {
    VtnPrincipal objVtnPrin = null; 
    personal objPers = new personal();
    BD BaseDatos = new BD();
    
    
    
    public VtnPersonal() {
        initComponents();
    }

    public VtnPersonal (VtnPrincipal objVtnPrin, personal objPers)
    {
        this.objVtnPrin = objVtnPrin;
        this.objPers = objPers;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModificarEmp = new javax.swing.JButton();
        txtCodigoEmpInfo = new javax.swing.JTextField();
        btnEliminarEmp = new javax.swing.JButton();
        txtNombreEmp = new javax.swing.JTextField();
        btnControlRegresar = new javax.swing.JButton();
        txtEdadEmp = new javax.swing.JTextField();
        lblCodigoEmp = new javax.swing.JLabel();
        comboTipoEmp = new javax.swing.JComboBox<>();
        txtCodigoEmp = new javax.swing.JTextField();
        txtRFCEmp = new javax.swing.JTextField();
        lblCodigoEmpInfo = new javax.swing.JLabel();
        txtSalarioEmp = new javax.swing.JTextField();
        lblNombreEmp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaReporteEmp = new javax.swing.JTextArea();
        lblPersonal = new javax.swing.JLabel();
        lblEdadEmp = new javax.swing.JLabel();
        btnAgregarEmp = new javax.swing.JButton();
        lblTipoEmp = new javax.swing.JLabel();
        btnReporteEmp = new javax.swing.JButton();
        lblRFCEmp = new javax.swing.JLabel();
        btnBuscarEmp = new javax.swing.JButton();
        lblSalarioEmp = new javax.swing.JLabel();
        lblCodigoEmpElim = new javax.swing.JLabel();
        txtCodigoEmpElim = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnModificarEmp.setText("Modificar datos");
        btnModificarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEmpActionPerformed(evt);
            }
        });

        btnEliminarEmp.setText("Eliminar empleados");
        btnEliminarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpActionPerformed(evt);
            }
        });

        txtNombreEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpActionPerformed(evt);
            }
        });

        btnControlRegresar.setText("Regresar");
        btnControlRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlRegresarActionPerformed(evt);
            }
        });

        lblCodigoEmp.setText("Código:");

        comboTipoEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Laboratorista", " " }));

        lblCodigoEmpInfo.setText("Código:");

        lblNombreEmp.setText("Nombre:");

        txtareaReporteEmp.setColumns(20);
        txtareaReporteEmp.setRows(5);
        jScrollPane1.setViewportView(txtareaReporteEmp);

        lblPersonal.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        lblPersonal.setText("Control de Personal");

        lblEdadEmp.setText("Edad:");

        btnAgregarEmp.setText("Agregar Empleado");
        btnAgregarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpActionPerformed(evt);
            }
        });

        lblTipoEmp.setText("Tipo de Empleado:");

        btnReporteEmp.setText("Reporte de Empleados");
        btnReporteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteEmpActionPerformed(evt);
            }
        });

        lblRFCEmp.setText("RFC:");

        btnBuscarEmp.setText("Buscar un Empleado");
        btnBuscarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpActionPerformed(evt);
            }
        });

        lblSalarioEmp.setText("Salario:");

        lblCodigoEmpElim.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalarioEmp)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSalarioEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblEdadEmp)
                                                .addGap(34, 34, 34))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblCodigoEmpInfo)
                                                    .addComponent(lblNombreEmp))
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNombreEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(txtEdadEmp)
                                            .addComponent(txtCodigoEmpInfo)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTipoEmp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboTipoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRFCEmp)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtRFCEmp))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarEmp)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarEmp))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblCodigoEmpElim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoEmpElim, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarEmp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnControlRegresar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReporteEmp)
                        .addGap(114, 114, 114))))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPersonal)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigoEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarEmp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblPersonal)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarEmp)
                    .addComponent(txtCodigoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoEmp))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoEmpInfo)
                            .addComponent(txtCodigoEmpInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreEmp)
                            .addComponent(txtNombreEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdadEmp)
                            .addComponent(txtEdadEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoEmp)
                            .addComponent(comboTipoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRFCEmp)
                            .addComponent(txtRFCEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalarioEmp)
                            .addComponent(txtSalarioEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporteEmp)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregarEmp)
                        .addComponent(btnModificarEmp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoEmpElim)
                    .addComponent(txtCodigoEmpElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarEmp))
                .addGap(2, 2, 2)
                .addComponent(btnControlRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpActionPerformed
        objPers.setCodigoEmp(txtCodigoEmpInfo.getText());
        objPers.setNombreEmp(txtNombreEmp.getText());
        objPers.setEdadEmp(Integer.parseInt(txtEdadEmp.getText()));
        objPers.setTipoEmp(comboTipoEmp.getSelectedItem().toString());
        objPers.setRFCEmp(txtRFCEmp.getText());
        objPers.setSalarioEmp(Integer.parseInt(txtSalarioEmp.getText()));
        
        BaseDatos.abrir();
        BaseDatos.insertarPersonal(objPers);     
        BaseDatos.cerrar();
        
        JOptionPane.showMessageDialog(this, "Agregado correctamente.");
        
    }//GEN-LAST:event_btnAgregarEmpActionPerformed

    private void txtNombreEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpActionPerformed

    private void btnReporteEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteEmpActionPerformed
        txtareaReporteEmp.setText(objPers.mostrar_info());
    }//GEN-LAST:event_btnReporteEmpActionPerformed

    private void btnControlRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlRegresarActionPerformed
        if(objVtnPrin == null)
            objVtnPrin = new VtnPrincipal();
        objVtnPrin.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnControlRegresarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void btnBuscarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpActionPerformed
        BaseDatos.abrir();
        personal objPers = null;
        objPers = BaseDatos.buscarEmpleado(txtCodigoEmp.getText());
        if(objPers != null)
        {
            txtareaReporteEmp.setText(objPers.mostrar_info());
        }else
        {
            JOptionPane.showMessageDialog(this, "No existe.");
        }
        BaseDatos.cerrar();
    }//GEN-LAST:event_btnBuscarEmpActionPerformed

    private void btnEliminarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpActionPerformed
        objPers.setCodigoEmp(txtCodigoEmpElim.getText());
        BaseDatos.abrir();
        BaseDatos.eliminarEmp(objPers);
        JOptionPane.showMessageDialog(this, "Eliminado.");
        BaseDatos.cerrar();
    }//GEN-LAST:event_btnEliminarEmpActionPerformed

    private void btnModificarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEmpActionPerformed
        objPers.setCodigoEmp(txtCodigoEmpInfo.getText());
        objPers.setNombreEmp(txtNombreEmp.getText());
        objPers.setEdadEmp(Integer.parseInt(txtEdadEmp.getText()));
        objPers.setTipoEmp(comboTipoEmp.getSelectedItem().toString());
        objPers.setRFCEmp(txtRFCEmp.getText());
        objPers.setSalarioEmp(Integer.parseInt(txtSalarioEmp.getText()));
        
        BaseDatos.abrir();
        BaseDatos.actualizarEmp(objPers);
        JOptionPane.showMessageDialog(this, "Empleado actualizado.");
    }//GEN-LAST:event_btnModificarEmpActionPerformed

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
            java.util.logging.Logger.getLogger(VtnPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VtnPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmp;
    private javax.swing.JButton btnBuscarEmp;
    private javax.swing.JButton btnControlRegresar;
    private javax.swing.JButton btnEliminarEmp;
    private javax.swing.JButton btnModificarEmp;
    private javax.swing.JButton btnReporteEmp;
    private javax.swing.JComboBox<String> comboTipoEmp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoEmp;
    private javax.swing.JLabel lblCodigoEmpElim;
    private javax.swing.JLabel lblCodigoEmpInfo;
    private javax.swing.JLabel lblEdadEmp;
    private javax.swing.JLabel lblNombreEmp;
    private javax.swing.JLabel lblPersonal;
    private javax.swing.JLabel lblRFCEmp;
    private javax.swing.JLabel lblSalarioEmp;
    private javax.swing.JLabel lblTipoEmp;
    private javax.swing.JTextField txtCodigoEmp;
    private javax.swing.JTextField txtCodigoEmpElim;
    private javax.swing.JTextField txtCodigoEmpInfo;
    private javax.swing.JTextField txtEdadEmp;
    private javax.swing.JTextField txtNombreEmp;
    private javax.swing.JTextField txtRFCEmp;
    private javax.swing.JTextField txtSalarioEmp;
    private javax.swing.JTextArea txtareaReporteEmp;
    // End of variables declaration//GEN-END:variables
}
