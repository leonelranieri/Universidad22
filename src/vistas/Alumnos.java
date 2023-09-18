/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import AccesoADatos.AlumnoData;
import Entidades.Alumno;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Alumnos extends javax.swing.JFrame {

    /**
     * Creates new form Alumnos2
     */
    public Alumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLdocumento = new javax.swing.JLabel();
        jTdocumento = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jTapellido = new javax.swing.JTextField();
        jLapellido = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jLestado = new javax.swing.JLabel();
        jRadioEstado = new javax.swing.JRadioButton();
        jLfecha = new javax.swing.JLabel();
        jBnuevo = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDfecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Alumno");

        jLdocumento.setText("DNI:");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLapellido.setText("Apellido:");

        jLnombre.setText("Nombre:");

        jLestado.setText("Estado:");

        jRadioEstado.setText("Tildar para activo");

        jLfecha.setText("Fecha nacimiento:");

        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBnuevo)
                            .addComponent(jLapellido)
                            .addComponent(jLnombre)
                            .addComponent(jLestado))
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jBeliminar)
                                .addGap(31, 31, 31)
                                .addComponent(jBguardar)
                                .addGap(13, 13, 13)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jBsalir))))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioEstado)))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLdocumento)
                        .addGap(44, 44, 44)
                        .addComponent(jTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLfecha)
                        .addGap(32, 32, 32)
                        .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdocumento)
                    .addComponent(jTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLapellido)
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnombre)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLestado)
                    .addComponent(jRadioEstado))
                .addGap(15, 15, 15)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLfecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBnuevo)
                            .addComponent(jBeliminar)
                            .addComponent(jBguardar)
                            .addComponent(jBsalir)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        jBnuevo.setEnabled(false);
        try{
            int dni = Integer.parseInt(jTdocumento.getText());
            AlumnoData ad = new AlumnoData();
            Alumno al = ad.buscarAlumnoPorDni(dni);
            //jTdocumento.setText(String.valueOf(al.getDni()));
            jTapellido.setText(al.getApellido());
            jTnombre.setText(al.getNombre());
            jDfecha.setDate(Date.valueOf(al.getFechaNac()));
            jRadioEstado.setSelected(al.isActivo());
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un DNI válido");
            jBnuevo.setEnabled(true);
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error en el campo DNI. Ingrese solo numeros");
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed        
        if (jTnombre.getText().isEmpty() || jTapellido.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No deje campos en blanco");
                return;
            }
        if(! jRadioEstado.isSelected()){
            JOptionPane.showMessageDialog(this, "Si agrega un alumno debe ser con el estado activo");
            return;
        }
        try {
            int dni = Integer.parseInt(jTdocumento.getText());
            String nombre = jTnombre.getText();
            String apellido = jTapellido.getText();
            boolean activo = jRadioEstado.isSelected();

            LocalDate fechald;
            if (jDfecha.getDate() != null) {
                fechald = jDfecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                AlumnoData ad = new AlumnoData();
                Alumno alumno = new Alumno(dni, apellido, nombre, fechald, activo);
                ad.guardarAlumno(alumno);

            }else{
                JOptionPane.showMessageDialog(this, "Seleccione la fecha de nacimiento");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en el campo DNI. Ingrese solo numeros");
            jTdocumento.setText("");
            return;
        }
        limpiar();
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed           
        try{
            int dni = Integer.parseInt(jTdocumento.getText());
            AlumnoData ad = new AlumnoData();
            Alumno al = ad.buscarAlumnoPorDni(dni);
            jTdocumento.setText(String.valueOf(al.getDni()));
            jTapellido.setText(al.getApellido());
            jTnombre.setText(al.getNombre());
            jDfecha.setDate(Date.valueOf(al.getFechaNac()));
            jRadioEstado.setSelected(al.isActivo());
            int id = al.getIdAlumno();
            ad.eliminarAlumno(id);
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un DNI válido");
            return;
        }
        limpiar();
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
         int respuesta = -1;

        if (jTnombre.getText().isEmpty() || jTapellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No deje campos en blanco");
            return;
        }

        if (!jRadioEstado.isSelected()) {
            respuesta = JOptionPane.showConfirmDialog(null, "Esta por dar de baja un alumno/a, ¿está seguro?",
                    null, JOptionPane.YES_NO_CANCEL_OPTION);

            if (respuesta == JOptionPane.NO_OPTION || respuesta == JOptionPane.CANCEL_OPTION) {
                jRadioEstado.setSelected(true);
                return; // Si el usuario elige "No" o "Cancelar", simplemente retorna sin hacer nada.
            }
        }

        if (jDfecha.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Dejó el campo 'Fecha de Nacimiento' en blanco");
            return;
        }

        try {
            int dni = Integer.parseInt(jTdocumento.getText());
            AlumnoData ad = new AlumnoData();
            Alumno al = ad.buscarAlumnoPorDni(dni);
            al.setNombre(jTnombre.getText());
            al.setApellido(jTapellido.getText());
            al.setDni(dni);
            al.setActivo(jRadioEstado.isSelected());
            al.setFechaNac(jDfecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            // Verifica si el usuario eligió dar de baja al alumno
            if (respuesta == JOptionPane.YES_OPTION) {
                al.setActivo(false); // Establece el estado del alumno como inactivo
            }

            ad.modificarAlumno(al);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en el campo DNI. Ingrese solo números");
        }
        limpiar();
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDfecha;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLapellido;
    private javax.swing.JLabel jLdocumento;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLfecha;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JRadioButton jRadioEstado;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTdocumento;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
        jTdocumento.setText("");
        jTapellido.setText("");
        jTnombre.setText("");
        jRadioEstado.setSelected(false);
        jDfecha.setDate(null);
    }
}
