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
    
    public void mostrarCarta(){
        System.out.printf("%d de %c", numero, palo);
    }
    private int comparar(Carta carta){
        int resultado;
        if(this.numero == carta.getNumero())
            if(this.palo == carta.getPalo())
        else if(this )
    }
    
}
