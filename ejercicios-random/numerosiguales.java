import java.util.Scanner;

public class numerosiguales {
    public static void main(String[] args) {
        System.out.println("Introduzca el valor del primer numero:");
        try (Scanner numero1 = new Scanner(System.in)) {
            int num1 = numero1.nextInt();
            System.out.println("Introduzca el valor del segundo numero:");
            try (Scanner numero2 = new Scanner(System.in)) {
                int num2 = numero2.nextInt();
    if (num1>num2){
    System.out.println("El numero mayor es: "+num1);
    }
    if (num2>num1){
                System.out.println("El numero mayor es: "+num2);
    }
    if (num1==num2){
                System.out.println("Los numeros son iguales");
    }
            }
        }
    }
}      