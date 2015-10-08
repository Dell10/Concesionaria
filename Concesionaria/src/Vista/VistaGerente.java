package Vista;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
public class VistaGerente extends javax.swing.JFrame {
    public VistaGerente() {
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
        // ajustes de la imagen CLIENTES
        ImageIcon imageCliente = new ImageIcon(getClass().getResource("/Images/clientes.png"));
        ImageIcon imageEmpleado = new ImageIcon(getClass().getResource("/Images/empleados.png"));
        ImageIcon imageCompra = new ImageIcon(getClass().getResource("/Images/compras.png"));
        ImageIcon imageVenta = new ImageIcon(getClass().getResource("/Images/entas.png"));
        
        bttCliente.setIcon(new ImageIcon(imageCliente.getImage().getScaledInstance(bttCliente.getWidth(), bttCliente.getHeight(), Image.SCALE_SMOOTH)));
        bttEmpleado.setIcon(new ImageIcon(imageEmpleado.getImage().getScaledInstance(bttEmpleado.getWidth(), bttEmpleado.getHeight(), Image.SCALE_SMOOTH)));
        bttCompra.setIcon(new ImageIcon(imageCompra.getImage().getScaledInstance(bttCompra.getWidth(), bttCompra.getHeight(), Image.SCALE_SMOOTH)));
        bttVenta.setIcon(new ImageIcon(imageVenta.getImage().getScaledInstance(bttVenta.getWidth(), bttVenta.getHeight(), Image.SCALE_SMOOTH)));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panelTranslucidoGeneral = new org.edisoncor.gui.panel.PanelTranslucido();
        panelTranslucidoClientes = new org.edisoncor.gui.panel.PanelTranslucido();
        bttCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelTranslucidoClientes2 = new org.edisoncor.gui.panel.PanelTranslucido();
        bttCompra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelTranslucidoClientes4 = new org.edisoncor.gui.panel.PanelTranslucido();
        bttEmpleado = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panelTranslucidoClientes5 = new org.edisoncor.gui.panel.PanelTranslucido();
        bttVenta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panelTranslucidoCarshop = new org.edisoncor.gui.panel.PanelTranslucido();
        lblImagenCarshop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":::GERENTE:::");

        panelTranslucidoGeneral.setBackground(new java.awt.Color(255, 51, 51));
        panelTranslucidoGeneral.setColorPrimario(new java.awt.Color(153, 153, 153));
        panelTranslucidoGeneral.setColorSecundario(new java.awt.Color(255, 255, 255));

        panelTranslucidoClientes.setBackground(new java.awt.Color(255, 51, 51));
        panelTranslucidoClientes.setColorPrimario(new java.awt.Color(153, 153, 153));
        panelTranslucidoClientes.setColorSecundario(new java.awt.Color(255, 255, 255));

        bttCliente.setBackground(new java.awt.Color(102, 102, 102));
        bttCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setText("Clientes");

