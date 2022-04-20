
package visual;
import javax.swing.JOptionPane;
import logica.recursos;
import BaseDatos.BD;

public class VtnRecursos extends javax.swing.JFrame {
   VtnPrincipal objVtnPrin = null; 
   recursos objRec = null;
   BD BaseDatos = new BD();
   
   
    public VtnRecursos() {
        initComponents();
    }

   public VtnRecursos (VtnPrincipal objVtnPrin, recursos objRec)
   {
       this.objVtnPrin = objVtnPrin;
       this.objRec = objRec;
       initComponents();
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIngresarNombre2 = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblTipoProd = new javax.swing.JLabel();
        comboProd = new javax.swing.JComboBox<>();
        lblExixtencia = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblRecursos = new javax.swing.JLabel();
        btnBuscarProd = new javax.swing.JButton();
        btnAltaProd = new javax.swing.JButton();
        btnModificarProd = new javax.swing.JButton();
        btnReporteProd = new javax.swing.JButton();
        btnRegresarRecursos = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtIngresarNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReporteProd = new javax.swing.JTextArea();
        lblNombre2 = new javax.swing.JLabel();
        lblNombreProdPrec = new javax.swing.JLabel();
        lblPrecioMod = new javax.swing.JLabel();
        txtCodigoProdMod = new javax.swing.JTextField();
        txtPrecioProdMod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txtIngresarNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarNombre2ActionPerformed(evt);
            }
        });

        lbCodigo.setText("Código:");

        lblTipoProd.setText("Tipo de Producto:");

        comboProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analgésicos", "Antibiótico", "Preventivos", " " }));
        comboProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdActionPerformed(evt);
            }
        });

        lblExixtencia.setText("Existencia:");

        lblPrecio.setText("Precio:");

        lblRecursos.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        lblRecursos.setText("Recursos Materiales");

        btnBuscarProd.setText("Buscar un producto");
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });

        btnAltaProd.setText("Dar de alta producto");
        btnAltaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaProdActionPerformed(evt);
            }
        });

        btnModificarProd.setText("Modificar precio de producto");
        btnModificarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProdActionPerformed(evt);
            }
        });

        btnReporteProd.setText("Reporte de Productos");
        btnReporteProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteProdActionPerformed(evt);
            }
        });

        btnRegresarRecursos.setText("Regresar");
        btnRegresarRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarRecursosActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        txtAreaReporteProd.setColumns(20);
        txtAreaReporteProd.setRows(5);
        jScrollPane1.setViewportView(txtAreaReporteProd);

        lblNombre2.setText("Nombre:");

        lblNombreProdPrec.setText("Codigo:");
        lblNombreProdPrec.setToolTipText("");

        lblPrecioMod.setText("Precio:");

        txtCodigoProdMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(12, 12, 12)
                        .addComponent(txtIngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblRecursos)
                        .addGap(254, 254, 254))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblExixtencia)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtExistencia))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblTipoProd)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboProd, 0, 154, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbCodigo)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCodigo))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNombre2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtIngresarNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addComponent(lblPrecio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(235, 235, 235)
                                        .addComponent(lblPrecioMod))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreProdPrec)
                                    .addComponent(btnAltaProd))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnReporteProd)
                                .addGap(61, 61, 61))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtCodigoProdMod, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtPrecioProdMod, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnModificarProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresarRecursos)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtIngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProd))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnReporteProd)
                        .addGap(98, 98, 98)
                        .addComponent(btnRegresarRecursos)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre2)
                            .addComponent(txtIngresarNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoProd)
                            .addComponent(comboProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblExixtencia)
                            .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecio)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAltaProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreProdPrec)
                            .addComponent(lblPrecioMod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoProdMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioProdMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarProd)
                        .addGap(41, 41, 41))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteProdActionPerformed
        txtAreaReporteProd.setText(objRec.mostrar_info());
    }//GEN-LAST:event_btnReporteProdActionPerformed

    private void comboProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProdActionPerformed

    private void btnRegresarRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarRecursosActionPerformed
        if(objVtnPrin == null)
            objVtnPrin = new VtnPrincipal();
        objVtnPrin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarRecursosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
        
    }//GEN-LAST:event_formWindowClosing
     
                
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
    }//GEN-LAST:event_formWindowClosed

    private void btnAltaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaProdActionPerformed
        objRec.setNombreProd(txtIngresarNombre2.getText());
        objRec.setCodigoProd(txtCodigo.getText());
        objRec.setTipoProd(comboProd.getSelectedItem().toString());
        objRec.setExistenciaProd(Integer.parseInt(txtExistencia.getText()));
        objRec.setPrecioProd(Integer.parseInt(txtPrecio.getText())); 
        
        BaseDatos.abrir();
        BaseDatos.insertarProducto(objRec);
        BaseDatos.cerrar();
        
        JOptionPane.showMessageDialog(this, "Los datos se almacenaron correctamente");
    }//GEN-LAST:event_btnAltaProdActionPerformed

    private void txtIngresarNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresarNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresarNombre2ActionPerformed

    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed
        BaseDatos.abrir();
        recursos objRec = null;
        objRec = BaseDatos.buscarProducto(txtIngresarNombre.getText());
        
        if(objRec != null)
        {
            txtAreaReporteProd.setText(objRec.mostrar_info());
        }else
            {
               JOptionPane.showMessageDialog(this, "No existe.");
            }
        
        BaseDatos.cerrar();
    }//GEN-LAST:event_btnBuscarProdActionPerformed
        //no funcionó (u.u)
    private void btnModificarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProdActionPerformed
        objRec.setCodigoProd(txtCodigoProdMod.getText());
        objRec.setPrecioProdMod(Integer.parseInt(txtPrecioProdMod.getText()));
        BaseDatos.abrir();
        BaseDatos.actualizarPrecio(objRec);
        JOptionPane.showMessageDialog(this, "Precio Actualizado");
      //  txtNombreProdMod.setText(" ");
       // txtPrecioProdMod.setText(" ");
        
        BaseDatos.cerrar();
    }//GEN-LAST:event_btnModificarProdActionPerformed

    private void txtCodigoProdModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdModActionPerformed

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
            java.util.logging.Logger.getLogger(VtnRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VtnRecursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaProd;
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnModificarProd;
    private javax.swing.JButton btnRegresarRecursos;
    private javax.swing.JButton btnReporteProd;
    private javax.swing.JComboBox<String> comboProd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lblExixtencia;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombreProdPrec;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecioMod;
    private javax.swing.JLabel lblRecursos;
    private javax.swing.JLabel lblTipoProd;
    private javax.swing.JTextArea txtAreaReporteProd;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoProdMod;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtIngresarNombre;
    private javax.swing.JTextField txtIngresarNombre2;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioProdMod;
    // End of variables declaration//GEN-END:variables
}
