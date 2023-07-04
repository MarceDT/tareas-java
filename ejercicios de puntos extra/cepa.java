import java.util.Scanner;
 public class cepa{
  static int o;
    public static void main(String[] args) {
     
      System.out.println("Introduzca la cantidad de llamadas a realizar: ");
      Scanner cantlla = new Scanner(System.in);
      int canlla = cantlla.nextInt();
      System.out.print("\033[H\033[2J");
      System.out.flush();
      while (o<=canlla) {
        System.out.println("Tipo de llamado a realizar:");
        System.out.println("1.Inicializar");
        System.out.println("2.Mutacion");
        System.out.println("3.Madres");//imprime la cantidad de madres que hay
        System.out.println("4.Cantidad maxima de generacion"); // 
        System.out.println("5.originarias");
        Scanner opcion= new Scanner(System.in);
        int op=opcion.nextInt();
        switch (op) {
          case 1:
              inicializar(op);
              break;
        
          default:
              break;
        }
      }
     
    }
   public static void inicializar(int op){
    o=0;
      
   }
 }