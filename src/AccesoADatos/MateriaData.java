package AccesoADatos;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leone
 */
public class MateriaData {
    
    private Connection con=null;
    
    public MateriaData(){
        con=Conexion.getConexion();
    }
    
    public void guardarMateria(Materia mat){
        String sql="INSERT INTO materia(nombre, año, estado)"
                + "VALUES (?, ?, ?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mat.getNombre());
            ps.setInt(2, mat.getAño());
            ps.setBoolean(3, mat.isEstado());
            
            ps.executeUpdate();
            ResultSet result=ps.getGeneratedKeys(); //matriz con los id de las materia enviadas
            if(result.next()){
                mat.setIdMateria(result.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia cargada exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia : " + ex.getMessage());
        }   
    }
    
    public Materia buscarMateriaPorId(int id){
            String sql="SELECT nombre, año FROM materia "
                    + "WHERE idMateria=? AND estado=1";
            Materia mat=null;
            
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet result=ps.executeQuery();
            if(result.next()){
                mat=new Materia();
                mat.setIdMateria(id);
                mat.setNombre(result.getString("nombre"));
                mat.setAño(result.getInt("año"));
                mat.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe la materia con id : "+id);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return mat;
        }
    
    
    public void modificarMateria(Materia mat){
        String sql="UPDATE materia SET nombre=?,año=?, estado=? WHERE idMateria=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,mat.getNombre());
            ps.setInt(2, mat.getAño());
            ps.setBoolean(3, mat.isEstado());
            ps.setInt(4, mat.getIdMateria());
            int exito=ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia : "+ex.getMessage());
        }
     }
    
    public void eliminarMateria(int id){
            String sql="UPDATE materia SET estado=0 WHERE idMateria=?";
            
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Materia eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }
    
    public List<Materia> listarMaterias(){
            String sql="SELECT idMateria, nombre, año, estado FROM  materia "
                    + "WHERE estado=1";
            List<Materia> materias=new ArrayList<>();   
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet result=ps.executeQuery();
            if(result != null){ 
                while (result.next()) {
                    Materia mat = new Materia();
                    mat.setIdMateria(result.getInt("idMateria"));
                    mat.setNombre(result.getString("nombre"));
                    mat.setAño(result.getInt("año"));
                    mat.setEstado(result.getBoolean("estado"));
                    materias.add(mat);
                }    
            }else {
                JOptionPane.showMessageDialog(null, "No existen materias activas");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return materias;
        }
    
}
