public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro(1L, "Papelucho", "Marcela Paz", "978-956-349-3", 1990, 5);

        libro1.aumentarStock();
        libro1.mostrarinformacion();
        libro1.disminuirStock();
        libro1.mostrarinformacion();
    }
}