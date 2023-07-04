import java.util.*;

public class Laboratorio {
    public static int[] calcularBaldosasAccesibles(String[] mapa, int[][] perros) {
        int filas = mapa.length;
        int columnas = mapa[0].length();
        int[][] visited = new int[filas][columnas];
        int[] result = new int[perros.length];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                visited[i][j] = 0;
            }
        }

        for (int i = 0; i < perros.length; i++) {
            int filaPerro = perros[i][0];
            int columnaPerro = perros[i][1];

            result[i] = dfs(mapa, filaPerro, columnaPerro, visited, 0);
        }

        return result;
    }

    public static int dfs(String[] mapa, int fila, int columna, int[][] visited, int count) {
        int filas = mapa.length;
        int columnas = mapa[0].length();
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas
                || isEscritorio(mapa, fila, columna) || visited[fila][columna] == 1) {
            return count;
        }

        visited[fila][columna] = 1;
        count++;

        for (int[] direction : directions) {
            int nuevaFila = fila + direction[0];
            int nuevaColumna = columna + direction[1];

            count = dfs(mapa, nuevaFila, nuevaColumna, visited, count);
        }

        return count;
    }

    public static boolean isEscritorio(String[] mapa, int fila, int columna) {
        return mapa[fila].charAt(columna) == '#';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();
        String[] mapa = new String[N];
        int[][] perros = new int[P][2];

        for (int i = 0; i < N; i++) {
            mapa[i] = sc.next();
        }

        for (int i = 0; i < P; i++) {
            perros[i][0] = sc.nextInt();
            perros[i][1] = sc.nextInt();
        }

        int[] result = calcularBaldosasAccesibles(mapa, perros);

        for (int i = 0; i < P; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
