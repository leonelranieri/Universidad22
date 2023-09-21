package AccesoADatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author leone
 */
public class InscripcionData {
    
    private Connection con=null;
    private AlumnoData aluData;
    private MateriaData matData;

    public InscripcionData() {
        con=Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql="INSERT INTO inscripcion(nota, idAlumno, idMateria)"
                + "VALUES (?, ?, ?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            
            ps.executeUpdate();
            ResultSet result=ps.getGeneratedKeys(); //matriz con los id de los inscripciones enviados
            if(result.next()){
                insc.setIdInscripcion(result.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripción cargada exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción : " + ex.getMessage());
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        String sql="SELECT idInscripto, nota, idAlumno, IdMateria FROM inscripcion";
            List<Inscripcion> inscripciones=new ArrayList<>();   
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet result=ps.executeQuery();
            if(result != null){ 
                while (result.next()) {
                    Inscripcion insc = new Inscripcion();
                    insc.setIdInscripcion(result.getInt("idInscripto"));
                    insc.setNota(result.getInt("nota"));
                    //obtener datos del alumno
                    AlumnoData aluData=new AlumnoData();
                    Alumno alu=aluData.buscarAlumnoPorId(result.getInt("idAlumno"));
                    insc.setAlumno(alu);
                    //obtener datos de la materia
                    MateriaData matData=new MateriaData();
                    Materia mat=matData.buscarMateriaPorId(result.getInt("idMateria"));
                    insc.setMateria(mat);
         
                    inscripciones.add(insc);
                }    
            }else {
                JOptionPane.showMessageDialog(null, "No existen inscripciones");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción : "+ex.getMessage());
        }
        return inscripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        String sql="SELECT * FROM inscripcion WHERE idAlumno=?";
            List<Inscripcion> inscripciones=new ArrayList<>();   
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet result=ps.executeQuery();
            if(result != null){
                while (result.next()) {
                    Inscripcion insc = new Inscripcion();
                    insc.setIdInscripcion(result.getInt("idInscripto"));
                    insc.setNota(result.getInt("nota"));
                    //obtener datos del alumno
                    AlumnoData aluData=new AlumnoData();
                    Alumno alu=aluData.buscarAlumnoPorId(result.getInt("idAlumno"));
                    insc.setAlumno(alu);
                    //obtener datos de la materia
                    MateriaData matData=new MateriaData();
                    Materia mat=matData.buscarMateriaPorId(result.getInt("idMateria"));
                    insc.setMateria(mat);
         
                    inscripciones.add(insc);
                }    
            }else {
                JOptionPane.showMessageDialog(null, "No existen inscripciones para el alumno con id : "+id);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción : "+ex.getMessage());
        }
        return inscripciones;
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
        List<Materia> materias=new ArrayList<Materia>();
        String sql="SELECT i.idMateria, nombre, año FROM inscripcion i JOIN materia m "
                + "ON (i.idMateria=m.idMateria)"
                + "WHERE i.idAlumno=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet result=ps.executeQuery();
            while (result.next()) {
                    Materia materia=new Materia();
                    materia.setIdMateria(result.getInt("idMateria"));
                    materia.setNombre(result.getString("nombre"));
                    materia.setAño(result.getInt("año"));
                    materias.add(materia);
                }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción : "+ex.getMessage());
        }
        return materias;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int id){
        List<Materia> materias=new ArrayList<Materia>();
        String sql="SELECT * FROM materia "
                + "WHERE idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno=?) AND estado=1";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet result=ps.executeQuery();
            while (result.next()) {
                    Materia materia=new Materia();
                    materia.setIdMateria(result.getInt("idMateria"));
                    materia.setNombre(result.getString("nombre"));
                    materia.setAño(result.getInt("año"));
                    materias.add(materia);
                }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción : "+ex.getMessage());
        }
        return materias;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        String sql="DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int registro=ps.executeUpdate();
            if(registro == 1){
                JOptionPane.showMessageDialog(null, "Incripción borrada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción : "+ex.getMessage());
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, int nota) {
        try {
            String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int registro = ps.executeUpdate();

            if (registro == 1) {
                JOptionPane.showMessageDialog(null, "La nota ha sido actualizada.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción." + ex.getMessage());
        }
    }
    
    public List<Alumno> obtenerAlumnosPorMateria(int id) {
        List<Alumno> alumnos = new ArrayList<Alumno>();

        try {
            String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado " +
                    "FROM alumno a JOIN inscripcion i ON (a.idAlumno = i.idAlumno) " +
                    "WHERE i.idMateria = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();

            Alumno alumno = new Alumno();
            
            while (result.next()) {
                alumno.setIdAlumno(result.getInt("idAlumno"));
                alumno.setDni(result.getInt("dni"));
                alumno.setApellido(result.getString("apellido"));
                alumno.setNombre(result.getString("nombre"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion." + ex.getMessage());
        }
//        System.out.println("Retorno lista");
//        System.out.println(alumnos.toString());
        return alumnos;
    }
}
