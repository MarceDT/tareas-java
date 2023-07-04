import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese la capital depositada en el banco: ");
        try (Scanner c = new Scanner(System.in)) {
            int ce= c.nextInt();
            System.out.println("Introduzca el interes: ");
            try (Scanner r = new Scanner(System.in)) {
                int re= r.nextInt();
                System.out.println("Introduzca los años que estara depositada la capital: ");
                try (Scanner t = new Scanner(System.in)) {
                    int te= t.nextInt();
                    double i=(ce*re*te)/100;
                    System.out.println("El interes despues de los años es: "+i+ "$");
                }
            }
        }

     
    }
}
