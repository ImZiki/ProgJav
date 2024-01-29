package ud06.juegos;

import java.util.Scanner;

public class Mano {
    private int tamaño;
    private Carta[] cartas;

    public Mano() {
        this.tamaño = 3;
        this.cartas = new Carta[3];
        for (int i = 0; i < 3; i++) {
            this.cartas[i] = new Carta();
        }
    }

    public int getTamaño() {
        return tamaño;
    }

    public void mostrarCarta(int indice) {
        if (indice >= 0 && indice < tamaño) {
            System.out.println("Carta " + (indice + 1) + ": " + cartas[indice]);
        } else {
            System.out.println("Índice de carta inválido");
        }
    }

    public void setCarta(int indice) {
        if (indice >= 0 && indice < tamaño) {
            cartas[indice].setPalo();
            cartas[indice].setNumero();
        } else {
            System.out.println("Índice de carta inválido");
        }
    }

    public String toString() {
        String manoString = "";
        for (int i = 0; i < tamaño; i++) {
            manoString += "Carta " + (i + 1) + ": " + cartas[i] + "\n";
        }
        return manoString;
    }

    public void pedirMano() {
        for (int i = 0; i < tamaño; i++) {
            cartas[i].setPalo();
            cartas[i].setNumero();
        }
    }

    public void mostrarMano() {
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Carta " + (i + 1) + ": " + cartas[i]);
        }
    }

    private int comparar(Mano mano) {
        int sumaThis = 0;
        int sumaMano = 0;
        int cartasRojasThis = 0;
        int cartasRojasMano = 0;

        for (int i = 0; i < tamaño; i++) {
            sumaThis += cartas[i].getNumero();
            sumaMano += mano.cartas[i].getNumero();
            if (cartas[i].getPalo() == 'r' || cartas[i].getPalo() == 't') {
                cartasRojasThis++;
            }
            if (mano.cartas[i].getPalo() == 'r' || mano.cartas[i].getPalo() == 't') {
                cartasRojasMano++;
            }
        }

        if (sumaThis > sumaMano) {
            return -1;
        } else if (sumaThis < sumaMano) {
            return 1;
        } else {
            if (cartasRojasThis > cartasRojasMano) {
                return -1;
            } else if (cartasRojasThis < cartasRojasMano) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public void mostrarGanadora(Mano mano) {
        int resultado = comparar(mano);

        if (resultado == -1) {
            System.out.println("Ha ganado esta mano:");
            System.out.println(this);
        } else if (resultado == 1) {
            System.out.println("Ha ganado la siguiente mano:");
            System.out.println(mano);
        } else {
            System.out.println("Hay un empate entre las dos manos.");
        }
    }
}
