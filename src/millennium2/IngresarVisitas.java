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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author edy11
 */
public class IngresarVisitas extends javax.swing.JFrame {

    DrawerController drawer;
    IngresarVisitas reVi = this;
    private String dato = "";
    Connection con = null;
    PreparedStatement pst = null;
    //ResultSet rs = null;

    public IngresarVisitas() {
        initComponents();
        this.setLocationRelativeTo(null);
        fechaTF.setText(fecha());
        drawer = Drawer.newDrawer(this)
                .header(new JLabel("    Menu"))
                .separator(2, new Color(255, 255, 255))
                .background(new Color(255, 255, 255))
                .drawerBackground(new Color(166, 44, 26))
                .enableScroll(true)
                .addChild(new DrawerItem("Administrar Visitas").build())
                .separator(2, new Color(255, 255, 255))
                .addFooter(new DrawerItem("Regresar").build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int i, DrawerItem di) {
                        switch (i) {
                            case 0:
                                AdministrarVisitas mf2 = new AdministrarVisitas();
                                mf2.setUsuario(dato);
                                mf2.setVisible(true);
                                reVi.dispose();
                                break;
                            case 1:
                                Administrador mf = new Administrador();
                                mf.setUsuario(dato);
                                mf.setVisible(true);
                                reVi.dispose();
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
        jPanel1 = new javax.swing.JPanel();
        administradorJL = new javax.swing.JLabel();
        LoginLogo = new FondoPanel2();
        registrarVisitas = new javax.swing.JLabel();
        botonMenu = new javax.swing.JButton();
        panelDeLista = new javax.swing.JPanel();
        registrarVisitaJL = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();
        numeroVisitanteJL = new javax.swing.JLabel();
        nombreVisitanteJL = new javax.swing.JLabel();
        telefonoJL = new javax.swing.JLabel();
        direccionJL = new javax.swing.JLabel();
        numeroVisitanteTF = new javax.swing.JTextField();
        nombreTF = new javax.swing.JTextField();
        telefonoTF = new javax.swing.JTextField();
        contactoEmergenciaJL = new javax.swing.JLabel();
        contactoEmergenciaTF = new javax.swing.JTextField();
        apellidoPaternoJL = new javax.swing.JLabel();
        apellidoPaternoTF = new javax.swing.JTextField();
        apellidoMaternoJL = new javax.swing.JLabel();
        apellidoMaternoTF = new javax.swing.JTextField();
        calleTF = new javax.swing.JTextField();
        numeroTF = new javax.swing.JTextField();
        coloniaTF = new javax.swing.JTextField();
        contactoEmergenciaJL1 = new javax.swing.JLabel();
        fechaTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(9, 17, 43));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 70));

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

