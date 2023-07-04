import java.util.Scanner;

public class ClasificacionEquipoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] equipos = new int[12][4];

        for (int i = 0; i < equipos.length; i++) {
            System.out.println("Equipo " + (i+1) + ":");
            System.out.print("Ingrese el número de partidos ganados: ");
            equipos[i][0] = scanner.nextInt();
            System.out.print("Ingrese el número de partidos empatados: ");
            equipos[i][1] = scanner.nextInt();
            System.out.print("Ingrese el número de partidos perdidos: ");
            equipos[i][2] = scanner.nextInt();
        }

        for (int i = 0; i < equipos.length; i++) {
            int puntos = equipos[i][0] * 3 + equipos[i][1];

            if (puntos >= 33) {
                equipos[i][3] = 1;
            } else if (puntos >= 28) {
                equipos[i][3] = 2;
            } else if (puntos >= 23) {
                equipos[i][3] = 3;
            } else if (puntos >= 18) {
                equipos[i][3] = 4;
            } else if (puntos >= 13) {
                equipos[i][3] = 5;
            } else {
                equipos[i][3] = 6;
            }
        }

        System.out.print("Ingrese la posición del equipo en la tabla (1-12): ");
        int posicion = scanner.nextInt();

        if (posicion < 1 || posicion > 12) {
            System.out.println("Posición inválida");
        } else {
            int clasificacion = equipos[posicion-1][3];

            if (clasificacion == 1 || clasificacion == 2 || clasificacion == 3 || clasificacion == 4) {
                System.out.println("El equipo jugará la Copa Libertadores de América");
            } else if (clasificacion == 5 || clasificacion == 6) {
                System.out.println("El equipo jugará la Copa Sudamericana");
            } else {
                System.out.println("El equipo descenderá de categoría");
            }
        }
    }
}
