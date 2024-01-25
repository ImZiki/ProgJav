package ud05;

public class Cadenas {
    public static void main(String[] args) {
        String nombre = "Francisca";
        int longitud = nombre.length();
        System.out.println("Nombre " + nombre + " tiene " + longitud + " caracteres");
        
        int posicion = nombre.indexOf("a");
        System.out.println("Nombre " + nombre + " tiene la letra 'a' en la posicion " + posicion);

        System.out.println("Empieza por: " + nombre.substring(0,4));
        System.out.println("Termina por: " + nombre.substring(4));
    }
}
