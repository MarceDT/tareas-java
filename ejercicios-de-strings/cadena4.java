import java.util.Scanner;

public class cadena4 {
    public static void main(String[] args) {
  System.out.println("Introduzca la primera cadena:");
 Scanner c1 = new Scanner(System.in);
 String cad1 = c1.nextLine();
  System.out.println("Introduzca la segunda cadena:");
 Scanner c2 = new Scanner(System.in);
 String cad2 = c2.nextLine();
     if(cad1.contains(cad2)){
    System.out.println("La cadena tiene una coincidencia");
  }
  else{
    System.out.println("Las cadenas no coinciden :v");
  }
    c1.close();
    c2.close();

      }
    }