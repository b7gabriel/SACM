package clinicamedicasolidarista.vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angelica
 */
public class VistaFormularioCitas extends javax.swing.JFrame {

    /**
     * Creates new form VistaFormularioCitas
     */
    public VistaFormularioCitas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        etqTituloFormularioCita = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelInformacionCita = new javax.swing.JPanel();
        etqEspecialidad = new javax.swing.JLabel();
        etqServicio = new javax.swing.JLabel();
        cmbEspecialidad = new javax.swing.JComboBox<String>();
        cmbServicio = new javax.swing.JComboBox<String>();
        etqHorarioCitaEspecialidad = new javax.swing.JLabel();
        etqHorarioCitaServicio = new javax.swing.JLabel();
        etqDiaServicio = new javax.swing.JLabel();
        etqDiaEspecialidad = new javax.swing.JLabel();
        textDiaEspecialidad = new javax.swing.JTextField();
        textDiaServicio = new javax.swing.JTextField();
        iconCalendarioEspecialidad = new javax.swing.JLabel();
        iconCalendarioServicio = new javax.swing.JLabel();
        etqHoraEspecialidad = new javax.swing.JLabel();
        etqHoraServicio = new javax.swing.JLabel();
        cmbHoraServicio = new javax.swing.JComboBox<String>();
        cmbHoraEspecialidad = new javax.swing.JComboBox<String>();
        etqTituloDoctor = new javax.swing.JLabel();
        etqNombreDoctor = new javax.swing.JLabel();
        fondo_informacion_cita = new javax.swing.JLabel();
        btnRegistrarCita = new javax.swing.JButton();
        etqAsetaca = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        etqFondoPanelPrincipal = new javax.swing.JLabel();

        jLabel2.setText("ESPECIALIDAD ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqTituloFormularioCita.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        etqTituloFormularioCita.setText("FORMULARIO DE SOLICITUD DE CITA MÉDICA");
        panelPrincipal.add(etqTituloFormularioCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 410, 30));
        panelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 640, 10));

        panelInformacionCita.setBackground(new java.awt.Color(255, 255, 255));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ObjectProperty.create(), panelInformacionCita, org.jdesktop.beansbinding.BeanProperty.create("border"));
        bindingGroup.addBinding(binding);

        panelInformacionCita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqEspecialidad.setText("ESPECIALIDAD");
        panelInformacionCita.add(etqEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 61, -1, -1));

        etqServicio.setText("SERVICIO");
        panelInformacionCita.add(etqServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EXAMEN DE SANGRE", "Item 2", "Item 3", "Item 4" }));
        cmbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEspecialidadActionPerformed(evt);
            }
        });
        panelInformacionCita.add(cmbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 160, 30));

        cmbServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelInformacionCita.add(cmbServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 160, 30));

        etqHorarioCitaEspecialidad.setText("HORARIO DE CITAS");
        panelInformacionCita.add(etqHorarioCitaEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        etqHorarioCitaServicio.setText("HORARIO DE CITAS");
        panelInformacionCita.add(etqHorarioCitaServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        etqDiaServicio.setText("DÍA");
        panelInformacionCita.add(etqDiaServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        etqDiaEspecialidad.setText("DÍA");
        panelInformacionCita.add(etqDiaEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        textDiaEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDiaEspecialidadActionPerformed(evt);
            }
        });
        panelInformacionCita.add(textDiaEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 140, 30));
        panelInformacionCita.add(textDiaServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 140, 30));

        iconCalendarioEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/calendario (1).png"))); // NOI18N
        panelInformacionCita.add(iconCalendarioEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, 40));

        iconCalendarioServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/calendario (1).png"))); // NOI18N
        panelInformacionCita.add(iconCalendarioServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        etqHoraEspecialidad.setText("HORA");
        panelInformacionCita.add(etqHoraEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));

        etqHoraServicio.setText("HORA");
        panelInformacionCita.add(etqHoraServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        cmbHoraServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelInformacionCita.add(cmbHoraServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 100, 30));

        cmbHoraEspecialidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelInformacionCita.add(cmbHoraEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 100, 30));

        etqTituloDoctor.setText("DOCTOR(A)");
        panelInformacionCita.add(etqTituloDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, -1, -1));

        etqNombreDoctor.setText("MA FERNANDA GUITIERREZ GUILLEN");
        panelInformacionCita.add(etqNombreDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, -1, -1));

        fondo_informacion_cita.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACIÓN DE CITA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        panelInformacionCita.add(fondo_informacion_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 16, 1140, 270));

        panelPrincipal.add(panelInformacionCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 290));

        btnRegistrarCita.setText("REGISTRAR CITA");
        panelPrincipal.add(btnRegistrarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, 30));

        etqAsetaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/asetaca.png"))); // NOI18N
        panelPrincipal.add(etqAsetaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 110));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 130, 30));

        etqFondoPanelPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/fondoBlanco.jpg"))); // NOI18N
        panelPrincipal.add(etqFondoPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 620));

        jScrollPane1.setViewportView(panelPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1239, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEspecialidadActionPerformed

    private void textDiaEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDiaEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDiaEspecialidadActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaFormularioCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaFormularioCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarCita;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JComboBox<String> cmbHoraEspecialidad;
    private javax.swing.JComboBox<String> cmbHoraServicio;
    private javax.swing.JComboBox<String> cmbServicio;
    private javax.swing.JLabel etqAsetaca;
    private javax.swing.JLabel etqDiaEspecialidad;
    private javax.swing.JLabel etqDiaServicio;
    private javax.swing.JLabel etqEspecialidad;
    private javax.swing.JLabel etqFondoPanelPrincipal;
    private javax.swing.JLabel etqHoraEspecialidad;
    private javax.swing.JLabel etqHoraServicio;
    private javax.swing.JLabel etqHorarioCitaEspecialidad;
    private javax.swing.JLabel etqHorarioCitaServicio;
    private javax.swing.JLabel etqNombreDoctor;
    private javax.swing.JLabel etqServicio;
    private javax.swing.JLabel etqTituloDoctor;
    private javax.swing.JLabel etqTituloFormularioCita;
    private javax.swing.JLabel fondo_informacion_cita;
    private javax.swing.JLabel iconCalendarioEspecialidad;
    private javax.swing.JLabel iconCalendarioServicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelInformacionCita;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField textDiaEspecialidad;
    private javax.swing.JTextField textDiaServicio;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
