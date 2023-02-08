package UD06.matrices;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] numeros = new int[6][10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int filaMax = 0;
        int colMax = 0;
        int filaMin = 0;
        int colMin = 0;

        for (int f = 0; f < numeros.length; f++) {
            for (int c = 0; c < numeros[0].length; c++)
                numeros[f][c] = new Random().nextInt(1001);
        }
        for (int f = 0; f < numeros.length; f++) {
            for (int c = 0; c < numeros[0].length; c++){
                if(numeros[f][c] > max){
                    max = numeros[f][c];
                    filaMax = f;
                    colMax = c;
                }
                if(numeros[f][c] < min){
                    min = numeros[f][c];
                    filaMin = f;
                    colMin = c;
                }

            } 
        }
        System.out.println("El maximo es "+ max + " en la fila "+ filaMax + " y la columna "+ colMax);   
        System.out.println("El minimo es "+ min + " en la fila "+ filaMin + " y la columna "+ colMin);
        System.out.println();
        for (int f = 0; f < numeros.length; f++) {
            for (int c = 0; c < numeros.length; c++)
                System.out.print(String.format("%5d",numeros[f][c]));
            System.out.println();
        }
    } 
} 
