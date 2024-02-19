import java.util.Scanner;

public class TestTienda{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            TiendaAlimentacion.mostrarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine(); // Consume la nueva línea después de leer el entero
            switch (opcion) {
                case 1:
                    TiendaAlimentacion.introducirProducto();
                    break;
                case 2:
                TiendaAlimentacion.modificarPrecio();
                    break;
                case 3:
                TiendaAlimentacion.mostrarProductos();
                    break;
                case 4:
                TiendaAlimentacion.eliminarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, introduce una opción válida.");
            }
        } while (opcion != 5);
    }
}
