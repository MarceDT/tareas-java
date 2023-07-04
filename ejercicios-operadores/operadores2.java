import java.util.Scanner;

public class operadores2 {
    public static void main(String[] args) {
System.out.println("Introduzca el valor de a: " );
Scanner a = new Scanner(System.in);
int aa = a.nextInt();
System.out.println("Introduzca el valor de b: " );
Scanner b = new Scanner(System.in);
int bb = b.nextInt();
double aentreb=aa/bb;
double bentrea=bb/aa;
System.out.println("El resultado de la division entre "+aa+" y "+bb+" es: "+aentreb);
System.out.println("El resultado de la division entre "+bb+" y "+aa+" es: "+bentrea);
a.close();
b.close();
      }
    }