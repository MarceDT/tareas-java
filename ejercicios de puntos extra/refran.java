import java.util.Scanner;

public class refran {
  public static void main(String[] args) {
    System.out.println("Introduzca la cantidad de palabras: ");
    Scanner cant = new Scanner(System.in);
    int canti = cant.nextInt();
    System.out.println("Empiece a introducir sus palabras:");
    String palfin="";
    
    Scanner pala = new Scanner(System.in);
    for (int i = 0; i < canti; i++) {
      String pal = pala.nextLine();
      int longi = pal.length();
      if (longi % 2 == 0) {
        StringBuilder cadena2 = new StringBuilder(pal);
        String cadena3 = cadena2.reverse().toString();
        palfin+=" "+cadena3;
      } else if(longi % 2 != 0) {
        int mid=longi/2;
        int mid2=mid+2;
        int mid3=mid;
        String inter = pal.substring(mid2 , longi) + pal.substring(mid3-1, mid2) + pal.substring(0,mid3-1);
        palfin+=" "+inter;
        
      }else if (longi == 1  || longi == 3 ) {
        palfin+=" "+pal;
      }

    }
    System.out.println(palfin);
cant.close();
pala.close();
  }
}