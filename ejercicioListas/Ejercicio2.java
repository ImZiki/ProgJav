import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio2 {
    private static final int LONGITUD = 100;
    private static List<Integer> crearLista(int n) {
        Random random = new Random();
        List<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            numeros.add(random.nextInt(1000)+1);
        }
        return numeros;
    }
    
    private static int Mayor(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }
    public static void main(String[] args) {
        List<Integer> numeros1 = crearLista(LONGITUD);
        List<Integer> numeros2 = crearLista(LONGITUD);
        List<Integer> numeros3 = crearLista(LONGITUD);

        for (int i = 0; i < LONGITUD; i++) {
            int mayor = Mayor(numeros1.get(i), numeros2.get(i));
            numeros3.add(mayor);
        }
        
        System.out.println(numeros3);
    }
    
    
}
