package ud06;

public class PruebaAutor {
    public static void main(String[] args) {
        Autor ahTeck = new Autor("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("Name is: " + ahTeck.getNombre());
        System.out.println("Email is: " + ahTeck.getEmail());
        System.out.println("Gender is: " + ahTeck.getGenero());
    }
}
