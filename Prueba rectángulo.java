package ud06;

public class PruebaRectángulo {

    public static void main(String[] args) {
        // Crear una instancia de Rectángulo
        Rectángulo rectángulo = new Rectángulo(5.0, 8.0);

        // Imprimir información del rectángulo
        System.out.println("Información del rectángulo:");
        System.out.println(rectángulo);

        // Calcular e imprimir el área y perímetro del rectángulo
        System.out.println("Área del rectángulo: " + rectángulo.calcularÁrea());
        System.out.println("Perímetro del rectángulo: " + rectángulo.calcularPerímetro());
    }
}
