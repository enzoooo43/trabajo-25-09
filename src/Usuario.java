public class Usuario {
    private static long nextId = 0;
    private Long idUsuario;
    private String rut;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Usuario(String rut, String nombre, String apellido, String email, String telefono) {
        this.idUsuario = nextId++;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public Usuario(String rut, String nombre, String apellido, String email) {
        this.idUsuario = idUsuario;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
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
        System.out.println("Id : " + nextId +
                "\n rut: " + this.rut +
                "\n nombre: " + this.nombre +
                "\n apellido: " + this.apellido +
                "\n email: " + this.email +
                "\n telefono: " + this.telefono);
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + nextId +
                ", rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    public void actualizarEmail(String nuevoEmail){
        this.email = nuevoEmail;

    }

}