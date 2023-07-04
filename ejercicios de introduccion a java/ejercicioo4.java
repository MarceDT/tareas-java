import java.util.Scanner;

public class ejercicioo4 {
    public static void main(String[] args) {
   System.out.println("Introduzca la cantidad de litros a cargar:");
   try (Scanner litro = new Scanner(System.in)) {
    int lit = litro.nextInt();
       double total=lit*3.785;
       System.out.println("El costo total es de :"+total+ " $");
}
  
    } 
}         