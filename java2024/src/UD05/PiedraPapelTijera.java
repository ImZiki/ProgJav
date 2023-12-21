package UD05;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int victoria = 0;
        int derrota = 0;
        int empate = 0;
        int partidas = 0;
        double porcentaje_victoria = 0;
        double porcentaje_derrota = 0;
        double porcentaje_empate = 0;
        String eleccionPc = "";

        while (true) {
            int numeroPc = rd.nextInt(3);
            System.out.println("Introduce tu movimiento(Piedra, Papel, Tijeras o Salir)");
            String eleccionJugador = sc.nextLine();
            if(eleccionJugador.equals("Salir"))
                break;

            switch(numeroPc){
                case 0: 
                    eleccionPc = "Piedra";
                    break;
                case 1: 
                    eleccionPc = "Papel";
                    break;

                case 2: 
                    eleccionPc = "Tijeras";
                    break;
                default:
                    break;

            }
            if(eleccionJugador.equals(eleccionPc)){
                empate += 1;
                System.out.println("Hemos empatado"); 
            } 
            else if(eleccionJugador.equals("Tijeras") && eleccionPc.equals("Papel") || eleccionJugador.equals("Papel") && eleccionPc.equals("Piedra") || eleccionJugador.equals("Piedra") && eleccionPc.equals("Tijeras")){
                victoria += 1;
                System.out.println("Has ganado");
            }
                
            else{
                derrota += 1;
                System.out.println("Has perdido");
            }
            partidas += 1;       
        }
        if(partidas != 0){
            if(victoria != 0)
                porcentaje_victoria = victoria * 100/ partidas ;
            if(derrota != 0)
                porcentaje_derrota = victoria * 100/ partidas ;
            if(empate != 0)
                porcentaje_empate = empate * 100 / partidas ;
        }

        System.out.println("Estadisticas:");
        System.out.println("Numero de victorias: " + victoria);
        System.out.printf("Porcentaje de victorias: %.2f%%\n",porcentaje_victoria);
        System.out.println("Numero de derrotas: " + derrota);
        System.out.printf("Porcentaje de derrotas: %.2f%%\n",porcentaje_derrota);
        System.out.println("Numero de empates: " + empate);
        System.out.printf("Porcentaje de empates: %.2f%%\n",porcentaje_empate);

    }
}

