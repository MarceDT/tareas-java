import java.util.Scanner;

public class cadena1 {
    public static void main(String[] args) {
   System.out.println("Ingrese la primera cadena");
   try (Scanner c1 = new Scanner(System.in)) {
    String cade1= c1.nextLine();
       System.out.println("Ingrese la segunda cadena");
       try (Scanner c2 = new Scanner(System.in)) {
        String cade2= c2.nextLine();
           System.out.println("Ingrese la tercera cadena");
           try (Scanner c3 = new Scanner(System.in)) {
            String cade3= c3.nextLine(); 
               String combi1=cade1.substring(0,2);
               String combi2=cade2.substring(0,4);
               String combi3=cade3.substring(0,6);
               String combi4=combi1+" "+combi2+"-"+combi3;
               int cantidad=combi4.length();
               System.out.println("La cadena combinada es: "+combi4+" y su longitud es: " +cantidad);
        }
    }
}    
    }
}

