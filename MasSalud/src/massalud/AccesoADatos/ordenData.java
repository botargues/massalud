package massalud.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import massalud.Entidades.Afiliados;
import massalud.Entidades.Orden;
import massalud.Entidades.Prestador;

public class ordenData {
    
    private Connection con = null;
    private afiliadoData afiData = new afiliadoData();
    private prestadorData presData = new prestadorData();

    public ordenData() {
        con = Conexion.getConexion();
    }
    
    public void guardarOrden(Orden orden){
        
        String squl = "INSERT INTO orden (fecha, formaDepago, importe, idAfiliado, idPrestador)"
                + "VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(squl, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDate(1, Date.valueOf(orden.getFecha()));
            ps.setString(2, orden.getFormaDepago());
            ps.setDouble(3, orden.getImporte());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
            
                orden.setIdOrden(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null,"Orden Guardada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden"+ ex);
        }
        
    }
    
    public void modificarOrden(Orden orden){
  
        String sql="UPDATE orden SET fecha=?, formaDepago=?, importe=?, idAfiliado=?, idPrestador=? "
            + "WHERE idOrden=?";
        try{ 
        PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setDate(1, Date.valueOf(orden.getFecha()));
        ps.setString(2, orden.getFormaDepago());        
        ps.setDouble(3, orden.getImporte()); 
        /*ps.setIdAfiliado(4, orden.getIdAfiliado());
        ps.setIdPrestador(5, orden.getIdPrestador());*/
        
        int exito=ps.executeUpdate();
        
        if(exito==1){
         JOptionPane.showMessageDialog(null, "Orden Modificada");
         }

        } catch(SQLException ex){
             
          JOptionPane.showMessageDialog(null, "Error al acceder a la BD"); 
             
         }
    }
    
    public ArrayList<Orden> buscarOrdenPorFecha(LocalDate fecha){
        Orden ord=null;
        
        ArrayList<Orden> orden = new ArrayList<>();
        
        String sql="SELECT fecha, formaDepago, importe, idAfiliado, idPrestador FROM orden WHERE fecha=?";
        
        PreparedStatement ss=null;
        
        try {
            ss=con.prepareStatement(sql);
            ss.setDate(1, Date.valueOf(fecha));
            ResultSet rs=ss.executeQuery();
            
            if (rs.next()){
                ord=new Orden();
                ord.setFecha(rs.getDate("fecha").toLocalDate());
                ord.setFormaDepago(rs.getString("formaDepago"));
                ord.setImporte(rs.getDouble("importe"));
                Afiliados afi = afiData.buscarAfiliadoPorId(rs.getInt("idAfiliado"));
                Prestador pres = presData.buscarPrestadorPorId(rs.getInt("idPrestador"));
                ord.setIdAfiliado(afi);
                ord.setIdPrestador(pres);
                orden.add(ord);
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro la orden");
                ss.close();
            }
        } catch (SQLException xx){
            JOptionPane.showMessageDialog(null,"Error alacceder a la tabla Orden "+xx.getMessage());
        }
        return orden;
    }
    
    public List<Orden> listarOrdenes(){
        List<Orden> ord = new ArrayList<>();
        try {
            String sql="SELECT * FROM orden";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs=ps.executeQuery();
                while (rs.next()){
                    Orden orden=new Orden();
                    orden.setIdOrden(rs.getInt("idOrden"));
                    orden.setFecha(rs.getDate("fecha").toLocalDate());
                    orden.setFormaDepago(rs.getString("formaDepago"));
                    /*orden.setIdAfiliado(rs.getInt("idAfiliado"));
                    orden.setIdPrestador(rs.getInt("idPrestador"));*/
                    ord.add(orden);
                }
            }
        }catch (SQLException exe){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden"+exe.getMessage());
        }
        return ord;
    }
    

    public List<Orden> obtenerOrdenes(LocalDate fecha){
        List<Orden> ord = new ArrayList<>();
        try {
            String sql="SELECT idOrden, fecha, formaDepago, importe, idAfiliado, idPrestador FROM orden";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs=ps.executeQuery();
                while (rs.next()){
                    Orden orden=new Orden();
                    orden.setIdOrden(rs.getInt("idOrden"));
                    orden.setFecha(rs.getDate("fecha").toLocalDate());
                    orden.setFormaDepago(rs.getString("formaDepago"));
                    orden.setImporte(rs.getDouble("importe"));
                    Afiliados afi = afiData.buscarAfiliadoPorId(rs.getInt("idAfiliado"));
                    Prestador pres = presData.buscarPrestadorPorId(rs.getInt("idPrestador"));
                    orden.setIdAfiliado(afi);
                    orden.setIdPrestador(pres);
                    ord.add(orden);
                }
            }
        }catch (SQLException exe){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden: "+exe.getMessage());
        }
        return ord;
    }
    
    
    
    
    
    
        public ArrayList<Orden> ordenPorAfiliado(int idAfiliado){
    
              ArrayList<Orden> ordenSacada= new ArrayList<>(); 
              
              String sql="SELECT* FROM Orden WHERE idAfiliado=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAfiliado);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
             Orden ord=new Orden();
             ord.setIdOrden(rs.getInt("idOrden"));
             ord.setFecha(rs.getDate("fecha").toLocalDate());
             ord.setFormaDepago(rs.getString("formaDepago"));
             ord.setImporte(rs.getInt("importe"));
             Afiliados afi=afiData.buscarAfiliadoPorId(rs.getInt("idAfiliado"));
             Prestador pres=presData.buscarPrestadorPorId(rs.getInt("idPrestador"));
             ord.setIdAfiliado(afi);
             ord.setIdPrestador(pres);
                          
             ordenSacada.add(ord);
             
            }
             
           ps.close();
            
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
          }
       return ordenSacada;  

      }

        
             public ArrayList<Orden> ordenPorPrestador(int idPrestador){
    
              ArrayList<Orden> ordenes= new ArrayList<>(); 
              
              String sql="SELECT* FROM Orden WHERE idPrestador=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idPrestador);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
             Orden ord=new Orden();
             ord.setIdOrden(rs.getInt("idOrden"));
             ord.setFecha(rs.getDate("fecha").toLocalDate());
             ord.setFormaDepago(rs.getString("formaDepago"));
             ord.setImporte(rs.getInt("importe"));
             Afiliados afi=afiData.buscarAfiliado(rs.getInt("idAfiliado"));
             Prestador pres=presData.buscarPrestadorPorId(rs.getInt("idPrestador"));
             ord.setIdAfiliado(afi);
             ord.setIdPrestador(pres);
                          
             ordenes.add(ord);
             
            }
             
           ps.close();
            
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
          }
       return ordenes;  

      }
    
}
