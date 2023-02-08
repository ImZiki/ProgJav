package UD06.matrices;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numerosAleatorios = new int[10][10];
        int fila;
        int columna;

        System.out.println("Introduce numero");
        int numero = sc.nextInt();
        sc.close();
        for (int f = 0; f < numerosAleatorios.length; f++) {
            for (int c = 0; c < numerosAleatorios.length; c++) {
                numerosAleatorios[f][c] = new Random().nextInt(100)+1;
            }
        }
        
        for (int f = 0; f < numerosAleatorios.length; f++) {
            for (int c = 0; c < numerosAleatorios.length; c++) {
                if(numerosAleatorios[f][c] == numero){
                    fila = f;
                    columna = c;
                    System.out.println("El numero sale en la fila "+ fila + " y en la columna " +  columna);
                }
            }
            
        }
        System.out.println();
        for (int f = 0; f < numerosAleatorios.length; f++) {
            for (int c = 0; c < numerosAleatorios.length; c++)
                System.out.print(String.format("%3d",numerosAleatorios[f][c]));
            System.out.println();
        }
    }
}