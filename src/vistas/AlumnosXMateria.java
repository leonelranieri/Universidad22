
package vistas;

public class AlumnosXMateria extends javax.swing.JInternalFrame {

    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jBsalir = new javax.swing.JButton();
      jLabel6 = new javax.swing.JLabel();
      jCalumnos = new javax.swing.JComboBox<>();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTinscripcionesListadoMaterias = new javax.swing.JTable();

      setClosable(true);

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabel1.setText("Listado de alumnos por materia");

      jLabel2.setText("Seleccione una materia:");

      jBsalir.setText("Salir");
      jBsalir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBsalirActionPerformed(evt);
         }
      });

      jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabel6.setText("Listado de Materias");

      jCalumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
      jCalumnos.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCalumnosActionPerformed(evt);
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

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(19, 19, 19)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jLabel1)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jCalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addComponent(jBsalir)))
               .addGroup(layout.createSequentialGroup()
                  .addGap(213, 213, 213)
                  .addComponent(jLabel6))
               .addGroup(layout.createSequentialGroup()
                  .addGap(103, 103, 103)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(117, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(jCalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jLabel6)
            .addGap(34, 34, 34)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBsalir)
            .addGap(18, 18, 18))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalumnosActionPerformed
     
    }//GEN-LAST:event_jCalumnosActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jBsalir;
   private javax.swing.JComboBox<String> jCalumnos;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTinscripcionesListadoMaterias;
   // End of variables declaration//GEN-END:variables
}
