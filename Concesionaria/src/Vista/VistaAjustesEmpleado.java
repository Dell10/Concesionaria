package Vista;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
public class VistaAjustesEmpleado extends javax.swing.JFrame {
    public VistaAjustesEmpleado() {
        initComponents();
        ajustes();
    }
    private void ajustes(){
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon imageLogo = new ImageIcon(getClass().getResource("/Images/LogoCARSHOP.png"));
        lblImagen.setIcon(new ImageIcon(imageLogo.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH)));
        Image icon = Toolkit.getDefaultToolkit().getImage("/Images/LogoCARSHOP.png");
        this.setIconImage(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTranslucido2 = new org.edisoncor.gui.panel.PanelTranslucido();
        lblImagen = new javax.swing.JLabel();
        panelTranslucido3 = new org.edisoncor.gui.panel.PanelTranslucido();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bttEmpleadoAjuste = new org.edisoncor.gui.button.ButtonSeven();
        txtUsuarioAjustes = new org.edisoncor.gui.textField.TextFieldRoundImage();
        bttCancelarEmpleadoAjuste = new org.edisoncor.gui.button.ButtonSeven();
        txtContraseniaAjuste = new org.edisoncor.gui.passwordField.PasswordFieldRoundImage();
        txtConfContraAjuste = new org.edisoncor.gui.passwordField.PasswordFieldRoundImage();
        lblImagenGerente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":::AJUSTES EMPLEADO:::");

        panelTranslucido2.setBackground(new java.awt.Color(255, 51, 51));
        panelTranslucido2.setColorPrimario(new java.awt.Color(153, 153, 153));
        panelTranslucido2.setColorSecundario(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelTranslucido2Layout = new javax.swing.GroupLayout(panelTranslucido2);
        panelTranslucido2.setLayout(panelTranslucido2Layout);
        panelTranslucido2Layout.setHorizontalGroup(
            panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucido2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTranslucido2Layout.setVerticalGroup(
            panelTranslucido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucido2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTranslucido3.setBackground(new java.awt.Color(255, 51, 51));
        panelTranslucido3.setColorPrimario(new java.awt.Color(153, 153, 153));
        panelTranslucido3.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel9.setText("Usuario:");

        jLabel10.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel10.setText("Contraseña::");

        jLabel11.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel11.setText("Confirmar:");

        bttEmpleadoAjuste.setBackground(new java.awt.Color(153, 255, 51));
        bttEmpleadoAjuste.setText("Actualizar");
        bttEmpleadoAjuste.setColorBrillo(new java.awt.Color(102, 0, 204));
        bttEmpleadoAjuste.setColorDeSombra(new java.awt.Color(255, 255, 204));
        bttEmpleadoAjuste.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bttEmpleadoAjuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEmpleadoAjusteActionPerformed(evt);
            }
        });

        txtUsuarioAjustes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuarioAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioAjustesActionPerformed(evt);
            }
        });

        bttCancelarEmpleadoAjuste.setBackground(new java.awt.Color(255, 153, 153));
        bttCancelarEmpleadoAjuste.setText("Cancelar");
        bttCancelarEmpleadoAjuste.setColorBrillo(new java.awt.Color(102, 0, 204));
        bttCancelarEmpleadoAjuste.setColorDeSombra(new java.awt.Color(255, 255, 204));
        bttCancelarEmpleadoAjuste.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bttCancelarEmpleadoAjuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarEmpleadoAjusteActionPerformed(evt);
            }
        });

        txtContraseniaAjuste.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtConfContraAjuste.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblImagenGerente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelTranslucido3Layout = new javax.swing.GroupLayout(panelTranslucido3);
        panelTranslucido3.setLayout(panelTranslucido3Layout);
        panelTranslucido3Layout.setHorizontalGroup(
            panelTranslucido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucido3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelTranslucido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTranslucido3Layout.createSequentialGroup()
                        .addComponent(bttCancelarEmpleadoAjuste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(bttEmpleadoAjuste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTranslucido3Layout.createSequentialGroup()
                        .addComponent(lblImagenGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(panelTranslucido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTranslucido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelTranslucido3Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtConfContraAjuste, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTranslucido3Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(30, 30, 30)
                                    .addComponent(txtContraseniaAjuste, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelTranslucido3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(54, 54, 54)
                                .addComponent(txtUsuarioAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
        );
        panelTranslucido3Layout.setVerticalGroup(
            panelTranslucido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucido3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTranslucido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTranslucido3Layout.createSequentialGroup()
                        .addGroup(panelTranslucido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtUsuarioAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTranslucido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtContraseniaAjuste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTranslucido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtConfContraAjuste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(panelTranslucido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttEmpleadoAjuste, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttCancelarEmpleadoAjuste, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImagenGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTranslucido2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTranslucido3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTranslucido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTranslucido3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttEmpleadoAjusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEmpleadoAjusteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttEmpleadoAjusteActionPerformed

    private void txtUsuarioAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioAjustesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioAjustesActionPerformed

    private void bttCancelarEmpleadoAjusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarEmpleadoAjusteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttCancelarEmpleadoAjusteActionPerformed
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
            java.util.logging.Logger.getLogger(VistaAjustesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAjustesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAjustesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAjustesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAjustesEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonSeven bttCancelarEmpleadoAjuste;
    private org.edisoncor.gui.button.ButtonSeven bttEmpleadoAjuste;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenGerente;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucido2;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucido3;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundImage txtConfContraAjuste;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundImage txtContraseniaAjuste;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtUsuarioAjustes;
    // End of variables declaration//GEN-END:variables
}
