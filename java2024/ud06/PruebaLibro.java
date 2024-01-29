package ud06;

public class PruebaLibro{
    public static void main(String[] args) {
        Autor ahTeck = new Autor("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        Libro librito = new Libro("Java para tontos", ahTeck, 19.95, 99);
        System.out.println(librito);

        librito.setPrecio(29.95);
        librito.setCantidad(28);
        System.out.println("Nombre: " + librito.getNombre());
        System.out.println("Precio: " + librito.getPrecio());
        System.out.println("Cantidad: " + librito.getCantidad());
        System.out.println("Autor: " + librito.getAutor());
        System.out.println("Nombre Autor: " + librito.getAutor().getNombre());
        System.out.println("Email Autor: " + librito.getAutor().getEmail());

        Libro otroLibro = new Libro("Mas java", new Autor("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(otroLibro);

        Libro otroLibroMas = new Libro("Aun mas java", new Autor("John Doe", "johndoe@somewhere.com", 'm'), 30.95);
        System.out.println(otroLibroMas.getNombreAutor());       
        System.out.println(otroLibroMas.getEmailAutor());
        System.out.println(otroLibroMas.getGeneroAutor());
    }
}