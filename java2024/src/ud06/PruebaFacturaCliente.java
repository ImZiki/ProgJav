package ud06;

public class PruebaFacturaCliente{
    public static void main(String[] args) {
        Factura f1 = new Factura(1, new Cliente(1, "Pedro", 5), 10);
        System.out.println(f1.getId());
        System.out.println(f1.getCliente());
        System.out.println(f1.getCantidad());
        System.out.println(f1.getIdCliente());
        System.out.println(f1.getNombreCliente());
        System.out.println(f1.getDescuentoCliente());
        System.out.println(f1.getCantidadDespuesDescuento());

        System.out.println(f1);
    }
}