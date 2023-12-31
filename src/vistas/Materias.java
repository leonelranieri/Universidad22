
package vistas;

import AccesoADatos.MateriaData;
import Entidades.Materia;
import java.awt.Point;
import javax.swing.JOptionPane;

public class Materias extends javax.swing.JInternalFrame{
    
    public Materias() {
        initComponents();
        this.setLocation(new Point(50, 50));
    }

    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jBuscar = new javax.swing.JButton();
      jBNuevo = new javax.swing.JButton();
      jBEliminar = new javax.swing.JButton();
      jBGuardar = new javax.swing.JButton();
      jBSalir = new javax.swing.JButton();
      jRadioEstado = new javax.swing.JRadioButton();
      jTId = new javax.swing.JTextField();
      jTNombre = new javax.swing.JTextField();
      jTAño = new javax.swing.JTextField();

      setClosable(true);
      setIconifiable(true);
      setMaximizable(true);
      setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/materia.png"))); // NOI18N
      jLabel1.setText("Materia");

      jLabel2.setText("Codigo:");

      jLabel3.setText("Nombre:");

      jLabel4.setText("Año:");

      jLabel5.setText("Estado:");

      jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_24.png"))); // NOI18N
      jBuscar.setText("Buscar");
      jBuscar.setContentAreaFilled(false);
      jBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      jBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_24.png"))); // NOI18N
      jBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_32.png"))); // NOI18N
      jBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      jBuscar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBuscarActionPerformed(evt);
         }
      });

      jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo24.png"))); // NOI18N
      jBNuevo.setText("Nuevo");
      jBNuevo.setContentAreaFilled(false);
      jBNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jBNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      jBNuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo24.png"))); // NOI18N
      jBNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo_32.png"))); // NOI18N
      jBNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      jBNuevo.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBNuevoActionPerformed(evt);
         }
      });

      jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_24.png"))); // NOI18N
      jBEliminar.setText("Eliminar");
      jBEliminar.setContentAreaFilled(false);
      jBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jBEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      jBEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_24.png"))); // NOI18N
      jBEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_32.png"))); // NOI18N
      jBEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      jBEliminar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBEliminarActionPerformed(evt);
         }
      });

      jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar_24.png"))); // NOI18N
      jBGuardar.setText("Guardar");
      jBGuardar.setContentAreaFilled(false);
      jBGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jBGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      jBGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar_24.png"))); // NOI18N
      jBGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar_32.png"))); // NOI18N
      jBGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      jBGuardar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBGuardarActionPerformed(evt);
         }
      });

      jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_24.png"))); // NOI18N
      jBSalir.setText("Salir");
      jBSalir.setContentAreaFilled(false);
      jBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jBSalir.setHideActionText(true);
      jBSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      jBSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_24.png"))); // NOI18N
      jBSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_32.png"))); // NOI18N
      jBSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      jBSalir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBSalirActionPerformed(evt);
         }
      });

      jRadioEstado.setText("Tildar para activo");
      jRadioEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

      jTId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

      jTNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

      jTAño.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
      jTAño.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTAñoActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel4)
                              .addGap(38, 38, 38))
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addComponent(jLabel2)
                              .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(16, 16, 16)
                              .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jRadioEstado)
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(18, 18, 18)
                              .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
               .addGroup(layout.createSequentialGroup()
                  .addGap(13, 13, 13)
                  .addComponent(jLabel3)
                  .addGap(18, 18, 18)
                  .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(35, Short.MAX_VALUE))
         .addGroup(layout.createSequentialGroup()
            .addGap(122, 122, 122)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(16, 16, 16)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(26, 26, 26)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel2))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel3)
                     .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18))
               .addGroup(layout.createSequentialGroup()
                  .addGap(77, 77, 77)
                  .addComponent(jBuscar)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(22, 22, 22)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jRadioEstado)
               .addComponent(jLabel5))
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jBEliminar)
               .addComponent(jBNuevo)
               .addComponent(jBGuardar)
               .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(19, 19, 19))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        jBNuevo.setEnabled(false);
        try {
            int id = Integer.parseInt(jTId.getText());
            MateriaData md = new MateriaData();
            Materia materia = md.buscarMateriaPorId(id);
            //jTdocumento.setText(String.valueOf(al.getDni()));
            jTNombre.setText(materia.getNombre());
            jTAño.setText(materia.getAño() + "");
            jRadioEstado.setSelected(materia.isEstado());
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un código válido");
            limpiar();
            jBNuevo.setEnabled(true);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en el campo código. Ingrese solo numeros");
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
            try {
            int id = Integer.parseInt(jTId.getText());
            MateriaData md = new MateriaData();
            Materia mat = md.buscarMateriaPorId(id);
            jTId.setText(String.valueOf(mat.getIdMateria()));
            jTNombre.setText(mat.getNombre());
            jTAño.setText(mat.getAño() + (""));
            jRadioEstado.setSelected(mat.isEstado());
            md.eliminarMateria(id);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido");
            return;
        }
        limpiar();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        int respuesta = -1;
        
        if (jTNombre.getText().isEmpty() || jTAño.getText().isEmpty() || jTId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No deje campos en blanco");
            return;
        }
        
        if (!jRadioEstado.isSelected()) {
            respuesta = JOptionPane.showConfirmDialog(null, "Esta por dar de baja una materia, ¿está seguro?",
                    null, JOptionPane.YES_NO_CANCEL_OPTION);
            
            if (respuesta == JOptionPane.NO_OPTION || respuesta == JOptionPane.CANCEL_OPTION) {
                jRadioEstado.setSelected(true);
                return; // Si el usuario elige "No" o "Cancelar", simplemente retorna sin hacer nada.
            }
        }
        
        try {
            int id = Integer.parseInt(jTId.getText());
            MateriaData md = new MateriaData();
            Materia mat = md.buscarMateriaPorId(id);
            mat.setIdMateria(Integer.parseInt(jTId.getText()));
            mat.setNombre(jTNombre.getText());            
            mat.setAño(Integer.parseInt(jTAño.getText()));
            mat.setEstado(jRadioEstado.isSelected());

            // Verifica si el usuario eligió dar de baja al alumno
            if (respuesta == JOptionPane.YES_OPTION) {
                mat.setEstado(false); // Establece el estado del alumno como inactivo
            }
            
            md.modificarMateria(mat);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en el campo Código. Ingrese solo números");
        }
        limpiar();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        if (jTNombre.getText().isEmpty() || jTAño.getText().isEmpty() || jTId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No deje campos en blanco");
                return;
            }
        if(! jRadioEstado.isSelected()){
            JOptionPane.showMessageDialog(this, "Si agrega una materia debe ser con el estado activo");
            return;
        }
        try {
            int id = Integer.parseInt(jTId.getText());
            String nombre = jTNombre.getText();
            String año = jTAño.getText();
            boolean activo = jRadioEstado.isSelected();

            MateriaData md = new MateriaData();
            Materia materia = new Materia(id, nombre, id, activo);
            md.guardarMateria(materia);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en el campo 'CÓDIGO'. Ingrese solo numeros");
            jTId.setText("");
            return;
        }
        limpiar();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jTAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAñoActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jBEliminar;
   private javax.swing.JButton jBGuardar;
   private javax.swing.JButton jBNuevo;
   private javax.swing.JButton jBSalir;
   private javax.swing.JButton jBuscar;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JRadioButton jRadioEstado;
   private javax.swing.JTextField jTAño;
   private javax.swing.JTextField jTId;
   private javax.swing.JTextField jTNombre;
   // End of variables declaration//GEN-END:variables

        private void limpiar(){
        jTId.setText("");
        jTAño.setText("");
        jTNombre.setText("");
        jRadioEstado.setSelected(false);      
 }

}
