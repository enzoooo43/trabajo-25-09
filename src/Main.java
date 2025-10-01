import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro(1L, "Papelucho", "Marcela Paz", "978-956-349-568-3", "1990", 5);
        libro1.aumentarStock();
        libro1.mostrarinformacion();
        libro1.disminuirStock();
        libro1.mostrarinformacion();

        Libro libro2 = new Libro(2L, "Vigilancia permanente", "Edward Snowden", "978-950-49-6852-8", "2019", 10);
        libro2.aumentarStock();
        libro2.mostrarinformacion();
        libro2.disminuirStock();
        libro2.mostrarinformacion();

        Date fechaPrestamo = new Date(2025, 10, 1);

        Usuario usuario1 = new Usuario("22515174-1", "Miguel", "Cordero", "example@gmail.com", "+56 9 1234 5678");
        Prestamo prestamo1 = new Prestamo(fechaPrestamo ,null , Estado.ACTIVO, usuario1, libro2);
        prestamo1.mostrarDetalle();
    }
}