class Humano {
    private String nombre;
    private String apellido;
    
    public Humano(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido; }
    
    public String getNombreCompleto() {
    return this.apellido + ", " + this.nombre; }
    
    public String getIdentificacion() {
    return this.getNombreCompleto(); }
    }
class Ciudadano extends Humano {
     private String documento; //atributo de ciudadano
        
    public Ciudadano(String nombre,String apellido, String documento) {
        super(nombre,apellido);
        this.documento = documento;
        }
        //super( ) llama al constructor de la clase de la que se hereda (extends).
        public String getIdentificacion() {
        return super.getIdentificacion() + ", documento: " + this.documento;
        }
        public String getDocumento(){
        return documento; }
        }
        
public class herencia
{
public static void main (String args[ ])
{
Humano a = new Humano("Emilio","Rosso");
Ciudadano b = new Ciudadano("Emilio","Rosso","3052454545");
System.out.println(a.getNombreCompleto());
System.out.println(b.getIdentificacion());
System.out.println(b.getDocumento());
// System.out.println(a.getDocumento());

/* no es posible acceder a un miembro de la clase hija usando una
referencia u objeto de la clase padre*/
}
}
