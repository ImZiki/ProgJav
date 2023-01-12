package UD05.Actividades1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nombre de la primera persona");
        String persona1 = sc.nextLine();
        
        System.out.println("\nNombre de la segunda persona");
        String persona2 = sc.nextLine();

        System.out.println("\nNombre de la tercera persona");
        String persona3= sc.nextLine();

        if(persona1.compareToIgnoreCase(persona2)<0 && persona1.compareToIgnoreCase(persona3)<0)
            if(persona2.compareToIgnoreCase(persona3)<0)
                System.out.println(persona1 + " "+ persona2 +" " + persona3);
            else
                System.out.println(persona1 + " "+ persona3 +" " + persona2);

        else if(persona1.compareToIgnoreCase(persona2)>0 && persona1.compareToIgnoreCase(persona3)>0)
            if(persona2.compareToIgnoreCase(persona3)>0)
                System.out.println(persona2 + " "+ persona3 +" " + persona1);
            else
                System.out.println(persona2 + " " +persona1+ " " + persona3);

        else if(persona2.compareToIgnoreCase(persona3)<0 && persona2.compareToIgnoreCase(persona1)<0)
            if(persona1.compareToIgnoreCase(persona3)>0)
                System.out.println(persona3 + " " + persona2+ " " + persona1);
            else
                System.out.println(persona3 + " " + persona1 + " " + persona2);


            
      

    }
}