        registrarVisitas.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 18)); // NOI18N
        registrarVisitas.setForeground(new java.awt.Color(255, 255, 255));
        registrarVisitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarVisitas.setText("Ingresar Visitas");
        registrarVisitas.setFocusable(false);
        registrarVisitas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registrarVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 438, Short.MAX_VALUE)
                .addComponent(administradorJL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LoginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(administradorJL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(registrarVisitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        panelDeLista.setPreferredSize(new java.awt.Dimension(500, 400));

        registrarVisitaJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 18)); // NOI18N
        registrarVisitaJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarVisitaJL.setText("Ingresar Visita");

        botonIngresar.setBackground(new java.awt.Color(166, 44, 26));
        botonIngresar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 12)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar.setText("Ingresar");
        botonIngresar.setBorder(null);
        botonIngresar.setBorderPainted(false);
        botonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresar.setMaximumSize(new java.awt.Dimension(60, 30));
        botonIngresar.setMinimumSize(new java.awt.Dimension(60, 30));
        botonIngresar.setPreferredSize(new java.awt.Dimension(70, 30));
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        numeroVisitanteJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        numeroVisitanteJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroVisitanteJL.setText("Número de Visitante");
        numeroVisitanteJL.setPreferredSize(new java.awt.Dimension(170, 20));

        nombreVisitanteJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        nombreVisitanteJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreVisitanteJL.setText("Nombre");
        nombreVisitanteJL.setPreferredSize(new java.awt.Dimension(60, 20));

        telefonoJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        telefonoJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefonoJL.setText("Teléfono");
        telefonoJL.setPreferredSize(new java.awt.Dimension(70, 20));

        direccionJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        direccionJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        direccionJL.setText("Dirección");
        direccionJL.setPreferredSize(new java.awt.Dimension(60, 20));

        numeroVisitanteTF.setBackground(new java.awt.Color(242, 242, 242));
        numeroVisitanteTF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        numeroVisitanteTF.setMinimumSize(new java.awt.Dimension(60, 30));
        numeroVisitanteTF.setPreferredSize(new java.awt.Dimension(60, 30));
        numeroVisitanteTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroVisitanteTFKeyTyped(evt);
            }
        });

        nombreTF.setBackground(new java.awt.Color(242, 242, 242));
        nombreTF.setMinimumSize(new java.awt.Dimension(60, 30));
        nombreTF.setPreferredSize(new java.awt.Dimension(60, 30));
        nombreTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTFKeyTyped(evt);
            }
        });

        telefonoTF.setBackground(new java.awt.Color(242, 242, 242));
        telefonoTF.setMinimumSize(new java.awt.Dimension(60, 30));
        telefonoTF.setPreferredSize(new java.awt.Dimension(60, 30));
        telefonoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoTFKeyTyped(evt);
            }
        });

        contactoEmergenciaJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        contactoEmergenciaJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactoEmergenciaJL.setText("Contacto de Emergencia");
        contactoEmergenciaJL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        contactoEmergenciaJL.setPreferredSize(new java.awt.Dimension(160, 20));

        contactoEmergenciaTF.setBackground(new java.awt.Color(242, 242, 242));
        contactoEmergenciaTF.setMinimumSize(new java.awt.Dimension(60, 30));
        contactoEmergenciaTF.setPreferredSize(new java.awt.Dimension(60, 30));
        contactoEmergenciaTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactoEmergenciaTFKeyTyped(evt);
            }
        });

        apellidoPaternoJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        apellidoPaternoJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apellidoPaternoJL.setText("Apellido Paterno");
        apellidoPaternoJL.setPreferredSize(new java.awt.Dimension(60, 20));

        apellidoPaternoTF.setBackground(new java.awt.Color(242, 242, 242));
        apellidoPaternoTF.setMinimumSize(new java.awt.Dimension(60, 30));
        apellidoPaternoTF.setPreferredSize(new java.awt.Dimension(60, 30));
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
        apellidoMaternoTF.setMinimumSize(new java.awt.Dimension(60, 30));
        apellidoMaternoTF.setPreferredSize(new java.awt.Dimension(60, 30));
        apellidoMaternoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoMaternoTFKeyTyped(evt);
            }
        });

        calleTF.setBackground(new java.awt.Color(242, 242, 242));
        calleTF.setMinimumSize(new java.awt.Dimension(60, 30));
        calleTF.setPreferredSize(new java.awt.Dimension(60, 30));
        calleTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calleTFKeyTyped(evt);
            }
        });

        numeroTF.setBackground(new java.awt.Color(242, 242, 242));
        numeroTF.setMinimumSize(new java.awt.Dimension(60, 30));
        numeroTF.setPreferredSize(new java.awt.Dimension(60, 30));
        numeroTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTFKeyTyped(evt);
            }
        });

        coloniaTF.setBackground(new java.awt.Color(242, 242, 242));
        coloniaTF.setMinimumSize(new java.awt.Dimension(60, 30));
        coloniaTF.setPreferredSize(new java.awt.Dimension(60, 30));
        coloniaTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                coloniaTFKeyTyped(evt);
            }
        });

        contactoEmergenciaJL1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        contactoEmergenciaJL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactoEmergenciaJL1.setText("Fecha");
        contactoEmergenciaJL1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        contactoEmergenciaJL1.setPreferredSize(new java.awt.Dimension(160, 20));

        fechaTF.setEditable(false);
        fechaTF.setMinimumSize(new java.awt.Dimension(60, 30));
        fechaTF.setPreferredSize(new java.awt.Dimension(60, 30));

        javax.swing.GroupLayout panelDeListaLayout = new javax.swing.GroupLayout(panelDeLista);
        panelDeLista.setLayout(panelDeListaLayout);
        panelDeListaLayout.setHorizontalGroup(
            panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeListaLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeListaLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(contactoEmergenciaJL1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fechaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelDeListaLayout.createSequentialGroup()
                            .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nombreVisitanteJL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numeroVisitanteJL, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(apellidoMaternoJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(apellidoPaternoJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(direccionJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(telefonoJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
                            .addGap(18, 18, 18)
                            .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDeListaLayout.createSequentialGroup()
                                    .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(coloniaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(registrarVisitaJL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(telefonoTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(apellidoMaternoTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(apellidoPaternoTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombreTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numeroVisitanteTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(panelDeListaLayout.createSequentialGroup()
                            .addComponent(contactoEmergenciaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contactoEmergenciaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(104, 104, 104))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        panelDeListaLayout.setVerticalGroup(
            panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeListaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(registrarVisitaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroVisitanteJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroVisitanteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreVisitanteJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoPaternoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoPaternoJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoMaternoJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoMaternoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coloniaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactoEmergenciaJL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactoEmergenciaJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactoEmergenciaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(panelDeLista, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDeLista, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

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

    private void calleTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calleTFKeyTyped
        // TODO add your handling code here:
        if (calleTF.getText().length() == 20) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if ((c < 'A' || c > 'Z') && (c < ' ' || c > ' ') && (c < '0' || c > '9')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_calleTFKeyTyped

    private void numeroTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTFKeyTyped
        // TODO add your handling code here:
        if (numeroTF.getText().length() == 20) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if ((c < '0' || c > '9') && (c < '#' || c > '#')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_numeroTFKeyTyped

    private void coloniaTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_coloniaTFKeyTyped
        // TODO add your handling code here:
        if (coloniaTF.getText().length() == 20) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if ((c < 'A' || c > 'Z') && (c < ' ' || c > ' ') && (c < '0' || c > '9')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_coloniaTFKeyTyped

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        // TODO add your handling code here:
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            String sql1 = "INSERT INTO VISITAS(ID_VISITANTE, NOMBRE, APELLIDO_P, APELLIDO_M, TELEFONO, NUM_EMERGENCIA, DIRECCION, FECHA_VISITA) VALUES(?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql1);
            if (numeroVisitanteTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el numero de identificacion del visitante");
            } else {
                pst.setString(1, numeroVisitanteTF.getText());
            }
            if (nombreTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el nombre del visitante");
            } else {
                pst.setString(2, nombreTF.getText());
            }
            if (apellidoPaternoTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el apellido paterno del visitante");
            } else {
                pst.setString(3, apellidoPaternoTF.getText());
            }
            if (apellidoMaternoTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el apellido materno del visitante");
            } else {
                pst.setString(4, apellidoMaternoTF.getText());
            }
            if (telefonoTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el numero de telefono del visitante");
            } else {
                pst.setString(5, telefonoTF.getText());
            }
            if (contactoEmergenciaTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el numero del contacto de emergencia del visitante");
            } else {
                pst.setString(6, contactoEmergenciaTF.getText());
            }
            if (calleTF.getText().equals("") || numeroTF.getText().equals("") || coloniaTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba la direccion completa del visitante");
            } else {
                pst.setString(7, calleTF.getText() + ", " + numeroTF.getText() + ", " + coloniaTF.getText());
            }
            pst.setString(8, fecha());
            if (validarNombresApellidosVisitas() == 0) {
                UIManager.put("OptionPane.yesButtonText", "Sí");
                UIManager.put("OptionPane.noButtonText", "No");
                UIManager.put("OptionPane.cancelButtonText", "Cancelar");
                int option = JOptionPane.showConfirmDialog(null, "El cliente acepta los términos y condiciones en los cuales \nel gimnasio no se responsabiliza de cualquier perdida/extravió \nde objetos personales o lesiones ocurridas dentro de las instalaciones.", "Terminos y Condiciones", JOptionPane.YES_NO_CANCEL_OPTION);
                switch (option) {
                    case JOptionPane.YES_OPTION:
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Visita ingresada exitosamente");
                        numeroVisitanteTF.setText("");
                        nombreTF.setText("");
                        apellidoPaternoTF.setText("");
                        apellidoMaternoTF.setText("");
                        telefonoTF.setText("");
                        contactoEmergenciaTF.setText("");
                        calleTF.setText("");
                        numeroTF.setText("");
                        coloniaTF.setText("");
                        break;
                    case JOptionPane.NO_OPTION:
                        JOptionPane.showMessageDialog(null, "El cliente debe aceptar las condiciones para continuar");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "La visita con el nombre " + nombreTF.getText() + " " + apellidoPaternoTF.getText() + " " + apellidoMaternoTF.getText() + " ya se encuentra registrado");
            }
        } catch (SQLException ex) {
            switch (ex.getErrorCode()) {
                case 1400 ->
                    JOptionPane.showMessageDialog(null, "Ningun campo puede quedar vacio");
                case 1 ->
                    JOptionPane.showMessageDialog(null, "El numero de identificacion que intenta ingresar ya existe");
                default ->
                    JOptionPane.showMessageDialog(null, "No se ha podido completar la acción, revise la información");
            }
        }
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void numeroVisitanteTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroVisitanteTFKeyTyped
        // TODO add your handling code here:
        if (numeroVisitanteTF.getText().length() == 6) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_numeroVisitanteTFKeyTyped

    private void nombreTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTFKeyTyped
        // TODO add your handling code here:
        if (nombreTF.getText().length() == 50) {
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

    private void contactoEmergenciaTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactoEmergenciaTFKeyTyped
        // TODO add your handling code here:
        if (contactoEmergenciaTF.getText().length() == 10) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_contactoEmergenciaTFKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IllegalAccessException {
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarVisitas().setVisible(true);
            }
        });
    }

    private String fecha() {
        LocalDate fechaActual = LocalDate.now();

        // Crear un formateador para el formato DD/MM/AAAA
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatear la fecha
        String fechaFormateada = fechaActual.format(formateador);

        return fechaFormateada;
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

    public int validarNombresApellidosVisitas() {
        int bandera = 1;

        try {
            Connection conVNAV = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            String sqlVNAV = "SELECT NOMBRE, APELLIDO_P, APELLIDO_M FROM VISITAS WHERE NOMBRE=? AND APELLIDO_P=? AND APELLIDO_M=?";
            PreparedStatement pstVNAV = conVNAV.prepareStatement(sqlVNAV);
            pstVNAV.setString(1, nombreTF.getText());
            pstVNAV.setString(2, apellidoPaternoTF.getText());
            pstVNAV.setString(3, apellidoMaternoTF.getText());
            ResultSet rsVNAV = pstVNAV.executeQuery();
            if (rsVNAV.next() == false) {
                bandera = 0;
            }

        } catch (SQLException ex) {
            System.out.print(ex);
        }

        return bandera;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginLogo;
    private javax.swing.JLabel administradorJL;
    private javax.swing.JLabel apellidoMaternoJL;
    private javax.swing.JTextField apellidoMaternoTF;
    private javax.swing.JLabel apellidoPaternoJL;
    private javax.swing.JTextField apellidoPaternoTF;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonMenu;
    private javax.swing.JTextField calleTF;
    private javax.swing.JTextField coloniaTF;
    private javax.swing.JLabel contactoEmergenciaJL;
    private javax.swing.JLabel contactoEmergenciaJL1;
    private javax.swing.JTextField contactoEmergenciaTF;
    private javax.swing.JLabel direccionJL;
    private javax.swing.JTextField fechaTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JLabel nombreVisitanteJL;
    private javax.swing.JTextField numeroTF;
    private javax.swing.JLabel numeroVisitanteJL;
    private javax.swing.JTextField numeroVisitanteTF;
    private javax.swing.JPanel panelDeLista;
    private javax.swing.JLabel registrarVisitaJL;
    private javax.swing.JLabel registrarVisitas;
    private javax.swing.JLabel telefonoJL;
    private javax.swing.JTextField telefonoTF;
    // End of variables declaration//GEN-END:variables
}
