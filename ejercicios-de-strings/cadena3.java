import java.util.Scanner;

public class cadena3 {
    public static void main(String[] args) {
    System.out.println("Ingrese su cadena: ");
    Scanner cad = new Scanner(System.in);
        String cadena = cad.nextLine();
        System.out.println("Ingrese la longitud de su cadena");
        Scanner longi = new Scanner(System.in); 
        int longitud = longi.nextInt();
        int longtot=longitud-1;
        StringBuffer cadena2 = new StringBuffer(cadena);
        StringBuffer cadena3=cadena2.reverse();
        String cadenota=cadena3.substring(0,longtot);
        System.out.println("El resultado de la palabra con su espejo es: " +cadena+cadenota);
        cad.close();
        longi.close();
        }
    }

    