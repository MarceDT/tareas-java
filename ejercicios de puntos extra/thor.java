import java.util.*;

public class thor {
    public static void main(String[] args) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de personajes: ");
        int n = sc.nextInt();
        System.out.print("Ingrese el número de objetos: ");
        int m = sc.nextInt();
        System.out.print("Ingrese la distancia objetivo: ");
        int D = sc.nextInt();

        int[] a = new int[n];
        int[] f = new int[n];
        int[] p = new int[m];

        System.out.println("Ingrese la altura y fuerza de cada personaje:");
        for (int i = 0; i < n; i++) {
            System.out.print(" altura: ");
            a[i] = sc.nextInt();
            System.out.print(" fuerza: ");
            f[i] = sc.nextInt();
        }
        System.out.println("Ingrese el peso de cada objeto:");
        for (int i = 0; i < m; i++) {
            System.out.print("Objeto " + (i + 1) + " - peso: ");
            p[i] = sc.nextInt();
        }
        for (int i =0; i<n;i++) {
                for (int u : p) {
                    if (((a[i] * f[i]) / u) >= D) {
                        c++;
                    }
                
            }
        }
        System.out.println(
                "la cantidad de combinaciones de personaje y objeto que producen un lanzamiento con distancia D o superior son : "  + c);
    }
}