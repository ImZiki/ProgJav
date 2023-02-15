package UD06.Actividades1;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena");
        String cadena = sc.nextLine();

        System.out.println("Introduce la palabra para buscarla");
        String palabra = sc.nextLine();

        //Conversion para ignorar mayusculas/minusculas
        cadena = cadena.toLowerCase();
        palabra = palabra.toLowerCase();


        int contador = 0;
        int lastIndex = 0;
        //prueba con while, con indexOf y lastIndex
        while(lastIndex != -1){
            lastIndex = cadena.indexOf(palabra,lastIndex);
            if(lastIndex != -1){
                contador ++;
                lastIndex += palabra.length();
            }
        }

        if(contador == 0)
            System.out.println("La palabra " + palabra + " no está en la cadena");
        else
            System.out.println("La palabra " + palabra + " se repite "+contador+" vez/veces en la cadena");
    }
}


/*
        prueba con for, usando substrings

        int contador = 0;
        String subcadena = "";
        for (int i = 0; i < cadena.length(); i++) {
            subcadena = cadena.substring(i);
            if (subcadena.startsWith(palabra))
                contador ++;
        }
        if(cadena.indexOf(palabra) == -1)
            System.out.println("La letra introducida no está en la cadena");
        else
            System.out.println("La palabra se repite "+contador+" vez/veces en la cadena");
    }
}
*/
