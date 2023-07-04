import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
    
 System.out.print("Ingrese el valor de A:");
 try (Scanner a = new Scanner(System.in)) {
    int A= a.nextInt();
 System.out.println("Introduzca el valor de B:");
 try (Scanner b = new Scanner(System.in)) {
    int B= b.nextInt();
     System.out.println("Introduzca el valor de C:");
       try (Scanner c = new Scanner(System.in)) {
        int C= c.nextInt();
         System.out.println("Introduzca el valor de D:");
          try (Scanner d = new Scanner(System.in)) {
            int D= d.nextInt();
              double sum=A+B;
              double rest=D-C;
              double mult=A*B*C*D;
              double div=A/B;
            
              System.out.println("El valor de la suma de A y B es: " +sum);
              System.out.println("El valor de la resta de D y C es: " +rest);
              System.out.println("El valor de la multiplicacion de las letras es: " +mult);
              System.out.println("El valor de la division de A y B es: " +div);
        }
    }
}
}
    

}
}