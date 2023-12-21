package UD05;

public class ParImpar {
    public static void main(String[] args) {
        int x = 33;
        boolean resultado;
        resultado = x%2 == 0 ? true : false;
        if (resultado)
            System.out.println("El numero " + x + " es par");
        else
            System.out.println("El numero " + x + " es impar");
    }
}
