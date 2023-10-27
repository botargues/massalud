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
import massalud.Entidades.Especialidad;
import massalud.Entidades.Prestador;
import java.util.ArrayList;
import java.util.List;
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
    
    public Prestador buscarPrestadorDniActivos(int dni){
        Prestador prestado=null;
        
        String sql="SELECT nombre, apellido, dni, domicilio, telefono, estado, idEspecialidad FROM prestador WHERE dni=? AND estado=1";
        
        PreparedStatement ss=null;
        especialidadData esp = new especialidadData();
        
        try {
            ss=con.prepareStatement(sql);
            ss.setInt(1,dni);
            ResultSet rs=ss.executeQuery();
            System.out.println(rs);
            if (rs.next()){
                
                prestado=new Prestador();
                prestado.setNombre(rs.getString("nombre"));
                prestado.setApellido(rs.getString("apellido"));
                prestado.setDni(rs.getInt("dni"));
                prestado.setDomicilio(rs.getString("domicilio"));
                prestado.setTelefono(rs.getLong("telefono"));
                prestado.setEstado(rs.getBoolean("estado"));
//                System.out.println(prestado);
                
                int IdEspecialidad = rs.getInt("idEspecialidad");
                Especialidad especialidad = esp.obtenerIdEspecialida(IdEspecialidad);
                
                prestado.setEspecialidad(especialidad);
                //System.out.println(especialidad);
                //System.out.println(prestado);
            }else{
                JOptionPane.showMessageDialog(null,"prestador no registrado");
                ss.close();
            }
        } catch (SQLException xx){
            JOptionPane.showMessageDialog(null,"Error alacceder a la tabla prestador "+xx.getLocalizedMessage());
        }
        return prestado;
    }
    
    public Prestador buscarPrestadorDniNoActivos(int dni){
     Prestador prestado=null;
        
        String sql="SELECT nombre, apellido, dni, domicilio, telefono, estado, idEspecialidad FROM prestador WHERE dni=? AND estado=0";
        
        PreparedStatement ss=null;
        especialidadData esp = new especialidadData();
        
        try {
            ss=con.prepareStatement(sql);
            ss.setInt(1,dni);
            ResultSet rs=ss.executeQuery();
            System.out.println(rs);
            if (rs.next()){
                
                prestado=new Prestador();
                prestado.setNombre(rs.getString("nombre"));
                prestado.setApellido(rs.getString("apellido"));
                prestado.setDni(rs.getInt("dni"));
                prestado.setDomicilio(rs.getString("domicilio"));
                prestado.setTelefono(rs.getLong("telefono"));
                prestado.setEstado(rs.getBoolean("estado"));
//                System.out.println(prestado);
                
                int IdEspecialidad = rs.getInt("idEspecialidad");
                Especialidad especialidad = esp.obtenerIdEspecialida(IdEspecialidad);
                
                prestado.setEspecialidad(especialidad);
                //System.out.println(especialidad);
                //System.out.println(prestado);
            }else{
                JOptionPane.showMessageDialog(null,"prestador no registrado");
                ss.close();
            }
        } catch (SQLException xx){
            JOptionPane.showMessageDialog(null,"Error alacceder a la tabla prestador "+xx.getLocalizedMessage());
        }
        return prestado;
    
    
    
    
    }
     
    public void modificarPrestador(Prestador prestador){
    
        String sql = "UPDATE prestador SET nombre = ?, apellido = ?, dni = ?, domicilio = ?, telefono = ?, estado = ?, idEspecialidad = ? WHERE dni = ?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, prestador.getNombre());
            ps.setString(2, prestador.getApellido());
            ps.setInt(3, prestador.getDni());
            ps.setString(4, prestador.getDomicilio());
            ps.setLong(5, prestador.getTelefono());
            ps.setBoolean(6, prestador.isEstado());
            ps.setInt(7, prestador.getEspecialidad().getIdEspecialidad());
            ps.setInt(8, prestador.getDni());
            int exito = ps.executeUpdate();
            
            if(exito==1){
                
                JOptionPane.showMessageDialog(null,"Prestador Modificado Exitosamente");
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador"+ ex);
        }
    }
    
    public void eliminarPrestadro(int dni){
        
        String sql = "UPDATE prestador SET estado = 0 WHERE dni = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exito =ps.executeUpdate();
            
            if (exito ==1) {
                JOptionPane.showMessageDialog(null, "Prestador Borrado");
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Prestador"+ ex);
        }
    
    }
    
    public ArrayList<Prestador> listarPrestador(){
        
            
           String sql="SELECT idPrestador,nombre, apellido,dni,domicilio,telefono FROM prestador WHERE estado=1"; 
           ArrayList<Prestador> prestadores=new ArrayList<>();
         try {    
            PreparedStatement ps=con.prepareStatement(sql);  
            ResultSet rs=ps.executeQuery();
            while(rs.next()){       
            
              Prestador pres=new Prestador(); 
              pres.setIdPrestador(rs.getInt("idPrestador")); 
              pres.setNombre(rs.getString("nombre"));
              pres.setApellido(rs.getString("apellido"));
              pres.setDni(rs.getInt("dni"));
              pres.setDomicilio(rs.getString("domicilio"));
              pres.setTelefono(rs.getLong("telefono"));
              pres.setEstado(true);
              
               prestadores.add( pres);
            
              
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador");
        }
        
        return prestadores;         
        
        
        }
    
    public Prestador buscarPrestadorPorId(int idPrestador){
        Prestador prestado=null;
        String sql="SELECT nombre, apellido, dni, domicilio, telefono, estado, idEspecialidad FROM prestador WHERE idPrestador=? AND estado=1";
        PreparedStatement ss=null;
        especialidadData esp = new especialidadData();
        try {
            ss=con.prepareStatement(sql);
            ss.setInt(1,idPrestador);
            ResultSet rs=ss.executeQuery();
            if (rs.next()){
                prestado=new Prestador();
                prestado.setNombre(rs.getString("nombre"));
                prestado.setApellido(rs.getString("apellido"));
                prestado.setDni(rs.getInt("dni"));
                prestado.setDomicilio(rs.getString("domicilio"));
                prestado.setTelefono(rs.getLong("telefono"));
                prestado.setEstado(rs.getBoolean("estado"));
                prestado.setIdPrestador(idPrestador);
                int IdEspecialidad = rs.getInt("idEspecialidad");
                Especialidad especialidad = esp.obtenerIdEspecialida(IdEspecialidad);
                prestado.setEspecialidad(especialidad);
            }else{
                ss.close();
            }
        } catch (SQLException xx){
            JOptionPane.showMessageDialog(null,"Error alacceder a la tabla prestador "+xx.getLocalizedMessage());
        }
        return prestado;
    }
    
    public List<Especialidad> listarEspecialidad(){
        List<Especialidad> especia = new ArrayList<>();
        try {
            String sql="SELECT * FROM especialidad";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Especialidad especial =new Especialidad();
                especial.setIdEspecialidad(rs.getInt("idEspecialidad"));
                especial.setNomEspecialidad(rs.getString("especialidad"));
                especia.add(especial);
            }
            ps.close();
        }catch (SQLException exe){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Especialidades "+exe.getMessage());
        }
            return especia;
        }
}
