package ud06.ejercicios;

import java.util.Scanner;

public class Carta {
    private char palo;
    private int numero;
    
    
    public Carta(char palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }
    public Carta(Carta carta){
        palo = carta.getPalo();
        numero = carta.getNumero();
    }
    public char getPalo() {
        return palo;
    }
    public int getNumero() {
        return numero;
    }
    public void setPalo(char palo) {
        Scanner sc = new Scanner(System.in);
        while(true){
            palo = sc.next().charAt(0);

            if(palo == 'c' || palo == 'p' || palo == 'r' || palo == 't'){
                this.palo = palo;
                break;
            }
        }
    }

    public void setNumero(int numero) {
        Scanner sc = new Scanner(System.in);
        while(true){
            palo = sc.next().charAt(0);
            if(numero <= 1 && numero >= 13){
                this.numero = numero;
                break;
            }
        }
    }
    
    public void mostrarCarta() {
        String nombreNumero;
        String nombrePalo;
        switch (numero) {
            case 1:
                nombreNumero = "As";
                break;
            case 11:
                nombreNumero = "Jack";
                break;
            case 12:
                nombreNumero = "Reina";
                break;
            case 13:
                nombreNumero = "Rey";
                break;
            default:
                nombreNumero = this.numero;
                break;
        }

        
        switch (palo) {
            case 'c':
                nombrePalo = "Corazones";
                break;
            case 'p':
                nombrePalo = "Picas";
                break;
            case 'r':
                nombrePalo = "Rombos";
                break;
            case 't':
                nombrePalo = "Tréboles";
                break;
            default:
                nombrePalo = "";
                break;
        }

        System.out.println("Es el " + nombreNumero + " de " + nombrePalo);
    }
    private int comparar(Carta carta) {
        int resultado;

        if (this.numero > carta.numero) {
            resultado = -1; // La carta actual gana
        } else if (this.numero < carta.numero) {
            resultado = 1; // La carta pasada por parámetro gana
        } else {
            // Los números son iguales, comparar palos
            String palos = "ctrp"; // Orden de victoria: Trébol, Rombos, Picas, Corazones
            int indiceActual = palos.indexOf(this.palo);
            int indiceOtra = palos.indexOf(carta.palo);

            if (indiceActual < indiceOtra) {
                resultado = -1; 
            } else if (indiceActual > indiceOtra) {
                resultado = 1; 
            } else {
                resultado = 0; 
            }
        }

        return resultado;
    }
    public void mostrarGanadora(Carta carta) {
        int resultado = comparar(carta);

        if (resultado == -1) {
            System.out.println("La carta actual gana a la carta pasada por parámetro.");
        } else if (resultado == 1) {
            System.out.println("La carta pasada por parámetro gana a la carta actual.");
        } else {
            System.out.println("Hay un empate entre las dos cartas.");
        }
    }
 public static void main(String[] args) {
        Carta carta1 = new Carta();
        Carta carta2 = new Carta(carta1);

        carta1.setNumero(1);
        carta1.setPalo('c');

        carta1.mostrarCarta();
        carta2.mostrarCarta();
        carta1.mostrarGanadora(carta2);
        System.out.println();

        carta2.setNumero(2);
        carta2.setPalo('t');
     
        carta1.mostrarCarta();
        carta2.mostrarCarta();
        System.out.println();
        carta1.mostrarGanadora(carta2);

    }   
}
