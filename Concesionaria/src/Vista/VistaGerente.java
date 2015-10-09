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
        jPanelCrearEmpleado = new javax.swing.JPanel();
        lblImagenEmpleado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuarioEmpleado = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtContraseniaEmpleado = new org.edisoncor.gui.passwordField.PasswordFieldRoundImage();
        txtConfContraseniaEmpleado = new org.edisoncor.gui.passwordField.PasswordFieldRoundImage();
        jLabel9 = new javax.swing.JLabel();
        txtClaveElectorEmpleado = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel10 = new javax.swing.JLabel();
        txtNombreEmpleado = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtApPaternoEmpleado = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtApMaternoEmpleado = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel13 = new javax.swing.JLabel();
        txtDireccionEmpleado = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTelefonoEmpleado = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jComboBoxPuestoEmpleado = new javax.swing.JComboBox();
        txtSalarioEmpleado = new org.edisoncor.gui.textField.TextFieldRoundImage();
        bttCancelarAgrEmpleado = new org.edisoncor.gui.button.ButtonSeven();
        bttGuardarEmpleado = new org.edisoncor.gui.button.ButtonSeven();
        panelTranslucidoCarshop = new org.edisoncor.gui.panel.PanelTranslucido();
        lblImagenCarshop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":::GERENTE:::");

        jTabbedPane1.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N

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
                .addContainerGap(47, Short.MAX_VALUE))
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

        lblImagenEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel7.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel7.setText("Contraseña:");

        jLabel8.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel8.setText("Confirmar:");

        txtUsuarioEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioEmpleadoActionPerformed(evt);
            }
        });

        txtContraseniaEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtConfContraseniaEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel9.setText("Clave elector:");

        txtClaveElectorEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClaveElectorEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveElectorEmpleadoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel10.setText("Nombre:");

        txtNombreEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel11.setText("Apellido paterno:");

        jLabel12.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel12.setText("Apellido materno:");

        txtApPaternoEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApPaternoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApPaternoEmpleadoActionPerformed(evt);
            }
        });

        txtApMaternoEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApMaternoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApMaternoEmpleadoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel13.setText("Direcciòn:");

        txtDireccionEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDireccionEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionEmpleadoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel14.setText("Telèfono:");

        jLabel15.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel15.setText("Puesto:");

        jLabel16.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel16.setText("Salario:");

        txtTelefonoEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefonoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEmpleadoActionPerformed(evt);
            }
        });

        jComboBoxPuestoEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Comercio", "Financiamiento" }));

        txtSalarioEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSalarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioEmpleadoActionPerformed(evt);
            }
        });

        bttCancelarAgrEmpleado.setBackground(new java.awt.Color(255, 153, 153));
        bttCancelarAgrEmpleado.setText("Cancelar");
        bttCancelarAgrEmpleado.setColorBrillo(new java.awt.Color(102, 0, 204));
        bttCancelarAgrEmpleado.setColorDeSombra(new java.awt.Color(255, 255, 204));
        bttCancelarAgrEmpleado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bttCancelarAgrEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarAgrEmpleadoActionPerformed(evt);
            }
        });

        bttGuardarEmpleado.setBackground(new java.awt.Color(153, 255, 51));
        bttGuardarEmpleado.setText("Guardar");
        bttGuardarEmpleado.setColorBrillo(new java.awt.Color(102, 0, 204));
        bttGuardarEmpleado.setColorDeSombra(new java.awt.Color(255, 255, 204));
        bttGuardarEmpleado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bttGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGuardarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCrearEmpleadoLayout = new javax.swing.GroupLayout(jPanelCrearEmpleado);
        jPanelCrearEmpleado.setLayout(jPanelCrearEmpleadoLayout);
        jPanelCrearEmpleadoLayout.setHorizontalGroup(
            jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblImagenEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtContraseniaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtConfContraseniaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(29, 29, 29)
                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccionEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                                        .addComponent(bttCancelarAgrEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bttGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                                                .addComponent(jComboBoxPuestoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel16))
                                            .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtClaveElectorEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtApPaternoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtApMaternoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(29, 29, 29)
                                        .addComponent(txtSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelCrearEmpleadoLayout.setVerticalGroup(
            jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearEmpleadoLayout.createSequentialGroup()
                        .addComponent(lblImagenEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearEmpleadoLayout.createSequentialGroup()
                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtContraseniaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtConfContraseniaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtClaveElectorEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(16, 16, 16)
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                        .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApPaternoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(txtApMaternoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxPuestoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttCancelarAgrEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear empleado", jPanelCrearEmpleado);

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

    private void txtUsuarioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioEmpleadoActionPerformed

    private void txtClaveElectorEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveElectorEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveElectorEmpleadoActionPerformed

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void txtApPaternoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApPaternoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApPaternoEmpleadoActionPerformed

    private void txtApMaternoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApMaternoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApMaternoEmpleadoActionPerformed

    private void txtDireccionEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionEmpleadoActionPerformed

    private void txtTelefonoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEmpleadoActionPerformed

    private void txtSalarioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioEmpleadoActionPerformed

    private void bttCancelarAgrEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarAgrEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttCancelarAgrEmpleadoActionPerformed

    private void bttGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttGuardarEmpleadoActionPerformed

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
    private org.edisoncor.gui.button.ButtonSeven bttCancelarAgrEmpleado;
    private javax.swing.JButton bttCliente;
    private javax.swing.JButton bttCompra;
    private javax.swing.JButton bttEmpleado;
    private org.edisoncor.gui.button.ButtonSeven bttGuardarEmpleado;
    private javax.swing.JButton bttVenta;
    private javax.swing.JComboBox jComboBoxPuestoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCrearEmpleado;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblImagenCarshop;
    private javax.swing.JLabel lblImagenEmpleado;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoCarshop;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoClientes;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoClientes2;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoClientes4;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoClientes5;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoGeneral;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtApMaternoEmpleado;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtApPaternoEmpleado;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtClaveElectorEmpleado;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundImage txtConfContraseniaEmpleado;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundImage txtContraseniaEmpleado;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtDireccionEmpleado;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtNombreEmpleado;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtSalarioEmpleado;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtTelefonoEmpleado;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtUsuarioEmpleado;
    // End of variables declaration//GEN-END:variables
}