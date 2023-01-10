package UD05;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class PiedraPapelTijera {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         Random rd= new Random();
         char jugada;
         double victorias = 0;
         double derrotas = 0;
         int partidaJugada = 0;
         System.out.println("Bienvenido a Piedra Papel o Tijera");
         
         do{
            System.out.println("Introduce X(piedra), P(Papel), T(tijeras) para jugar o S para salir");
            jugada = sc.next().charAt(0);
            if(jugada != 'S' && jugada != 'T' && jugada != 'X' && jugada != 'P'){
                System.out.println("Jugada no reconocida");
                continue;
            }
            int ordenador = rd.nextInt(3)+1;
            char ordenadorCambiada;
            switch (ordenador){
                case 1:
                    ordenadorCambiada = 'X';
                    break;
                case 2:
                    ordenadorCambiada = 'P';
                    break;
                case 3:
                    ordenadorCambiada = 'T';
                    break;
                default:
                    continue;
            }
            System.out.println("La maquina saca " + ordenadorCambiada);
            if(jugada != 'S'){
                partidaJugada++;  
                if(jugada == ordenadorCambiada){
                    System.out.println("Empate");
                }else if(jugada== 'X' && ordenadorCambiada=='T'
                    || jugada== 'P' && ordenadorCambiada == 'X'
                    || jugada == 'T' && ordenadorCambiada == 'P'){
                    System.out.println("Has ganado");
                    victorias++;
                }else{
                    System.out.println("Has perdido");
                    derrotas++;
                }
            }  
            
            
         }while(jugada!= 'S');
         double empates = partidaJugada - (victorias+derrotas);
         System.out.println("Has jugado "+ partidaJugada + " partidas");
         if(partidaJugada != 0){
            double totalVictorias = (victorias / partidaJugada)*100;
            double totalDerrotas = (derrotas / partidaJugada)*100;
            double totalEmpates = ( empates / partidaJugada)*100;
            DecimalFormat df = new DecimalFormat("#.0");
            System.out.println("Ganaste "+ victorias + "(" + df.format(totalVictorias)+"%)");
            System.out.println("Perdiste "+ derrotas + "(" + df.format(totalDerrotas)+"%)");
            System.out.println("Empataste" + empates + "(" + df.format(totalEmpates)+"%)");
        }
    }
}
