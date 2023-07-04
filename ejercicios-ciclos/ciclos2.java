import java.util.Scanner;

public class ciclos2 {
    public static void main(String[] args) {
     System.out.println("Introduzca el valor de n:");
     Scanner n = new Scanner(System.in);
     int ne = n.nextInt();
     System.out.println("Introduzca el valor de y:");
     Scanner y = new Scanner(System.in);
     int ye = y.nextInt();
        for(int c=1;c<=ne;c++){
          if(ye%c==0 )
          {
         System.out.println("*");
          }
          else
          { 
         System.out.println(c);
          }
        }
n.close();
y.close();
     }
    }