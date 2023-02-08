package UD06.arrays;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosNegativos = new int[10];
        ;
        for (int i = 0; i < 10; i++) {

            System.out.print("Introduce un número negativo: ");
            int numero = sc.nextInt();

            while (numero >= 0) {
              System.out.print("El número debe ser negativo. Introduce un número negativo: ");
              numero = sc.nextInt();
            }

            numerosNegativos[i] = numero;
          }

          System.out.println("Contenido del array");
          for (int numero : numerosNegativos) {
            System.out.println(numero);
       }
       sc.close();
    }
}
