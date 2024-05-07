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
 * @author edy11
 */
public class EditarSocioRecepcionista extends javax.swing.JFrame {

    DrawerController drawer;
    EditarSocioRecepcionista ediSosRep = this;
    private String dato = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public EditarSocioRecepcionista() {
        initComponents();
        this.setLocationRelativeTo(null);
        rellenarCbxEstatus();
        AdministrarSociosRecepcionista ventana = new AdministrarSociosRecepcionista();
        numeroIdentificacionTF.setText(ventana.id_Socios);
        nombreTF.setText(ventana.nombre);
        apellidoPaternoTF.setText(ventana.paterno);
        apellidoMaternoTF.setText(ventana.materno);
        telefonoTF.setText(ventana.telefono);
        inscripcionTF.setText(ventana.inscripcion);
        calleTF.setText(ventana.calle);
        numeroTF.setText(ventana.numero);
        coloniaTF.setText(ventana.colonia);
        contactoEmergenciaTF.setText(ventana.contactoEmergencia);
        estatusCbx.setSelectedItem(ventana.estatus);
        drawer = Drawer.newDrawer(this)
                .header(new JLabel("    Menu"))
                .separator(2, new Color(255, 255, 255))
                .background(new Color(255, 255, 255))
                .drawerBackground(new Color(166, 44, 26))
                .enableScroll(true)
                .addChild(new DrawerItem("Administrar Socios").build())
                .separator(2, new Color(255, 255, 255))
                .addFooter(new DrawerItem("Regresar").build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int i, DrawerItem di) {
                        switch (i) {
                            case 0:
                                AdministrarSociosRecepcionista mf2 = new AdministrarSociosRecepcionista();
                                mf2.setUsuario(dato);
                                mf2.setVisible(true);
                                ediSosRep.dispose();
                                break;
                            case 1:
                                Recepcionista mf1 = new Recepcionista();
                                mf1.setUsuario(dato);
                                mf1.setVisible(true);
                                ediSosRep.dispose();
                                break;
                        }
                    }
                })
                .build();
    }

    public void setUsuario(String dato) {
        this.dato = dato;
        recepcionistaJL.setText(dato);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        recepcionistaJL = new javax.swing.JLabel();
        LoginLogo = new FondoPanel2();
        jLabel2 = new javax.swing.JLabel();
        botonMenu = new javax.swing.JButton();
        panelDeLista = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botonEditar = new javax.swing.JButton();
        numeroIdentificacionJL = new javax.swing.JLabel();
        nombreJL = new javax.swing.JLabel();
        telefonoJL = new javax.swing.JLabel();
        direccionJL = new javax.swing.JLabel();
        numeroIdentificacionTF = new javax.swing.JTextField();
        nombreTF = new javax.swing.JTextField();
        telefonoTF = new javax.swing.JTextField();
        inscripcionJL = new javax.swing.JLabel();
        apellidoPaternoTF = new javax.swing.JTextField();
        apellidoPaternoJL = new javax.swing.JLabel();
        apellidoMaternoJL = new javax.swing.JLabel();
        apellidoMaternoTF = new javax.swing.JTextField();
        inscripcionTF = new javax.swing.JTextField();
        contactoEmergenciaJL = new javax.swing.JLabel();
        contactoEmergenciaTF = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();
        contactoEmergenciaJL1 = new javax.swing.JLabel();
        estatusCbx = new javax.swing.JComboBox<>();
        calleTF = new javax.swing.JTextField();
        numeroTF = new javax.swing.JTextField();
        coloniaTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(9, 17, 43));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 70));

        recepcionistaJL.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 2, 18)); // NOI18N
        recepcionistaJL.setForeground(new java.awt.Color(255, 255, 255));
        recepcionistaJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
        jLabel2.setText("Editar Socios");

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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(recepcionistaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(recepcionistaJL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        panelDeLista.setMinimumSize(new java.awt.Dimension(600, 540));
        panelDeLista.setPreferredSize(new java.awt.Dimension(600, 540));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Datos del Socio");

        botonEditar.setBackground(new java.awt.Color(166, 44, 26));
        botonEditar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 12)); // NOI18N
        botonEditar.setForeground(new java.awt.Color(255, 255, 255));
        botonEditar.setText("Editar");
        botonEditar.setBorder(null);
        botonEditar.setBorderPainted(false);
        botonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEditar.setMaximumSize(new java.awt.Dimension(70, 30));
        botonEditar.setMinimumSize(new java.awt.Dimension(70, 30));
        botonEditar.setPreferredSize(new java.awt.Dimension(70, 30));
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        numeroIdentificacionJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        numeroIdentificacionJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroIdentificacionJL.setText("Número de Identificación");
        numeroIdentificacionJL.setPreferredSize(new java.awt.Dimension(170, 20));

        nombreJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        nombreJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJL.setText("Nombre");
        nombreJL.setPreferredSize(new java.awt.Dimension(60, 20));

        telefonoJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        telefonoJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefonoJL.setText("Teléfono");
        telefonoJL.setPreferredSize(new java.awt.Dimension(70, 20));

        direccionJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        direccionJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        direccionJL.setText("Dirección");
        direccionJL.setPreferredSize(new java.awt.Dimension(60, 20));

        numeroIdentificacionTF.setEditable(false);
        numeroIdentificacionTF.setMinimumSize(new java.awt.Dimension(60, 30));
        numeroIdentificacionTF.setPreferredSize(new java.awt.Dimension(60, 30));

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

        inscripcionJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        inscripcionJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inscripcionJL.setText("Fecha de Inscripcion");
        inscripcionJL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inscripcionJL.setPreferredSize(new java.awt.Dimension(100, 20));

        apellidoPaternoTF.setBackground(new java.awt.Color(242, 242, 242));
        apellidoPaternoTF.setMinimumSize(new java.awt.Dimension(60, 30));
        apellidoPaternoTF.setPreferredSize(new java.awt.Dimension(60, 30));
        apellidoPaternoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoPaternoTFKeyTyped(evt);
            }
        });

        apellidoPaternoJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        apellidoPaternoJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apellidoPaternoJL.setText("Apellido Paterno");
        apellidoPaternoJL.setPreferredSize(new java.awt.Dimension(60, 20));

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

        inscripcionTF.setEditable(false);
        inscripcionTF.setMinimumSize(new java.awt.Dimension(60, 30));
        inscripcionTF.setName(""); // NOI18N
        inscripcionTF.setPreferredSize(new java.awt.Dimension(60, 30));
        inscripcionTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inscripcionTFKeyTyped(evt);
            }
        });

        contactoEmergenciaJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        contactoEmergenciaJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactoEmergenciaJL.setText("Contacto de Emergencia");
        contactoEmergenciaJL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        contactoEmergenciaJL.setPreferredSize(new java.awt.Dimension(100, 20));

        contactoEmergenciaTF.setBackground(new java.awt.Color(242, 242, 242));
        contactoEmergenciaTF.setMinimumSize(new java.awt.Dimension(60, 30));
        contactoEmergenciaTF.setPreferredSize(new java.awt.Dimension(60, 30));
        contactoEmergenciaTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactoEmergenciaTFKeyTyped(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(166, 44, 26));
        botonEliminar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 12)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("Eliminar");
        botonEliminar.setBorder(null);
        botonEliminar.setBorderPainted(false);
        botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminar.setMaximumSize(new java.awt.Dimension(70, 30));
        botonEliminar.setMinimumSize(new java.awt.Dimension(70, 30));
        botonEliminar.setPreferredSize(new java.awt.Dimension(70, 30));
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        contactoEmergenciaJL1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        contactoEmergenciaJL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactoEmergenciaJL1.setText("Estatus");
        contactoEmergenciaJL1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        contactoEmergenciaJL1.setPreferredSize(new java.awt.Dimension(100, 20));

        estatusCbx.setBackground(new java.awt.Color(242, 242, 242));
        estatusCbx.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estatusCbx.setMinimumSize(new java.awt.Dimension(60, 30));
        estatusCbx.setPreferredSize(new java.awt.Dimension(60, 30));

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

        javax.swing.GroupLayout panelDeListaLayout = new javax.swing.GroupLayout(panelDeLista);
        panelDeLista.setLayout(panelDeListaLayout);
        panelDeListaLayout.setHorizontalGroup(
            panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeListaLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeListaLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(apellidoMaternoJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoPaternoJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionJL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(apellidoPaternoTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(apellidoMaternoTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(telefonoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDeListaLayout.createSequentialGroup()
                                .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coloniaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDeListaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDeListaLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(inscripcionJL, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(inscripcionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelDeListaLayout.createSequentialGroup()
                                        .addComponent(contactoEmergenciaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(contactoEmergenciaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelDeListaLayout.createSequentialGroup()
                                    .addComponent(contactoEmergenciaJL1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(estatusCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelDeListaLayout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDeListaLayout.createSequentialGroup()
                        .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreJL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroIdentificacionJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeroIdentificacionTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreTF, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addGap(76, 76, 76))
        );
        panelDeListaLayout.setVerticalGroup(
            panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeListaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroIdentificacionJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroIdentificacionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoPaternoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoPaternoJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoMaternoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoMaternoJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccionJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeListaLayout.createSequentialGroup()
                        .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coloniaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscripcionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inscripcionJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactoEmergenciaJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactoEmergenciaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactoEmergenciaJL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estatusCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(panelDeLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDeLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        String estatusLocal = id_estatus();
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            //pst = con.prepareStatement("UPDATE SOCIOS SET DIRECCION='" + calleTF.getText() + ", " + numeroTF.getText() + ", " + coloniaTF.getText() + "', ID_ESTATUS_FK='" + estatusLocal + "', NOMBRE='" + nombreTF.getText() + "', APELLIDO_P='" + apellidoPaternoTF.getText() + "', APELLIDO_M='" + apellidoMaternoTF.getText() + "', TELEFONO='" + telefonoTF.getText() + "', NUM_EMERGENCIA='" + contactoEmergenciaTF.getText() + "', INSCRIPCION='" + inscripcionTF.getText() + "' WHERE ID_SOCIO='" + numeroIdentificacionTF.getText() + "'");
            pst = con.prepareStatement("UPDATE SOCIOS SET DIRECCION=?, ID_ESTATUS_FK=? , NOMBRE= ?, APELLIDO_P= ?, APELLIDO_M= ?, TELEFONO= ?, NUM_EMERGENCIA= ?, INSCRIPCION= ? WHERE ID_SOCIO=? ");
            if (calleTF.getText().equals("") || numeroTF.getText().equals("") || coloniaTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba la direccion completa del socio");
            } else {
                pst.setString(1, calleTF.getText() + ", " + numeroTF.getText() + ", " + coloniaTF.getText());
            }
            pst.setString(2, estatusLocal);
            if (nombreTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el nombre del socio");
            } else {
                pst.setString(3, nombreTF.getText());
            }
            if (apellidoPaternoTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el apellido paterno del socio");
            } else {
                pst.setString(4, apellidoPaternoTF.getText());
            }
            if (apellidoMaternoTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el apellido materno del socio");
            } else {
                pst.setString(5, apellidoMaternoTF.getText());
            }
            if (telefonoTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el numero de telefono del socio");
            } else {
                pst.setString(6, telefonoTF.getText());
            }
            if (contactoEmergenciaTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el numero del contacto de emergencia del socio");
            } else {
                pst.setString(7, contactoEmergenciaTF.getText());
            }
            pst.setString(8, inscripcionTF.getText());
            pst.setString(9, numeroIdentificacionTF.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos del socio modificados");
            this.dispose();
            AdministrarSociosRecepcionista mf2 = new AdministrarSociosRecepcionista();
            mf2.setUsuario(dato);
            mf2.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar los dtos del socio, revise la informacion");
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            String sql = "DELETE FROM SOCIOS WHERE ID_SOCIO=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, numeroIdentificacionTF.getText());
            if (numeroIdentificacionTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione un socio en la ventana anterior");
            } else {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos Eliminados");
            }
            numeroIdentificacionTF.setText("");
            nombreTF.setText("");
            apellidoPaternoTF.setText("");
            apellidoMaternoTF.setText("");
            telefonoTF.setText("");
            contactoEmergenciaTF.setText("");
            calleTF.setText("");
            numeroTF.setText("");
            coloniaTF.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar el socio, revise la infromación");
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void apellidoPaternoTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoPaternoTFKeyTyped
        // TODO add your handling code here:
        if (apellidoPaternoTF.getText().length() == 20) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if ((c < 'A' || c > 'Z')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_apellidoPaternoTFKeyTyped

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

    private void inscripcionTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inscripcionTFKeyTyped
        // TODO add your handling code here:
        if (inscripcionTF.getText().length() == 10) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();

            if ((c < '0' || c > '9') && (c < '/' || c > '/')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_inscripcionTFKeyTyped

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarSocioRecepcionista().setVisible(true);
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

    private void rellenarCbxEstatus() {
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "MILLENNIUM2", "MILLENNIUM2");
            pst = con.prepareStatement("SELECT ESTATUS FROM ESTATUS ORDER BY ID_ESTATUS ASC");
            rs = pst.executeQuery();

            while (rs.next()) {
                var es = rs.getString("ESTATUS");
                estatusCbx.addItem(es);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private String id_estatus() {
        String id = "";
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            String sql = "SELECT ID_ESTATUS FROM ESTATUS WHERE ID_ESTATUS=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, estatusCbx.getSelectedIndex() + 1);
            rs = pst.executeQuery();

            while (rs.next()) {
                id = rs.getString("ID_ESTATUS");
            }
            return id;
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginLogo;
    private javax.swing.JLabel apellidoMaternoJL;
    private javax.swing.JTextField apellidoMaternoTF;
    private javax.swing.JLabel apellidoPaternoJL;
    private javax.swing.JTextField apellidoPaternoTF;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonMenu;
    private javax.swing.JTextField calleTF;
    private javax.swing.JTextField coloniaTF;
    private javax.swing.JLabel contactoEmergenciaJL;
    private javax.swing.JLabel contactoEmergenciaJL1;
    private javax.swing.JTextField contactoEmergenciaTF;
    private javax.swing.JLabel direccionJL;
    private javax.swing.JComboBox<String> estatusCbx;
    private javax.swing.JLabel inscripcionJL;
    private javax.swing.JTextField inscripcionTF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JLabel numeroIdentificacionJL;
    private javax.swing.JTextField numeroIdentificacionTF;
    private javax.swing.JTextField numeroTF;
    private javax.swing.JPanel panelDeLista;
    private javax.swing.JLabel recepcionistaJL;
    private javax.swing.JLabel telefonoJL;
    private javax.swing.JTextField telefonoTF;
    // End of variables declaration//GEN-END:variables
}
