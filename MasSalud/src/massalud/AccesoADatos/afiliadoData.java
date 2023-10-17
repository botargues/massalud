/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massalud.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import massalud.Entidades.Afiliados;

/**
 *
 * @author DADY
 */
public class afiliadoData {
 
    private Connection con =null;

    public afiliadoData() {
    
    con=Conexion.getConexion();
    
    }   

public void guardarAfiliado( Afiliados afiliado){ 
        
        String sql="INSERT INTO afiliados (nombre, apellido, dni, domicilio, telefono, estado )" 
                + " VALUES(?,?,?,?,?,?)";
        try {        
        
        PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        ps.setString(1, afiliado.getNombre() );
        ps.setString(2, afiliado.getApellido() );
        ps.setInt(3, afiliado.getDni());
        ps.setString(4, afiliado.getDomicilio());
        ps.setLong(5, afiliado.getTelefono());
        ps.setBoolean(6, afiliado.isEstado());
        
                
        ps.executeUpdate();
        
        ResultSet rs=ps.getGeneratedKeys();   
                                              
        if(rs.next()){                         
            afiliado.setIdAfiliado(rs.getInt(1));   
            JOptionPane.showMessageDialog(null,"Se ha agregado un afiliado");
          }
        
        ps.close();
              
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliados");
        }
    }
    
    public void modificarAfiliado(Afiliados afiliado){
  
        String sql="UPDATE afiliados SET nombre=?, apellido=?, dni=?, domicilio=?, telefono=? "
            + "WHERE idAAfiliados=?";
        try{ 
        PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, afiliado.getNombre());
        ps.setString(2, afiliado.getApellido());        
        ps.setInt(3, afiliado.getDni()); 
        ps.setString(4, afiliado.getDomicilio());
        ps.setLong(5, afiliado.getTelefono());
        ps.setInt(6, afiliado.getIdAfiliado());
        
        int exito=ps.executeUpdate();
        
        if(exito==1){
         JOptionPane.showMessageDialog(null, "Afiliado Modificado");
         }

        } catch(SQLException ex){
             
          JOptionPane.showMessageDialog(null, "Error al acceder a la BD"); 
             
         }
    }

     public void eliminarAfiliado(int dni){
     
        try {
            String sql="UPDATE afiliados SET estado=0 WHERE dni=? ";  // cuando tengo en la sentencia srl el un parametro dinamico luego tengo que setearlo  
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dni);
            int exito=ps.executeUpdate();
            if(exito==1){
              JOptionPane.showMessageDialog(null, "El Afiliado ha sido eliminado");
              }
                   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado"); 
        }
     
     }
     
     
     public Afiliados buscarAfiliado(int dni){
        
            
            String sql="SELECT idAfiliados, nombre, apellido, dni, domicilio, telefono FROM afiliados WHERE dni=? AND estado=1";
            Afiliados afiliado=null;
           try {    
            PreparedStatement ps=con.prepareStatement(sql);  
            ps.setInt(1, dni);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){      
            
            afiliado=new Afiliados();          
            
            afiliado.setIdAfiliado(rs.getInt("idAfiliados")); 
            afiliado.setNombre(rs.getString("nombre"));
            afiliado.setApellido(rs.getString("apellido"));
            afiliado.setDni(dni);   
            afiliado.setDomicilio(rs.getString("domicilio"));
            afiliado.setTelefono(rs.getLong("telefono"));
            afiliado.setEstado(true);
            
            } else {
             
             JOptionPane.showMessageDialog(null, "No ningun afiliado con ese dni");   
            
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliados");
        }
        
        return afiliado;         
        
        
        }
     
     public List<Afiliados> listarAfiliadosNoActivos(){
         
        String sql="SELECT idAfiliados,nombre, apellido, dni,domicilio,telefono FROM afiliados WHERE estado=0"; 
        ArrayList<Afiliados> afiliados=new ArrayList<>();
        
        
        try{     
        PreparedStatement ps=con.prepareStatement(sql);  //generamos el preparedstament con la conexion  y pasamos la sentencia sql
        ResultSet rs=ps.executeQuery(); 
        while(rs.next()){   
             
         Afiliados afi = new Afiliados();
         afi.setNombre(rs.getString("nombre"));
         afi.setApellido(rs.getString("apellido"));
         afi.setDni(rs.getInt("dni"));
         afi.setDomicilio(rs.getString("domicilio"));
         afi.setTelefono(rs.getLong("telefono"));
         afi.setEstado(rs.getBoolean("estado"));
         afiliados.add(afi);
        }
        ps.close();          
        
         
       }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "error al intenetar obtener los datos de afiliado " +e.getLocalizedMessage());
         
         }
                 
     return afiliados;
     
     }
     
     
     
     public List<Afiliados> listarAfiliadosActivos(){
         
           
        String sql="SELECT idAfiliados,nombre, apellido, dni,domicilio,telefono FROM afiliados WHERE estado=1";
        ArrayList<Afiliados> afiliados=new ArrayList<>();
        
        
        try{     
        PreparedStatement ps=con.prepareStatement(sql);  //generamos el preparedstament con la conexion  y pasamos la sentencia sql
        ResultSet rs=ps.executeQuery(); 
        while(rs.next()){   
             
                     
        Afiliados afi = new Afiliados();
         afi.setIdAfiliado(rs.getInt("idAfiliado"));
         afi.setNombre(rs.getString("nombre"));
         afi.setApellido(rs.getString("apellido"));
         afi.setDni(rs.getInt("dni"));
         afi.setDomicilio(rs.getString("domicilio"));
         afi.setTelefono(rs.getLong("telefono"));
         afi.setEstado(rs.getBoolean("estado"));
         afiliados.add(afi);
        }
        ps.close();          
        
         
         }catch(SQLException e){
       
             JOptionPane.showMessageDialog(null, "error al intenetar obtener los datos de afiliado " +e.getLocalizedMessage());
         
         }
                 
    
     return afiliados;
     
     }
     
}
