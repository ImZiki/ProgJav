package UD06.matrices;



public class Ejercicio1 {
    public static void main(String[] args) {
        int [][] numeros = new int[5][5];
        int num = 1;
        
        for (int f = 0; f < numeros.length; f++) {
            for (int c = 0; c < numeros[f].length; c++) {
                numeros[f][c] = num++;
            }
        }
        for (int f = 0; f < numeros.length; f++) {
            for (int c = 0; c < numeros.length; c++) {
                System.out.print(numeros[f][c]+" ");
            }
            System.out.println();
        }
    }
}
