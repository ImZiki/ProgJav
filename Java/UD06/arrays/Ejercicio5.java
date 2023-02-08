package UD06.arrays;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;

        while (contador < 5) {
        System.out.println("Introduce un número positivo: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Error: El número debe ser positivo.");
            continue;
        }

        System.out.println("Introduce la posición en la que quieres insertar el número (0-9): ");
        int pos = sc.nextInt();
        if (pos < 0 || pos > 9) {
            System.out.println("Error: La posición debe estar entre 0 y 9.");
            continue;
        }
        if (numeros[pos] != 0) {
            System.out.println("Error: La posición ya está ocupada.");
            continue;
        }

        numeros[pos] = num;
        contador++;
        }
        sc.close();
    }
}