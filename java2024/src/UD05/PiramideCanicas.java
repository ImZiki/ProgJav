package UD05;

import java.util.Scanner;

public class PiramideCanicas {
    public static void main(String[] args) {
        int canicas;
        int piramide;
        int pisos;
        int numeroCasos;
        Scanner sc = new Scanner(System.in);
        numeroCasos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numeroCasos; i++){
            pisos = sc.nextInt();
            piramide = 0;
            canicas = 0;
            for (int piso = 1; piso <= pisos; piso++) {
                canicas += piso;
                piramide += canicas;
            }
        System.out.println(piramide);
        }
    }
}