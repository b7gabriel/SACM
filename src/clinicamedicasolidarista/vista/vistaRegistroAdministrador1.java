/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicasolidarista.vista;

import clinicamedicasolidarista.ClinicaMedicaSolidarista;
import clinicamedicasolidarista.controlador.Controlador;
import clinicamedicasolidarista.modelo.usuario.Administrador;
import static clinicamedicasolidarista.vista.vistaRegistroAdministrador1.BORDER_ERROR;
import static clinicamedicasolidarista.vista.vistaRegistroAdministrador1.BORDER_RIGHT;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Angelica
 */
public class vistaRegistroAdministrador1 extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form vistaSolicitudCita
     */
    public vistaRegistroAdministrador1() {
        initComponents();
        this.txtCedulaAyuda.setVisible(false);
//    try {
//            formatoFecha();
//        } catch (ParseException ex) {
//            Logger.getLogger(vistaRegistroAdministrador.class.getName()).log(Level.SEVERE, null, ex);
//        }
     
    }
    public void formatoFecha() throws ParseException{
     MaskFormatter mascara = new MaskFormatter("##-##-####");
   
    } 
    public void setControl(Controlador c){
    c.registrarObservador(this);
    this.control=c;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textNombreAdmin = new javax.swing.JTextField();
        textSegundoApellidoadmin = new javax.swing.JTextField();
        textPrimerApellidoadmin = new javax.swing.JTextField();
        cmbIdentificacionadmin = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textConfirmarContraseñaadmin = new javax.swing.JPasswordField();
        textContraseñaadmin = new javax.swing.JPasswordField();
        textIdentificacionadmin = new javax.swing.JFormattedTextField();
        txtCedulaAyuda = new javax.swing.JTextField();
        btnEnviaradmin = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textConfirmarContraseñaadmin1 = new javax.swing.JPasswordField();
        textContraseñaadmin1 = new javax.swing.JPasswordField();
        tituloFormularioAdministradores = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        jDesktopPane6 = new javax.swing.JDesktopPane();
        jLabel29 = new javax.swing.JLabel();
        jDesktopPane7 = new javax.swing.JDesktopPane();
        jDesktopPane8 = new javax.swing.JDesktopPane();
        jLabel30 = new javax.swing.JLabel();
        jDesktopPane9 = new javax.swing.JDesktopPane();
        jDesktopPane10 = new javax.swing.JDesktopPane();
        jLabel31 = new javax.swing.JLabel();
        jDesktopPane11 = new javax.swing.JDesktopPane();
        jDesktopPane12 = new javax.swing.JDesktopPane();
        jLabel12 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jDesktopPane13 = new javax.swing.JDesktopPane();
        jDesktopPane14 = new javax.swing.JDesktopPane();
        jDesktopPane15 = new javax.swing.JDesktopPane();
        jDesktopPane16 = new javax.swing.JDesktopPane();
        jLabel32 = new javax.swing.JLabel();
        jDesktopPane17 = new javax.swing.JDesktopPane();
        jDesktopPane18 = new javax.swing.JDesktopPane();
        jLabel33 = new javax.swing.JLabel();
        jDesktopPane19 = new javax.swing.JDesktopPane();
        jDesktopPane20 = new javax.swing.JDesktopPane();
        jLabel34 = new javax.swing.JLabel();
        jDesktopPane21 = new javax.swing.JDesktopPane();
        jDesktopPane22 = new javax.swing.JDesktopPane();
        jLabel13 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACIÓN PERSONAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("NOMBRE");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel5.setText("PRIMER APELLIDO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel6.setText("SEGUNDO APELLIDO");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        jLabel7.setText("TIPO DE IDENTIFICACIÓN ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 99, -1, -1));

        jLabel8.setText("No DE IDENTIFICACIÓN ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        textNombreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreAdminActionPerformed(evt);
            }
        });
        textNombreAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreAdminKeyTyped(evt);
            }
        });
        jPanel2.add(textNombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 160, -1));

        textSegundoApellidoadmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSegundoApellidoadminKeyTyped(evt);
            }
        });
        jPanel2.add(textSegundoApellidoadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 155, -1));

        textPrimerApellidoadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrimerApellidoadminActionPerformed(evt);
            }
        });
        textPrimerApellidoadmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPrimerApellidoadminKeyTyped(evt);
            }
        });
        jPanel2.add(textPrimerApellidoadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 155, -1));

        cmbIdentificacionadmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula de Identidad", "Cédula de Residencia", "Cédula de Refugiado", "Permiso de Estudio" }));
        cmbIdentificacionadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdentificacionadminActionPerformed(evt);
            }
        });
        jPanel2.add(cmbIdentificacionadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 131, -1));

        jLabel9.setText("CONTRASEÑA");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel10.setText("CONFIRMAR CONTRASEÑA");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        textConfirmarContraseñaadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConfirmarContraseñaadminActionPerformed(evt);
            }
        });
        jPanel2.add(textConfirmarContraseñaadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 180, -1));
        jPanel2.add(textContraseñaadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 180, -1));

        try {
            textIdentificacionadmin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textIdentificacionadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdentificacionadminActionPerformed(evt);
            }
        });
        textIdentificacionadmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIdentificacionadminKeyTyped(evt);
            }
        });
        jPanel2.add(textIdentificacionadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 130, -1));

        txtCedulaAyuda.setEditable(false);
        txtCedulaAyuda.setBackground(new java.awt.Color(255, 255, 255));
        txtCedulaAyuda.setForeground(new java.awt.Color(128, 128, 128));
        txtCedulaAyuda.setText("Debe digitar cédula completa");
        txtCedulaAyuda.setBorder(null);
        txtCedulaAyuda.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCedulaAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaAyudaActionPerformed(evt);
            }
        });
        jPanel2.add(txtCedulaAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 210, 20));

        btnEnviaradmin.setBackground(new java.awt.Color(8, 83, 148));
        btnEnviaradmin.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviaradmin.setText("ENVIAR FORMULARIO ");
        btnEnviaradmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviaradminActionPerformed(evt);
            }
        });
        jPanel2.add(btnEnviaradmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 150, 40));

        jLabel11.setText("CÓDIGO DE SEGURIDAD");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel14.setText("PUESTO");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        textConfirmarContraseñaadmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConfirmarContraseñaadmin1ActionPerformed(evt);
            }
        });
        jPanel2.add(textConfirmarContraseñaadmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 180, -1));
        jPanel2.add(textContraseñaadmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 180, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 900, 410));

        tituloFormularioAdministradores.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tituloFormularioAdministradores.setText("FORMULARIO DE REGISTRO PARA ADMINISTRADOR");
        jPanel1.add(tituloFormularioAdministradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 430, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/asetacaMediano.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/fondoBlanco.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 960, 850));

        jDesktopPane3.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane4.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane3.add(jDesktopPane4);
        jDesktopPane4.setBounds(0, 510, 960, 20);

        jDesktopPane5.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane6.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane5.add(jDesktopPane6);
        jDesktopPane6.setBounds(0, 510, 960, 20);

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("BIENVENIDO @USUARIO");
        jDesktopPane5.add(jLabel29);
        jLabel29.setBounds(410, 20, 160, 20);

        jDesktopPane3.add(jDesktopPane5);
        jDesktopPane5.setBounds(0, 500, 960, 40);

        jDesktopPane7.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane8.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane7.add(jDesktopPane8);
        jDesktopPane8.setBounds(0, 510, 960, 20);

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("BIENVENIDO @USUARIO");
        jDesktopPane7.add(jLabel30);
        jLabel30.setBounds(410, 20, 160, 20);

        jDesktopPane9.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane10.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane9.add(jDesktopPane10);
        jDesktopPane10.setBounds(0, 510, 960, 20);

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("BIENVENIDO @USUARIO");
        jDesktopPane9.add(jLabel31);
        jLabel31.setBounds(410, 20, 160, 20);

        jDesktopPane7.add(jDesktopPane9);
        jDesktopPane9.setBounds(0, 500, 960, 40);

        jDesktopPane3.add(jDesktopPane7);
        jDesktopPane7.setBounds(0, 500, 960, 40);

        jDesktopPane11.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane12.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane11.add(jDesktopPane12);
        jDesktopPane12.setBounds(0, 510, 960, 20);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("BIENVENIDO @USUARIO");
        jDesktopPane11.add(jLabel12);
        jLabel12.setBounds(410, 20, 160, 20);

        jDesktopPane3.add(jDesktopPane11);
        jDesktopPane11.setBounds(0, 520, 960, 20);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/E2_1.png"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jDesktopPane3.add(jLabel28);
        jLabel28.setBounds(920, 0, 18, 18);

        jDesktopPane13.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane14.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane13.add(jDesktopPane14);
        jDesktopPane14.setBounds(0, 510, 960, 20);

        jDesktopPane15.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane16.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane15.add(jDesktopPane16);
        jDesktopPane16.setBounds(0, 510, 960, 20);

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("BIENVENIDO @USUARIO");
        jDesktopPane15.add(jLabel32);
        jLabel32.setBounds(410, 20, 160, 20);

        jDesktopPane13.add(jDesktopPane15);
        jDesktopPane15.setBounds(0, 500, 960, 40);

        jDesktopPane17.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane18.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane17.add(jDesktopPane18);
        jDesktopPane18.setBounds(0, 510, 960, 20);

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("BIENVENIDO @USUARIO");
        jDesktopPane17.add(jLabel33);
        jLabel33.setBounds(410, 20, 160, 20);

        jDesktopPane19.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane20.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane19.add(jDesktopPane20);
        jDesktopPane20.setBounds(0, 510, 960, 20);

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("BIENVENIDO @USUARIO");
        jDesktopPane19.add(jLabel34);
        jLabel34.setBounds(410, 20, 160, 20);

        jDesktopPane17.add(jDesktopPane19);
        jDesktopPane19.setBounds(0, 500, 960, 40);

        jDesktopPane13.add(jDesktopPane17);
        jDesktopPane17.setBounds(0, 500, 960, 40);

        jDesktopPane21.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane22.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane21.add(jDesktopPane22);
        jDesktopPane22.setBounds(0, 510, 960, 20);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("BIENVENIDO @USUARIO");
        jDesktopPane21.add(jLabel13);
        jLabel13.setBounds(410, 20, 160, 20);

        jDesktopPane13.add(jDesktopPane21);
        jDesktopPane21.setBounds(0, 520, 960, 20);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/E2_1.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jDesktopPane13.add(jLabel35);
        jLabel35.setBounds(900, 0, 18, 18);

        jDesktopPane3.add(jDesktopPane13);
        jDesktopPane13.setBounds(0, 0, 0, 0);

        jPanel1.add(jDesktopPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 20));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        Menu n = new Menu();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void btnEnviaradminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviaradminActionPerformed

        Boolean flag = true;
       
        String contrasena2 = textConfirmarContraseñaadmin.getText();
        String contrasena1 = textContraseñaadmin.getText();
       
        String id = textIdentificacionadmin.getText();
        String name = textNombreAdmin.getText();
       
        String primerApellido = textPrimerApellidoadmin.getText();
        String segundoApellido = textSegundoApellidoadmin.getText();
      //  String usuario =textUsuarioadmin.getText();

        //Nombre
        if(name.equals("") ){
            textNombreAdmin.setBorder(BORDER_ERROR);
            textNombreAdmin.setToolTipText("Digite el nombre del Administrador");
            flag =  false;
        }else{
            textNombreAdmin.setBorder(BORDER_RIGHT);
            textNombreAdmin.setToolTipText("");

        }
        //Apellido1
        if(primerApellido.equals("") ){
            textPrimerApellidoadmin.setBorder(BORDER_ERROR);
            textPrimerApellidoadmin.setToolTipText("Digite el primer apellido de Gestor");
            flag =  false;
        }else{
            textPrimerApellidoadmin.setBorder(BORDER_RIGHT);
            textPrimerApellidoadmin.setToolTipText("");

        }
        //apellido2
        if(segundoApellido.equals("") ){
            textSegundoApellidoadmin.setBorder(BORDER_ERROR);
            textSegundoApellidoadmin.setToolTipText("Digite el segundo apellido de Gestor");
            flag =  false;
        }else{
            textSegundoApellidoadmin.setBorder(BORDER_RIGHT);
            textSegundoApellidoadmin.setToolTipText("");

        }
        //id
        if(textIdentificacionadmin.getValue()==null ){
            textIdentificacionadmin.setBorder(BORDER_ERROR);
            textIdentificacionadmin.setToolTipText("Digite el id de Gestor");
            flag =  false;
        }else{
            textIdentificacionadmin.setBorder(BORDER_RIGHT);
            textIdentificacionadmin.setToolTipText("");

        }
       
        //usuario
        /*if(usuario.equals("") ){
            textUsuarioadmin.setBorder(BORDER_ERROR);
            textUsuarioadmin.setToolTipText("Digite el usuario de Gestor");
            flag =  false;
        }else{
            textUsuarioadmin.setBorder(BORDER_RIGHT);
            textUsuarioadmin.setToolTipText("");

        }*/
        //contra1
        if(contrasena1.equals("") ){
            textContraseñaadmin.setBorder(BORDER_ERROR);
            textContraseñaadmin.setToolTipText("Digite la contraseña");
            flag =  false;
        }else{
            textContraseñaadmin.setBorder(BORDER_RIGHT);
            textContraseñaadmin.setToolTipText("");

        }
        //contra2
        if(!contrasena2.equals(contrasena1) ){
            textConfirmarContraseñaadmin.setBorder(BORDER_ERROR);
            textConfirmarContraseñaadmin.setToolTipText("Digite la contraseña igual");
            flag =  false;
        }else{
            textConfirmarContraseñaadmin.setBorder(BORDER_RIGHT);
            textConfirmarContraseñaadmin.setToolTipText("");

        }

        if(flag != false){
            Administrador Admin =new Administrador (id, name,primerApellido+" "+segundoApellido ,"",  DigestUtils.shaHex(contrasena1));
            control.agregarUsuario(Admin);
            camposVacios();
        }
    }//GEN-LAST:event_btnEnviaradminActionPerformed

    private void txtCedulaAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaAyudaActionPerformed

    private void textIdentificacionadminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIdentificacionadminKeyTyped
        char cPress=evt.getKeyChar();
        if(cPress=='\b'){
            textIdentificacionadmin.setValue(null);
        }

        String id = textIdentificacionadmin.getText();
       // textUsuarioadmin.setText(id);
    }//GEN-LAST:event_textIdentificacionadminKeyTyped

    private void textIdentificacionadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdentificacionadminActionPerformed

    }//GEN-LAST:event_textIdentificacionadminActionPerformed

    private void textConfirmarContraseñaadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConfirmarContraseñaadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConfirmarContraseñaadminActionPerformed

    private void cmbIdentificacionadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdentificacionadminActionPerformed
        String tipo=cmbIdentificacionadmin.getSelectedItem().toString();
        textIdentificacionadmin.setText("");
        textIdentificacionadmin.setValue(null);
        MaskFormatter uppercase = null;
        //textIdentificacionGestor.getFormatterFactory().getFormatter(null);
        try {
            switch(tipo){
                case "Cédula de Identidad" :
                uppercase = new MaskFormatter("#-####-####");//cambia la mascara al campo de ID
                break;
                default :
                uppercase = new MaskFormatter("####################");//cambia la mascara al campo de ID

            }
        } catch (ParseException ex) {
            Logger.getLogger(vistaRegistroGestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(uppercase);

        txtCedulaAyuda.setVisible(true);
        textIdentificacionadmin.setFormatterFactory(factory);
        textIdentificacionadmin.setEditable(true);
    }//GEN-LAST:event_cmbIdentificacionadminActionPerformed

    private void textPrimerApellidoadminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPrimerApellidoadminKeyTyped
        char c = evt.getKeyChar();

        if(Character.isDigit(c)){
            textPrimerApellidoadmin.setBorder(BORDER_ERROR);
            textPrimerApellidoadmin.setToolTipText("Digite solo letras");
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        else{
            textPrimerApellidoadmin.setBorder(BORDER_RIGHT);
            textPrimerApellidoadmin.setToolTipText("");
        }
    }//GEN-LAST:event_textPrimerApellidoadminKeyTyped

    private void textPrimerApellidoadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrimerApellidoadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrimerApellidoadminActionPerformed

    private void textSegundoApellidoadminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSegundoApellidoadminKeyTyped
        char c = evt.getKeyChar();

        if(Character.isDigit(c)){
            textSegundoApellidoadmin.setBorder(BORDER_ERROR);
            textSegundoApellidoadmin.setToolTipText("Digite solo letras");
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        else{
            textSegundoApellidoadmin.setBorder(BORDER_RIGHT);
            textSegundoApellidoadmin.setToolTipText("");
        }
    }//GEN-LAST:event_textSegundoApellidoadminKeyTyped

    private void textNombreAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreAdminKeyTyped
        char c = evt.getKeyChar();

        if(Character.isDigit(c)){
            textNombreAdmin.setBorder(BORDER_ERROR);
            textNombreAdmin.setToolTipText("Digite solo letras");
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        else{
            textNombreAdmin.setBorder(BORDER_RIGHT);
            textNombreAdmin.setToolTipText("");
        }
    }//GEN-LAST:event_textNombreAdminKeyTyped

    private void textNombreAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreAdminActionPerformed

    private void textConfirmarContraseñaadmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConfirmarContraseñaadmin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConfirmarContraseñaadmin1ActionPerformed
public static Date deStringToDate(String fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaEnviar = null;
        try {
            fechaEnviar = formatoDelTexto.parse(fecha);
            return fechaEnviar;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

public void camposVacios(){
    textNombreAdmin.setText("");
    textNombreAdmin.setBorder(BORDER_RIGHT);
    textNombreAdmin.setToolTipText("");
    
    textPrimerApellidoadmin.setText("");
    textPrimerApellidoadmin.setBorder(BORDER_RIGHT);
    textPrimerApellidoadmin.setToolTipText("");
    
    textSegundoApellidoadmin.setText("");
    textSegundoApellidoadmin.setBorder(BORDER_RIGHT);
    textSegundoApellidoadmin.setToolTipText("");
    
    textIdentificacionadmin.setText("");
    textIdentificacionadmin.setBorder(BORDER_RIGHT);
    textIdentificacionadmin.setToolTipText("");
    
    textConfirmarContraseñaadmin.setText("");
     textConfirmarContraseñaadmin.setBorder(BORDER_RIGHT);
    textConfirmarContraseñaadmin.setToolTipText("");
    
    textContraseñaadmin.setText("");
     textContraseñaadmin.setBorder(BORDER_RIGHT);
    textContraseñaadmin.setToolTipText("");
    

    
    /*textUsuarioadmin.setText("");
    textUsuarioadmin.setBorder(BORDER_RIGHT);
    textUsuarioadmin.setToolTipText("");*/
    
    }
  
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
            java.util.logging.Logger.getLogger(vistaRegistroAdministrador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaRegistroAdministrador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaRegistroAdministrador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaRegistroAdministrador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new vistaRegistroAdministrador().setVisible(true);
//            }
//        });
        //</editor-fold>
       
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new vistaRegistroAdministrador().setVisible(true);
//            }
//        });
    }
     @Override
    public void update(Observable o, Object o1) {
         String s = o1.toString();
         if(s.equals("EXISTE")){
            JOptionPane.showMessageDialog(this,"Este usuario ya existe", "Mensaje de Error", //Título
          JOptionPane.ERROR_MESSAGE); 
         }
         if(s.equals("AGREGADO")){
            JOptionPane.showMessageDialog(this,"Este usuario ha sidoagregado","Agregado", //Título
              JOptionPane.OK_OPTION); }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviaradmin;
    private javax.swing.JComboBox<String> cmbIdentificacionadmin;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane10;
    private javax.swing.JDesktopPane jDesktopPane11;
    private javax.swing.JDesktopPane jDesktopPane12;
    private javax.swing.JDesktopPane jDesktopPane13;
    private javax.swing.JDesktopPane jDesktopPane14;
    private javax.swing.JDesktopPane jDesktopPane15;
    private javax.swing.JDesktopPane jDesktopPane16;
    private javax.swing.JDesktopPane jDesktopPane17;
    private javax.swing.JDesktopPane jDesktopPane18;
    private javax.swing.JDesktopPane jDesktopPane19;
    private javax.swing.JDesktopPane jDesktopPane20;
    private javax.swing.JDesktopPane jDesktopPane21;
    private javax.swing.JDesktopPane jDesktopPane22;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JDesktopPane jDesktopPane6;
    private javax.swing.JDesktopPane jDesktopPane7;
    private javax.swing.JDesktopPane jDesktopPane8;
    private javax.swing.JDesktopPane jDesktopPane9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField textConfirmarContraseñaadmin;
    private javax.swing.JPasswordField textConfirmarContraseñaadmin1;
    private javax.swing.JPasswordField textContraseñaadmin;
    private javax.swing.JPasswordField textContraseñaadmin1;
    private javax.swing.JFormattedTextField textIdentificacionadmin;
    private javax.swing.JTextField textNombreAdmin;
    private javax.swing.JTextField textPrimerApellidoadmin;
    private javax.swing.JTextField textSegundoApellidoadmin;
    private javax.swing.JLabel tituloFormularioAdministradores;
    private javax.swing.JTextField txtCedulaAyuda;
    // End of variables declaration//GEN-END:variables
    private Controlador control;
    
     public static Border BORDER_ERROR = BorderFactory.createLineBorder(Color.red);
     public static Border BORDER_RIGHT = BorderFactory.createLineBorder(Color.BLACK);

   
   
}