import java.util.Scanner;

public class ejercicioo3 {

public static void main(String[] args) {

System.out.println("introduzca un numero y se mostrara su doble y triple:");
try (Scanner numero = new Scanner(System.in)) {
    int num = numero.nextInt();
    int resu1= (int) Math.pow(num,2);
    int resu2= (int) Math.pow(num,3);
System.out.println("El doble del numero introducido es:" +resu1);
System.out.println("El triple del numero introducido es:" +resu2);
  }
 } 
} 