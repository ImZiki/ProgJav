package UD06.arrays;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = new char[20];
        int contador = 0;

        System.out.println("Introduce 20 letras: ");
        for (int i = 0; i < letras.length; i++) {
            letras[i] = sc.next().charAt(0);
            if(letras[i] == 'a')
                contador++;
        }
        System.out.println("Se han introducido "+ contador+ " letras 'a'");
        if(contador > 0){
            System.out.println("La letra 'a' esta en las siguientes posiciones: ");
            for (int j = 0; j < letras.length; j++) {
                if(letras[j]== 'a')
                    System.out.println("Posicion " +j);
            }
        }
        sc.close();
    }
}
