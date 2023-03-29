package Enumeracion;

import java.util.Scanner;

public class TestDiasSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un dia");
        String dia = sc.nextLine();
        boolean esEntreSemana = false;

        for (DiaSemana dias : DiaSemana.values()) {
            if(dias.esDiaSemana())
                esEntreSemana = true;
            if(dias.esFinSemana())
                esEntreSemana = false;
        }
        if(esEntreSemana)
            System.out.println("El dia " + dia + " es entre semana");
        else
            System.out.println("El dia " + dia + " es fin de semana");
    }
}
