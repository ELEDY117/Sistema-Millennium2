package millennium2;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author edy11
 */
public class Reporte extends javax.swing.JFrame {

    DrawerController drawer;
    Reporte re = this;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private String dato = "";

    public Reporte() {
        initComponents();
        this.setLocationRelativeTo(null);
       //this.setExtendedState(this.MAXIMIZED_BOTH);
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
                                re.dispose();
                                break;
                            case 1:
                                Administrador mf = new Administrador();
                                mf.setUsuario(dato);
                                mf.setVisible(true);
                                re.dispose();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        panelDeLista = new javax.swing.JPanel();
        generarReporteJL = new javax.swing.JLabel();
        botonGenerar = new javax.swing.JButton();
        primeraFcehaJL = new javax.swing.JLabel();
        tipoReporteCbx = new javax.swing.JComboBox<>();
        botonGenerarPDF = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaReporte = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        administradorJL = new javax.swing.JLabel();
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

        panelDeLista.setPreferredSize(new java.awt.Dimension(700, 400));

        generarReporteJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 18)); // NOI18N
        generarReporteJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generarReporteJL.setText("Generar Reporte");

        botonGenerar.setBackground(new java.awt.Color(166, 44, 26));
        botonGenerar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 12)); // NOI18N
        botonGenerar.setForeground(new java.awt.Color(255, 255, 255));
        botonGenerar.setText("Generar");
        botonGenerar.setBorder(null);
        botonGenerar.setMaximumSize(new java.awt.Dimension(70, 30));
        botonGenerar.setMinimumSize(new java.awt.Dimension(70, 30));
        botonGenerar.setPreferredSize(new java.awt.Dimension(70, 30));
        botonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarActionPerformed(evt);
            }
        });

        primeraFcehaJL.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        primeraFcehaJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        primeraFcehaJL.setText("Tipo Reporte");
        primeraFcehaJL.setPreferredSize(new java.awt.Dimension(60, 20));

        tipoReporteCbx.setBackground(new java.awt.Color(242, 242, 242));
        tipoReporteCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reporte de inscripciones", "Reporte de socios al dia", "Reporte de socios pendiente", "Reporte de visitas", "Reporte de Pagos de Mensualidad" }));
        tipoReporteCbx.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tipoReporteCbx.setMinimumSize(new java.awt.Dimension(60, 30));
        tipoReporteCbx.setPreferredSize(new java.awt.Dimension(60, 30));

        botonGenerarPDF.setBackground(new java.awt.Color(166, 44, 26));
        botonGenerarPDF.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 12)); // NOI18N
        botonGenerarPDF.setForeground(new java.awt.Color(255, 255, 255));
        botonGenerarPDF.setText("Generar PDF");
        botonGenerarPDF.setBorder(null);
        botonGenerarPDF.setMaximumSize(new java.awt.Dimension(70, 30));
        botonGenerarPDF.setMinimumSize(new java.awt.Dimension(70, 30));
        botonGenerarPDF.setPreferredSize(new java.awt.Dimension(70, 30));
        botonGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarPDFActionPerformed(evt);
            }
        });

        tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Dato del Reporte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaReporte);
        if (tablaReporte.getColumnModel().getColumnCount() > 0) {
            tablaReporte.getColumnModel().getColumn(0).setResizable(false);
            tablaReporte.getColumnModel().getColumn(1).setResizable(false);
            tablaReporte.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout panelDeListaLayout = new javax.swing.GroupLayout(panelDeLista);
        panelDeLista.setLayout(panelDeListaLayout);
        panelDeListaLayout.setHorizontalGroup(
            panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeListaLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeListaLayout.createSequentialGroup()
                        .addComponent(generarReporteJL, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeListaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeListaLayout.createSequentialGroup()
                        .addComponent(primeraFcehaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoReporteCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeListaLayout.createSequentialGroup()
                        .addComponent(botonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
        );
        panelDeListaLayout.setVerticalGroup(
            panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeListaLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(generarReporteJL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoReporteCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primeraFcehaJL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDeListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

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

        reporteJL.setFont(new java.awt.Font("Microsoft YaHei UI Light", 2, 18)); // NOI18N
        reporteJL.setForeground(new java.awt.Color(255, 255, 255));
        reporteJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reporteJL.setText("Reporte");

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
                .addComponent(reporteJL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 488, Short.MAX_VALUE)
                .addComponent(administradorJL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LoginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(administradorJL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reporteJL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(panelDeLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(panelDeLista, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void botonGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarPDFActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF", "pdf");
        fileChooser.setFileFilter(filter);

        int seleccion = fileChooser.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            Document documento;
            FileOutputStream archivo;
            documento = new Document();
            String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath() + ".pdf";
            try {
                archivo = new FileOutputStream(rutaArchivo);
                PdfWriter.getInstance(documento, archivo);
                documento.open();
                PdfPTable tabla = new PdfPTable(3);
                PdfPCell id = new PdfPCell(new Phrase("ID"));
                PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
                PdfPCell datosdelreporte = new PdfPCell();
                switch (tipoReporteCbx.getSelectedIndex()) {
                    case 0 -> {
                        datosdelreporte = new PdfPCell(new Phrase("Fecha"));
                    }
                    case 1 -> {
                        datosdelreporte = new PdfPCell(new Phrase("Estatus"));
                    }
                    case 2 -> {
                        datosdelreporte = new PdfPCell(new Phrase("Estatus"));
                    }
                    case 3 -> {
                        datosdelreporte = new PdfPCell(new Phrase("Fecha"));
                    }
                    case 4 -> {
                        datosdelreporte = new PdfPCell(new Phrase("Fecha"));
                    }
                }
                tabla.addCell(id);
                tabla.addCell(nombre);
                tabla.addCell(datosdelreporte);
                for (int i = 0; i < tablaReporte.getRowCount(); i++) {
                    String placa1 = tablaReporte.getValueAt(i, 0).toString();
                    tabla.addCell(placa1);
                    tabla.addCell((String) tablaReporte.getValueAt(i, 1));
                    tabla.addCell((String) tablaReporte.getValueAt(i, 2));
                }
                documento.add(tabla);
                documento.close();
                JOptionPane.showMessageDialog(this, "Se ha creado el archivo PDF correctamente");
            } catch (DocumentException | FileNotFoundException ex) {
                Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /*JFileChooser fc = new JFileChooser();
        int seleccion = fc.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            Document documento;
            FileOutputStream archivo;
            documento = new Document();
            try {
                String nombreArchivo = "";
                nombreArchivo = fc.getName();
                archivo = new FileOutputStream(nombreArchivo);
                PdfWriter.getInstance(documento, archivo);
                documento.open();
                PdfPTable tabla = new PdfPTable(3);
                PdfPCell id = new PdfPCell(new Phrase("ID"));
                PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
                PdfPCell datosdelreporte = new PdfPCell();
                switch (tipoReporteCbx.getSelectedIndex()) {
                    case 0 -> {
                        datosdelreporte = new PdfPCell(new Phrase("Fecha"));
                    }
                    case 1 -> {
                        datosdelreporte = new PdfPCell(new Phrase("Estatus"));
                    }
                    case 2 -> {
                        datosdelreporte = new PdfPCell(new Phrase("Estatus"));
                    }
                    case 3 -> {
                        datosdelreporte = new PdfPCell(new Phrase("Fecha"));
                    }
                }
                tabla.addCell(id);
                tabla.addCell(nombre);
                tabla.addCell(datosdelreporte);
                for (int i = 0; i < tablaReporte.getRowCount(); i++) {
                    String placa1 = tablaReporte.getValueAt(i, 0).toString();
                    tabla.addCell(placa1);
                    tabla.addCell((String) tablaReporte.getValueAt(i, 1));
                    tabla.addCell((String) tablaReporte.getValueAt(i, 2));
                }
                documento.add(tabla);
                documento.close();
                JOptionPane.showMessageDialog(null, "Reporte creado Correctamente");

            } catch (DocumentException | FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }*/
    }//GEN-LAST:event_botonGenerarPDFActionPerformed

    private void botonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarActionPerformed
        // TODO add your handling code here:
        switch (tipoReporteCbx.getSelectedIndex()) {
            case 0 -> {
                try {
                    tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
                            new Object[][]{
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null}
                            },
                            new String[]{
                                "ID", "Nombre", "Fecha"
                            }
                    ) {
                        boolean[] canEdit = new boolean[]{
                            false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit[columnIndex];
                        }
                    });

                    String fecha1 = JOptionPane.showInputDialog(null, "Ingrese la fecha inicial: ", "Fecha inicial", JOptionPane.QUESTION_MESSAGE);
                    String fecha2 = JOptionPane.showInputDialog(null, "Ingrese la fecha final: ", "Fecha final", JOptionPane.QUESTION_MESSAGE);
                    con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
                    pst = con.prepareStatement("SELECT ID_SOCIO, NOMBRE, APELLIDO_P, APELLIDO_M, TO_CHAR(INSCRIPCION,'DD/MM/YYYY') FROM SOCIOS WHERE INSCRIPCION BETWEEN ? AND ? ORDER BY INSCRIPCION DESC");
                    pst.setString(1, fecha1);
                    pst.setString(2, fecha2);
                    rs = pst.executeQuery();
                    DefaultTableModel tblModel = (DefaultTableModel) tablaReporte.getModel();
                    tblModel.setRowCount(0);

                    while (rs.next()) {
                        String id_socio = rs.getString("ID_SOCIO");
                        String nombre = rs.getString("NOMBRE");
                        String paterno = rs.getString("APELLIDO_P");
                        String materno = rs.getString("APELLIDO_M");
                        String fecha = rs.getString(5).substring(0, 10);

                        String tbData[] = {id_socio, nombre + " " + paterno + " " + materno, fecha};
                        tblModel.addRow(tbData);

                    }

                } catch (NumberFormatException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese fechas validas para el reporte");
                }
            }
            case 1 -> {
                tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "ID", "Nombre", "Estatus"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });

                try {
                    con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
                    pst = con.prepareStatement("SELECT ID_SOCIO, NOMBRE, APELLIDO_P, APELLIDO_M, ESTATUS FROM SOCIOS, ESTATUS WHERE SOCIOS.ID_ESTATUS_FK = ESTATUS.ID_ESTATUS AND ID_ESTATUS = 1 ORDER BY ID_SOCIO ASC");
                    rs = pst.executeQuery();
                    DefaultTableModel tblModel = (DefaultTableModel) tablaReporte.getModel();
                    tblModel.setRowCount(0);

                    while (rs.next()) {
                        String id_socio = rs.getString("ID_SOCIO");
                        String nombre = rs.getString("NOMBRE");
                        String paterno = rs.getString("APELLIDO_P");
                        String materno = rs.getString("APELLIDO_M");
                        String fecha = rs.getString("ESTATUS");

                        String tbData[] = {id_socio, nombre + " " + paterno + " " + materno, fecha};

                        tblModel.addRow(tbData);

                    }

                } catch (NumberFormatException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
            case 2 -> {
                tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "ID", "Nombre", "Estatus"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });

                try {
                    System.out.println(tipoReporteCbx.getSelectedIndex());
                    con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
                    pst = con.prepareStatement("SELECT ID_SOCIO, NOMBRE, APELLIDO_P, APELLIDO_M, ESTATUS FROM SOCIOS, ESTATUS WHERE SOCIOS.ID_ESTATUS_FK = ESTATUS.ID_ESTATUS AND ID_ESTATUS = 2 ORDER BY ID_SOCIO ASC");
                    rs = pst.executeQuery();
                    DefaultTableModel tblModel = (DefaultTableModel) tablaReporte.getModel();
                    tblModel.setRowCount(0);

                    while (rs.next()) {
                        String id_socio = rs.getString("ID_SOCIO");
                        String nombre = rs.getString("NOMBRE");
                        String paterno = rs.getString("APELLIDO_P");
                        String materno = rs.getString("APELLIDO_M");
                        String fecha = rs.getString("ESTATUS");

                        String tbData[] = {id_socio, nombre + " " + paterno + " " + materno, fecha};

                        tblModel.addRow(tbData);

                    }

                } catch (NumberFormatException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
            case 3 -> {
                tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "ID", "Nombre", "Fecha"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                try {
                    String fecha1 = JOptionPane.showInputDialog(null, "Ingrese la fecha inicial: ", "Fecha inicial", JOptionPane.QUESTION_MESSAGE);
                    String fecha2 = JOptionPane.showInputDialog(null, "Ingrese la fecha final: ", "Fecha final", JOptionPane.QUESTION_MESSAGE);
                    con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
                    pst = con.prepareStatement("SELECT ID_VISITANTE, NOMBRE, APELLIDO_P, APELLIDO_M, TO_CHAR(FECHA_VISITA,'DD/MM/YYYY') FROM VISITAS WHERE FECHA_VISITA BETWEEN ? AND ? ORDER BY FECHA_VISITA DESC");
                    pst.setString(1, fecha1);
                    pst.setString(2, fecha2);
                    if (fecha1.equals("") && fecha2.equals("")) {
                        JOptionPane.showMessageDialog(null, "Escriba las fechas para el reporte");
                    } else {
                        rs = pst.executeQuery();
                    }
                    DefaultTableModel tblModel = (DefaultTableModel) tablaReporte.getModel();
                    tblModel.setRowCount(0);

                    while (rs.next()) {
                        String id_socio = rs.getString("ID_VISITANTE");
                        String nombre = rs.getString("NOMBRE");
                        String paterno = rs.getString("APELLIDO_P");
                        String materno = rs.getString("APELLIDO_M");
                        String fecha = rs.getString(5).substring(0, 10);

                        String tbData[] = {id_socio, nombre + " " + paterno + " " + materno, fecha};

                        tblModel.addRow(tbData);

                    }

                } catch (NumberFormatException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese fechas validas para el reporte");
                }
            }

            case 4 -> {
                tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "ID", "Nombre", "Fecha"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });

                try {
                    String fecha1 = JOptionPane.showInputDialog(null, "Ingrese la fecha inicial: ", "Fecha inicial", JOptionPane.QUESTION_MESSAGE);
                    String fecha2 = JOptionPane.showInputDialog(null, "Ingrese la fecha final: ", "Fecha final", JOptionPane.QUESTION_MESSAGE);
                    con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
                    pst = con.prepareStatement("SELECT ID_SOCIO_FK, NOMBRE, APELLIDO_P, APELLIDO_M, TO_CHAR(FECHA,'DD/MM/YYYY') FROM SOCIOS, PAGOS WHERE PAGOS.ID_SOCIO_FK = SOCIOS.ID_SOCIO AND FECHA BETWEEN ? AND ? ORDER BY FECHA DESC");
                    pst.setString(1, fecha1);
                    pst.setString(2, fecha2);
                    if (fecha1.equals("") && fecha2.equals("")) {
                        JOptionPane.showMessageDialog(null, "Escriba las fechas para el reporte");
                    } else {
                        rs = pst.executeQuery();
                    }
                    DefaultTableModel tblModel = (DefaultTableModel) tablaReporte.getModel();
                    tblModel.setRowCount(0);

                    while (rs.next()) {
                        String id_socio = rs.getString("ID_SOCIO_FK");
                        String nombre = rs.getString("NOMBRE");
                        String paterno = rs.getString("APELLIDO_P");
                        String materno = rs.getString("APELLIDO_M");
                        String fecha = rs.getString(5).substring(0, 10);

                        String tbData[] = {id_socio, nombre + " " + paterno + " " + materno, fecha};

                        tblModel.addRow(tbData);

                    }
                } catch (NumberFormatException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese fechas validas para el reporte");
                }
            }
        }
    }//GEN-LAST:event_botonGenerarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte().setVisible(true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginLogo;
    private javax.swing.JLabel administradorJL;
    private javax.swing.JButton botonGenerar;
    private javax.swing.JButton botonGenerarPDF;
    private javax.swing.JButton botonMenu;
    private javax.swing.JLabel generarReporteJL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelDeLista;
    private javax.swing.JLabel primeraFcehaJL;
    private javax.swing.JLabel reporteJL;
    private javax.swing.JTable tablaReporte;
    private javax.swing.JComboBox<String> tipoReporteCbx;
    // End of variables declaration//GEN-END:variables
}
