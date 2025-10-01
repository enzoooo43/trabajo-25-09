import java.util.Date;

public class Prestamo {
    private static long nextId = 0;
    private Long idPrestamo;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Estado estado;
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Estado estado, Usuario usuario, Libro libro) {
        this.idPrestamo = nextId++;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
        this.usuario = usuario;
        this.libro = libro;
    }

    public Prestamo(Date fechaPrestamo, Estado estado, Usuario usuario, Libro libro) {
        this.fechaPrestamo = fechaPrestamo;
        this.estado = estado;
        this.usuario = usuario;
        this.libro = libro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "idPrestamo=" + idPrestamo +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", estado=" + estado +
                ", usuario=" + usuario +
                ", libro=" + libro +
                '}';
    }

    public void registrarPrestamo(){
        this.estado = Estado.ACTIVO;
        libro.disminuirStock();
    }

    public void registrarDevolucion(){
        this.estado = Estado.DEVUELTO;
        this.fechaDevolucion = new Date();
        libro.aumentarStock();
    }

    public void mostrarDetalle() {
        System.out.println("Id : " + nextId +
                "\n Fecha prestamo: " + this.fechaPrestamo +
                "\n Fecha devolución: " + this.fechaDevolucion +
                "\n estado: " + this.estado +
                "\n usuario: " + this.usuario +
                "\n libro: " + this.libro);
    }

}



