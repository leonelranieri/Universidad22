
package vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import Entidades.Alumno;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Inscripciones extends javax.swing.JInternalFrame {
    
    public Inscripciones(){
        initComponents();
        armarCabeceraTabla();
        cargarCombo();
    }

    private DefaultTableModel modeloTabla=new DefaultTableModel(){
      public boolean isCellEditable(int r, int c){
          return false;
      }  
    };
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBinscribir = new javax.swing.JButton();
        jBanular = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCalumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();
        jRnoinscriptas = new javax.swing.JRadioButton();
        jRinscriptas = new javax.swing.JRadioButton();

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/documento.png"))); // NOI18N
        jLabel1.setText("Inscripciones");

        jLabel2.setText("Seleccione un alumno:");

        jBinscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inscripcion.png"))); // NOI18N
        jBinscribir.setText("Inscribir");

        jBanular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/navegador.png"))); // NOI18N
        jBanular.setText("Anular");
        jBanular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBanularActionPerformed(evt);
            }
        });

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar-sesion.png"))); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Listado de Materias");

        jCalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalumnosActionPerformed(evt);
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

        jRnoinscriptas.setText("Materias no inscriptas");

        jRinscriptas.setText("Materias Inscriptas");
        jRinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRinscriptasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBinscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jBanular)
                                .addGap(41, 41, 41)
                                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCalumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jRinscriptas)
                .addGap(66, 66, 66)
                .addComponent(jRnoinscriptas)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRnoinscriptas)
                    .addComponent(jRinscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBinscribir)
                    .addComponent(jBanular, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanularActionPerformed
      
    }//GEN-LAST:event_jBanularActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalumnosActionPerformed
        String alumno=String.valueOf(jCalumnos.getSelectedItem());
        InscripcionData id = new InscripcionData();
        id.obtenerMateriasCursadas(WIDTH);//aca iria el id
        
        /**************FALTA TERMINAR ESTA PARTE*************
        for(Alumnos alu:id.listarAlumnos()){
            if(String.valueOf(alu. .equals(item)){
                modeloTabla.addRow(new Object[]{prod.getCodigo(), prod.getDescripcion(),
                    prod.getPrecio(), prod.getStock()});
            }
        }*/
    }//GEN-LAST:event_jCalumnosActionPerformed

    private void jRinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRinscriptasActionPerformed
        // TODO add your handling code here:
        int index=jCalumnos.getSelectedIndex();
        if(index==0){
            JOptionPane.showMessageDialog(null, "Seleccione un alumno");
        }else {
            String a = jCalumnos.getItemAt(index);
            System.out.println(a);
        }
    }//GEN-LAST:event_jRinscriptasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBanular;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCalumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRinscriptas;
    private javax.swing.JRadioButton jRnoinscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo(){
        AlumnoData ad = new AlumnoData();
        for (Alumno alumno : ad.listarAlumnos()) {
            jCalumnos.addItem(alumno.toString());
        }
    }
    
    private void armarCabeceraTabla(){
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Año");
        jTtabla.setModel(modeloTabla);
    }
}
