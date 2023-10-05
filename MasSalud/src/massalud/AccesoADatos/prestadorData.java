/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package massalud.AccesoADatos;

import java.sql.Connection;

/**
 *
 * @author Ignacio Benavides
 */
public class prestadorData {
    private Connection con =null;

    public prestadorData() {
        con = Conexion.getConexion();
    }
    
    
}
