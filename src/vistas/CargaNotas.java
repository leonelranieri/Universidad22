
package vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CargaNotas extends javax.swing.JInternalFrame {


    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jBsalir = new javax.swing.JButton();
      jCAlumnos = new javax.swing.JComboBox<>();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTabla = new javax.swing.JTable();
      jBGuardar = new javax.swing.JButton();

      setClosable(true);
      setIconifiable(true);
      setMaximizable(true);

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cargarNotas.png"))); // NOI18N
      jLabel1.setText("Carga de notas");

      jLabel2.setText("Seleccione un alumno");

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

      jCAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jCAlumnos.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCAlumnosActionPerformed(evt);
         }
      });

      jTabla.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
         },
         new String [] {
            "Código", "Nombre  Materia", "Nota"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
         };
         boolean[] canEdit = new boolean [] {
            false, false, true
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTablaMouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(jTabla);

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
                  .addGap(103, 103, 103)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(117, Short.MAX_VALUE))
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
            .addGap(28, 28, 28)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jBGuardar)
               .addComponent(jBsalir))
            .addGap(20, 20, 20))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    public CargaNotas(){
        initComponents();
        armarCabeceraTabla();
        cargarCombo();
        Principal.limpiarTabla(jTabla, modeloTabla);
        jBGuardar.setEnabled(false);
    }
     
    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            // SOLO PERMITE EDITAR LA ÚLTIMA COLUMNA
            return column == getColumnCount() - 1;
        }
    };

    
    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
    this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAlumnosActionPerformed
        Principal.limpiarTabla(jTabla, modeloTabla);
        if(jCAlumnos.getSelectedIndex() != -1){
            jBGuardar.setEnabled(true);
        }
        Alumno alumno = (Alumno) jCAlumnos.getSelectedItem();
        int idAlu = alumno.getIdAlumno();
        InscripcionData inscriData = new InscripcionData();
        List<Inscripcion> inscripciones = inscriData.obtenerInscripcionesPorAlumno(idAlu);
        for (Materia materia : inscriData.obtenerMateriasCursadas(idAlu)) {
            for (Inscripcion inscri : inscripciones) {
                if (materia.getIdMateria() == inscri.getMateria().getIdMateria()) {
                    modeloTabla.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(),
                        inscri.getNota()});
                }
            }
        }
    }//GEN-LAST:event_jCAlumnosActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        InscripcionData inscriData = new InscripcionData();
        int fila = jTabla.getSelectedRow(); 
        int nota = -1;
        int notaActualizada = -1;
        try {
            nota = (int) jTabla.getValueAt(fila, 2);
        } catch (ClassCastException ex) {
            try {  // VERIFICAR INGRESO DE VALORES NUMÉRICOS
                nota = Integer.parseInt((String) jTabla.getValueAt(fila, 2));
            }catch(NumberFormatException nfe){
                return;
            }
        }finally {
            if (fila != -1) {
                if (jTabla.getCellEditor() != null) {    // SE OBTIENE EL VALOR EDITADO Y SE DETIENE LA EDICIÓN
                    jTabla.getCellEditor().stopCellEditing();
                    Alumno alumno = (Alumno) jCAlumnos.getSelectedItem();
                    int idAlu = alumno.getIdAlumno();
                    int idMate = (int) jTabla.getValueAt(fila, 0);
                    try{
                        notaActualizada = Integer.parseInt((String) jTabla.getValueAt(fila, 2));
                    }catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(this, "Debe ingresar valores numéricos");
                        return;
                    }
                    //int notaActualizada = Integer.parseInt((String) jTabla.getValueAt(fila, 2));
                    if (notaActualizada < 0 || notaActualizada > 10){
                        JOptionPane.showMessageDialog(this, "Valor de nota inválido");
                        return;
                    }
                    if (nota != notaActualizada) {
                        inscriData.actualizarNota(idAlu, idMate, notaActualizada);
                        jBGuardar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Para modificar la nota cambie el valor");
                        return;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una fila de la tabla");
                return;
            }
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        if(jTabla.getSelectedRow() != -1){
            jBGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_jTablaMouseClicked

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jBGuardar;
   private javax.swing.JButton jBsalir;
   private javax.swing.JComboBox<Alumno> jCAlumnos;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTabla;
   // End of variables declaration//GEN-END:variables
    
    // MÉTODO PARA ARMAR LA CABECERA DE LA TABLA
    private void armarCabeceraTabla() {
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombre Materia");
        modeloTabla.addColumn("Nota");
        jTabla.setModel(modeloTabla);
    }
    
    // MÉTODO PARA CARGAR LOS ALUMNOS AL JRADIOBUTTON
    private void cargarCombo() {
        AlumnoData ad = new AlumnoData();
        for (Alumno alumno : ad.listarAlumnos()) {
            jCAlumnos.addItem(alumno);
        }
    }
}
