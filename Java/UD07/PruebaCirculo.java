package UD07;



public class PruebaCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2.0, "azul");
        System.out.println("el radio es: " + c1.getRadio());
        System.out.println("El color es: " + c1.getColor());
        System.out.println("El area es: " + c1.getArea());

        Circulo c2 = new Circulo(2.0);
        System.out.println("el radio es: " + c2.getRadio());
        System.out.println("El color es: " + c2.getColor());
        System.out.println("El area es: " + c2.getArea());

        Circulo c3 = new Circulo();
        System.out.println("el radio es: " + c3.getRadio());
        System.out.println("El color es: " + c3.getColor());
        System.out.println("El area es: " + c3.getArea());

        Circulo c4 = new Circulo(c1);
        System.out.println("El radio es: " + c4.getRadio());
        System.out.println("El color es: " + c4.getColor());
        System.out.println("El area es: " + c4.getArea());
    }
}