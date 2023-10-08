/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package massalud.Entidades;

/**
 *
 * @author juanBenavides
 */
public class Especialidad {
    private int idEspecialidad;
    private String NomEspecialidad;

    public Especialidad(int idEspecialidad, String NomEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.NomEspecialidad = NomEspecialidad;
    }

    public Especialidad() {
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNomEspecialidad() {
        return NomEspecialidad;
    }

    public void setNomEspecialidad(String NomEspecialidad) {
        this.NomEspecialidad = NomEspecialidad;
    }

    @Override
    public String toString() {
        return  "id: "+idEspecialidad+"-"+NomEspecialidad;
    }
    
    
}
