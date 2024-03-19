package millennium2;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author edy117
 */
public class EditarUsuarios extends javax.swing.JFrame {

    DrawerController drawer;
    EditarUsuarios ediUs = this;
    private String dato = "";
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public EditarUsuarios() {
        initComponents();
        //rellenarCbxDomicilio();
        rellenarCbxTipoUsuario();
        AdministrarUsuarios ventana = new AdministrarUsuarios();
        numeroIdentificacionTF.setText(ventana.id_Usuarios);
        nombreUsuarioTF.setText(ventana.nombreUsuario);
        contrasenaTF.setText(ventana.contrasena);
        nombreTF.setText(ventana.nombre);
        apellidoPaternoTF.setText(ventana.paterno);
        apellidoMaternoTF.setText(ventana.materno);
        telefonoTF.setText(ventana.telefono);
        //calleTF.setText(ventana.domicilio);
        tipoDeUsuarioCbx.setSelectedItem(ventana.tipoUsuario);
        this.setLocationRelativeTo(null);
        drawer = Drawer.newDrawer(this)
                .header(new JLabel("    Menu"))
                .separator(2, new Color(255, 255, 255))
                .background(new Color(255, 255, 255))
                .drawerBackground(new Color(166, 44, 26))
                .enableScroll(true)
                .addChild(new DrawerItem("Administrar Usuarios").build())
                .separator(2, new Color(255, 255, 255))
                .addFooter(new DrawerItem("Regresar").build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int i, DrawerItem di) {
                        switch (i) {
                            case 0:
                                AdministrarUsuarios mf2 = new AdministrarUsuarios();
                                mf2.setUsuario(dato);
                                mf2.setVisible(true);
                                ediUs.dispose();
                                break;
                            case 1:
                                Administrador mf = new Administrador();
                                mf.setUsuario(dato);
                                mf.setVisible(true);
                                ediUs.dispose();
                                break;

                        }
                    }
                }).build();
    }

    public void setUsuario(String dato) {
        this.dato = dato;
        administradorJL.setText(dato);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelDeLista = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botonEditar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        numeroIdentificacionTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        telefonoTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tipoDeUsuarioCbx = new javax.swing.JComboBox<>();
        apellidoPaternoJL = new javax.swing.JLabel();
        apellidoPaternoTF = new javax.swing.JTextField();
        apellidoMaternoJL = new javax.swing.JLabel();
        apellidoMaternoTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nombreUsuarioTF = new javax.swing.JTextField();
        contrasenaTF = new javax.swing.JTextField();
        coloniaTF = new javax.swing.JTextField();
        numeroTF = new javax.swing.JTextField();
        calleTF = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        administradorJL = new javax.swing.JLabel();
        LoginLogo = new FondoPanel2();
        jLabel2 = new javax.swing.JLabel();
        botonMenu = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelDeLista.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Editar Usuario");

        botonEditar.setBackground(new java.awt.Color(166, 44, 26));
        botonEditar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 12)); // NOI18N
        botonEditar.setForeground(new java.awt.Color(255, 255, 255));
        botonEditar.setText("Editar");
        botonEditar.setBorder(null);
        botonEditar.setBorderPainted(false);
        botonEditar.setPreferredSize(new java.awt.Dimension(60, 30));
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonBorrar.setBackground(new java.awt.Color(166, 44, 26));
        botonBorrar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 12)); // NOI18N
        botonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        botonBorrar.setText("Eliminar");
        botonBorrar.setBorder(null);
        botonBorrar.setBorderPainted(false);
        botonBorrar.setPreferredSize(new java.awt.Dimension(60, 30));
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Número de Identificación");
        jLabel4.setPreferredSize(new java.awt.Dimension(170, 20));

        numeroIdentificacionTF.setEditable(false);
        numeroIdentificacionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroIdentificacionTFActionPerformed(evt);
            }
        });
        numeroIdentificacionTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroIdentificacionTFKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre");
        jLabel5.setPreferredSize(new java.awt.Dimension(60, 20));

        nombreTF.setBackground(new java.awt.Color(242, 242, 242));
        nombreTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTFKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Teléfeono");

        telefonoTF.setBackground(new java.awt.Color(242, 242, 242));
        telefonoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoTFKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dirección");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tipo de Usuario");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tipoDeUsuarioCbx.setBackground(new java.awt.Color(242, 242, 242));
        tipoDeUsuarioCbx.setToolTipText("");
        tipoDeUsuarioCbx.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tipoDeUsuarioCbx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipoDeUsuarioCbx.setDoubleBuffered(true);
        tipoDeUsuarioCbx.setName(""); // NOI18N
        tipoDeUsuarioCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDeUsuarioCbxActionPerformed(evt);
            }
        });

        apellidoPaternoJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        apellidoPaternoJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apellidoPaternoJL.setText("Apellido Paterno");
        apellidoPaternoJL.setPreferredSize(new java.awt.Dimension(60, 20));

        apellidoPaternoTF.setBackground(new java.awt.Color(242, 242, 242));
        apellidoPaternoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoPaternoTFKeyTyped(evt);
            }
        });

        apellidoMaternoJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        apellidoMaternoJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apellidoMaternoJL.setText("Apellido Materno");
        apellidoMaternoJL.setPreferredSize(new java.awt.Dimension(60, 20));

        apellidoMaternoTF.setBackground(new java.awt.Color(242, 242, 242));
        apellidoMaternoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoMaternoTFKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nombre del Usuario");
        jLabel9.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Contraseña");
        jLabel10.setPreferredSize(new java.awt.Dimension(60, 20));

        nombreUsuarioTF.setBackground(new java.awt.Color(242, 242, 242));

        contrasenaTF.setBackground(new java.awt.Color(242, 242, 242));

        coloniaTF.setBackground(new java.awt.Color(242, 242, 242));
        coloniaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coloniaTFActionPerformed(evt);
            }
        });
        coloniaTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                coloniaTFKeyTyped(evt);
            }
        });

        numeroTF.setBackground(new java.awt.Color(242, 242, 242));
        numeroTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTFActionPerformed(evt);
            }
        });
        numeroTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTFKeyTyped(evt);
            }
        });

        calleTF.setBackground(new java.awt.Color(242, 242, 242));
        calleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calleTFActionPerformed(evt);
            }
        });
        calleTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calleTFKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDeListaLayout = new javax.swing.GroupLayout(panelDeLista);
        panelDeLista.setLayout(panelDeListaLayout);
        panelDeListaLayout.setHorizontalGroup(
            panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeListaLayout.createSequentialGroup()
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeListaLayout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(apellidoMaternoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(apellidoPaternoJL, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nombreTF)
                                .addComponent(apellidoPaternoTF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(apellidoMaternoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelDeListaLayout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelDeListaLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nombreUsuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelDeListaLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(numeroIdentificacionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelDeListaLayout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(contrasenaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDeListaLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(telefonoTF)
                                .addComponent(tipoDeUsuarioCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDeListaLayout.createSequentialGroup()
                                .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDeListaLayout.createSequentialGroup()
                                .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coloniaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        panelDeListaLayout.setVerticalGroup(
            panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeListaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroIdentificacionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrasenaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoPaternoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoPaternoJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoMaternoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoMaternoJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telefonoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coloniaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tipoDeUsuarioCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(9, 17, 43));
        jPanel5.setPreferredSize(new java.awt.Dimension(900, 70));

        administradorJL.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 2, 18)); // NOI18N
        administradorJL.setForeground(new java.awt.Color(255, 255, 255));
        administradorJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout LoginLogoLayout = new javax.swing.GroupLayout(LoginLogo);
        LoginLogo.setLayout(LoginLogoLayout);
        LoginLogoLayout.setHorizontalGroup(
            LoginLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        LoginLogoLayout.setVerticalGroup(
            LoginLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Editar Usuarios");

        botonMenu.setBackground(new java.awt.Color(9, 17, 43));
        botonMenu.setForeground(new java.awt.Color(255, 255, 255));
        botonMenu.setText("|||");
        botonMenu.setBorder(null);
        botonMenu.setBorderPainted(false);
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(administradorJL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LoginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(administradorJL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDeLista, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDeLista, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        // TODO add your handling code here:
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_botonMenuActionPerformed

    private void tipoDeUsuarioCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDeUsuarioCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoDeUsuarioCbxActionPerformed

    private void numeroIdentificacionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroIdentificacionTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroIdentificacionTFActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        // TODO add your handling code here:
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            String sql = "DELETE FROM USUARIOS WHERE ID_USUARIOS=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, numeroIdentificacionTF.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Eliminados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar el usuario, revise la infromación");
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        // TODO add your handling code here:
        //String domicilio = id_domicilio();
        String tipoUsuarioLocal = id_tipoUsuario();
        try {
            if (calleTF.getText().equals("") || numeroTF.getText().equals("") || coloniaTF.getText().equals("")) {
                con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
                pst = con.prepareStatement("UPDATE USUARIOS SET CONTRASENA='" + contrasenaTF.getText() + "', NOMBREUSUARIO='" + nombreUsuarioTF.getText() + "', TIPO_USUARIO_FK='" + tipoUsuarioLocal + "', NOMBRE='" + nombreTF.getText() + "', APELLIDO_P='" + apellidoPaternoTF.getText() + "', APELLIDO_M='" + apellidoPaternoTF.getText() + "', TELEFONO='" + telefonoTF.getText() + "' WHERE ID_USUARIOS='" + numeroIdentificacionTF.getText() + "'");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos del usuario modificados");
            } else {
                con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
                pst = con.prepareStatement("UPDATE USUARIOS SET CONTRASENA='" + contrasenaTF.getText() + "', NOMBREUSUARIO='" + nombreUsuarioTF.getText() + "', TIPO_USUARIO_FK='" + tipoUsuarioLocal + "', NOMBRE='" + nombreTF.getText() + "', APELLIDO_P='" + apellidoPaternoTF.getText() + "', APELLIDO_M='" + apellidoPaternoTF.getText() + "', TELEFONO='" + telefonoTF.getText() + "', DIRECCION='" + calleTF.getText() + ", " + numeroTF.getText() + ", " + coloniaTF.getText() + "' WHERE ID_USUARIOS='" + numeroIdentificacionTF.getText() + "'");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos del usuario modificados");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar los datos del usuario, revise la informacion");
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void numeroIdentificacionTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroIdentificacionTFKeyTyped
        // TODO add your handling code here:
        if (numeroIdentificacionTF.getText().length() == 4) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_numeroIdentificacionTFKeyTyped

    private void nombreTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTFKeyTyped
        // TODO add your handling code here:
        if (nombreTF.getText().length() == 20) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if ((c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_nombreTFKeyTyped

    private void apellidoPaternoTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoPaternoTFKeyTyped
        // TODO add your handling code here:
        if (apellidoPaternoTF.getText().length() == 20) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if ((c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_apellidoPaternoTFKeyTyped

    private void apellidoMaternoTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoMaternoTFKeyTyped
        // TODO add your handling code here:
        if (apellidoMaternoTF.getText().length() == 20) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if ((c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_apellidoMaternoTFKeyTyped

    private void telefonoTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoTFKeyTyped
        // TODO add your handling code here:
        if (telefonoTF.getText().length() == 10) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_telefonoTFKeyTyped

    private void coloniaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coloniaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coloniaTFActionPerformed

    private void coloniaTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_coloniaTFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_coloniaTFKeyTyped

    private void numeroTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTFActionPerformed

    private void numeroTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTFKeyTyped

    private void calleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calleTFActionPerformed

    private void calleTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calleTFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_calleTFKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarUsuarios().setVisible(true);
            }
        });
    }

    class FondoPanel2 extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/LoginIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    /*private void rellenarCbxDomicilio() {
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "MILLENNIUM2", "MILLENNIUM2");
            pst = con.prepareStatement("SELECT CALLE, NUMERO, COLONIA FROM DOMICILIO, COLONIA WHERE DOMICILIO.COLONIA_IDCOLONIA = COLONIA.ID_COLONIA ORDER BY ID_DOMICILIO ASC");
            rs = pst.executeQuery();

            while (rs.next()) {
                var ID_DOMICILIO = rs.getString("CALLE");
                var ID_NUMERO = rs.getString("NUMERO");
                var ID_COLONIA = rs.getString("COLONIA");
                direccionCbx.addItem(ID_NUMERO + ", " + ID_DOMICILIO + ", " + ID_COLONIA);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private String id_domicilio() {
        String id = "";
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            String sql = "SELECT ID_DOMICILIO FROM DOMICILIO WHERE ID_DOMICILIO=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, direccionCbx.getSelectedIndex() + 1);
            rs = pst.executeQuery();

            while (rs.next()) {
                id = rs.getString("ID_DOMICILIO");
            }
            return id;
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return id;
    }*/
    private void rellenarCbxTipoUsuario() {
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "MILLENNIUM2", "MILLENNIUM2");
            pst = con.prepareStatement("SELECT TIPO_USUARIO FROM TIPO_USUARIOS ORDER BY ID_TIPOUSUARIO ASC");
            rs = pst.executeQuery();

            while (rs.next()) {
                var tipoUsuario = rs.getString("TIPO_USUARIO");
                tipoDeUsuarioCbx.addItem(tipoUsuario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private String id_tipoUsuario() {
        String id = "";
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            String sql = "SELECT ID_TIPOUSUARIO FROM TIPO_USUARIOs WHERE ID_TIPOUSUARIO=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, tipoDeUsuarioCbx.getSelectedIndex() + 1);
            rs = pst.executeQuery();

            while (rs.next()) {
                id = rs.getString("ID_TIPOUSUARIO");
            }
            return id;
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginLogo;
    private javax.swing.JLabel administradorJL;
    private javax.swing.JLabel apellidoMaternoJL;
    private javax.swing.JTextField apellidoMaternoTF;
    private javax.swing.JLabel apellidoPaternoJL;
    private javax.swing.JTextField apellidoPaternoTF;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonMenu;
    private javax.swing.JTextField calleTF;
    private javax.swing.JTextField coloniaTF;
    private javax.swing.JTextField contrasenaTF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JTextField nombreUsuarioTF;
    private javax.swing.JTextField numeroIdentificacionTF;
    private javax.swing.JTextField numeroTF;
    private javax.swing.JPanel panelDeLista;
    private javax.swing.JTextField telefonoTF;
    private javax.swing.JComboBox<String> tipoDeUsuarioCbx;
    // End of variables declaration//GEN-END:variables
}
