import java.util.Scanner;

public class transporte {
    public static void main(String[] args) {

        System.out.println("Ingrese el lugar a donde va dirigido su paquete(1 america del norte, 2 america central, 3 america del sur,4 europa o 5 asia):");
        try (Scanner ubicacion = new Scanner(System.in)) {
            int ubicacion_paquete = ubicacion.nextInt();
        
            while(ubicacion_paquete<=5){  
              System.out.println("Ingrese el peso del paquete en kilogramos: ");
              try (Scanner peso = new Scanner(System.in)) {
                double peso_paquete = peso.nextDouble();
                  if (peso_paquete<5){
                    System.out.println("su paquete no sera transportado por cuestiones de logistica y seguridad.");
                  }
                  else{
                  switch (ubicacion_paquete) {
                    case 1:
                     double pes_pac=peso_paquete*24;
                     System.out.println("El costo total del paquete es de: " +pes_pac);
                        break;
                    case 2:
                     double pes_pac2=peso_paquete*20;
                     System.out.println("El costo total del paquete es de: " +pes_pac2);
                        break;
                    case 3:
                     double pes_pac3=peso_paquete*21;
                     System.out.println("El costo total del paquete es de: " +pes_pac3);
                     break;
                    case 4:
                     double pes_pac4=peso_paquete*10;
                     System.out.println("El costo total del paquete es de: " +pes_pac4);
                     break;
                    case 5:
                     double pes_pac5=peso_paquete*18;
                     System.out.println("El costo total del paquete es de: " +pes_pac5);
                     break;
                    default:
                     System.out.println("ingrese un lugar valido porfavor");
                     break;
                                       } 
                      }
            }
          } 
       
        if(ubicacion_paquete>5);
        System.out.println("Inserte una ubicacion valida.");

          }  
 }
}
