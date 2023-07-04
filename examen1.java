import java.util.*;
    public class examen1{
        public static void main(String[] args){
            int m=0; //declaracion de variables y matrices
            int n=0;
            int [][] posrob= new int [m][n];
            int m2=10;
            int n2=20;
            Integer dir=0;
            int c=0;
            int [][] mapa= new int [m2][n2];
            System.out.println("-----------------------------------------------------");// se declara el tamaño del mapa
            System.out.println("introduzca el tamaño del mapa: ");
            System.out.println("filas:");
            Scanner eme2=new Scanner(System.in);
            m2=eme2.nextInt();
            System.out.println("columnas:");
            Scanner ene2=new Scanner(System.in);
            n2=ene2.nextInt();
            System.out.println("-----------------------------------------------------");
            System.out.println("Ingrese la posicion inicial del robot"); //ingreso de la posicion inicial del robot
            System.out.println("Columna:");
            Scanner ene= new Scanner(System.in);
            n=ene.nextInt();
            while(n<=0){                //validacion
              System.out.println("Introduzca un numero mayor a cero porfavor.");
              n=ene.nextInt();
            }
            while(n>n2){ //validacion
                System.out.println("No se exeda de los limites del mapa porfavor.");
                n=ene.nextInt();
              }
            System.out.println("Fila:" );
            Scanner eme= new Scanner(System.in);
            m=eme.nextInt();
            while(m<=0){ //validacion
                System.out.println("Introduzca un numero mayor a cero porfavor.");
                m=eme.nextInt();
              }
            while(m>m2){ //validacion
                System.out.println("No se exeda de los limites del mapa porfavor.");
                m=eme.nextInt();
              }
            System.out.println("Introduzca el sentido inicial que tendra el robot: "); //1, para norte, 2 para este, 3 para sur,4 para oeste
            Scanner ese= new Scanner(System.in);
            int s=ese.nextInt();
                 switch (s) {
                  case 1:
                  dir = 0;
                  break;
              case 2:
                  dir = 90;
                  break;
              case 3:
                  dir = 180;
                  break;
              case 4:
                  dir = 270;
                  break;
              default:
                  System.out.println("direccion invalida, se usara norte como predeterminado.");
                  dir = 0;
                  break;      

                 }
               System.out.println("introduzca los comandos a seguir por el robot: ");
               Scanner comando= new Scanner(System.in);
               String com="";
               while(c<=10 && !(com.equals("salir")) ){ //favor introducir los datos 1 a 1 en este while, ejemplo: a1, luego r3 y asi sucesivamente
               com=comando.nextLine();
               switch (com) {
                case "r0":
                    dir=0;
                    break;
                    case "r1":
                    dir=90;
                    break;
                    case "r2":
                    dir=180;
                    break;
                    case "r3":
                    dir=270;
                    break;
                    case "r4":
                    dir=0;
                    break;
                    case "r5":
                    dir=90;
                    break;
                    case "r6":
                    dir=180;
                    break;
                    case "r7":
                    dir=270;
                    break;
                    case "r8":
                    dir=0;
                    break;
                    case "r9":
                    dir=90;
                    break;
                case "a1":
                    if(m<m2 && m>0){
                      if (n<n2 && n>0) {
                       switch (dir) {
                        case 0:
                          n++;
                          break;
                        case 90:
                          m++;
                          break;
                          case 180:
                          n--;
                          case 270:
                          m--;
                          break;
                       }
                      }
                    }
                    break;
                    case "a2":
                    if(m<m2 && m>0){
                      if (n<n2 && n>0) {
                       switch (dir) {
                        case 0:
                          n=n+2;
                          break;
                        case 90:
                          m=m+2;
                          break;
                          case 180:
                          n=n-2;
                          case 270:
                          m=m-2;
                          break;
                       }
                      }
                    }
                    break;
                    case "a3":
                    if(m<m2 && m>0){
                      if (n<n2 && n>0) {
                       switch (dir) {
                        case 0:
                          n=n+3;
                          break;
                        case 90:
                          m=m+3;
                          break;
                          case 180:
                          n=n-3;
                          case 270:
                          m=m-3;
                          break;
                       }
                      }
                    }
                    break;
                    case "a4":
                    if(m<m2 && m>0){
                      if (n<n2 && n>0) {
                       switch (dir) {
                        case 0:
                          n=n+4;
                          break;
                        case 90:
                          m=m+4;
                          break;
                          case 180:
                          n=n-4;
                          case 270:
                          m=m-4;
                          break;
                       }
                      }
                    }
                    break;
                    case "a5":
                    if(m<m2 && m>0){
                      if (n<n2 && n>0) {
                       switch (dir) {
                        case 0:
                          n=n+5;
                          break;
                        case 90:
                          m=m+5;
                          break;
                          case 180:
                          n=n-5;
                          case 270:
                          m=m-5;
                          break;
                       }
                      }
                    }
                    break;
                    case "a6":
                    if(m<m2 && m>0){
                      if (n<n2 && n>0) {
                       switch (dir) {
                        case 0:
                          n=n+6;
                          break;
                        case 90:
                          m=m+6;
                          break;
                          case 180:
                          n=n-6;
                          case 270:
                          m=m-6;
                          break;
                       }
                      }
                    }
                    break;
                    case "a7":
                    if(m<m2 && m>0){
                      if (n<n2 && n>0) {
                       switch (dir) {
                        case 0:
                          n=n+7;
                          break;
                        case 90:
                          m=m+7;
                          break;
                          case 180:
                          n=n-7;
                          case 270:
                          m=m-7;
                          break;
                       }
                      }
                    }
                    break;
                    case "a8":
                    if(m<m2 && m>0){
                      if (n<n2 && n>0) {
                       switch (dir) {
                        case 0:
                          n=n+8;
                          break;
                        case 90:
                          m=m+8;
                          break;
                          case 180:
                          n=n-8;
                          case 270:
                          m=m-8;
                          break;
                       }
                      }
                    }
                    break;
                    case "a9":
                    if(m<m2 && m>0){
                      if (n<n2 && n>0) {
                       switch (dir) {
                        case 0:
                          n=n+9;
                          break;
                        case 90:
                          m=m+9;
                          break;
                          case 180:
                          n=n-9;
                          case 270:
                          m=m-9;
                          break;
                       }
                      }
                    }
                    break;
               }
              }
                     System.out.println(m+ "," +n);
                }
          }
        