        javax.swing.GroupLayout panelTranslucidoClientesLayout = new javax.swing.GroupLayout(panelTranslucidoClientes);
        panelTranslucidoClientes.setLayout(panelTranslucidoClientesLayout);
        panelTranslucidoClientesLayout.setHorizontalGroup(
            panelTranslucidoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bttCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoClientesLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(58, 58, 58))
        );
        panelTranslucidoClientesLayout.setVerticalGroup(
            panelTranslucidoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoClientesLayout.createSequentialGroup()
                .addComponent(bttCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        panelTranslucidoClientes2.setBackground(new java.awt.Color(255, 51, 51));
        panelTranslucidoClientes2.setColorPrimario(new java.awt.Color(153, 153, 153));
        panelTranslucidoClientes2.setColorSecundario(new java.awt.Color(255, 255, 255));

        bttCompra.setBackground(new java.awt.Color(102, 102, 102));
        bttCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCompraActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel3.setText("Compras");

        javax.swing.GroupLayout panelTranslucidoClientes2Layout = new javax.swing.GroupLayout(panelTranslucidoClientes2);
        panelTranslucidoClientes2.setLayout(panelTranslucidoClientes2Layout);
        panelTranslucidoClientes2Layout.setHorizontalGroup(
            panelTranslucidoClientes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bttCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoClientes2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        panelTranslucidoClientes2Layout.setVerticalGroup(
            panelTranslucidoClientes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoClientes2Layout.createSequentialGroup()
                .addComponent(bttCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );

        panelTranslucidoClientes4.setBackground(new java.awt.Color(255, 51, 51));
        panelTranslucidoClientes4.setColorPrimario(new java.awt.Color(153, 153, 153));
        panelTranslucidoClientes4.setColorSecundario(new java.awt.Color(255, 255, 255));

        bttEmpleado.setBackground(new java.awt.Color(102, 102, 102));
        bttEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEmpleadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel5.setText("Empleados");

        javax.swing.GroupLayout panelTranslucidoClientes4Layout = new javax.swing.GroupLayout(panelTranslucidoClientes4);
        panelTranslucidoClientes4.setLayout(panelTranslucidoClientes4Layout);
        panelTranslucidoClientes4Layout.setHorizontalGroup(
            panelTranslucidoClientes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bttEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoClientes4Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        panelTranslucidoClientes4Layout.setVerticalGroup(
            panelTranslucidoClientes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoClientes4Layout.createSequentialGroup()
                .addComponent(bttEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5))
        );

        panelTranslucidoClientes5.setBackground(new java.awt.Color(255, 51, 51));
        panelTranslucidoClientes5.setColorPrimario(new java.awt.Color(153, 153, 153));
        panelTranslucidoClientes5.setColorSecundario(new java.awt.Color(255, 255, 255));

        bttVenta.setBackground(new java.awt.Color(102, 102, 102));
        bttVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVentaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel6.setText("Ventas");

        javax.swing.GroupLayout panelTranslucidoClientes5Layout = new javax.swing.GroupLayout(panelTranslucidoClientes5);
        panelTranslucidoClientes5.setLayout(panelTranslucidoClientes5Layout);
        panelTranslucidoClientes5Layout.setHorizontalGroup(
            panelTranslucidoClientes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bttVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoClientes5Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        panelTranslucidoClientes5Layout.setVerticalGroup(
            panelTranslucidoClientes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoClientes5Layout.createSequentialGroup()
                .addComponent(bttVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6))
        );

        javax.swing.GroupLayout panelTranslucidoGeneralLayout = new javax.swing.GroupLayout(panelTranslucidoGeneral);
        panelTranslucidoGeneral.setLayout(panelTranslucidoGeneralLayout);
        panelTranslucidoGeneralLayout.setHorizontalGroup(
            panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoGeneralLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTranslucidoClientes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTranslucidoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTranslucidoClientes4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTranslucidoClientes5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
        );
        panelTranslucidoGeneralLayout.setVerticalGroup(
            panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoGeneralLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTranslucidoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTranslucidoClientes4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTranslucidoClientes5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTranslucidoClientes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTranslucidoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelTranslucidoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jTabbedPane1.addTab("Inicio", jPanel1);
        jTabbedPane1.addTab("Cuenta Gerente", jTabbedPane2);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTranslucidoCarshop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTranslucidoCarshop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttVentaActionPerformed

    private void bttEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttEmpleadoActionPerformed

    private void bttCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttCompraActionPerformed

    private void bttClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttClienteActionPerformed

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
            java.util.logging.Logger.getLogger(VistaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttCliente;
    private javax.swing.JButton bttCompra;
    private javax.swing.JButton bttEmpleado;
    private javax.swing.JButton bttVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenCarshop;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoCarshop;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoClientes;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoClientes2;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoClientes4;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoClientes5;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoGeneral;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoGeneral1;
    // End of variables declaration//GEN-END:variables
}