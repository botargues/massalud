/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package massalud.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import massalud.Entidades.Especialidad;

/**
 *
 * @author Usuario
 */
public class especialidadData {
    
    private Connection con =null;

    public especialidadData() {
        con = Conexion.getConexion();
    }
    
    public List<Especialidad> listarEspecialidades(){
    
        List<Especialidad> nombrarEspecialidad = new ArrayList<>();
        
        try {
            String sql="SELECT * FROM especialidad ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Especialidad esp = new Especialidad();
                
                esp.setIdEspecialidad(rs.getInt("idEspecialidad"));
                esp.setNomEspecialidad(rs.getString("Especialidad"));
                nombrarEspecialidad.add(esp);
            
            }
        } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Especialidad"+e.getMessage());
        }
    
        return nombrarEspecialidad;
    }
    
    
    public Especialidad obtenerIdEspecialida(int idEspecialidad){
     
         String sql = "SELECT idEspecialidad, Especialidad FROM especialidad WHERE idEspecialidad = ? ";
        Especialidad idEsp = null;
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEspecialidad);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                
                
                idEsp = new Especialidad();
                
                idEsp.setIdEspecialidad(rs.getInt("idEspecialidad"));
                idEsp.setNomEspecialidad(rs.getString("Especialidad"));
                
            }
            
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Alumno");
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "error: "+e.getLocalizedMessage());
        }
        return idEsp;
     
     }
    
    
    
    
}
