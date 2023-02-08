package UD06.arrays;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] caracteres = new char[10];

        System.out.println("Introduce 10 caracteres: ");
        for (int i = 0; i < 10; i++) {
          caracteres[i] = sc.next().charAt(0);
        }

        System.out.println("Los caracteres introducidos en orden inverso son: ");
        for (int i = 9; i >= 0; i--) {
          System.out.println(caracteres[i]);
        }
        sc.close();
    }
}