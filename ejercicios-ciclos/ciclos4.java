import java.util.Scanner;

public class ciclos4 {
    public static void main(String[] args) {
    System.out.println("Introduzca el valor de n:");
    Scanner ene = new Scanner(System.in);
    int n = ene.nextInt();
    int c=0;
    for(int i=1;i<=n;i++)
    {
    if (n%i==0) 
    {
     c=c+1; 
    }

    }
    System.out.println("La cantidad de numeros primos es: " +c);
ene.close();

    }
}