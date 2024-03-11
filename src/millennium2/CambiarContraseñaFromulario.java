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
public class CambiarContraseñaFromulario extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public CambiarContraseñaFromulario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static String usuario="";

    public Connection conexion() {
        try {   //Creamos e iniciamos nuestra conexión hacia nuestra base de datos llamada MILLENNIUM2
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "MILLENNIUM2", "MILLENNIUM2");
            //Declaramos una variable String llamada sql donde escribiremos la sentencia select para hacer una busqueda
            //del usuario y la contraseña que se ingrese en el login
            String sql = "SELECT * FROM USUARIOS WHERE NOMBREUSUARIO=? AND CONTRASENA=?";
            pst = con.prepareStatement(sql);
            //Al ingresar los datos del usuario se traeran los datos escritos en los campos y se mandaran dentro de la variable 
            //de nuestra sentencia SQL.
            pst.setString(1, numeroUsuarioTF.getText());
            pst.setString(2, passwordTF.getText());
            //con este mandamos a ejecutar el query sql dentro de nuestra base de datos
            rs = pst.executeQuery();
            //Si los datos ingresados son correctos nos mostrará el siguiente mensaje
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión correcto");
                //Despues de iniciar correctamente abrira la siguiente ventana del tipo de usuario que le corresponda
                Administrador mf = new Administrador();
                mf.setVisible(true);

                this.dispose();
            } //en caso contrario si no son correctos nos mostrará lo siguiente y se limpiaran los campos del login.
            else {
                JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos");
                numeroUsuarioTF.setText("");
                passwordTF.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return con;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        numeroUsuarioTF = new javax.swing.JTextField();
        numeroUsuarioJL = new javax.swing.JLabel();
        passwordTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cambiarContraseñaBtn = new javax.swing.JButton();
        confirmarContraseñaTF = new javax.swing.JTextField();
        confirmarContraseñaJL = new javax.swing.JLabel();
        iniciarSesionBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(166, 44, 26));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 250));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cambiar Contraseña");
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

        numeroUsuarioTF.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 12)); // NOI18N
        numeroUsuarioTF.setBorder(null);
        numeroUsuarioTF.setPreferredSize(new java.awt.Dimension(200, 30));

        numeroUsuarioJL.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        numeroUsuarioJL.setForeground(new java.awt.Color(255, 255, 255));
        numeroUsuarioJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroUsuarioJL.setText("Numero del Usuario");

        passwordTF.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 12)); // NOI18N
        passwordTF.setBorder(null);
        passwordTF.setPreferredSize(new java.awt.Dimension(200, 30));
        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nueva Contraseña");

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

        confirmarContraseñaTF.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 12)); // NOI18N
        confirmarContraseñaTF.setBorder(null);
        confirmarContraseñaTF.setPreferredSize(new java.awt.Dimension(200, 30));
        confirmarContraseñaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarContraseñaTFActionPerformed(evt);
            }
        });

        confirmarContraseñaJL.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        confirmarContraseñaJL.setForeground(new java.awt.Color(255, 255, 255));
        confirmarContraseñaJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmarContraseñaJL.setText("Confirma la Contraseña");

        iniciarSesionBtn.setBackground(new java.awt.Color(166, 44, 26));
        iniciarSesionBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 12)); // NOI18N
        iniciarSesionBtn.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSesionBtn.setText("Iniciar Sesion");
        iniciarSesionBtn.setBorder(null);
        iniciarSesionBtn.setBorderPainted(false);
        iniciarSesionBtn.setContentAreaFilled(false);
        iniciarSesionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarSesionBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        iniciarSesionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numeroUsuarioJL, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroUsuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmarContraseñaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(confirmarContraseñaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciarSesionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiarContraseñaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numeroUsuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroUsuarioJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmarContraseñaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmarContraseñaJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cambiarContraseñaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iniciarSesionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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

    private void cambiarContraseñaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContraseñaBtnActionPerformed
        
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "MILLENNIUM2", "MILLENNIUM2");
            // pst = con.prepareStatement("UPDATE USUARIOS SET CONTRASENA='" + passwordTF.getText() + "' WHERE ID_USUARIOS='" + numeroUsuarioTF.getText() + "'");
            String sql = "UPDATE USUARIOS SET CONTRASENA=? WHERE ID_USUARIOS=?";
            pst = con.prepareStatement(sql);
            if(passwordTF.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese la nueva contraseña");
            }else{
            pst.setString(1, passwordTF.getText());
            }
            if(confirmarContraseñaTF.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Confirme la nueva contraseña");
            }
            if(numeroUsuarioTF.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese el numero de identificacion del usuario");
            }else{
            pst.setString(2, numeroUsuarioTF.getText());
            }
            if(passwordTF.getText().equals(confirmarContraseñaTF.getText())){
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contraseña del usuario modificada");
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar los datos del usuario, revise la informacion");
        }
    }//GEN-LAST:event_cambiarContraseñaBtnActionPerformed

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFActionPerformed

    private void confirmarContraseñaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarContraseñaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarContraseñaTFActionPerformed

    private void iniciarSesionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionBtnActionPerformed
        // TODO add your handling code here:
        InicioSesionFormulario ventana = new InicioSesionFormulario();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iniciarSesionBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarContraseñaFromulario().setVisible(true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiarContraseñaBtn;
    private javax.swing.JLabel confirmarContraseñaJL;
    private javax.swing.JTextField confirmarContraseñaTF;
    private javax.swing.JButton iniciarSesionBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel numeroUsuarioJL;
    private javax.swing.JTextField numeroUsuarioTF;
    private javax.swing.JTextField passwordTF;
    // End of variables declaration//GEN-END:variables
}
