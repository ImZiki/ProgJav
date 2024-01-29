package ud06;

public class PruebaCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo (2.0, "azul");
        System.out.println("El radio es: " + c1.getRadio()); 
        System.out.println("El color es: " + c1.getColor());
        System.out.printf("El área es: %.2f%n", c1.getArea()); 
        
        Circulo c2 = new Circulo (2.0); 
        System.out.println("El radio es: " + c2.getRadio()); 
        System.out.println("El color es: " + c2.getColor()); 
        System.out.printf("El área es: %.2f%n", c2.getArea());
        
        Circulo c3 = new Circulo(); 
        System.out.println("El radio es: " + c3.getRadio()); 
        System.out.println("El color es: " + c3.getColor()); 
        System.out.printf("El área es: %.2f%n", c3.getArea());

    }
} 