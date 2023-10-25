package massalud.AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "massalud";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    
    public Conexion(){}
    
    public static Connection getConexion(){
    
        if(connection == null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers: "+ex);
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error de conexion"+ex);
            }
        }
        return connection;
    }
}
