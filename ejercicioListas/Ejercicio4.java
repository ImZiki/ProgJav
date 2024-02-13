import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static List<Integer> listaUnion(List<Integer> list1, List<Integer> list2) {
        List<Integer> union = new ArrayList<>(list1);
        union.addAll(list2);
        return union;
    }

    public static List<Integer> listaInterseccion(List<Integer> list1, List<Integer> list2) {
        List<Integer> interseccion = new ArrayList<>(list1);
        interseccion.retainAll(list2);
        return interseccion;
    }

    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(3);
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);

        List<Integer> union = listaUnion(lista1, lista2);
        System.out.println("Unión: " + union);

        List<Integer> interseccion = listaInterseccion(lista1, lista2);
        System.out.println("Intersección: " + interseccion);
    }
}
