import java.util.*;

class Deporte {
    // Contiene el nombre del deporte
    protected String nombre;
    // Contiene el número de equipos que participan en el deporte
    protected int numeroDeEquipos;
    // Contiene el número de jugadores de cada equipo
    protected int numeroDeJugadores;
    public Deporte(String nombre, int numeroDeEquipos, int numeroDeJugadores) {
    this.nombre = nombre;
    this.numeroDeEquipos = numeroDeEquipos;
    this.numeroDeJugadores = numeroDeJugadores; }

    }
class futbol extends Deporte{
    private int[] goles;
    public futbol(String nombre, int numeroDeEquipos,int numeroDeJugadores){
        super(nombre, numeroDeEquipos, numeroDeJugadores);
        this.goles = new int[numeroDeEquipos];
        }
    public String getinfo(){
        return "nombre: "+this.nombre +", numero de equipo: "+ this.numeroDeEquipos +", numero de jugadores: "+ this.numeroDeJugadores ;
    }
    public int[] getGoles(){
        return this.goles;
    }

}

public class partido{
    public static void main (String args[ ]){
  futbol equipo1= new futbol("olimpia", 1, 11);
  futbol equipo2= new futbol("cerro porteño", 2, 11);
  System.out.println("Introduzca cuántos goles ha marcado el equipo 1:");
  Scanner sc = new Scanner(System.in);
  int golesEquipo1 = sc.nextInt();

  System.out.println("Introduzca cuántos goles ha marcado el equipo 2:");
  int golesEquipo2 = sc.nextInt();

  equipo1.getGoles()[0] = golesEquipo1;
  equipo2.getGoles()[0] = golesEquipo2;

  System.out.println("Información del equipo 1:");
  System.out.println(equipo1.getinfo());
  System.out.println("Cantidad de goles: " + equipo1.getGoles()[0]);

  System.out.println("Información del equipo 2:");
  System.out.println(equipo2.getinfo());
  System.out.println("Cantidad de goles: " + equipo2.getGoles()[0]);
    }
    }
  