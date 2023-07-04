import java.util.Scanner;
import java.lang.Math;

public class operadores3 {
    public static void main(String[] args) {
        System.out.println("Introduzca el valor de a: ");
        Scanner a = new Scanner(System.in);
        double a1 = a.nextDouble();
        System.out.println("Introduzca el valor de b: ");
        Scanner b = new Scanner(System.in);
        double b1 = b.nextDouble();
        System.out.println("Introduzca el valor de c: ");
        Scanner c = new Scanner(System.in);
        double c1 = c.nextDouble();
        double r=Math.pow(b1,2)-4*a1*c1;
        double x,x1,x2;
if(r==0){
x=-b1/(2*a1);
System.out.println("El resultado de la ecuacion es: " +x);
}else if(r>0){
    x1=(-b1+Math.sqrt(r))/(2*a1);
    x2=(-b1-Math.sqrt(r))/(2*a1);
    System.out.println("Los posibles resultados: " +x1+" y " +x2);
}else {
    System.out.println("La ecuacion no tiene solucion.");
}
a.close();
b.close();
c.close();


    }
} 