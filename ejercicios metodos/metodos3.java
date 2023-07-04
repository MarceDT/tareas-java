import java.util.Scanner;
 public class metodos3{
    public static void main(String[] args){
       System.out.println("Introduzca que area quiere calcular, 1 para circulo, 2 para cuadrado y 3 para triangulo");
       Scanner area= new Scanner(System.in);
       int area1=area.nextInt();
       calculo(area1);
 }

  public static void calculo(int area1) {
   switch (area1) {
    case 1:
        System.out.println("introduzca el radio");
        Scanner radio= new Scanner(System.in);
        double radioo= radio.nextDouble();
        double radcu=Math.pow(radioo,2);
        double arcir=radcu*3.14;
        System.out.println("el area del circulo es: "+arcir);
        break;
   case 2:
        System.out.println("introduzca la base");
        Scanner base= new Scanner(System.in);
        double bass=base.nextDouble();
        System.out.println("introduzca la altura");
        Scanner altura= new Scanner(System.in);
        double alt=altura.nextDouble();
        double artri=(bass*alt)/2;
        System.out.println("el area del triangulo es: "+artri);
  case 3:
  System.out.println("introduzca el lado");
  Scanner lado= new Scanner(System.in);
  double lado1=lado.nextDouble();
  double arcuad=lado1*lado1;
  System.out.println("el area del cuadrado es: "+arcuad);
    default:
    System.out.println("Introduzca un comando valido porfavor.");
        break;
   }   
}

  
}
while(c<=10 && !(com.equals("salir")) ){