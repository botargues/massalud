package massalud.Entidades;

public class Prestador {
    
    private int idPrestador;
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private String telefono;
    private boolean estado;
    private Especialidad especialidad;

    public Prestador(int idPrestador, String nombre, String apellido, int dni, String domicilio, String telefono, boolean estado, Especialidad especialidad) {
        this.idPrestador = idPrestador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
        this.especialidad = especialidad;
    }

    public Prestador(String nombre, String apellido, int dni, String domicilio, String telefono, boolean estado, Especialidad especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
        this.especialidad = especialidad;
    }

    public Prestador() {}
    
    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
       this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return nombre+" "+apellido;
    }
}
