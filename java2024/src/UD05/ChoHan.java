package UD05;

import java.util.Random;
import java.util.Scanner;

public class ChoHan {
    public static void main(String[] args) {
        final double TASA = 0.1;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        String eleccionJugador;
        String eleccionPc;
        double dineroActual = 5000.00;
        double apuestaJugador;
        double ganancia;
        double tasaCasa;
        System.out.println("En este juego de dados tradicional japonés, el crupier, sentado en el suelo,");
        System.out.println("lanza los dos dados en un cubilete de bambú. El jugador debe adivinar si los");
        System.out.println("dados suman un numero par(Cho) o impar(Han)");
        do {

                System.out.printf("Tienes %.2f€ Cuanto apuestas (o 0 para Salir)\n", dineroActual);
                apuestaJugador = sc.nextDouble();
                sc.nextLine();
                if(apuestaJugador == 0){
                    System.out.println("Adiós!");
                    break;
                }else if(apuestaJugador>dineroActual){
                    System.out.println("No tienes tanto dinero");
                    continue;
                }

                int dado1 = rd.nextInt(6) + 1;
                int dado2 = rd.nextInt(6) + 1;
                if ((dado1 + dado2) % 2 == 0)
                    eleccionPc = "Cho";
                else
                    eleccionPc = "Han";
            
                System.out.println("El crupier hace girar el cubilete y se oye el traqueteo de los dados\nEl crupier golpea el cubilete contra el suelo, todavia cubriendo los dados y pide tu apuesta.");
                System.out.println("Elije Cho o Han: ");
                eleccionJugador = sc.nextLine();
                if (eleccionJugador.equalsIgnoreCase(eleccionPc)){
                    tasaCasa = apuestaJugador * TASA;
                    ganancia = apuestaJugador - tasaCasa;
                    dineroActual += ganancia;
                    System.out.printf("Has ganado, te llevas %.2f€", ganancia);
                    System.out.printf(" la casa se lleva %.2f€\n", tasaCasa);
                }else{
                    dineroActual -= apuestaJugador;
                    System.out.println("Has perdido");
                }
                if (dineroActual == 0)
                    System.out.println("Te quedaste sin dinero, adiós");
        } while (dineroActual != 0);
    }
}