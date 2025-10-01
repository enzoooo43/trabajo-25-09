public class Libro {
    /*
    id_libro (Long)
    titulo (String)
    autor (String)
    isbn (String)
    anioPublicacion (Integer)
    stock (Integer)
    */
    private Long idLibro;
    private String titulo;
    private String autor;
    private String isbn;
    private String anioPublicacion;
    private int stock;


    public Libro(Long idLibro, String titulo, String autor, String isbn, String anioPublicacion, int stock) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.stock = stock;
    }

    public Libro(){

    }

    public Long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Long idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAniopublicacion() {
        return anioPublicacion;
    }

    public void setAniopublicacion(String aniopublicacion) {
        this.anioPublicacion = aniopublicacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void mostrarinformacion() {
        System.out.println("Id : " + this.idLibro +
                "\n titulo: " + this.titulo +
                "\n autor: " + this.autor +
                "\n isbn: " + this.isbn +
                "\n añopublicación: " + this.anioPublicacion +
                "\n stock: " + this.stock);
    }


    @Override // pepito wallace was here :D
    public String toString() {
        return "libro{" +
                "idLibro=" + idLibro +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", Año de publicación='" + anioPublicacion + '\'' +
                ", stock=" + stock +
                '}';
    }

    public void disminuirStock() {
        if (this.stock > 0) {
            this.stock--;
        }
    }

    public void aumentarStock() {
        if (this.stock > 0) {
            this.stock++;
        }


    }
}
