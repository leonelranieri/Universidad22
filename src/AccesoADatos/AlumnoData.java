package AccesoADatos;

import Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
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
    
    
    
    
}
