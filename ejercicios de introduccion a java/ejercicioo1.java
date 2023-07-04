import java.util.Scanner;

public class ejercicioo1 {
    public static void main(String[] args) {
        System.out.print("Introduzca el primer numero a mostrar:");
        try (Scanner num1 = new Scanner(System.in)) {
            int nume1 = num1.nextInt();
            System.out.print("Introduzca el segundo numero a mostrar:");
            try (Scanner num2 = new Scanner(System.in)) {
                int nume2 = num2.nextInt();
     System.out.println("El primer numero que introdujiste fue: " +nume1+ " y el segundo fue: " +nume2);
            }
        } 
    
}
}
