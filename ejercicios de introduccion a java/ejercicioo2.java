import java.util.Scanner;

public class ejercicioo2{
  public static void main(String[] args) {
   System.out.println("introduzca su nombre:");
   try (Scanner nombre = new Scanner(System.in)) {
    String nom = nombre.nextLine();
       System.out.println("Buenos dias " +nom+ " :D");
}
    
  } 
 } 