package UD06.Actividades1;

import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena="";
        int contador = 0;
        char letra;

        System.out.println("Ingrese una cadena");
        cadena=sc.nextLine();

        System.out.println("Ingresa una letra");
        letra = sc.next().charAt(0);

        for(int i=0; i<cadena.length(); i++)
            if(cadena.charAt(i) == letra)
                contador++;

        System.out.println("La letra " + letra + " aparece " + contador + " veces en la cadena "+ cadena);

        //Esto es una pijada adicional porque me aburría.
        System.out.print("En las posiciones: ");
        for (int i=0; i< cadena.length(); i++)
            if (cadena.charAt(i) == letra)
                System.out.print(i + " ");

    }
}