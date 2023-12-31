
package vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Inscripciones extends javax.swing.JInternalFrame {
   
    private static boolean inscriptas;    //VARIABLES PARA CONTROLAR LA EJECUCIÓN DE LOS
    private static boolean noInscriptas;  // JRADIOBUTTON DENTRO DEL MÉTODO jCAlumnosActionPerformed
    
    private DefaultTableModel modeloTabla=new DefaultTableModel(){
      public boolean isCellEditable(int r, int c){
          return false;
      }  
    };
    
    public Inscripciones(){
        initComponents();
        armarCabeceraTabla();
        cargarCombo();
        Principal.limpiarTabla(jTtabla, modeloTabla);
        jCAlumnos.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBInscribir = new javax.swing.JButton();
        jBAnular = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCAlumnos = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();
        jRInscriptas = new javax.swing.JRadioButton();
        jRNoInscriptas = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Inscripciones.png"))); // NOI18N
        jLabel1.setText("Inscripciones");

        jLabel2.setText("Seleccione un alumno:");

        jBInscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inscripcion_24.png"))); // NOI18N
        jBInscribir.setText("Inscribir");
        jBInscribir.setContentAreaFilled(false);
        jBInscribir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBInscribir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBInscribir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inscripcion_24.png"))); // NOI18N
        jBInscribir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inscripcion_32.png"))); // NOI18N
        jBInscribir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anular_ 24.png"))); // NOI18N
        jBAnular.setText("Anular");
        jBAnular.setContentAreaFilled(false);
        jBAnular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAnular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAnular.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anular_ 24.png"))); // NOI18N
        jBAnular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anular_32.png"))); // NOI18N
        jBAnular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ListaMaterias.png"))); // NOI18N
        jLabel6.setText("Listado de Materias");

        jCAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAlumnosActionPerformed(evt);
            }
        });

        jTtabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTtabla);

        jRInscriptas.setText("Materias inscriptas");
        jRInscriptas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRInscriptasActionPerformed(evt);
            }
        });

        jRNoInscriptas.setText("Materias no inscriptas");
        jRNoInscriptas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNoInscriptasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jRInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(jRNoInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22))))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRInscriptas)
                    .addComponent(jRNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBInscribir)
                    .addComponent(jBAnular)
                    .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularActionPerformed
        AlumnoData ad=new AlumnoData();
        InscripcionData idata=new InscripcionData();
        int id=0;
        int filaSelecionada = jTtabla.getSelectedRow();
        Object aluSeleccionado = jCAlumnos.getSelectedItem();
        for (Alumno alu : ad.listarAlumnos()) {
                if (alu.toString().equals(aluSeleccionado)) {
                    aluSeleccionado=alu;
                    id=alu.getIdAlumno();
                }
            }
        try {
            if (filaSelecionada != -1) {
                int idMateria = (int) jTtabla.getValueAt(filaSelecionada, 0);
                int idAlumno = id;
                idata.borrarInscripcionMateriaAlumno(idAlumno, idMateria);
                Principal.limpiarTabla(jTtabla, modeloTabla);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        }
    }//GEN-LAST:event_jBAnularActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jRInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRInscriptasActionPerformed
        int index=prepararAmbienteInsc();
        if (index == 0) {
            return;
        } else {
            String alumnoItem = String.valueOf(jCAlumnos.getSelectedItem());
            AlumnoData ad = new AlumnoData();

            for (Alumno alu : ad.listarAlumnos()) {
                if (alu.toString().equals(alumnoItem)) {
                    int idAlumno = alu.getIdAlumno();
                    listarMateriasInscriptas(idAlumno);
                }
            }
        }
    }//GEN-LAST:event_jRInscriptasActionPerformed

    private void jCAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAlumnosActionPerformed
        if (inscriptas) {
            jRInscriptasActionPerformed(evt);
        } else if (noInscriptas) {
            jRNoInscriptasActionPerformed(evt);
        }
    }//GEN-LAST:event_jCAlumnosActionPerformed

    private void jRNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNoInscriptasActionPerformed
        int index=prepararAmbienteNoInsc();
        if (index == 0) {
            return;
        } else {
            String alumnoItem = String.valueOf(jCAlumnos.getSelectedItem());
            AlumnoData ad = new AlumnoData();

            for (Alumno alu : ad.listarAlumnos()) {
                if (alu.toString().equals(alumnoItem)) {
                    int idAlumno = alu.getIdAlumno();
                    listarMateriasNoinscriptas(idAlumno);
                }
            }
        }
    }//GEN-LAST:event_jRNoInscriptasActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        AlumnoData ad=new AlumnoData();
        Alumno aluSeleccionado=new Alumno();
        if(noInscriptas){
            int filaSelecionada = jTtabla.getSelectedRow();
            Object alumnoItem = jCAlumnos.getSelectedItem();
            int nota = 0;
             for (Alumno alu : ad.listarAlumnos()) {
                if (alu.toString().equals(alumnoItem)) {
                    aluSeleccionado=alu; 
                }
            }
            try {
                if (filaSelecionada != -1) {
                    int idMateria = (Integer) jTtabla.getValueAt(filaSelecionada, 0);
                    String nombre = (String)jTtabla.getValueAt(filaSelecionada, 1);
                    int año = (int) jTtabla.getValueAt(filaSelecionada, 2);
                    Materia materiaSeleccionada = new Materia(idMateria, nombre, año, true);
                    InscripcionData id=new InscripcionData();
                    Inscripcion nuevaInsc=new Inscripcion(aluSeleccionado, materiaSeleccionada, nota);
                    id.guardarInscripcion(nuevaInsc);
                    Principal.limpiarTabla(jTtabla, modeloTabla);
                }
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Seleccione una materia");
            }catch(ClassCastException ex){
                return;
            }
        }
    }//GEN-LAST:event_jBInscribirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnular;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRInscriptas;
    private javax.swing.JRadioButton jRNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables

    // MÉTODO PARA CARGAR LOS ALUMNOS AL JRADIOBUTTON
    private void cargarCombo(){
        jCAlumnos.addItem("SELECCIONE_UN_ALUMNO");
        AlumnoData ad = new AlumnoData();
        for (Alumno alumno : ad.listarAlumnos()) {
            jCAlumnos.addItem(alumno.toString());
        }
    }
    
    // MÉTODO PARA ARMAR LA CABECERA DE LA TABLA
    private void armarCabeceraTabla(){
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Año");
        jTtabla.setModel(modeloTabla);
    }
    
    // MÉTODO PARA LISTAR MATERIAS INSCRIPTAS POR ALUMNO
    private void listarMateriasInscriptas(int idAlumno) {
        Principal.limpiarTabla(jTtabla, modeloTabla);
        InscripcionData id = new InscripcionData();

        for (Materia mat : id.obtenerMateriasCursadas(idAlumno)) {
            modeloTabla.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAño()});
        }
    }

    // MÉTODO PARA LISTAR MATERIAS NO INSCRIPTAS POR ALUMNO
    private void listarMateriasNoinscriptas(int idAlumno) {
        Principal.limpiarTabla(jTtabla, modeloTabla);
        InscripcionData id = new InscripcionData();

        for (Materia mat : id.obtenerMateriasNoCursadas(idAlumno)) {
            modeloTabla.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAño()});
        }
    }
    
    private int prepararAmbienteInsc(){
        inscriptas=true;   //DAMOS VALOR A LAS VARIABLES PARA CONTROLAR EL FLUJO DE EJECUCIÓN
        noInscriptas=false;
        Principal.limpiarTabla(jTtabla, modeloTabla);
        jCAlumnos.setEnabled(true);   //ACTIVAMOS EL JCOMBOBOX QUE INICIA DESACTIVADO EN EL CONSTRUCTOR
        jRNoInscriptas.setSelected(false);  //DESACTIVAMOS EL JRADIOBUTTON 'MATERIAS NO INSCRIPTAS'
        return jCAlumnos.getSelectedIndex();
    }
    
    private int prepararAmbienteNoInsc(){
        inscriptas = false;
        noInscriptas = true;
        Principal.limpiarTabla(jTtabla, modeloTabla);
        jCAlumnos.setEnabled(true);
        jRInscriptas.setSelected(false);
        return jCAlumnos.getSelectedIndex();
    }
}
