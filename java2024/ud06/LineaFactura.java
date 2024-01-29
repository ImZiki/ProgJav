package ud06;

public class LineaFactura {

    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnidad;
    private double total;

   public LineaFactura(int id, String descripcion, int cantidad, double precioUnidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

   public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public double calcularMontoFactura() {
        return cantidad * precioUnidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    public double getTotal(){
        return total = precioUnidad * cantidad;
    }
    @Override
    public String toString() {
    return String.format("Factura: Número:%02d, Descripción:'%s', Cantidad:%02d, Precio unidad:%.2f, Total: %.2f", id, descripcion, cantidad, precioUnidad, total);
    }
}

