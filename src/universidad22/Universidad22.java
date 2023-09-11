package universidad22;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import Entidades.Alumno;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leone
 */
public class Universidad22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection con=Conexion.getConexion();
        
        AlumnoData alumnoData=new AlumnoData();
        /*Alumno alumno = new Alumno(1, 29948529, "Ranieri", "Juan Leonel", LocalDate.of(1983, Month.JANUARY, 05), true);
        Alumno alumno1 = new Alumno(29955877, "Rivolta", "Rodrigo", LocalDate.of(1979, Month.JULY, 9), false);
        alumnoData.guardarAlumno(alumno);
        alumnoData.guardarAlumno(alumno1);
        alumnoData.modificarAlumno(alumno);
        alumnoData.eliminarAlumno(1);
        Alumno alumnoEncontrado=alumnoData.buscarAlumnoPorDni(33548795);
        if(alumnoEncontrado!=null){
            JOptionPane.showMessageDialog(null, "Alumno : " + alumnoEncontrado.toString());   
        }*/
        List<Alumno> alumnosActivos=alumnoData.listarAlumnos();
        for(Alumno alumno: alumnoData.listarAlumnos()){
            JOptionPane.showMessageDialog(null, alumno.toString());
        }

        
        
    }
    
}
