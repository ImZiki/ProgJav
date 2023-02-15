package UD06.Actividades1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        int contadorTotal = 0;

        System.out.println("Ingresa una cadena");
        String cadena = sc.nextLine();


        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.toLowerCase().charAt(i);

            if (caracter == 'a'){
                contadorA++;
                contadorTotal++;
            } else if(caracter == 'e'){
                contadorE++;
                contadorTotal++;
            }else if(caracter == 'i'){
                contadorI++;
                contadorTotal++;
            }else if(caracter == 'o'){
                contadorO++;
                contadorTotal++;
            }else if(caracter == 'u'){
                contadorU++;
                contadorTotal++;
            }
        }
        System.out.println("La cadena tiene "+ contadorTotal + " vocales en total");
        System.out.println("De las cuales:"+"\nA: "+contadorA + "\nE: "+contadorE+"\nI: "+contadorI+"\nO: "+contadorO+"\nU: "+contadorU);
    }
}