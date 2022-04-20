package visual;
import javax.swing.JOptionPane;
import logica.clientes;
import logica.citas;
import BaseDatos.BD;

public class VtnClientes extends javax.swing.JFrame {
    VtnPrincipal objVtnPrin = null; 
    clientes objClnt = new clientes();
    citas objCita = new citas();
    BD BaseDatos = new BD();
    
    public VtnClientes() {
        initComponents();
    }

    public VtnClientes(VtnPrincipal objVtnPrin, clientes objClnt)
    {
      this.objVtnPrin = objVtnPrin; 
      this.objClnt = objClnt;

      initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloClientes = new javax.swing.JLabel();
        lblNombreClnt = new javax.swing.JLabel();
        txtNombreClntInfo = new javax.swing.JTextField();
        btnBuscarClnt = new javax.swing.JButton();
        lblNombreClnt2 = new javax.swing.JLabel();
        txtNombreClnt = new javax.swing.JTextField();
        lblEdadClnt = new javax.swing.JLabel();
        txtEdadClnt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoClntInfo = new javax.swing.JTextField();
        lblDireccionClnt = new javax.swing.JLabel();
        txtDireccionClnt = new javax.swing.JTextField();
        btnAgregarClnt = new javax.swing.JButton();
        btnModificarClnt = new javax.swing.JButton();
        btnEliminarClnt = new javax.swing.JButton();
        lblTituloCitas = new javax.swing.JLabel();
        lblCodigoClntCita = new javax.swing.JLabel();
        txtCodigoClntCita = new javax.swing.JTextField();
        lblDiaCita = new javax.swing.JLabel();
        comboDiaCita = new javax.swing.JComboBox<>();
        lblMesCita = new javax.swing.JLabel();
        comboMesCita = new javax.swing.JComboBox<>();
        comboHoraCita = new javax.swing.JComboBox<>();
        lblHoraCita = new javax.swing.JLabel();
        lblTipoEstudio = new javax.swing.JLabel();
        comboTipoEstudio = new javax.swing.JComboBox<>();
        btnEstablecerCita = new javax.swing.JButton();
        btnListaCitas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaCitas = new javax.swing.JTextArea();
        btnCitaRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtCodEmpElim = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTituloClientes.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        lblTituloClientes.setText("Manejo de Clientes");

        lblNombreClnt.setText("Nombre:");

        btnBuscarClnt.setText("Buscar");
        btnBuscarClnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClntActionPerformed(evt);
            }
        });

        lblNombreClnt2.setText("Nombre:");

        lblEdadClnt.setText("Edad:");

        jLabel2.setText("Código:");

        lblDireccionClnt.setText("Dirección:");

        txtDireccionClnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionClntActionPerformed(evt);
            }
        });

        btnAgregarClnt.setText("Agregar Cliente");
        btnAgregarClnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClntActionPerformed(evt);
            }
        });

        btnModificarClnt.setText("Modificar Datos");
        btnModificarClnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClntActionPerformed(evt);
            }
        });

        btnEliminarClnt.setText("Eliminar Cliente");
        btnEliminarClnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClntActionPerformed(evt);
            }
        });

        lblTituloCitas.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        lblTituloCitas.setText("Citas");

        lblCodigoClntCita.setText("Código:");

        lblDiaCita.setText("Día:");

        comboDiaCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        lblMesCita.setText("Mes:");

        comboMesCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));

        comboHoraCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8 a.m.", "9 a.m.", "10 a.m.", "11 a.m.", "12 p.m.", "1 p.m.", "2 p.m.", "------", "4 p.m.", "5 p.m.", "6 p.m.", "7 p.m." }));

        lblHoraCita.setText("Hora:");

        lblTipoEstudio.setText("Tipo de Estudio:");

        comboTipoEstudio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sangre", "Nivel de Azucar", "Orina" }));

        btnEstablecerCita.setText("Establecer Cita");
        btnEstablecerCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstablecerCitaActionPerformed(evt);
            }
        });

        btnListaCitas.setText("Lista de Citas");

        txtareaCitas.setColumns(20);
        txtareaCitas.setRows(5);
        jScrollPane1.setViewportView(txtareaCitas);

        btnCitaRegresar.setText("Regresar a Principal");
        btnCitaRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaRegresarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTituloCitas)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblMesCita)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboMesCita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCodigoClntCita)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCodigoClntCita, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblDiaCita)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboDiaCita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblHoraCita)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboHoraCita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblTipoEstudio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboTipoEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(btnEstablecerCita))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombreClnt)
                                .addGap(12, 12, 12)
                                .addComponent(txtNombreClnt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarClnt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnListaCitas))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(lblTituloClientes)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCitaRegresar)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodEmpElim, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarClnt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtCodigoClntInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNombreClnt2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNombreClntInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(lblEdadClnt)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtEdadClnt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(211, 211, 211))
                                        .addComponent(lblDireccionClnt, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txtDireccionClnt, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnModificarClnt)
                                    .addComponent(btnAgregarClnt))
                                .addGap(218, 218, 218)))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloClientes)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigoClntInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreClnt2)
                            .addComponent(txtNombreClntInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnAgregarClnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarClnt)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdadClnt)
                            .addComponent(txtEdadClnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccionClnt)
                            .addComponent(txtDireccionClnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreClnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreClnt)
                            .addComponent(btnBuscarClnt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarClnt)
                            .addComponent(jLabel1)
                            .addComponent(txtCodEmpElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCodigoClntCita)
                                    .addComponent(txtCodigoClntCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTipoEstudio)
                                    .addComponent(comboTipoEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDiaCita)
                                    .addComponent(comboDiaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTituloCitas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMesCita)
                                    .addComponent(comboMesCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHoraCita)
                                    .addComponent(comboHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnEstablecerCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnListaCitas)
                        .addGap(100, 100, 100)))
                .addComponent(btnCitaRegresar)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstablecerCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstablecerCitaActionPerformed
        objCita.setCodigoClntCita(txtCodigoClntCita.getText());
        objCita.setTipoEstudio(comboTipoEstudio.getSelectedItem().toString());
        objCita.setDiaCita(comboDiaCita.getSelectedItem().toString());
        objCita.setMesCita(comboMesCita.getSelectedItem().toString());
        objCita.setHoraCita(comboHoraCita.getSelectedItem().toString());
        
        BaseDatos.abrir();
        BaseDatos.insertarCita(objCita);
        BaseDatos.cerrar();
        JOptionPane.showMessageDialog(this, "Agregado correctamente");
        
        
    }//GEN-LAST:event_btnEstablecerCitaActionPerformed

    private void btnCitaRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaRegresarActionPerformed
        if(objVtnPrin == null)
            objVtnPrin = new VtnPrincipal();
        objVtnPrin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCitaRegresarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void btnAgregarClntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClntActionPerformed
        objClnt.setCodigoClnt(txtCodigoClntInfo.getText());
        objClnt.setNombreClnt(txtNombreClntInfo.getText());
        objClnt.setEdadClnt(Integer.parseInt(txtEdadClnt.getText()));
        objClnt.setDireccionClnt(txtDireccionClnt.getText());
        
        BaseDatos.abrir();
        BaseDatos.insertarClnt(objClnt);
        
        JOptionPane.showMessageDialog(this, "Agregado correctamente");
        
        BaseDatos.cerrar();
    }//GEN-LAST:event_btnAgregarClntActionPerformed

    private void btnBuscarClntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClntActionPerformed
        BaseDatos.abrir();
        clientes objClnt = null;
        objClnt = BaseDatos.buscarCliente(txtNombreClnt.getText());
        if(objClnt != null)
        {
            jTextArea1.setText(objClnt.mostrar_info());
        }else
        {
            JOptionPane.showMessageDialog(this, "El cliente no existe.");
        }
        BaseDatos.cerrar();
    }//GEN-LAST:event_btnBuscarClntActionPerformed

    private void btnEliminarClntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClntActionPerformed
        objClnt.setCodigoClnt(txtCodEmpElim.getText());
        BaseDatos.abrir();
        BaseDatos.eliminarCliente(objClnt);
        
        JOptionPane.showMessageDialog(this, "Eliminado correctamente");
        BaseDatos.cerrar();
    }//GEN-LAST:event_btnEliminarClntActionPerformed

    private void btnModificarClntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClntActionPerformed
        objClnt.setCodigoClnt(txtCodigoClntInfo.getText());
        objClnt.setNombreClnt(txtNombreClntInfo.getText());
        objClnt.setEdadClnt(Integer.parseInt(txtEdadClnt.getText()));
        objClnt.setDireccionClnt(txtDireccionClnt.getText());
        
        BaseDatos.abrir();
        BaseDatos.actualizarCliente(objClnt);
        
        JOptionPane.showMessageDialog(this, "Datos modificados correctamente");
        BaseDatos.cerrar();
    }//GEN-LAST:event_btnModificarClntActionPerformed

    private void txtDireccionClntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionClntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionClntActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(VtnClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VtnClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarClnt;
    private javax.swing.JButton btnBuscarClnt;
    private javax.swing.JButton btnCitaRegresar;
    private javax.swing.JButton btnEliminarClnt;
    private javax.swing.JButton btnEstablecerCita;
    private javax.swing.JButton btnListaCitas;
    private javax.swing.JButton btnModificarClnt;
    private javax.swing.JComboBox<String> comboDiaCita;
    private javax.swing.JComboBox<String> comboHoraCita;
    private javax.swing.JComboBox<String> comboMesCita;
    private javax.swing.JComboBox<String> comboTipoEstudio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCodigoClntCita;
    private javax.swing.JLabel lblDiaCita;
    private javax.swing.JLabel lblDireccionClnt;
    private javax.swing.JLabel lblEdadClnt;
    private javax.swing.JLabel lblHoraCita;
    private javax.swing.JLabel lblMesCita;
    private javax.swing.JLabel lblNombreClnt;
    private javax.swing.JLabel lblNombreClnt2;
    private javax.swing.JLabel lblTipoEstudio;
    private javax.swing.JLabel lblTituloCitas;
    private javax.swing.JLabel lblTituloClientes;
    private javax.swing.JTextField txtCodEmpElim;
    private javax.swing.JTextField txtCodigoClntCita;
    private javax.swing.JTextField txtCodigoClntInfo;
    private javax.swing.JTextField txtDireccionClnt;
    private javax.swing.JTextField txtEdadClnt;
    private javax.swing.JTextField txtNombreClnt;
    private javax.swing.JTextField txtNombreClntInfo;
    private javax.swing.JTextArea txtareaCitas;
    // End of variables declaration//GEN-END:variables

}
