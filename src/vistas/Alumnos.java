

package Vistas;

import AccesoADatos.AlumnoData;
import Entidades.Alumno;
import java.awt.Point;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;


public class Alumnos extends javax.swing.JInternalFrame {


    public Alumnos() {
        initComponents();
        this.setLocation(new Point(50, 50));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setPreferredSize(new java.awt.Dimension(480, 450));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/alumno.png"))); // NOI18N
        jLabel1.setText("Alumno");

        jLdocumento.setText("DNI:");

        jTdocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_24.png"))); // NOI18N
        jBbuscar.setText("Buscar");
        jBbuscar.setContentAreaFilled(false);
        jBbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBbuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBbuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_24.png"))); // NOI18N
        jBbuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_32.png"))); // NOI18N
        jBbuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jTapellido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLapellido.setText("Apellido:");

        jLnombre.setText("Nombre:");

        jTnombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLestado.setText("Estado:");

        jRadioEstado.setText("Tildar para activo");
        jRadioEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEstadoActionPerformed(evt);
            }
        });

        jLfecha.setText("Fecha nacimiento:");
        jLfecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLfecha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo24.png"))); // NOI18N
        jBnuevo.setText("Nuevo");
        jBnuevo.setContentAreaFilled(false);
        jBnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBnuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo24.png"))); // NOI18N
        jBnuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo_32.png"))); // NOI18N
        jBnuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_24.png"))); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.setContentAreaFilled(false);
        jBeliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBeliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBeliminar.setInheritsPopupMenu(true);
        jBeliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_24.png"))); // NOI18N
        jBeliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_32.png"))); // NOI18N
        jBeliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar_24.png"))); // NOI18N
        jBguardar.setText("Guardar");
        jBguardar.setContentAreaFilled(false);
        jBguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBguardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar_24.png"))); // NOI18N
        jBguardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar_32.png"))); // NOI18N
        jBguardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_24.png"))); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.setContentAreaFilled(false);
        jBsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBsalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_24.png"))); // NOI18N
        jBsalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_32.png"))); // NOI18N
        jBsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(626, 626, 626)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLfecha)
                                    .addComponent(jLestado))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioEstado)
                                    .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLnombre)
                                    .addComponent(jLapellido))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLdocumento)
                                        .addGap(44, 44, 44)
                                        .addComponent(jTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jBbuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLdocumento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jBbuscar)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnombre)
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLestado)
                    .addComponent(jRadioEstado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBeliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBsalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            limpiar();
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
            JOptionPane.showMessageDialog(this, "Si agrega un/a alumno/a debe ser con el estado activo");
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
            respuesta = JOptionPane.showConfirmDialog(null, "Esta por dar de baja un/a alumno/a, ¿está seguro?",
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

   private void jRadioEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEstadoActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jRadioEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDfecha;
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
