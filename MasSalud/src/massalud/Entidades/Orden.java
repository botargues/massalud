package massalud.Entidades;

import java.time.LocalDate;

public class Orden {
    private int idOrden;
    private LocalDate fecha;
    private Byte formaDepago;
    private double importe;
    private Afiliados idAfiliado;
    private Prestador idPrestador;

    public Orden(int idOrden, LocalDate fecha, Byte formaDepago, double importe, Afiliados idAfiliado, Prestador idPrestador) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.formaDepago = formaDepago;
        this.importe = importe;
        this.idAfiliado = idAfiliado;
        this.idPrestador = idPrestador;
    }

    public Orden(LocalDate fecha, Byte formaDepago, double importe, Afiliados idAfiliado, Prestador idPrestador) {
        this.fecha = fecha;
        this.formaDepago = formaDepago;
        this.importe = importe;
        this.idAfiliado = idAfiliado;
        this.idPrestador = idPrestador;
    }

    public Orden() {}

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Byte getFormaDepago() {
        return formaDepago;
    }

    public void setFormaDepago(Byte formaDepago) {
        this.formaDepago = formaDepago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Afiliados getIdAfiliado() {
        return idAfiliado;
    }
    
  
    public void setIdAfiliado(Afiliados idAfiliado) {
        this.idAfiliado = idAfiliado;
    }

    public Prestador getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(Prestador idPrestador) {
        this.idPrestador = idPrestador;
    }

    @Override
    public String toString() {
        return "{" + "" + fecha + '}';
    }
}
