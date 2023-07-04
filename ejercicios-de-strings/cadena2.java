import java.util.Scanner;

public class cadena2 {
    public static void main(String[] args) {
     System.out.println("Ingrese su numero telefonico:");
     try (Scanner nume = new Scanner(System.in)) {
        String numero = nume.nextLine();
         String primpart=numero.substring(0,4);
         String segpart=numero.substring(4,7);
         String terpart=numero.substring(7,10);
         String numeropro="("+primpart+") "+segpart+"-"+terpart;
         System.out.println("Tu numero telefonico pero mas pro: " +numeropro);
    }
    

    }
}        
