import java.util.Scanner;

public class Ordenador {
    private String marca;
    private int velocidad;
    private static int contador = 0;

    public Ordenador() {
        this.velocidad = 3000;
        contador++;
    }

    public Ordenador(String marca) {
        this.marca = marca;
        this.velocidad = 3000;
        contador++;
    }

    public Ordenador(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
        contador++;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public static int getContador() {
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de ordenadores a crear: ");
        int cantidadOrdenadores = scanner.nextInt();
        scanner.nextLine();

        Ordenador[] ordenadores = new Ordenador[cantidadOrdenadores];

        for (int i = 0; i < cantidadOrdenadores; i++) {
            System.out.println("\nOrdenador #" + (i + 1));

            System.out.print("Ingrese la marca del ordenador: ");
            String marca = scanner.nextLine();

            System.out.print("Ingrese la velocidad del ordenador en Megahertzios: ");
            int velocidad = scanner.nextInt();
            scanner.nextLine();

            ordenadores[i] = new Ordenador(marca, velocidad);
        }

        System.out.println("\nDetalles de los ordenadores:");

        for (int i = 0; i < cantidadOrdenadores; i++) {
            System.out.println("\nOrdenador #" + (i + 1));
            System.out.println("Marca: " + ordenadores[i].getMarca());
            System.out.println("Velocidad: " + ordenadores[i].getVelocidad());
        }

        System.out.println("\nContador de ordenadores: " + Ordenador.getContador());

        scanner.close();
    }
}
