package UD06.Actividades1;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena");
        String cadena = sc.nextLine();

        System.out.println("Introduce la cadena para comparar");
        String comparacion = sc.nextLine();

        if(cadena.endsWith(comparacion))
            System.out.println("La cadena introducida termina con " + comparacion);
        else
            System.out.println("La cadena introducida no termina con " + comparacion);
    }
}

