/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroui.vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registroui.modelo.Alumno;
import registroui.controlador.Universidad;
import registroui.helpers.Validacion;

/**
 *
 * @author ProfL3401
 */
public class RegistroAlumno extends javax.swing.JFrame {
    
    private Universidad universidad;
    private DefaultTableModel modeloTabla;
    /**
     * Creates new form RegistroAlumno
     */
    public RegistroAlumno(Universidad universidad) {
        initComponents();
        this.universidad = universidad;
        
        modeloTabla = new DefaultTableModel();
        
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombres");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Direccion");
        modeloTabla.addColumn("Carrera");
        modeloTabla.addColumn("Beca");
        
        this.tblAlumnos.setModel(modeloTabla);
        
        this.setearFormularioPorDefecto();
        
        this.cargarAlumnosDesdeLista();
    }
    
    private void cargarAlumnosDesdeLista(){
        
        modeloTabla.setRowCount(0);
        
        for(Alumno alumno:universidad.getAlumnos()) {
            String[] fila = new String[7];
            
            fila[0] = alumno.getCodigo();
            fila[1] = alumno.getNombres();
            fila[2] = alumno.getApellidos();
            fila[3] = ((Integer)alumno.getEdad()).toString();
            fila[4] = alumno.getDireccion();
            fila[5] = alumno.getCarrera();
            fila[6] = alumno.getEstadoBeca() ? "BECADO" : "NO BECADO";
            
            modeloTabla.addRow(fila);
        }
       
    }
    
    private void setearFormularioPorDefecto(){
        this.setControls(false);
        this.txtCodigo.setEnabled(false);
        this.btnRegistrar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
        this.btnNuevo.setEnabled(true);
        
        if (modeloTabla.getRowCount() > 0) {
            this.btnModificar.setEnabled(true);
        } else {
            this.btnModificar.setEnabled(false);
        }
    }
    
    private void limpiarControles() {
        this.txtCodigo.setText("");
        this.txtApellidos.setText("");
        this.txtDireccion.setText("");
        this.txtEdad.setText("");
        this.txtNombres.setText("");
        this.rdBtnNoBeca.setSelected(true);
        this.rdBtnBeca.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupBeca = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        cmbCarrera = new javax.swing.JComboBox<String>();
        rdBtnBeca = new javax.swing.JRadioButton();
        rdBtnNoBeca = new javax.swing.JRadioButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Registro de Alumnos");

        jLabel2.setText("Código:");

        jLabel3.setText("Nombres:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Dirección:");

        jLabel7.setText("Carrera:");

        btnRegistrar.setText("Guardar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAlumnos);

        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SISTEMAS", "ARQUITECTURA", "CIVIL", "ELECTRONICA" }));

        btnGroupBeca.add(rdBtnBeca);
        rdBtnBeca.setText("BECADO");
        rdBtnBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnBecaActionPerformed(evt);
            }
        });

        btnGroupBeca.add(rdBtnNoBeca);
        rdBtnNoBeca.setSelected(true);
        rdBtnNoBeca.setText("SIN BECA");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbCarrera, 0, 248, Short.MAX_VALUE)
                                .addComponent(txtDireccion)))
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(rdBtnBeca)
                                    .addGap(73, 73, 73)
                                    .addComponent(rdBtnNoBeca))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                                    .addComponent(txtApellidos)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdBtnBeca)
                    .addComponent(rdBtnNoBeca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
       
        Alumno alumno = new Alumno(
                this.txtNombres.getText(),
                this.txtApellidos.getText(),
                this.txtEdad.getText().isEmpty() ? 0 : Integer.parseInt(this.txtEdad.getText()),
                this.txtDireccion.getText(),
                this.cmbCarrera.getSelectedItem().toString(),
                this.rdBtnBeca.isSelected(),
                this.txtCodigo.getText());
        
        Validacion validacionDeAlumno = alumno.validar();
        
        if (validacionDeAlumno.isValido()) {
            
            if (this.txtCodigo.getText().isEmpty()) {
                alumno = universidad.insertar(alumno);
            } else {
                alumno = universidad.modificar(alumno);
            }
                       
            this.txtCodigo.setText(alumno.getCodigo());

            JOptionPane.showMessageDialog(null,
                "Datos Guardados!",
                "Mensaje",
                JOptionPane.INFORMATION_MESSAGE);
            
            this.cargarAlumnosDesdeLista();
            
        } else {
            String mensaje = validacionDeAlumno.getMensajes().get(0);
            
            JOptionPane.showMessageDialog(null,
                mensaje,
                "Error de Validación",
                JOptionPane.ERROR_MESSAGE);
        }
        
        this.setearFormularioPorDefecto();
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void rdBtnBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnBecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdBtnBecaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.activarControlesParaEdicion();
        this.limpiarControles();
    }//GEN-LAST:event_btnNuevoActionPerformed
    
    private void activarControlesParaEdicion(){
        this.setControls(true);
        this.btnRegistrar.setEnabled(true);
        this.btnNuevo.setEnabled(false);
        this.btnModificar.setEnabled(false);
    }
        
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        
        //Validar que hay seleccion
        int selectedRow = this.tblAlumnos.getSelectedRow();
        
        if ( selectedRow >= 0) {
            String codigoAlumno = this.modeloTabla.getValueAt(selectedRow, 0).toString();
            
            Alumno alumno = this.universidad.buscar(codigoAlumno);
            
            if (alumno != null)
                this.cargarAlumnoEnFormulario(alumno);
            
            this.activarControlesParaEdicion();
            
        } else {
            JOptionPane.showMessageDialog(null,
                "Debe seleccionar una fila.",
                "Mensaje",
                JOptionPane.WARNING_MESSAGE);
        }
        
        //activar formulario
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cargarAlumnoEnFormulario(Alumno alumno) {
        this.txtCodigo.setText(alumno.getCodigo());
        this.txtNombres.setText(alumno.getNombres());
        this.txtEdad.setText(Integer.toString(alumno.getEdad()));
        this.txtDireccion.setText(alumno.getDireccion());
        
        if (alumno.getEstadoBeca()) {
            this.rdBtnBeca.setSelected(true);
            this.rdBtnNoBeca.setSelected(false);
        } else {
            this.rdBtnBeca.setSelected(false);
            this.rdBtnNoBeca.setSelected(true);
        }
        
        this.cmbCarrera.setSelectedItem(alumno.getCarrera());
    }
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }
    
    private void setControls(Boolean enabled){
        this.txtNombres.setEnabled(enabled);
        this.txtApellidos.setEnabled(enabled);
        this.txtEdad.setEnabled(enabled);
        this.txtDireccion.setEnabled(enabled);
        this.cmbCarrera.setEnabled(enabled);
        this.rdBtnBeca.setEnabled(enabled);
        this.rdBtnNoBeca.setEnabled(enabled);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGroupBeca;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdBtnBeca;
    private javax.swing.JRadioButton rdBtnNoBeca;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
