package ud06

public class Factura {

    private int numero;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(int numero, String descripcion, int cantidad, double precio) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double calcularMontoFactura() {
        return cantidad * precio;
    }

    @Override
public String toString() {
    return String.format("Factura: Número:%02d, Descripción:'%s', Cantidad:%02d, Precio:%.2f", numero, descripcion, cantidad, precio);
}

    }
}
