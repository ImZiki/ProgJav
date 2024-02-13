import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<String>();
        lista.add("Manuel");
        lista.add("Ana");    
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el nombre del primer elemento a intercambiar");
        String nombre1 = entrada.next();
        System.out.println("Introduzca el nombre del segundo elemento a intercambiar");
        String nombre2 = entrada.next();
    
        lista.set(0, nombre2); 
        lista.set(1, nombre1);
    }
}
