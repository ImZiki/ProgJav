package UD05;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ChoHan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        DecimalFormat df = new DecimalFormat("#.00");
        String dado1jap;
        String dado2jap;
        String eleccionJugador;
        double dineroActual = 5000.00;
        double apuestaJugador;
        do{
            
                    //Generar dados
            int dado1 = rd.nextInt(6)+1;
            int dado2 = rd.nextInt(6)+1;
            //Switch numeros
            switch(dado1){
                case 1:
                    dado1jap = "Ichi";
                    break;
                case 2:
                    dado1jap = "Ni";
                    break;
                case 3:
                    dado1jap = "San";
                    break;
                case 4:
                    dado1jap = "Shi";
                    break;
                case 5:
                    dado1jap = "Go";
                    break;
                case 6:
                    dado1jap = "Roku";
                    break;
                default:
                    continue;
            }
            switch(dado2){
                case 1:
                    dado2jap = "Ichi";
                    break;
                case 2:
                    dado2jap = "Ni";
                    break;
                case 3:
                    dado2jap = "San";
                    break;
                case 4:
                    dado2jap = "Shi";
                    break;
                case 5:
                    dado2jap = "Go";
                    break;
                case 6:
                    dado2jap = "Roku";
                    break;
                default:
                    continue;
            }
            System.out.println("Tienes "+ df.format(dineroActual) +"€, ¿Cuánto apuestas?");
            apuestaJugador = sc.nextDouble();
            if(apuestaJugador == 0){
                System.out.println("Adiós!");
                break;
            }else if(apuestaJugador>dineroActual){
                System.out.println("No tienes tanto dinero");
                continue;
            }
            System.out.println("El crupier hace girar el cubilete y se oye el traqueteo de los dados\n El crupier golpea el cubilete contra el suelo, todavia cubriendo los dados y pide tu apuesta.");
            System.out.println("Elije Cho o Han: ");
            eleccionJugador = sc.next();
            System.out.println(dado1jap+ " " + dado2jap);
            
            
            
            
            boolean esPar;
            if((dado1 + dado2)%2 == 0){
                esPar = true;
            }else{
                esPar = false;
            }
            double tasa = (apuestaJugador* 10)/100;
            double ganado = apuestaJugador - tasa;
            
            if(eleccionJugador.equals("Cho") && esPar ){
                dineroActual += ganado;
                System.out.println("Ganaste! Has ganado "+ df.format(ganado)+"€\nLa casa se ha llevado "+ df.format(tasa) + "€");
                
            }else if(eleccionJugador.equals("Han") && !esPar) {
                dineroActual += ganado;
                System.out.println("Ganaste! Has ganado "+ df.format(ganado)+"€\nLa casa se ha llevado "+ df.format(tasa) + "€");
                
            }else{
                dineroActual -= apuestaJugador;
                System.out.println("Perdiste! Has perdido "+ df.format(apuestaJugador)+"€");
            }
            if(dineroActual == 0){
                System.out.println("Te quedaste sin blanca!");
            }
        }while(dineroActual != 0);
       


    }
}
