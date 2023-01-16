package UD06;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        char letra;
        int contador = 0;
        String cadenaBorrada = "";

        System.out.println("Ingresa una cadena");
        cadena = sc.nextLine();

        System.out.println("Ingresa una letra");
        letra = sc.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != letra)
                cadenaBorrada += cadena.charAt(i);
            else
                contador++;
        }
        System.out.println("Se han borrado "+ contador + " letras " + letra + "\nLa cadena resultante es: "+cadenaBorrada);
    }
}
