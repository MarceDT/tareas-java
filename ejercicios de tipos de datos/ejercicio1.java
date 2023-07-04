
import java.util.Scanner;

public class ejercicio1  {
        public static void main(String[] args) {
      System.out.println("Ingrese la cantidad de horas: ");
   try (Scanner semanas = new Scanner(System.in)) {
    int semanass=semanas.nextInt();
    
      System.out.println("La cantidad de semanas es: " +semanass/168 );
      System.out.println("La cantidad de dias es: " +semanass%(24*7)/24);
      System.out.println("La cantidad de horas es: " +semanass%24);
  }


    }
}