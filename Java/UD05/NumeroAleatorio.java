package UD05;
import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd= new Random();
        System.out.println("Bienvenido a Adivina un numero\nEstoy pensando un numero entre 1 y 20\nTrata de adivinarlo en menos de 6 intentos");
        int numeroSecreto = rd.nextInt(20)+1;
        int intentos = 0;
        boolean ganador = false;
        
        do{
            System.out.println("Adivina");
            int numeroAdivinar = sc.nextInt();
            if (numeroAdivinar == numeroSecreto) {
                ganador = true;
                System.out.println("Adivinaste el numero en " + (intentos+1) + " intentos");
            }else if(numeroAdivinar > numeroSecreto){
                System.out.println("Es muy alto");
            }else{
                System.out.println("Es muy bajo");
            }
            intentos++;
        }while(intentos != 6 && !ganador);
        if (!ganador){
            System.out.println("\nPerdiste, agotaste todos los intentos");
        }
    }
}
