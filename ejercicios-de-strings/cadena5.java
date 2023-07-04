import java.util.Scanner;

public class cadena5 {
    public static void main(String[] args) {
  System.out.println("Introduzca la primera cadena:");
 Scanner c1 = new Scanner(System.in);
 String cad1 = c1.nextLine();
  System.out.println("Introduzca la segunda cadena:");
 Scanner c2 = new Scanner(System.in);
 String cad2 = c2.nextLine();
     if(cad2.contains(cad1)){
    int cad3=cad2.lastIndexOf(cad1);
    String cad4=cad2.substring(0,cad3);
    int cad5=cad2.length();
    int cad7=cad1.length();
    String cad6=cad2.substring(cad3+cad7, cad5);
    System.out.println("Tu cadena cambiada es: "+cad4+cad1.toUpperCase()+cad6);

  }
  else{
    System.out.println("Las cadenas no coinciden :v");
  }
    c1.close();
    c2.close();

      }
    }