package Vista;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
public class VistaConfiguracionBDD extends javax.swing.JFrame {
    public VistaConfiguracionBDD() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panelTranslucidoGeneral = new org.edisoncor.gui.panel.PanelTranslucido();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtIpBdd = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtPuertoBdd = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtUsuarioBdd = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtContraseniaBdd = new org.edisoncor.gui.passwordField.PasswordFieldRoundImage();
        bttCancelarConfigBdd = new org.edisoncor.gui.button.ButtonSeven();
        bttGuardarConfigBdd = new org.edisoncor.gui.button.ButtonSeven();
        jPanelCrearEmpleado = new javax.swing.JPanel();
        lblImagenGerente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuarioGerente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtContraseniaGerente = new org.edisoncor.gui.passwordField.PasswordFieldRoundImage();
        txtConfContraseniaGerente = new org.edisoncor.gui.passwordField.PasswordFieldRoundImage();
        jLabel9 = new javax.swing.JLabel();
        txtClaveElectorGerente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel10 = new javax.swing.JLabel();
        txtNombreGerente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtApPaternoGerente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtApMaternoGerente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel13 = new javax.swing.JLabel();
        txtDireccionGerente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTelefonoGerente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtSalarioGerente = new org.edisoncor.gui.textField.TextFieldRoundImage();
        bttCancelarGerencia = new org.edisoncor.gui.button.ButtonSeven();
        bttGuardarGerencia = new org.edisoncor.gui.button.ButtonSeven();
        panelTranslucidoCarshop = new org.edisoncor.gui.panel.PanelTranslucido();
        lblImagenCarshop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":::ADMINISTRADOR BDD:::");

        jTabbedPane1.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N

        panelTranslucidoGeneral.setBackground(new java.awt.Color(255, 51, 51));
        panelTranslucidoGeneral.setColorPrimario(new java.awt.Color(153, 153, 153));
        panelTranslucidoGeneral.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jLabel5.setText("IP:");

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jLabel6.setText("Puerto:");

        jLabel15.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jLabel15.setText("Contraseña BD:");

        jLabel17.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jLabel17.setText("Usuario BD:");

        txtIpBdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIpBdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpBddActionPerformed(evt);
            }
        });

        txtPuertoBdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPuertoBdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuertoBddActionPerformed(evt);
            }
        });

        txtUsuarioBdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuarioBdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioBddActionPerformed(evt);
            }
        });

        txtContraseniaBdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bttCancelarConfigBdd.setBackground(new java.awt.Color(255, 153, 153));
        bttCancelarConfigBdd.setText("Cancelar");
        bttCancelarConfigBdd.setColorBrillo(new java.awt.Color(102, 0, 204));
        bttCancelarConfigBdd.setColorDeSombra(new java.awt.Color(255, 255, 204));
        bttCancelarConfigBdd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bttCancelarConfigBdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarConfigBddActionPerformed(evt);
            }
        });

        bttGuardarConfigBdd.setBackground(new java.awt.Color(153, 255, 51));
        bttGuardarConfigBdd.setText("Guardar");
        bttGuardarConfigBdd.setColorBrillo(new java.awt.Color(102, 0, 204));
        bttGuardarConfigBdd.setColorDeSombra(new java.awt.Color(255, 255, 204));
        bttGuardarConfigBdd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bttGuardarConfigBdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGuardarConfigBddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTranslucidoGeneralLayout = new javax.swing.GroupLayout(panelTranslucidoGeneral);
        panelTranslucidoGeneral.setLayout(panelTranslucidoGeneralLayout);
        panelTranslucidoGeneralLayout.setHorizontalGroup(
            panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoGeneralLayout.createSequentialGroup()
                .addGroup(panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTranslucidoGeneralLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttCancelarConfigBdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttGuardarConfigBdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTranslucidoGeneralLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15)
                            .addComponent(jLabel6)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIpBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPuertoBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuarioBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseniaBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(119, 119, 119))
        );
        panelTranslucidoGeneralLayout.setVerticalGroup(
            panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslucidoGeneralLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIpBdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPuertoBdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtUsuarioBdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtContraseniaBdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panelTranslucidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttGuardarConfigBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttCancelarConfigBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
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

        jTabbedPane1.addTab("Configuracion Base de Datos", jPanel1);

        lblImagenGerente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel7.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel7.setText("Contraseña:");

        jLabel8.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel8.setText("Confirmar:");

        txtUsuarioGerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuarioGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioGerenteActionPerformed(evt);
            }
        });

        txtContraseniaGerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtConfContraseniaGerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel9.setText("Clave elector:");

        txtClaveElectorGerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClaveElectorGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveElectorGerenteActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel10.setText("Nombre:");

        txtNombreGerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreGerenteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel11.setText("Apellido paterno:");

        jLabel12.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel12.setText("Apellido materno:");

        txtApPaternoGerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApPaternoGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApPaternoGerenteActionPerformed(evt);
            }
        });

        txtApMaternoGerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApMaternoGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApMaternoGerenteActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel13.setText("Direcciòn:");

        txtDireccionGerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDireccionGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionGerenteActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel14.setText("Telèfono:");

        jLabel16.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel16.setText("Salario:");

        txtTelefonoGerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefonoGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoGerenteActionPerformed(evt);
            }
        });

        txtSalarioGerente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSalarioGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioGerenteActionPerformed(evt);
            }
        });

        bttCancelarGerencia.setBackground(new java.awt.Color(255, 153, 153));
        bttCancelarGerencia.setText("Cancelar");
        bttCancelarGerencia.setColorBrillo(new java.awt.Color(102, 0, 204));
        bttCancelarGerencia.setColorDeSombra(new java.awt.Color(255, 255, 204));
        bttCancelarGerencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bttCancelarGerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarGerenciaActionPerformed(evt);
            }
        });

        bttGuardarGerencia.setBackground(new java.awt.Color(153, 255, 51));
        bttGuardarGerencia.setText("Guardar");
        bttGuardarGerencia.setColorBrillo(new java.awt.Color(102, 0, 204));
        bttGuardarGerencia.setColorDeSombra(new java.awt.Color(255, 255, 204));
        bttGuardarGerencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bttGuardarGerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGuardarGerenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCrearEmpleadoLayout = new javax.swing.GroupLayout(jPanelCrearEmpleado);
        jPanelCrearEmpleado.setLayout(jPanelCrearEmpleadoLayout);
        jPanelCrearEmpleadoLayout.setHorizontalGroup(
            jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                        .addComponent(bttCancelarGerencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttGuardarGerencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(lblImagenGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(77, 77, 77)
                            .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel4))
                            .addGap(26, 26, 26)
                            .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtContraseniaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConfContraseniaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtUsuarioGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jLabel16))
                            .addGap(29, 29, 29)
                            .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDireccionGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                                    .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombreGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtClaveElectorGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApPaternoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApMaternoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTelefonoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSalarioGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelCrearEmpleadoLayout.setVerticalGroup(
            jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearEmpleadoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearEmpleadoLayout.createSequentialGroup()
                        .addComponent(lblImagenGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearEmpleadoLayout.createSequentialGroup()
                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtUsuarioGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtContraseniaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtConfContraseniaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtClaveElectorGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(txtNombreGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApPaternoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(txtApMaternoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccionGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefonoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(20, 20, 20)
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtSalarioGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanelCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttGuardarGerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttCancelarGerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Asignar gerencia", jPanelCrearEmpleado);

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

    private void txtUsuarioGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioGerenteActionPerformed

    private void txtClaveElectorGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveElectorGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveElectorGerenteActionPerformed

    private void txtNombreGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreGerenteActionPerformed

    private void txtApPaternoGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApPaternoGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApPaternoGerenteActionPerformed

    private void txtApMaternoGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApMaternoGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApMaternoGerenteActionPerformed

    private void txtDireccionGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionGerenteActionPerformed

    private void txtTelefonoGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoGerenteActionPerformed

    private void txtSalarioGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioGerenteActionPerformed

    private void txtIpBddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpBddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIpBddActionPerformed

    private void txtPuertoBddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuertoBddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuertoBddActionPerformed

    private void txtUsuarioBddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioBddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioBddActionPerformed

    private void bttCancelarConfigBddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarConfigBddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttCancelarConfigBddActionPerformed

    private void bttGuardarConfigBddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarConfigBddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttGuardarConfigBddActionPerformed

    private void bttCancelarGerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarGerenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttCancelarGerenciaActionPerformed

    private void bttGuardarGerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarGerenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttGuardarGerenciaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaConfiguracionBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaConfiguracionBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaConfiguracionBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaConfiguracionBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaConfiguracionBDD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonSeven bttCancelarConfigBdd;
    private org.edisoncor.gui.button.ButtonSeven bttCancelarGerencia;
    private org.edisoncor.gui.button.ButtonSeven bttGuardarConfigBdd;
    private org.edisoncor.gui.button.ButtonSeven bttGuardarGerencia;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel lblImagenGerente;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoCarshop;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucidoGeneral;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtApMaternoGerente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtApPaternoGerente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtClaveElectorGerente;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundImage txtConfContraseniaGerente;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundImage txtContraseniaBdd;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundImage txtContraseniaGerente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtDireccionGerente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtIpBdd;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtNombreGerente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtPuertoBdd;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtSalarioGerente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtTelefonoGerente;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtUsuarioBdd;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtUsuarioGerente;
    // End of variables declaration//GEN-END:variables
}