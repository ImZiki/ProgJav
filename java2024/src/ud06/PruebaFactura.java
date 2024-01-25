package ud06;

public class PruebaFactura {

    public static void main(String[] args) {

        LineaFactura factura = new LineaFactura(123, "Productos varios", 5, 20.5);


        System.out.println("Información de la factura:");
        System.out.println(factura);


        System.out.println("Monto total de la factura: " + factura.calcularMontoFactura());
    }
}
