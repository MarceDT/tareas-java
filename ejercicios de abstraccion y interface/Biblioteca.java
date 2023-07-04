// Interfaz Prestable
interface Prestable {
    void prestar();
    void devolver();
    boolean prestado();
}

// Clase base para los materiales de la biblioteca
class MaterialBiblioteca {
    private String codigo;
    private String titulo;
    private int anioPublicacion;

    // Constructor
    public MaterialBiblioteca(String codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Método toString para imprimir los atributos
    public String toString() {
        return "Código: " + codigo + "\nTítulo: " + titulo + "\nAño de publicación: " + anioPublicacion;
    }
}

// Clase Libro que extiende MaterialBiblioteca e implementa Prestable
class Libro extends MaterialBiblioteca implements Prestable {
    private boolean prestado;

    // Constructor
    public Libro(String codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.prestado = false;
    }

    // Implementación de los métodos de la interfaz Prestable
    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro '" + getTitulo() + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + getTitulo() + "' ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro '" + getTitulo() + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + getTitulo() + "' no estaba prestado.");
        }
    }

    @Override
    public boolean prestado() {
        return prestado;
    }
}

// Clase Revista que extiende MaterialBiblioteca
class Revista extends MaterialBiblioteca {
    private int numero;

    // Constructor
    public Revista(String codigo, String titulo, int anioPublicacion, int numero) {
        super(codigo, titulo, anioPublicacion);
        this.numero = numero;
    }

    // Método toString para imprimir los atributos, incluyendo el número de la revista
    public String toString() {
        return super.toString() + "\nNúmero de revista: " + numero;
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        // Creación de un libro y una revista
        Libro libro = new Libro("L001", "El gran libro", 2005);
        Revista revista = new Revista("R001", "Revista interesante", 2020, 10);

        // Prueba de los métodos prestable en el libro
        libro.prestar(); // Se presta el libro
        libro.prestar(); // El libro ya estaba prestado
        libro.devolver(); // Se devuelve el libro
        libro.devolver(); // El libro no estaba prestado

        // Impresión de los atributos del libro y la revista
        System.out.println("\nInformación del libro:\n" + libro.toString());
        System.out.println("\nInformación de la revista:\n" + revista.toString());
    }
}
