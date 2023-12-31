package massalud.Entidades;

import java.util.Objects;

public class Especialidad {
    private int idEspecialidad;
    private String NomEspecialidad;

    public Especialidad(int idEspecialidad, String NomEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.NomEspecialidad = NomEspecialidad;
    }

    public Especialidad() {}

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
        return idEspecialidad+" - "+NomEspecialidad;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Especialidad otro = (Especialidad) obj;
        return Objects.equals(this.idEspecialidad, otro.idEspecialidad) && Objects.equals(this.NomEspecialidad, otro.NomEspecialidad);
    }
}
