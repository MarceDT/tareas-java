import java.util.ArrayList;
import java.util.Scanner;

public class metodos2 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero y sera convertido a binario: ");
        Scanner nume = new Scanner(System.in);
        int num = nume.nextInt();
        calculo(num);
    }

    public static void calculo(int num) {
        ArrayList<Integer> resto = new ArrayList<>();
        while (true) {
            resto.add((num % 2));
            num /= 2;
            if ((num / 2) == 0) {
                resto.add(num % 2);
                break;
            }
        }
        for (int i = resto.size() - 1; i >= 0; i--) {
            System.out.print(resto.get(i));
        }

    }

}
