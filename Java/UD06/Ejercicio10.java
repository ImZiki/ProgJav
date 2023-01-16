package UD06;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = sc.nextLine();
        String cadenaSustituida = "";
        System.out.println("Ingresa una letra");
        char letra1 = sc.next().charAt(0);

        System.out.println("Ingresa una letra para sustituir");
        char letra2 = sc.next().charAt(0);

        System.out.println("La cadena sustituida es: " + (cadenaSustituida = cadena.replace(letra1, letra2)));
    }
}
