package UD06;

import java.util.Scanner;

public class VectorEnteros {
    public static void main(String[] args){
        int[] numeros;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int suma = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce longitud del array: ");
        int longitudArray = sc.nextInt();
        numeros = new int[longitudArray];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numero: ");
            numeros[i] = sc.nextInt();
        
            if(numeros[i] > mayor)
                mayor = numeros[i];
            else if(numeros[i]< menor)
                menor = numeros[i];
            suma += numeros[i];
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Suma: " + suma);
    }
}
