package UD05;

import java.util.Scanner;

public class EjemploLimpiarBufferEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = sc.nextInt();

        System.out.println("Dime un nombre");
        sc.nextLine();
        String cadena = sc.nextLine();
        System.out.println("Has introducido el numero "+num+" y el nombre "+cadena);

    }
}
