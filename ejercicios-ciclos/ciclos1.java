import java.util.Scanner;

public class ciclos1 {
    public static void main(String[] args) {
       System.out.println("Introduzca un numero y su tabla de multiplicar se mostrara: ");
       Scanner x = new Scanner(System.in);
       int num = x.nextInt();
    int c=0;   
    for(int i=0;i<10;i++){
     c++;
      int nume=num*c;
     System.out.println(nume);
     
    }
x.close();
     }
    }