package UD06.Actividades1;

import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nombre de la primera persona");
        String primeraPersona = sc.nextLine();
        
        System.out.println("\nNombre de la segunda persona");
        String segundaPersona = sc.nextLine();

        if(primeraPersona.compareToIgnoreCase(segundaPersona)<0)
            System.out.println(primeraPersona + " " + segundaPersona);
        else if(primeraPersona.compareToIgnoreCase(segundaPersona)>0 )
            System.out.println(segundaPersona + " " + primeraPersona);
        else
            System.out.println(primeraPersona + " " + segundaPersona);
    }
}
