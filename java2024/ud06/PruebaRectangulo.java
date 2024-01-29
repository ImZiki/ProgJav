package ud06;

public class PruebaRectangulo {

    public static void main(String[] args) {

        Rectangulo rectángulo = new Rectangulo(5.0, 8.0);

        System.out.println("Información del rectángulo:");
        System.out.println(rectángulo);

        System.out.println("Área del rectángulo: " + rectángulo.calcularÁrea());
        System.out.println("Perímetro del rectángulo: " + rectángulo.calcularPerímetro());
    }
}
