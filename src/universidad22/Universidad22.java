package universidad22;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
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
        
        // ALUMNO DATA
        /*Alumno alumno = new Alumno(1, 29948529, "Ranieri", "Juan Leonel", LocalDate.of(1983, Month.JANUARY, 05), true);
        Alumno alumno1 = new Alumno(2, 29955877, "Rivolta", "Rodrigo", LocalDate.of(1979, Month.JULY, 9), false);
        alumnoData.guardarAlumno(alumno);
        alumnoData.guardarAlumno(alumno1);
        alumnoData.modificarAlumno(alumno);
        alumnoData.eliminarAlumno(1);
        Alumno alumnoEncontrado=alumnoData.buscarAlumnoPorDni(33548795);
        if(alumnoEncontrado!=null){
            JOptionPane.showMessageDialog(null, "Alumno : " + alumnoEncontrado.toString());   
        }
        List<Alumno> alumnosActivos=alumnoData.listarAlumnos();
        for(Alumno alumno: alumnoData.listarAlumnos()){
            JOptionPane.showMessageDialog(null, alumno.toString());
        }*/

        // MATERIA DATA
        MateriaData materiaData=new MateriaData();
        
        /*Materia materia = new Materia(1, "geografía", 2020, true);
        Materia materia1 = new Materia("física", 2021, true);
        Materia materia2= new Materia(3, "matemáticas", 2022, true);
        Materia materia3 = new Materia("francés", 2020, true);
        
        materiaData.guardarMateria(materia);
        materiaData.guardarMateria(materia1);
        materiaData.guardarMateria(materia2);
        materiaData.guardarMateria(materia3);
        
        Materia mat=materiaData.buscarMateriaPorId(5);
        JOptionPane.showMessageDialog(null, mat.toString());
        
        Materia materiaModificada=new Materia(4, "taller de francés", 2023, true);
        materiaData.modificarMateria(materiaModificada);
        
        materiaData.eliminarMateria(2);s

        
        List<Materia> materiasActivas=materiaData.listarMaterias();
        for(Materia materia: materiasActivas){
            JOptionPane.showMessageDialog(null, materia.toString());
        }*/
        
        InscripcionData inscData=new InscripcionData();
        
        /*Inscripcion insc_1=new Inscripcion(alumno, materia, 9);
        Inscripcion insc_2=new Inscripcion(2, alumno1, materia2, 10);
        Inscripcion insc_3=new Inscripcion(2, alumno1, materia3, 8);
        
        inscData.guardarInscripcion(insc_1);
        inscData.guardarInscripcion(insc_2);
        
        List<Inscripcion> inscripciones=inscData.obtenerInscripciones();
        for(Inscripcion inscripcion: inscripciones){
            JOptionPane.showMessageDialog(null, inscripcion.toString());
        }
        
        List<Inscripcion> inscripciones=inscData.obtenerInscripcionesPorAlumno(1);
        for(Inscripcion inscripcion: inscripciones){
            JOptionPane.showMessageDialog(null, inscripcion.toString());
        }
        
        List<Materia> materiasCursadas=inscData.obtenerMateriasCursadas(2);
        for(Materia m: materiasCursadas){
            JOptionPane.showMessageDialog(null, m.toString());
        }
        
        List<Materia> materiasNoCursadas=inscData.obtenerMateriasNoCursadas(2);
        for(Materia m: materiasNoCursadas){
            JOptionPane.showMessageDialog(null, m.toString());
        }
        
        inscData.borrarInscripcionMateriaAlumno(2, 4);*/
        
        List<Alumno> alumnosPorMateria=inscData.obtenerAlumnosPorMateria(1);
        for(Alumno a: alumnosPorMateria){
            JOptionPane.showMessageDialog(null, a.toString());
        }
        
        
        
        
    }
    
   
}
