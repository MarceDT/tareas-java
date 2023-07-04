import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Empleado {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private int antiguedad;
    private String telefono;
    private double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("DNI: " + DNI);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salario: " + salario);
    }

    public void cambiarSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public void incrementarSalario() {
        salario *= 1.1; // Incremento del 10%
    }
}

class Secretario extends Empleado {
    private String despacho;
    private String numeroFax;

    public Secretario(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario,
                      String despacho, String numeroFax) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Secretario");
    }
}

class Vendedor extends Empleado {
    private String coche;
    private String telefonoMovil;
    private String areaVenta;
    private List<String> clientes;
    private double comision;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario,
                    String coche, String telefonoMovil, String areaVenta, double comision) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.coche = coche;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.comision = comision;
        this.clientes = new ArrayList<>();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Vendedor");
    }

    public void darDeAltaCliente(String cliente) {
        clientes.add(cliente);
    }

    public void darDeBajaCliente(String cliente) {
        clientes.remove(cliente);
    }

    public void cambiarCoche(String coche) {
        this.coche = coche;
    }
}

class JefeZona extends Empleado {
    private String despacho;
    private Secretario secretario;
    private List<Vendedor> vendedores;
    private String coche;

    public JefeZona(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario,
                    String despacho, Secretario secretario, String coche) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = new ArrayList<>();
        this.coche = coche;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Jefe de Zona");
    }

    public void cambiarSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public void cambiarCoche(String coche) {
        this.coche = coche;
    }

    public void darDeAltaVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void darDeBajaVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }
}

public class Emmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del supervisor:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        Empleado supervisor = new Empleado(nombre, apellidos, dni, direccion, telefono, salario);

        System.out.println("ddatos del secretario:");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        apellidos = scanner.nextLine();
        System.out.print("DNI: ");
        dni = scanner.nextLine();
        System.out.print("Dirección: ");
        direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        telefono = scanner.nextLine();
        System.out.print("Salario: ");
        salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Despacho: ");
        String despacho = scanner.nextLine();
        System.out.print("Número de fax: ");
        String numeroFax = scanner.nextLine();

        Secretario secretario = new Secretario(nombre, apellidos, dni, direccion, telefono, salario, despacho, numeroFax);

        System.out.println("datos del vendedor:");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        apellidos = scanner.nextLine();
        System.out.print("DNI: ");
        dni = scanner.nextLine();
        System.out.print("Dirección: ");
        direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        telefono = scanner.nextLine();
        System.out.print("Salario: ");
        salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Coche: ");
        String coche = scanner.nextLine();
        System.out.print("Teléfono móvil: ");
        String telefonoMovil = scanner.nextLine();
        System.out.print("Área de venta: ");
        String areaVenta = scanner.nextLine();
        System.out.print("Comisión: ");
        double comision = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        Vendedor vendedor = new Vendedor(nombre, apellidos, dni, direccion, telefono, salario, coche, telefonoMovil, areaVenta, comision);

        System.out.println("datos del jefe de zona:");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        apellidos = scanner.nextLine();
        System.out.print("DNI: ");
        dni = scanner.nextLine();
        System.out.print("Dirección: ");
        direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        telefono = scanner.nextLine();
        System.out.print("Salario: ");
        salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Despacho: ");
        despacho = scanner.nextLine();
        System.out.print("Coche: ");
        coche = scanner.nextLine();

        JefeZona jefeZona = new JefeZona(nombre, apellidos, dni, direccion, telefono, salario, despacho, secretario, coche);

        // Asignar supervisor al secretario, vendedor y jefe de zona
        secretario.cambiarSupervisor(supervisor);
        vendedor.cambiarSupervisor(supervisor);
        jefeZona.cambiarSupervisor(supervisor);

        // Imprimir los datos de los empleados
        System.out.println("--- Datos del supervisor ---");
        supervisor.imprimir();

        System.out.println("--- Datos del secretario ---");
        secretario.imprimir();

        System.out.println("--- Datos del vendedor ---");
        vendedor.imprimir();

        System.out.println("--- Datos del jefe de zona ---");
        jefeZona.imprimir();

        scanner.close();
    }
}
