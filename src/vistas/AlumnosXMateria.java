
package vistas;

import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Materia;
import javax.swing.table.DefaultTableModel;

public class AlumnosXMateria extends javax.swing.JInternalFrame {
    
  private DefaultTableModel modeloTabla=new DefaultTableModel(){
      public boolean isCellEditable(int r, int c){
          return false;
      }  
    };
    
    public AlumnosXMateria(){
        initComponents();
        armarCabeceraTabla();
        cargarCombo();
        Principal.limpiarTabla(jTabla, modeloTabla);
    }
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jBsalir = new javax.swing.JButton();
      jLabel6 = new javax.swing.JLabel();
      jCMaterias = new javax.swing.JComboBox<>();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTabla = new javax.swing.JTable();

      setClosable(true);
      setIconifiable(true);
      setMaximizable(true);

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ListaAlumno.png"))); // NOI18N
      jLabel1.setText("Listado de alumnos por materia");
      jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

      jLabel2.setText("Seleccione una materia:");

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

      jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ListaMaterias.png"))); // NOI18N
      jLabel6.setText("Listado de Materias");

      jCMaterias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jCMaterias.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCMateriasActionPerformed(evt);
         }
      });

      jTabla.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
         },
         new String [] {
            "ID", "DNI", "Apellido", "Nombre"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
         };
         boolean[] canEdit = new boolean [] {
            false, false, false, false
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      jScrollPane1.setViewportView(jTabla);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(201, 201, 201))
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(120, 120, 120)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGap(75, 75, 75)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGap(43, 43, 43)
                  .addComponent(jLabel2)
                  .addGap(29, 29, 29)
                  .addComponent(jCMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(72, 72, 72)))
            .addContainerGap(67, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jCMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2))
            .addGap(12, 12, 12)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(25, 25, 25)
            .addComponent(jBsalir)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMateriasActionPerformed
        Principal.limpiarTabla(jTabla, modeloTabla);
        Materia materia = (Materia) jCMaterias.getSelectedItem();
        int id = materia.getIdMateria();
        InscripcionData inscriData = new InscripcionData();
        for (Alumno alumno : inscriData.obtenerAlumnosPorMateria(id)) {
            modeloTabla.addRow(new Object[]{alumno.getIdAlumno(), alumno.getDni(), alumno.getApellido(),
                alumno.getNombre()});
        }
    }//GEN-LAST:event_jCMateriasActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jBsalir;
   private javax.swing.JComboBox<Materia> jCMaterias;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTabla;
   // End of variables declaration//GEN-END:variables
 
    // MÉTODO PARA CARGAR LOS ALUMNOS AL JRADIOBUTTON
    private void cargarCombo() {
        MateriaData md = new MateriaData();
        for (Materia materia : md.listarMaterias()) {
            jCMaterias.addItem(materia);
        }
    }
    
    // MÉTODO PARA ARMAR LA CABECERA DE LA TABLA
    private void armarCabeceraTabla(){
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Nombre");
        jTabla.setModel(modeloTabla);
    }

}
