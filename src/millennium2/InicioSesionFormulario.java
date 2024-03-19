package millennium2;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author edy11
 */
public class InicioSesionFormulario extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    
    
    public InicioSesionFormulario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Connection conexion() {
        try {   //Creamos e iniciamos nuestra conexión hacia nuestra base de datos llamada Millennium2
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "MILLENNIUM2", "MILLENNIUM2");
            //Declaramos una variable String llamada sql donde escribiremos la sentencia select para hacer una busqueda del usuario y la contraseña que se ingrese en el login
            String sql = "SELECT * FROM USUARIOS WHERE NOMBREUSUARIO=? AND CONTRASENA=?";
            String sql2 = "SELECT id_TIPOUSUARIO FROM USUARIOS,TIPO_USUARIOS WHERE NOMBREUSUARIO=? AND CONTRASENA=? AND USUARIOS.Tipo_Usuario_fk = TIPO_USUARIOS.id_TipoUsuario";
            pst = con.prepareStatement(sql);
            pst2 = con.prepareStatement(sql2);
            //Al ingresar los datos del usuario se traeran los datos escritos en los campos y se mandaran dentro de la variable de nuestra sentencia SQL.
            if(usuarioTF.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese el nombre del usuario");
            }else{
                pst.setString(1, usuarioTF.getText());
                pst2.setString(1, usuarioTF.getText());
            }
            if(passwordPF.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese la contraseña");
            }else{
                pst.setString(2, passwordPF.getText());
                pst2.setString(2, passwordPF.getText());
            }
            //con este mandamos a ejecutar el query sql dentro de nuestra base de datos
            if (validar() == 1) {
            rs = pst.executeQuery();
            rs2 = pst2.executeQuery();
            }else{
                JOptionPane.showMessageDialog(null, "Usuario inexistente, verifique el nombre del usuario");
            }
            //Si los datos ingresados son correctos nos mostrará el siguiente mensaje
            if (rs.next()) {
                while(rs2.next()){
                    var tipoUsuario = rs2.getString("ID_TIPOUSUARIO");
                    if(tipoUsuario.equals("1")){ 
                        JOptionPane.showMessageDialog(null, "Inicio de sesión correcto");
                        Administrador mf = new Administrador();
                        mf.setUsuario(usuarioTF.getText());
                        mf.setVisible(true);
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Inicio de sesión correcto");
                        Recepcionista mf = new Recepcionista();
                        mf.setUsuario(usuarioTF.getText());
                        mf.setVisible(true);
                        this.dispose();
                    }
                }
            } else{
                    JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos");
                    usuarioTF.setText("");
                    passwordPF.setText("");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, no pudo iniciarse la sesion");
        }
        return con;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        usuarioTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iniciarSesiónBtn = new javax.swing.JButton();
        cambiarContraseñaBtn = new javax.swing.JButton();
        passwordPF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(166, 44, 26));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 250));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        jLabel3.setPreferredSize(new java.awt.Dimension(140, 30));

        loginPanel = new FondoPanelLogin();

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        usuarioTF.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 12)); // NOI18N
        usuarioTF.setBorder(null);
        usuarioTF.setPreferredSize(new java.awt.Dimension(200, 30));
        usuarioTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Usuario");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contraseña");

        iniciarSesiónBtn.setBackground(new java.awt.Color(166, 44, 26));
        iniciarSesiónBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 12)); // NOI18N
        iniciarSesiónBtn.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSesiónBtn.setText("Iniciar Sesión");
        iniciarSesiónBtn.setBorder(null);
        iniciarSesiónBtn.setBorderPainted(false);
        iniciarSesiónBtn.setContentAreaFilled(false);
        iniciarSesiónBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarSesiónBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        iniciarSesiónBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesiónBtnActionPerformed(evt);
            }
        });
        iniciarSesiónBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iniciarSesiónBtnKeyPressed(evt);
            }
        });

        cambiarContraseñaBtn.setBackground(new java.awt.Color(166, 44, 26));
        cambiarContraseñaBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 12)); // NOI18N
        cambiarContraseñaBtn.setForeground(new java.awt.Color(255, 255, 255));
        cambiarContraseñaBtn.setText("Cambiar Contraseña");
        cambiarContraseñaBtn.setBorder(null);
        cambiarContraseñaBtn.setBorderPainted(false);
        cambiarContraseñaBtn.setContentAreaFilled(false);
        cambiarContraseñaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarContraseñaBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        cambiarContraseñaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContraseñaBtnActionPerformed(evt);
            }
        });

        passwordPF.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 12)); // NOI18N
        passwordPF.setBorder(null);
        passwordPF.setPreferredSize(new java.awt.Dimension(200, 30));
        passwordPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(usuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(94, 94, 94))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(iniciarSesiónBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(76, 76, 76))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(cambiarContraseñaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iniciarSesiónBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cambiarContraseñaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarSesiónBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesiónBtnActionPerformed
        conexion();
    }//GEN-LAST:event_iniciarSesiónBtnActionPerformed

    private void cambiarContraseñaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContraseñaBtnActionPerformed
        CambiarContraseñaFromulario mf = new CambiarContraseñaFromulario();
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cambiarContraseñaBtnActionPerformed

    private void passwordPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordPFActionPerformed
        conexion();
    }//GEN-LAST:event_passwordPFActionPerformed

    private void iniciarSesiónBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iniciarSesiónBtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarSesiónBtnKeyPressed

    private void usuarioTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTFActionPerformed
        // TODO add your handling code here:
        conexion();
    }//GEN-LAST:event_usuarioTFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesionFormulario().setVisible(true);
            }
        });
    }
    
    class FondoPanelLogin extends JPanel{
        private Image imagen;
        
        @Override
        public void paint (Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/LoginIcon.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    
    public int validar() {
        int bandera = 1;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            String sql = "SELECT NOMBREUSUARIO FROM USUARIOS WHERE NOMBREUSUARIO=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, usuarioTF.getText());
            rs = pst.executeQuery();
            if (rs.next() == false) {
                bandera = 0;
            }
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return bandera;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiarContraseñaBtn;
    private javax.swing.JButton iniciarSesiónBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JTextField usuarioTF;
    // End of variables declaration//GEN-END:variables
}
