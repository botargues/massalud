/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package massalud.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import massalud.Entidades.Prestador;

/**
 *
 * @author Ignacio Benavides
 */
public class prestadorData {
    private Connection con =null;

    public prestadorData() {
        con = Conexion.getConexion();
    }
    
    public void guardarPrestadores(Prestador prestador){
    
        String sql = "INSERT INTO prestador (nombre, apellido, dni, domicilio, telefono, estado, idEspecialidad) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {        
        
        PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        ps.setString(1, prestador.getNombre());
        ps.setString(2, prestador.getApellido());
        ps.setInt(3, prestador.getDni());
        ps.setString(4, prestador.getDomicilio());
        ps.setLong(5, prestador.getTelefono());
        ps.setBoolean(6, prestador.isEstado());
        ps.setInt(7, prestador.getEspecialidad().getIdEspecialidad());      
        ps.executeUpdate();
            
        
        ResultSet rs=ps.getGeneratedKeys();   
                                              
        if(rs.next()){                         
            prestador.setIdPrestador(rs.getInt(1));   
            JOptionPane.showMessageDialog(null,"Se ha agregado un Prestador");
          }
              
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador"+ex.getLocalizedMessage());
        }
    }
    
    public boolean ValidacionDni(int dni){
    
    String sql = "SELECT COUNT(*) FROM prestador WHERE dni = ?";
    
    try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
            int count = rs.getInt(1);
            return count > 0;
        }
        
        
    }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al prestador");    
    }
    
    return  false;
    
    }
}
