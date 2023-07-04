import java.util.*;
    public class robot{
        public static void main(String[] args){
            int m=0;
            int n=0;
            int [][] posrob= new int [m][n];
            int m2=10;
            int n2=20;
            int [][] mapa= new int [m2][n2];
            System.out.println("-----------------------------------------------------");
            System.out.println("introduzca el tamaño del mapa: ");
            System.out.println("filas:");
            Scanner eme2=new Scanner(System.in);
            m2=eme2.nextInt();
            System.out.println("columnas:");
            Scanner ene2=new Scanner(System.in);
            n2=ene2.nextInt();
            System.out.println("-----------------------------------------------------");
            System.out.println("Ingrese la posicion inicial del robot");
            System.out.println("Columna:");
            Scanner ene= new Scanner(System.in);
            n=ene.nextInt();
            while(n<=0){
              System.out.println("Introduzca un numero mayor a cero porfavor.");
              n=ene.nextInt();
            }
            while(n>n2){
                System.out.println("No se exeda de los limites del mapa porfavor.");
                n=ene.nextInt();
              }
            System.out.println("Fila:" );
            Scanner eme= new Scanner(System.in);
            m=eme.nextInt();
            while(m<=0){
                System.out.println("Introduzca un numero mayor a cero porfavor.");
                m=eme.nextInt();
              }
            while(m>m2){
                System.out.println("No se exeda de los limites del mapa porfavor.");
                m=eme.nextInt();
              }
            System.out.println("Introduzca el sentid inicial que tendra el robot: ");
            Scanner ese= new Scanner(System.in);
            String s=ese.nextLine();
            System.out.println("Introduzca el valor hacia donde quiere que vaya el robot: ");
            System.out.println("Advertencia: solo se pueden introducir n,s,e,o para las coordenadas.");
            int c=0;
            String com="";
            Scanner comando= new Scanner(System.in);
            while(c<=10 && !(com.equals("salir")) ){ 
                com=comando.nextLine();
                 switch (com) {
                    case "n":
                    if(m<m2 && m>0){
                      m=m+1;
                    }
                        break;
                    case "s":
                    if(m<m2 && m>0){
                      m=m-1;
                    }
                        break;
                    case "e":
                    if(n<n2 && n>0){
                      n=n+1;
                      }
                       break; 
                   case "o":
                   if(n<n2 && n>0){
                    n=n-1;
                    }
                        break;           

                 }

                c++; 
                }
           
             System.out.println(n+ ","+m);
          }
        }

