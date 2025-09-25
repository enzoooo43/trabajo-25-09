import java.util.Date;

public class Prestamo {
    private Long idPrestamo;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private String estado; // "Activo" o "Devuelto"
    private Usuario usuario;
    private Libro libro;

    public Prestamo() {
    }

    public Prestamo(Long idPrestamo, Date fechaPrestamo, Date fechaDevolucion, String estado, Usuario usuario, Libro libro) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
        this.usuario = usuario;
        this.libro = libro;
    }

    public Long getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Long idPrestamo) {
        this.idPrestamo = idPrestamo;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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

    public void registrarPrestamo() {
        this.estado = "Activo";
        this.fechaPrestamo = new Date(); // fecha actual
        libro.disminuirStock();
    }

    public void registrarDevolucion() {
        this.estado = "Devuelto";
        this.fechaDevolucion = new Date(); // fecha actual
        libro.aumentarStock();
    }

    public void mostrarDetalle() {
        System.out.println("------ DETALLE DEL PRÉSTAMO ------");
        System.out.println("ID Préstamo: " + idPrestamo);
        System.out.println("Estado: " + estado);
        System.out.println("Fecha Préstamo: " + fechaPrestamo);
        if (fechaDevolucion != null) {
            System.out.println("Fecha Devolución: " + fechaDevolucion);
        }
        System.out.println("\n-- Datos del Usuario --");
        usuario.mostrarDatos();
        System.out.println("\n-- Datos del Libro --");
        libro.mostrarDatos();
        System.out.println("----------------------------------\n");
    }
}
