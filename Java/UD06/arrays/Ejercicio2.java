package UD06.arrays;

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numerosAleatorios = new int[10];
        int sum = 0;
        int mult = 1;
        Random rand = new Random();
        System.out.println("Los numeros generados son: ");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = rand.nextInt(1, 11);
            System.out.println(numerosAleatorios[i]);
            sum += numerosAleatorios[i];
            mult *= numerosAleatorios[i];
        }
        System.out.println("La suma es: "+ sum);
        System.out.println("La multiplicacion es: "+ mult);
    }
}
