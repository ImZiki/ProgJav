import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaAlimentacion {
    private static final Map<String, Producto> productos = new HashMap<>();


    public static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Introducir producto");
        System.out.println("2. Modificar precio");
        System.out.println("3. Mostrar todos los productos");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void introducirProducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el código del producto: ");
        String codigo = entrada.nextLine();
        System.out.print("Introduce el precio del producto: ");
        double precio = entrada.nextDouble();
        entrada.nextLine(); // Consume la nueva línea después de leer el double
        System.out.print("Introduce la fecha de caducidad (DD/MM/AAAA): ");
        String fechaCaducidad = entrada.nextLine();

        Producto producto = new Producto(codigo, precio, fechaCaducidad);
        productos.put(codigo, producto);

        System.out.println("Producto introducido correctamente.");
    }

    public static void modificarPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el código del producto que quieres modificar: ");
        String codigo = entrada.nextLine();
        Producto producto = productos.get(codigo);
        if (producto != null) {
            System.out.print("Introduce el nuevo precio: ");
            double nuevoPrecio = entrada.nextDouble();
            producto.setPrecio(nuevoPrecio);
            System.out.println("Precio modificado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public static void mostrarProductos() {
        System.out.println("Listado de productos:");
        for (Producto producto : productos.values()) {
            System.out.println(producto);
        }
    }

    public static void eliminarProducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el código del producto que quieres eliminar: ");
        String codigo = entrada.nextLine();
        Producto producto = productos.remove(codigo);
        if (producto != null) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}