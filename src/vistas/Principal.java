
package vistas;
import java.awt.Image;
import java.awt.Toolkit;
import Vistas.Alumnos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
	setIconImage(getIconImage());	  
    }

    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      jDescritorio = new javax.swing.JDesktopPane();
      jMenuBar1 = new javax.swing.JMenuBar();
      jMalumno = new javax.swing.JMenu();
      jMenuItem1 = new javax.swing.JMenuItem();
      jMmateria = new javax.swing.JMenu();
      jMenuItem2 = new javax.swing.JMenuItem();
      jMadministracion = new javax.swing.JMenu();
      jMenuItem3 = new javax.swing.JMenuItem();
      jMenuItem4 = new javax.swing.JMenuItem();
      jMconsultas = new javax.swing.JMenu();
      jMenuItem5 = new javax.swing.JMenuItem();
      jMsalir = new javax.swing.JMenu();
      jMenuItem6 = new javax.swing.JMenuItem();

      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ulp.png"))); // NOI18N

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setIconImages(null);

      javax.swing.GroupLayout jDescritorioLayout = new javax.swing.GroupLayout(jDescritorio);
      jDescritorio.setLayout(jDescritorioLayout);
      jDescritorioLayout.setHorizontalGroup(
         jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 1042, Short.MAX_VALUE)
      );
      jDescritorioLayout.setVerticalGroup(
         jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 740, Short.MAX_VALUE)
      );

      jMalumno.setText("Alumno");
      jMalumno.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMalumnoActionPerformed(evt);
         }
      });

      jMenuItem1.setText("Formulario de alumno");
      jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
         }
      });
      jMalumno.add(jMenuItem1);

      jMenuBar1.add(jMalumno);

      jMmateria.setText("Materia");
      jMmateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

      jMenuItem2.setText("Formulario de materia");
      jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem2ActionPerformed(evt);
         }
      });
      jMmateria.add(jMenuItem2);

      jMenuBar1.add(jMmateria);

      jMadministracion.setText("Administración");
      jMadministracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

      jMenuItem3.setText("Manejo de inscripciones");
      jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem3ActionPerformed(evt);
         }
      });
      jMadministracion.add(jMenuItem3);

      jMenuItem4.setText("Manipulacion de notas");
      jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem4ActionPerformed(evt);
         }
      });
      jMadministracion.add(jMenuItem4);

      jMenuBar1.add(jMadministracion);

      jMconsultas.setText("Consultas");
      jMconsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

      jMenuItem5.setText("Alumnos por materia");
      jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem5ActionPerformed(evt);
         }
      });
      jMconsultas.add(jMenuItem5);

      jMenuBar1.add(jMconsultas);

      jMsalir.setText("Salir");
      jMsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jMsalir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMsalirActionPerformed(evt);
         }
      });

      jMenuItem6.setText("Salir");
      jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem6ActionPerformed(evt);
         }
      });
      jMsalir.add(jMenuItem6);

      jMenuBar1.add(jMsalir);

      setJMenuBar(jMenuBar1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jDescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jDescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(29, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        Alumnos alumnos = new Alumnos();
        alumnos.setVisible(true);
        jDescritorio.add(alumnos);
        jDescritorio.moveToFront(alumnos);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        Materias mat = new Materias();
        mat.setVisible(true);
        jDescritorio.add(mat);
        jDescritorio.moveToFront(mat);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
          jDescritorio.removeAll();
        jDescritorio.repaint();
        Inscripciones insc = new Inscripciones();
        insc.setVisible(true);
        jDescritorio.add(insc);
        jDescritorio.moveToFront(insc);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jDescritorio.removeAll();
        jDescritorio.repaint();
        AlumnosXMateria consultaAlumno = new AlumnosXMateria();
        consultaAlumno.setVisible(true);
        jDescritorio.add(consultaAlumno);
        jDescritorio.moveToFront(consultaAlumno);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        jDescritorio.removeAll();
        jDescritorio.repaint();
        CargaNotas carga = new CargaNotas();
        carga.setVisible(true);
        jDescritorio.add(carga);
        jDescritorio.moveToFront(carga);


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMsalirActionPerformed

    }//GEN-LAST:event_jMsalirActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
  
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMalumnoActionPerformed
        
    }//GEN-LAST:event_jMalumnoActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JDesktopPane jDescritorio;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JMenu jMadministracion;
   private javax.swing.JMenu jMalumno;
   private javax.swing.JMenu jMconsultas;
   private javax.swing.JMenuBar jMenuBar1;
   private javax.swing.JMenuItem jMenuItem1;
   private javax.swing.JMenuItem jMenuItem2;
   private javax.swing.JMenuItem jMenuItem3;
   private javax.swing.JMenuItem jMenuItem4;
   private javax.swing.JMenuItem jMenuItem5;
   private javax.swing.JMenuItem jMenuItem6;
   private javax.swing.JMenu jMmateria;
   private javax.swing.JMenu jMsalir;
   // End of variables declaration//GEN-END:variables
@Override 
public Image getIconImage(){
	Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("iconos/ulp1.png"));
return retValue;
}
    public static void limpiarTabla(JTable jTabla, DefaultTableModel modeloTabla) {
        int f = jTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }

}
