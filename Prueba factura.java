package ud06;

public class PruebaFactura {

    public static void main(String[] args) {
        // Crear una instancia de Factura
        Factura factura = new Factura(123, "Productos varios", 5, 20.5);

        // Imprimir información de la factura
        System.out.println("Información de la factura:");
        System.out.println(factura);

        // Calcular e imprimir el monto total de la factura
        System.out.println("Monto total de la factura: " + factura.calcularMontoFactura());
    }
}
