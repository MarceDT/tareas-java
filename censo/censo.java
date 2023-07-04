import java.util.Scanner;

public class censo {
  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Introduzca la cantidad de registros a revisar:");
    Scanner cant = new Scanner(System.in);
    int cantidad = cant.nextInt();
    int o = 0;
    int mayor = 0;
    int edadd = 0;
    while (o < cantidad) {
      System.out.println("------------------------------------");
      System.out.println("Introduzca que dato quiere saber:  -");
      System.out.println("1.Su año de nacimiento             -");
      System.out.println("2.Su edad                          -");
      System.out.println("3.Su nombre y apellido             -");
      System.out.println("------------------------------------");
      Scanner opciones = new Scanner(System.in);
      int opcion = opciones.nextInt();
      switch (opcion) {
        case 1:
          nacimiento(opcion);
          break;

        case 2:

          System.out.println("Introduzca su edad: ");
          Scanner edad = new Scanner(System.in);
          edadd = edad.nextInt();
          if (edadd >= 18) {
            System.out.println("eres mayor!");
            mayor++;
          } else {
            System.out.println("no eres mayor.");
          }
          while (edadd > 120) {
            System.out.println("Introduzca una edad valida.");
            edadd = edad.nextInt();
          }
          break;

        case 3:
          nombre(opcion);
          break;
        default:
          System.out.println("Introduzca una opcion valida porfavor.");
          break;

      }
      o++;
      
    }
    System.out.println("La cantidad de mayores registrados es: " + mayor);
    cant.close();
  }

  public static void nacimiento(int opcion) {
    System.out.println("Introduzca su año de nacimiento:");
    Scanner naci = new Scanner(System.in);
    String año = naci.nextLine();
    int longi = año.length();
    String extraido = año.substring(2, 4);
    String extraido2 = año.substring(2, 3);
    int extra2 = Integer.parseInt(extraido2);
    while (longi != 4) {
      System.out.println("Introduzca un año válido");
      año = naci.nextLine();
    }
    if (longi == 4 && extra2 > 0) {
      System.out.println("Su año de nacimiento es:" + extraido);
    } else {
      System.out.println("Su año de nacimiento es:" + extraido2);
    }
  }

  public static void nombre(int opcion) {
    System.out.println("Introduzca su nombre: ");
    Scanner nombre = new Scanner(System.in);
    String nom = nombre.nextLine();
    System.out.println("Introduzca su apellido:");
    Scanner apellido = new Scanner(System.in);
    String ap = apellido.nextLine();
    System.out.println("Su nombre y apellido es: " + nom + " " + ap);

  }
}