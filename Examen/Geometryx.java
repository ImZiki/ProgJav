import java.text.DecimalFormat;

public class Geometryx {
    public static void main(String[] args) {
        //Creacion todos los objetos
        DecimalFormat dFormat = new DecimalFormat("#.####");
        Punto p1 = new Punto(5, -1);
        Punto p2 = new Punto();
        Punto p3 = new Punto(10, 3);
        Punto p4 = new Punto(3, 10);
        
        Recta r1 = new Recta(p1, p4);
        Recta r2 = new Recta(5, 20, 3, 10);

        Punto p5 = new Punto(1,4);
        Rectangulo rect1 = new Rectangulo(p5, 4, 3);
        Rectangulo rect2 = new Rectangulo(3, 3, 1, 1);
        Rectangulo rect3 = new Rectangulo(0, 3, 2, 1);

        Punto p6 = new Punto(-2, -3);
        Punto p7 = new Punto(-4, -5);
        Punto p8 = new Punto(-1, -6);
        Triangulo t1 = new Triangulo(p6, p7, p8);
        Triangulo t2 = new Triangulo(3, 6, 1, 2, 5, 3);
        Triangulo t3 = new Triangulo(1, 1, 2, 2, 1, 2);



        System.out.println("TESTS DE PUNTO");
        System.out.println(p2.getX());
        System.out.println(p2.getY());

        //Test de ToString
        System.out.println("Punto 1" + p1);
        System.out.println("Punto 2" + p2);
        System.out.println("Punto 3 " + p3);
        System.out.println("Punto 4 " + p4);

        //Test de metodo distancia

        System.out.println("Distancia 1: " + dFormat.format(p1.distancia()));
        System.out.println("Distancia 2: " + dFormat.format(p1.distancia(5, 20)));
        System.out.println("Distancia 3: " + dFormat.format(p1.distancia(p3)));

        //Test Manhattan
        System.out.println("Manhattan: " + dFormat.format(p1.distanciaManhattan(p3)));

        //Test voltear
        System.out.println("Previo al volteo: " + p1);
        p1.voltear();
        System.out.println("Post volteo: " + p1);

        //Test pendiente
        System.out.println("Pendiente 1: " + dFormat.format(p4.pendiente(p1)));
        System.out.println("Pendiente2 : " + dFormat.format(p1.pendiente(p4)));

        //Tests esVertical & esColineal
        System.out.println("test esVertical 1: " + p1.esVertical(p3));
        System.out.println("test esVertical 2: " + p1.esVertical(p4));
        System.out.println("test esColineal: " + Punto.esColineal(p1, p4));

        System.out.println("\nTEST DE RECTA");
        //Tests de Recta
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.getUnPunto());
        System.out.println(r1.getOtroPunto());
        System.out.println("Pendiente r1: ");
        System.out.printf("%.02f \n", r1.pendiente());
        System.out.println("test esColineal recta: " + r1.esColineal(p3));

        System.out.println("\nTEST DE RECTANGULO");
        //Tests de Rectangulo
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);

        System.out.println(rect1.getAlto());
        System.out.println(rect1.getAncho());
        System.out.println(rect1.getEsquinaIzq());

        System.out.println(rect1.contiene(3, 4));
        System.out.println(rect1.contiene(p3));
        System.out.println(Rectangulo.contiene(rect2, rect3));

        System.out.println("\nTEST DE TRIANGULO");
        //Tests de Triangulo
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(dFormat.format(t1.perimetro()));
        System.out.println(dFormat.format(t2.perimetro()));
        System.out.println(dFormat.format(t3.perimetro()));
        System.out.println(t1.semejante(t2));
        System.out.println(Triangulo.semejante(t2, t3));
        System.out.println(t1.tipo());
        System.out.println(t2.tipo());
        System.out.println(t3.tipo());
    }
}