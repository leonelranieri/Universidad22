
package vistas;


public class Inscripciones extends javax.swing.JInternalFrame {


    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jBinscribir = new javax.swing.JButton();
      jBanular = new javax.swing.JButton();
      jBsalir = new javax.swing.JButton();
      jLabel6 = new javax.swing.JLabel();
      jCalumnos = new javax.swing.JComboBox<>();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTinscripcionesListadoMaterias = new javax.swing.JTable();

      setClosable(true);

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabel1.setText("Inscripciones");

      jLabel2.setText("Seleccione un alumno:");

      jBinscribir.setText("Inscribir");

      jBanular.setText("Anular");
      jBanular.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBanularActionPerformed(evt);
         }
      });

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
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                           .addComponent(jLabel2)
                           .addGap(18, 18, 18)
                           .addComponent(jCalumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                           .addComponent(jBinscribir)
                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                           .addComponent(jBanular)
                           .addGap(108, 108, 108)
                           .addComponent(jBsalir)))))
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jBinscribir)
               .addComponent(jBanular)
               .addComponent(jBsalir))
            .addGap(18, 18, 18))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void jBanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanularActionPerformed
      
    }//GEN-LAST:event_jBanularActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalumnosActionPerformed

    }//GEN-LAST:event_jCalumnosActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jBanular;
   private javax.swing.JButton jBinscribir;
   private javax.swing.JButton jBsalir;
   private javax.swing.JComboBox<String> jCalumnos;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTinscripcionesListadoMaterias;
   // End of variables declaration//GEN-END:variables
}
