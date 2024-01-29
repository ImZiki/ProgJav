package ud06.tiempo;

public class PruebaPrediccion {
    public static void main(String[] args) {
        // Prueba de la clase Dia
        Dia dia1 = new Dia(25, 15, 's');
        Dia dia2 = new Dia(20, 10, 'n');
        Dia dia3 = new Dia(30, 20, 'l');

        System.out.println("Datos del dia 1:");
        dia1.mostrarPrediccion();
        System.out.println("Datos del dia 2:");
        dia2.mostrarPrediccion();
        System.out.println("Datos del dia 3:");
        dia3.mostrarPrediccion();
    }
}
