import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Persona {
    private String id;
    private String nombre;
    private String apellido;

    public Persona(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static void main(String[] args) {

        List<Persona> listaPersonas = new LinkedList<>();


        Scanner scanner = new Scanner(System.in);


        do {

            System.out.println("Ingrese los datos de la persona:");
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();


            Persona persona = new Persona(id, nombre, apellido);
            listaPersonas.add(persona);


            System.out.print("¿Desea agregar otra persona? (s/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("s"));
    }
}
