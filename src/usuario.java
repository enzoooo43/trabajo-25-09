public class Usuario {
    private Long idUsuario;
    private String rut;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;


    public Usuario() {
    }

    public Usuario(Long idUsuario, String rut, String nombre, String apellido, String email, String telefono) {
        this.idUsuario = idUsuario;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }


    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public void mostrarDatos() {
        System.out.println("Usuario: " + nombre + " " + apellido);
        System.out.println("RUT: " + rut);
        System.out.println("Email: " + email);
        System.out.println("Teléfono: " + (telefono != null ? telefono : "No registrado"));
    }

    public void actualizarEmail(String nuevoEmail) {
        this.email = nuevoEmail;
    }
}
