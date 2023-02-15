package UD06.Actividades1;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena");
        String cadena = sc.nextLine();

        System.out.println("Introduce la letra para buscarla");
        char letra = sc.next().charAt(0);

        int contador = 0;
        int primero = -1;

        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == letra) {
                contador++;
                if(primero == -1)
                    primero = i;
            }
        }
        if(primero == -1)
            System.out.println("La letra introducida no está en la cadena");
        else
            System.out.println("La letra aparece primero en la posicion "+ (primero) +" y se repite "+contador+" vez/veces");
    }
}
