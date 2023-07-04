
abstract class Empleado{
    protected String nombre;
    protected String nro_dni;
    protected String apellido;
    protected int año_ingreso;
    protected double sueldo;

  public Empleado(String nombre, String nro_dni, String apellido, int año_ingreso, double sueldo){
    this.nombre = nombre;
    this.nro_dni = nro_dni;
    this.apellido = apellido;
    this.año_ingreso = año_ingreso;
    this.sueldo=sueldo;
  }  
}
class EAsalariado extends Empleado{
    public EAsalariado(String nombre, String nro_dni, String apellido, int año_ingreso,double sueldo) {
        super(nombre, nro_dni, apellido, año_ingreso,sueldo);
    }
    public String getInfo(){
        return "nombre del empleado: " +this.nombre+", dni: " +this.nro_dni+", apellido: " +this.apellido+", año de ingreso: " +this.año_ingreso+ " y su sueldo base es: " +this.sueldo;
    }
    public double getSalario(){
        return this.sueldo;
    }
}
class Ecomision extends Empleado{
    public int cantCliente;
    public double montoCliente;
    public Ecomision(String nombre, String nro_dni, String apellido,int año_ingreso,double montoCliente,int cantCliente,double sueldo){
        super(nombre, nro_dni, apellido, año_ingreso,sueldo);
        this.cantCliente=cantCliente;
        this.montoCliente=montoCliente;
    }
    public String getInfo(){
        return "nombre del empleado: " +this.nombre+", dni: " +this.nro_dni+", apellido: " +this.apellido+", año de ingreso: " +this.año_ingreso +", la cantidad de clientes es: " +this.cantCliente+ ", el monto por cliente es: " +montoCliente;
    }
    public double getSalario(){
        return this.sueldo;
    }
}

public class examen{
    public static void main(String[] args) {
 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");       
 EAsalariado empleado1= new EAsalariado("Javier", "569587A", "Gomez", 2008, 1225.00);
 System.out.println("Los datos del empleado 1 son: " + empleado1.getInfo()+" , y su sueldo final es: " +(empleado1.getSalario()+empleado1.getSalario()*0.15));
 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------"); 
 Ecomision empleado2= new Ecomision("Eva", "695235B", "Nieto", 2010, 8.10, 179, 1499.9);
 System.out.println("Los datos del empleado 2 son: " +empleado2.getInfo()+ " , y su sueldo final es: " +empleado2.getSalario());
 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------"); 
 Ecomision empleado3= new Ecomision("Jose", "741258C", "Ruiz", 2012, 7.90, 81, 639.9);
 System.out.println("Los datos del empleado 3 son: " +empleado3.getInfo()+ " , y su sueldo final es: " +empleado3.getSalario());
 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
 EAsalariado empleado4= new EAsalariado("Maria", "896325D", "nuñez", 2013, 1155.00);
 System.out.println("Los datos del empleado 4 son: " + empleado4.getInfo()+" , y su sueldo final es: " +(empleado4.getSalario()+empleado4.getSalario()*0.15));
    }
}
