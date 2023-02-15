package UD06.Actividades1;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce primera cadena");
        String primeraCadena = sc.nextLine();

        System.out.println("Introduce la segunda cadena");
        String segundaCadena = sc.nextLine();


        //Comparativa CaseInsensitive
        int comparacionCaseInsensitive = primeraCadena.compareToIgnoreCase(segundaCadena);
        if(comparacionCaseInsensitive < 0)
            System.out.println("La primera cadena es menor alfabeticamente ignorando mayusculas");
        else if(comparacionCaseInsensitive >0)
            System.out.println("La segunda cadena es menor alfabeticamente ignorando mayusculas");
        else
            System.out.println("Ambas cadenas son iguales alfabeticamente ignorando mayusculas");


        //Comparativa CaseSensitive
        int comparacionCaseSensitive = primeraCadena.compareTo(segundaCadena);
        if(comparacionCaseSensitive < 0)
            System.out.println("La primera cadena es menor alfabeticamente");
        else if(comparacionCaseSensitive > 0)
            System.out.println("La segunda cadena es menor alfabeticamente");
        else
            System.out.println("Ambas cadenas son iguales alfabeticamente");
    }
}
