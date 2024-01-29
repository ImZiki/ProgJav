package ud06.juegos;

import java.util.Scanner;

public class Carta {
    private char palo;
    private int numero;
    
    
    public Carta() {
        this.palo = 'c';
        this.numero = 1;
    }
    public Carta(Carta carta){
        palo = carta.palo;
        numero = carta.numero;
    }
    public char getPalo() {
        return palo;
    }
    public int getNumero() {
        return numero;
    }
    public void setPalo(char palo) {
        this.palo = palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
     }
    public void pedirNumero(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Introduce el número de la carta (entre 1 y 13): ");
            numero = sc.nextInt();
            if(numero >= 1 && numero <= 13){
                this.setNumero(numero);
                break;
            }
        }
    }
    public void pedirPalo(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Introduce el palo de la carta (t, r, p, c): ");
            palo = sc.next().charAt(0);
            if(palo == 'c' || palo == 'p' || palo == 'r' || palo == 't'){
                this.setPalo(palo);
                break;
            }
        }
    }

    public void pedirCarta(){
        pedirNumero();
        pedirPalo();
    }
    private int comparar(Carta carta) {
        int resultado;

        if (this.numero > carta.numero) {
            resultado = -1; // La carta actual gana
        } else if (this.numero < carta.numero) {
            resultado = 1; // La carta pasada por parámetro gana
        } else {
            // Los números son iguales, comparar palos
            String palos = "trpc"; // Orden de victoria: Trébol, Rombos, Picas, Corazones
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
            System.out.println("Gano " + this);
        } else if (resultado == 1) {
            System.out.println("Gano " + carta);
        } else {
            System.out.println("Hay un empate entre las dos cartas.");
        }

        
    }
 @Override
    public String toString() {
        String nombreNumero;
        String nombrePalo;
        switch (numero) {
            case 1:
                nombreNumero = "As";
                break;
            case 11:
                nombreNumero = "Jota";
                break;
            case 12:
                nombreNumero = "Reina";
                break;
            case 13:
                nombreNumero = "Rey";
                break;
            default:
                nombreNumero = Integer.toString(numero);
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
        return nombreNumero + " de " + nombrePalo;
    }
}