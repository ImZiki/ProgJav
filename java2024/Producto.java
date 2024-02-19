public class Producto {
    private String codigo;
    private double precio;
    private String fechaCaducidad;

    public Producto(String codigo, double precio, String fechaCaducidad) {
        this.codigo = codigo;
        this.precio = precio;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", fechaCaducidad='" + fechaCaducidad + '\'' +
                '}';
    }
}



