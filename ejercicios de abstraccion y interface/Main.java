abstract class Roedor {
    // Atributos comunes a todos los roedores
    private String nombre;
    private int edad;

    // Constructor
    public Roedor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos comunes a todos los roedores
    public abstract void hacerSonido();

    public abstract void comer();

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Raton extends Roedor {
    // Constructor
    public Raton(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación de los métodos abstractos
    @Override
    public void hacerSonido() {
        System.out.println("El ratón hace squeak!");
    }

    @Override
    public void comer() {
        System.out.println("El ratón come queso.");
    }
}

class Gerbo extends Roedor {
    // Constructor
    public Gerbo(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación de los métodos abstractos
    @Override
    public void hacerSonido() {
        System.out.println("El gerbo hace chirrido!");
    }

    @Override
    public void comer() {
        System.out.println("El gerbo come semillas.");
    }
}

class Hamster extends Roedor {
    // Constructor
    public Hamster(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación de los métodos abstractos
    @Override
    public void hacerSonido() {
        System.out.println("El hámster hace squeak-squeak!");
    }

    @Override
    public void comer() {
        System.out.println("El hámster come comida.");
    }
}

public class Main {
    public static void main(String[] args) {
        Roedor raton = new Raton("Jerry", 2);
        raton.hacerSonido();
        raton.comer();

        Roedor gerbo = new Gerbo("Gus", 1);
        gerbo.hacerSonido();
        gerbo.comer();

        Roedor hamster = new Hamster("Harry", 3);
        hamster.hacerSonido();
        hamster.comer();
    }
}
