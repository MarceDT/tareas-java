import java.util.Scanner;

public class metodos1 {
  public static void main(String[] args) {
    System.out.println("Jugador 1, introduzca el numero a adivinar: ");
    Scanner num1 = new Scanner(System.in);
    int numero1 = num1.nextInt();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Jugador 2, introduzca el numero: ");
    adivinacion(numero1);
  }

  public static void adivinacion(int numero1) {
    int c=0;
    Scanner num2 = new Scanner(System.in);
    int numero2 = num2.nextInt();
    while (true) {

      if (numero2 < numero1) {
        System.out.println("El numero es menor,intenta de nuevo");
        c++;
        System.out.println("fallos: " + c);
        numero2 = num2.nextInt();
        continue;
      }
      if (numero2 > numero1) {
        System.out.println("El numero es mayor,intenta de nuevo");
        c++;
        System.out.println("fallos: " + c);
        numero2 = num2.nextInt();
        continue;
      }
      break;
    }

    System.out.println("Felicidades, has acertado el numero :D");
    System.out.println("fallos totales: " + c);
    
  }
}
