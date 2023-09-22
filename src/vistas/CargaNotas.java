
package vistas;

import Entidades.Alumno;

public class CargaNotas extends javax.swing.JInternalFrame {


    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jBsalir = new javax.swing.JButton();
      jCAlumnos = new javax.swing.JComboBox<>();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTinscripcionesListadoMaterias = new javax.swing.JTable();
      jBsalir1 = new javax.swing.JButton();

      setClosable(true);
      setIconifiable(true);
      setMaximizable(true);

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-calificación-32.png"))); // NOI18N
      jLabel1.setText("Carga de notas");

      jLabel2.setText("Seleccione un alumno");

      jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar-sesion.png"))); // NOI18N
      jBsalir.setText("Salir");
      jBsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jBsalir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBsalirActionPerformed(evt);
         }
      });

      jCAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jCAlumnos.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCAlumnosActionPerformed(evt);
         }
      });

      jTinscripcionesListadoMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
      jScrollPane1.setViewportView(jTinscripcionesListadoMaterias);

      jBsalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
      jBsalir1.setText("Guardar");
      jBsalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jBsalir1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBsalir1ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(179, 179, 179)
                  .addComponent(jLabel1))
               .addGroup(layout.createSequentialGroup()
                  .addGap(22, 22, 22)
                  .addComponent(jLabel2)
                  .addGap(40, 40, 40)
                  .addComponent(jCAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGap(120, 120, 120)
                  .addComponent(jBsalir1)
                  .addGap(95, 95, 95)
                  .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGap(68, 68, 68)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(152, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jCAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jBsalir1)
               .addComponent(jBsalir))
            .addGap(20, 20, 20))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAlumnosActionPerformed

    }//GEN-LAST:event_jCAlumnosActionPerformed

    private void jBsalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalir1ActionPerformed

    }//GEN-LAST:event_jBsalir1ActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jBsalir;
   private javax.swing.JButton jBsalir1;
   private javax.swing.JComboBox<Alumno> jCAlumnos;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTinscripcionesListadoMaterias;
   // End of variables declaration//GEN-END:variables
}
