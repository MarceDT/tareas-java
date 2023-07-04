import java.util.*;

public class alumnitos{
    private String nomAlu;
    private int naciAlu;
    private double notas[];
    private static int total_alumnos = 0;

    public alumnitos(String nomAlu, int naciAlu, double notas[], int n){
      this.nomAlu=nomAlu;
      this.naciAlu=naciAlu;
      this.notas=notas;
      total_alumnos++;
    }
    public String getNombre(){
        return nomAlu;
    }
    public int getNacimiento(){
        return naciAlu;
    }
    public double getNota(int n){
        return notas[n];
    }
    public static int getTotal_alumnos(){
            return total_alumnos;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la cantidad de alumnos a revisar: ");
        int n = sc.nextInt();
        sc.nextLine();
       alumnitos[] cantAlu= new alumnitos[n]; 
       for(int i = 0; i <cantAlu.length; i++) {
        System.out.println("Introduzca los datos del alumno numero " +(i+1)+ " :");
        System.out.println("Introduzca el nombre del alumno: ");
        String nomAlu = sc.nextLine();

        System.out.println("Introduzca la edad del alumno: ");
        int naciAlu = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca la cantidad de notas del alumno: ");
        int cantidadNotas = sc.nextInt();
        sc.nextLine();

        double[] notas = new double[cantidadNotas];
        for (int j = 0; j < cantidadNotas; j++) {
            System.out.println("Introduzca la nota " + (j + 1) + " del alumno: ");
            notas[j] = sc.nextDouble();
            sc.nextLine();
        }

        cantAlu[i]= new alumnitos(nomAlu, naciAlu, notas, n);
        }

          for(int i = 0; i <cantAlu.length; i++) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("nombre del alumno numero: " +(i+1)+": " +cantAlu[i].getNombre());
            System.out.println("---------------------------------------------------------------");
            System.out.println("edad del alumno numero " +(i+1)+": " +cantAlu[i].getNacimiento());
            System.out.println("---------------------------------------------------------------");
            System.out.println("notas del alumno numero " +(i+1)+": ");
            for(int j = 0; j < cantAlu[i].notas.length; j++) {
                System.out.println("nota " +(j+1)+": " +cantAlu[i].getNota(j));
                }
          }
        System.out.println("Cantidad total de alumnos revisados:" +alumnitos.getTotal_alumnos());  
}
}