
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estante-para-libros.png"))); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setText("Codigo:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Año:");

        jLabel5.setText("Estado:");

        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ayuda.png"))); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar-archivo.png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar-sesion.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jRadioEstado.setText("Tildar para activo");

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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioEstado)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jBGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
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
