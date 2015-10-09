package Vista;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
public class VistaAgregarCliente extends javax.swing.JFrame {
    public VistaAgregarCliente() {
        initComponents();
        ajustes();
    }
    private void ajustes(){
        // ajustes de la imagen general
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon imageLogo = new ImageIcon(getClass().getResource("/Images/LogoCARSHOP.png"));
        lblImagenCarshop.setIcon(new ImageIcon(imageLogo.getImage().getScaledInstance(lblImagenCarshop.getWidth(), lblImagenCarshop.getHeight(), Image.SCALE_SMOOTH)));
        Image icon = Toolkit.getDefaultToolkit().getImage("/Images/LogoCARSHOP.png");
        this.setIconImage(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTranslucidoCarshop = new org.edisoncor.gui.panel.PanelTranslucido();
        lblImagenCarshop = new javax.swing.JLabel();
        panelTranslucido2 = new org.edisoncor.gui.panel.PanelTranslucido();
        jLabel9 = new javax.swing.JLabel();
        txtClaveElectorCliente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDireccionGerente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtRfcCliente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtTelefonoCliente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtApMaternoCliente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtApPaternoCliente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtNombreCliente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel17 = new javax.swing.JLabel();
        txtIngresoMensualCliente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        bttCancelarAgrCliente = new org.edisoncor.gui.button.ButtonSeven();
        bttAgregarCliente = new org.edisoncor.gui.button.ButtonSeven();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":::AGREGAR CLIENTE:::");

        panelTranslucidoCarshop.setBackground(new java.awt.Color(255, 51, 51));
        panelTranslucidoCarshop.setColorPrimario(new java.awt.Color(153, 153, 153));
        panelTranslucidoCarshop.setColorSecundario(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelTranslucidoCarshopLayout = new javax.swing.GroupLayout(panelTranslucidoCarshop);
        panelTranslucidoCarshop.setLayout(panelTranslucidoCarshopLayout);
        panelTranslucidoCarshopLayout.setHorizontalGroup(
            panelTranslucidoCarshopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoCarshopLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(lblImagenCarshop, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTranslucidoCarshopLayout.setVerticalGroup(
            panelTranslucidoCarshopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoCarshopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagenCarshop, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelTranslucido2.setBackground(new java.awt.Color(255, 51, 51));
        panelTranslucido2.setColorPrimario(new java.awt.Color(153, 153, 153));
        panelTranslucido2.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel9.setText("Clave elector:");

        txtClaveElectorCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClaveElectorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveElectorClienteActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel10.setText("Nombre:");

        jLabel11.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel11.setText("Apellido paterno:");

        jLabel12.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel12.setText("Apellido materno:");

        jLabel13.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel13.setText("Direcciòn:");

        jLabel14.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel14.setText("Telèfono:");

        jLabel16.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel16.setText("RFC:");

        txtDireccionGerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDireccionGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionGerenteActionPerformed(evt);
            }
        });

        txtRfcCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRfcCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfcClienteActionPerformed(evt);
            }
        });

        txtTelefonoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoClienteActionPerformed(evt);
            }
        });

        txtApMaternoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApMaternoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApMaternoClienteActionPerformed(evt);
            }
        });

        txtApPaternoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApPaternoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApPaternoClienteActionPerformed(evt);
            }
        });

        txtNombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel17.setText("Ingreso mensual:");

        txtIngresoMensualCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIngresoMensualCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresoMensualClienteActionPerformed(evt);
            }
        });

        bttCancelarAgrCliente.setBackground(new java.awt.Color(255, 153, 153));
        bttCancelarAgrCliente.setText("Cancelar");
        bttCancelarAgrCliente.setColorBrillo(new java.awt.Color(102, 0, 204));
        bttCancelarAgrCliente.setColorDeSombra(new java.awt.Color(255, 255, 204));
        bttCancelarAgrCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bttCancelarAgrCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarAgrClienteActionPerformed(evt);
            }
        });

        bttAgregarCliente.setBackground(new java.awt.Color(153, 255, 51));
        bttAgregarCliente.setText("Guardar");
        bttAgregarCliente.setColorBrillo(new java.awt.Color(102, 0, 204));
        bttAgregarCliente.setColorDeSombra(new java.awt.Color(255, 255, 204));
        bttAgregarCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bttAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTranslucido2Layout = new javax.swing.GroupLayout(panelTranslucido2);
        panelTranslucido2.setLayout(panelTranslucido2Layout);
        panelTranslucido2Layout.setHorizontalGroup(
            panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucido2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTranslucido2Layout.createSequentialGroup()
                        .addComponent(bttCancelarAgrCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTranslucido2Layout.createSequentialGroup()
                        .addGroup(panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17))
                        .addGap(45, 45, 45)
                        .addGroup(panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClaveElectorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApPaternoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApMaternoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtRfcCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtIngresoMensualCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panelTranslucido2Layout.setVerticalGroup(
            panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucido2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTranslucido2Layout.createSequentialGroup()
                        .addGroup(panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtClaveElectorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(16, 16, 16)
                        .addGroup(panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTranslucido2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel12))
                            .addGroup(panelTranslucido2Layout.createSequentialGroup()
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApPaternoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addComponent(txtApMaternoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))))
                        .addGap(20, 20, 20)
                        .addGroup(panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRfcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(20, 20, 20)
                        .addComponent(txtDireccionGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtIngresoMensualCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttCancelarAgrCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTranslucidoCarshop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTranslucido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTranslucidoCarshop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTranslucido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveElectorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveElectorClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveElectorClienteActionPerformed

    private void txtDireccionGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionGerenteActionPerformed

    private void txtRfcClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcClienteActionPerformed

    private void txtTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoClienteActionPerformed

    private void txtApMaternoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApMaternoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApMaternoClienteActionPerformed

    private void txtApPaternoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApPaternoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApPaternoClienteActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtIngresoMensualClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresoMensualClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresoMensualClienteActionPerformed

    private void bttCancelarAgrClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarAgrClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttCancelarAgrClienteActionPerformed

    private void bttAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttAgregarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAgregarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonSeven bttAgregarCliente;
    private org.edisoncor.gui.button.ButtonSeven bttCancelarAgrCliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImagenCarshop;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucido2;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoCarshop;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtApMaternoCliente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtApPaternoCliente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtClaveElectorCliente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtDireccionGerente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtIngresoMensualCliente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtNombreCliente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtRfcCliente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}