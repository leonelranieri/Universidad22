package AccesoADatos;

import Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
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
public class AlumnoData {

    private Connection con=null;

    public AlumnoData() {
        con=Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alu){
        String sql="INSERT INTO alumno(`dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) "
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alu.getDni());
            ps.setString(2, alu.getApellido());
            ps.setString(3, alu.getNombre());
            ps.setDate(4, Date.valueOf(alu.getFechaNac()));
            ps.setBoolean(5, alu.isActivo());
            
            ps.executeUpdate();
            ResultSet result=ps.getGeneratedKeys(); //matriz con los id de los alumnos enviados
            if(result.next()){
                alu.setIdAlumno(result.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno cargado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno : " + ex.getMessage());
        }
    }
    
    public void modificarAlumno(Alumno alu){
        String sql="UPDATE alumno "
        + "SET dni=?,apellido=?,"
        + "nombre=?,fechaNacimiento=?, estado=? WHERE idAlumno=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,alu.getDni() );
            ps.setString(2, alu.getApellido());
            ps.setString(3, alu.getNombre());
            ps.setDate(4, Date.valueOf(alu.getFechaNac()));
            ps.setBoolean(5, alu.isActivo());
            ps.setInt(6, alu.getIdAlumno());
            int exito=ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Alumno modificado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
     }
        
        public void eliminarAlumno(int id){
            String sql="UPDATE alumno SET estado=0 WHERE idAlumno=?";
            
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Alumno eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }
        
        public Alumno buscarAlumnoPorId(int id){
            String sql="SELECT dni, apellido, nombre, fechaNacimiento FROM  alumno "
                    + "WHERE idAlumno=? AND estado=1";
            Alumno alu=null;
            
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet result=ps.executeQuery();
            if(result.next()){
                alu = new Alumno();
                alu.setIdAlumno(id);
                alu.setDni(result.getInt("dni"));
                alu.setApellido(result.getString("apellido"));
                alu.setNombre(result.getString("nombre"));
                alu.setFechaNac(result.getDate("fechaNacimiento").toLocalDate());
                alu.setActivo(true);   
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alu;
        }
        
        public Alumno buscarAlumnoPorDni(int dni){
            String sql="SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM  alumno "
                    + "WHERE dni=? AND estado=1";
            Alumno alu=null;
            
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet result=ps.executeQuery();
            if(result.next()){
                alu = new Alumno();
                alu.setIdAlumno(result.getInt("idAlumno"));
                alu.setDni(result.getInt("dni"));
                alu.setApellido(result.getString("apellido"));
                alu.setNombre(result.getString("nombre"));
                alu.setFechaNac(result.getDate("fechaNacimiento").toLocalDate());
                alu.setActivo(true);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alu;            
       }
        
        public List<Alumno> listarAlumnos(){
            String sql="SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM  alumno "
                    + "WHERE estado=1";
            List<Alumno> alumnos=new ArrayList<>();   
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet result=ps.executeQuery();
            if(result != null){ 
                while (result.next()) {
                    Alumno alu = new Alumno();
                    alu.setIdAlumno(result.getInt("idAlumno"));
                    alu.setDni(result.getInt("dni"));
                    alu.setApellido(result.getString("apellido"));
                    alu.setNombre(result.getString("nombre"));
                    alu.setFechaNac(result.getDate("fechaNacimiento").toLocalDate());
                    alumnos.add(alu);
                }    
            }else {
                JOptionPane.showMessageDialog(null, "No existen alumnos activos");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumnos;
        }

    
    
    
    
}
