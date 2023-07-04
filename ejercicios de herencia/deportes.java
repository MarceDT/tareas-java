public class deportes{

public class Deporte {
    // Contiene el nombre del deporte
    private String nombre;
    // Contiene el número de equipos que participan en el deporte
    private int numeroDeEquipos;
    // Contiene el número de jugadores de cada equipo
    private int[] numeroDeJugadores;
    
    public Deporte(String nombre, int numeroDeEquipos, int[] numeroDeJugadores) {
        this.nombre = nombre;
        this.numeroDeEquipos = numeroDeEquipos;
        this.numeroDeJugadores = numeroDeJugadores; 
    }
}

public class Futbol extends Deporte {
    private int[] goles;
    
    public Futbol() {
        super("Futbol", 2, new int[]{11, 11});
        this.goles = new int[]{0, 0};
    }
    
    public void marcarGol(int equipo) {
        this.goles[equipo-1]++;
    }
    
    @Override
    public String toString() {
        return "Marcador: " + this.goles[0] + "-" + this.goles[1];
    }
}

public class Jugador {
    private static String nombre;
    private static String demarcacion;
    private static int partidosJugados;
    private static int goles;
    private static int tarjetasAmarillas;
    private static int tarjetasRojas;
    private static int identificador;
    
    public Jugador(String nombre, String demarcacion, int partidosJugados, int goles, int tarjetasAmarillas, int tarjetasRojas){
        this.nombre = nombre;
        this.demarcacion = demarcacion;
        this.partidosJugados = partidosJugados;
        this.goles = goles;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        identificador ++;
    }
    
    public Jugador (){
        this("sin nombre", "sin demarcacion", 0, 0, 0, 0);
    }
    
     public static void main(String[] args)    
     {
        System.out.println("Nombre: " + nombre);
        System.out.println("Demarcación: " + demarcacion);
        System.out.println("Partidos Jugados: " + partidosJugados);
        System.out.println("Goles Marcados: " + goles);
        System.out.println("Tarjetas amarillas: " + tarjetasAmarillas);
        System.out.println("Tarjetas Rojas: " + tarjetasRojas);
        System.out.println("Identificador: " + identificador);
       
    }
}

public class Portero extends Jugador {
    private int golesRecibidos;
    private int penaltisParados;
    
    public Portero(String nombre, String demarcacion, int partidosJugados, int golesMarcados, int tarjetasAmarillas, int tarjetasRojas, int golesRecibidos, int penaltisParados) {
        super(nombre, demarcacion, partidosJugados, golesMarcados, tarjetasAmarillas, tarjetasRojas);
        this.golesRecibidos = golesRecibidos;
        this.penaltisParados = penaltisParados;
    }
    
    public Portero() {
        super();
        golesRecibidos = 0;
        penaltisParados = 0;
        System.out.println("Goles recibidos: " + golesRecibidos);
        System.out.println("Penaltis parados: " + penaltisParados);  
    }
    
  
}

}