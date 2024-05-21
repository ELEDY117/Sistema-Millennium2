package millennium2;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javaswingdev.drawer.Drawer;
import java.sql.DriverManager;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edy11
 */
public class PagoMensualidad extends javax.swing.JFrame {

    DrawerController drawer;
    PagoMensualidad paMen = this;
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    private String dato = "";
    public static String id_Socio_fk = "";
    public static String cantidad = "";
    public static String fecha = "";

    public PagoMensualidad() {
        initComponents();
        this.setLocationRelativeTo(null);
        actualizarTabla();
        fechaTF.setText(fecha());
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
                                AdministrarSocios mf2 = new AdministrarSocios();
                                mf2.setVisible(true);
                                paMen.dispose();
                                break;
                            case 1:
                                Administrador mf = new Administrador();
                                mf.setVisible(true);
                                paMen.dispose();
                                break;

                        }
                    }
                }).build();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        numeroSocio = new javax.swing.JPanel();
        generarReporteJL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fechaJL = new javax.swing.JLabel();
        fechaTF = new javax.swing.JTextField();
        precioJL = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        fechaJL1 = new javax.swing.JLabel();
        numeroSocioTF = new javax.swing.JTextField();
        pagoTF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPagos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LoginLogo = new FondoPanel2();
        reporteJL = new javax.swing.JLabel();
        botonMenu = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 650));

        numeroSocio.setPreferredSize(new java.awt.Dimension(500, 400));

        generarReporteJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 18)); // NOI18N
        generarReporteJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generarReporteJL.setText("Pagos");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Datos del Pago");

        fechaJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        fechaJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaJL.setText("Fecha");
        fechaJL.setPreferredSize(new java.awt.Dimension(60, 20));

        fechaTF.setEditable(false);
        fechaTF.setMinimumSize(new java.awt.Dimension(60, 30));
        fechaTF.setPreferredSize(new java.awt.Dimension(60, 30));

        precioJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        precioJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precioJL.setText("Precio");
        precioJL.setPreferredSize(new java.awt.Dimension(60, 20));

        botonIngresar.setBackground(new java.awt.Color(166, 44, 26));
        botonIngresar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 12)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar.setText("Pagar");
        botonIngresar.setBorder(null);
        botonIngresar.setBorderPainted(false);
        botonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresar.setMaximumSize(new java.awt.Dimension(70, 30));
        botonIngresar.setMinimumSize(new java.awt.Dimension(70, 30));
        botonIngresar.setPreferredSize(new java.awt.Dimension(80, 30));
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        botonEditar.setBackground(new java.awt.Color(166, 44, 26));
        botonEditar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 12)); // NOI18N
        botonEditar.setForeground(new java.awt.Color(255, 255, 255));
        botonEditar.setText("Actualizar Precios");
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

        fechaJL1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 14)); // NOI18N
        fechaJL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaJL1.setText("Numero de Socio");
        fechaJL1.setPreferredSize(new java.awt.Dimension(60, 20));

        numeroSocioTF.setBackground(new java.awt.Color(242, 242, 242));
        numeroSocioTF.setMinimumSize(new java.awt.Dimension(60, 30));
        numeroSocioTF.setPreferredSize(new java.awt.Dimension(60, 30));
        numeroSocioTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroSocioTFKeyTyped(evt);
            }
        });

        pagoTF.setEditable(false);
        pagoTF.setText("450");
        pagoTF.setMinimumSize(new java.awt.Dimension(60, 30));
        pagoTF.setPreferredSize(new java.awt.Dimension(60, 30));

        tblPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero de Socio", "Cantidad", "Fecha"
            }
        ));
        jScrollPane2.setViewportView(tblPagos);

        javax.swing.GroupLayout numeroSocioLayout = new javax.swing.GroupLayout(numeroSocio);
        numeroSocio.setLayout(numeroSocioLayout);
        numeroSocioLayout.setHorizontalGroup(
            numeroSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numeroSocioLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(numeroSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(numeroSocioLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(numeroSocioLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(numeroSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(numeroSocioLayout.createSequentialGroup()
                                .addComponent(precioJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pagoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(numeroSocioLayout.createSequentialGroup()
                                .addComponent(fechaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(numeroSocioLayout.createSequentialGroup()
                                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(numeroSocioLayout.createSequentialGroup()
                        .addComponent(fechaJL1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numeroSocioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
            .addGroup(numeroSocioLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(generarReporteJL, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        numeroSocioLayout.setVerticalGroup(
            numeroSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numeroSocioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(generarReporteJL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numeroSocioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(numeroSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaJL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroSocioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(numeroSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(numeroSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(numeroSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        jPanel1.setBackground(new java.awt.Color(9, 17, 43));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 70));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        reporteJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 18)); // NOI18N
        reporteJL.setForeground(new java.awt.Color(255, 255, 255));
        reporteJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reporteJL.setText("Pago de Mensualidad");

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
                .addComponent(reporteJL, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reporteJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LoginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(numeroSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(numeroSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

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
        // TODO add your handling code here:
        String nuevoPago = JOptionPane.showInputDialog("Ingrese un nuevo precio: ");
        pagoTF.setText(nuevoPago);
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        //INSERT DE PAGO
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            String sql1 = "INSERT INTO PAGOS(ID_SOCIO_FK, CANTIDAD, FECHA) VALUES(?,?,?)";
            pst = con.prepareStatement(sql1);
            if (numeroSocioTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el numero de identificacion del socio");
            } else {
                pst.setString(1, numeroSocioTF.getText());
            }
            if (pagoTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "");
            } else {
                pst.setString(2, pagoTF.getText());
            }
            pst.setString(3, fecha());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago ingresado exitosamente");
            actualizarTabla();
        } catch (SQLException ex) {
            switch (ex.getErrorCode()) {
                case 1400 ->
                    JOptionPane.showMessageDialog(null, "Ningun campo puede quedar vacio");

                default ->
                    JOptionPane.showMessageDialog(null, "No se ha podido completar la acción, revise la información");
            }
        }

        //UPDATE PARA ESTATUS
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            String sql1 = "UPDATE SOCIOS SET ID_ESTATUS_FK = '1' WHERE ID_SOCIO = ?";
            pst = con.prepareStatement(sql1);
            pst.setString(1, numeroSocioTF.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Estado del socio modificado");

        } catch (SQLException ex) {
            switch (ex.getErrorCode()) {

                default ->
                    JOptionPane.showMessageDialog(null, "No se ha podido completar la accion, revise la información");
            }
        }
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void numeroSocioTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroSocioTFKeyTyped
        if (numeroSocioTF.getText().length() == 6) {
            evt.consume();
        } else {
            char c = evt.getKeyChar();
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_numeroSocioTFKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagoMensualidad().setVisible(true);
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

    public void actualizarTabla() {
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            String sql = "SELECT ID_SOCIO_FK, CANTIDAD, TO_CHAR(FECHA, 'DD/MM/YYYY') FROM PAGOS";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            DefaultTableModel tblModel = (DefaultTableModel) tblPagos.getModel();
            tblModel.setRowCount(0);

            while (rs.next()) {
                String id_Socio_fk = rs.getString("ID_SOCIO_FK");
                String cantidad = rs.getString("CANTIDAD");
                String fecha = rs.getString(3).substring(0, 10);

                String tbData[] = {id_Socio_fk, cantidad, fecha};

                tblModel.addRow(tbData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public void rellenarPagos() {
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            String sql = "SELECT ID_SOCIO_FK, CANTIDAD, FECHA,FROM PAGOS";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);

            while (rs.next()) {
                id_Socio_fk = rs.getString("ID_SOCIO");
                cantidad = rs.getString("CANTIDAD");
                fecha = rs.getString("FECHA");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }

    private String fecha() {
        LocalDate fechaActual = LocalDate.now();

        // Crear un formateador para el formato DD/MM/AAAA
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatear la fecha
        String fechaFormateada = fechaActual.format(formateador);

        return fechaFormateada;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginLogo;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonMenu;
    private javax.swing.JLabel fechaJL;
    private javax.swing.JLabel fechaJL1;
    private javax.swing.JTextField fechaTF;
    private javax.swing.JLabel generarReporteJL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel numeroSocio;
    private javax.swing.JTextField numeroSocioTF;
    private javax.swing.JTextField pagoTF;
    private javax.swing.JLabel precioJL;
    private javax.swing.JLabel reporteJL;
    private javax.swing.JTable tblPagos;
    // End of variables declaration//GEN-END:variables
}
