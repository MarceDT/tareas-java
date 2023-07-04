
public class ejercicio2{
  public static void main(String[] args) {
   int hora=40;
   int pago=5;
   int total=hora*pago;
   System.out.println("El total es: "+total+ "$");
   double retencion=total*12.5/100;
   System.out.println("La retencion es: "+retencion+ "$");
   double neto=total-retencion;
   System.out.println("El valor neto del trabajador es: "+neto +"$");

  }
}