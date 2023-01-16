package UD06;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena");
        String cadena = sc.nextLine();

        System.out.println("Introduce el número de partes en las que deseas dividir la cadena");
        int n = sc.nextInt();

        int longitudPartes = cadena.length() / n;

        for (int i = 0; i < n; i++) {
            int inicio = i * longitudPartes;
            int fin = inicio + longitudPartes;
            System.out.println(cadena.substring(inicio, fin));
        }
        if(cadena.length() % n != 0)
            System.out.println(cadena.substring(longitudPartes*n));
    }
}