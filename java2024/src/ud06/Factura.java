package ud06;

public class Factura {
    private int id;
    private Cliente cliente;
    private double cantidad;
    
    public Factura(int id, Cliente cliente, double cantidad) {
        this.id = id;
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdCliente(){
        return cliente.getId();
    }

    public String getNombreCliente(){
        return cliente.getNombre();
    }

    public int getDescuentoCliente(){
        return cliente.getDescuento();
    }

    public double getCantidadDespuesDescuento(){
        return cantidad - (cantidad * cliente.getDescuento() / 100);
    }

    @Override
    public String toString() {
        return "Factura [id=" + id + ", cliente=" + cliente + ", cantidad=" + cantidad + "]";
    }

    
    
}

