import java.util.Scanner;

public class ciclos3 {
    public static void main(String[] args) {
System.out.println("Introduzca su cadena: ");
Scanner cad = new Scanner(System.in);
String cadena = cad.nextLine();
int longe=cadena.length();
int c1=0;
  for(int c=1;c<=longe;c++)
  {
  
  String sub=cadena.substring(c1, c);
  System.out.println("Letra "+c+ ": "+ sub);
  c1++;
  
  }
  cad.close();
    }
}