import java.util.Scanner;

public class operadores1 {
    public static void main(String[] args) {
 System.out.println("Introduzca el primer numero: ");
 Scanner num1= new Scanner(System.in);
 double numero1=num1.nextInt();
 System.out.println("Introduzca el segundo numero: ");
 Scanner num2= new Scanner(System.in);
 double numero2=num2.nextInt();
 System.out.println("El resto de la division de los numeros es: " +numero1%numero2);
 num1.close();
 num2.close();

      }
    }