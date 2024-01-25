package ud06;

public class Libro {
    private String nombre;
    private Autor autor;
    private double precio;
    private int cantidad;
    
    
    
    public Libro(String nombre, Autor autor, double precio, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public Libro(String nombre, Autor autor, double precio) {
        this(nombre, autor, precio, 0);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getNombreAutor(){
        return autor.getNombre();
    }
    public String getEmailAutor(){
        return autor.getEmail();
    }
    public char getGeneroAutor(){
        return autor.getGenero();
    }
    @Override
    public String toString() {
        return "Libro [nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + ", cantidad=" + cantidad + "]";
    }
}
