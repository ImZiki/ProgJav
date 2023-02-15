package UD06.Actividades1;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce palabra");
        String palabra = sc.nextLine();
        boolean esPalindromo = true;

        palabra = palabra.toLowerCase();

        for(int i = 0; i< palabra.length()/2; i++){
            if(palabra.charAt(i) != palabra.charAt(palabra.length() -1 -i)){
                esPalindromo = false;
                break;
            }
        }

        if(esPalindromo)
            System.out.println("PALINDROMO");
        else
            System.out.println("NO PALINDROMO");
    }
}
