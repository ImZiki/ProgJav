import java.util.Collections;
import java.util.Random;

public class PuzzleDeslizante {
    private int[][] tableroObjetivo;
    private int[][] tableroJuego;
    
    // Constructor
    public PuzzleDeslizante(int n) {
        this.tableroObjetivo = generarTableroObjetivo(n);
        this.tableroJuego = generarTableroJuego(n);
    }
    
    // Método privado para generar el tablero objetivo
    public int[][] generarTableroObjetivo(int n) {
        int[][] tablero = new int[n][n];
        int contador = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tablero[i][j] = contador++;
            }
        }
        tablero[n - 1][n - 1] = 0;
        return tablero;
    }
        public int[][] generarTableroJuego(int n) {
        int[][] tablero = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tablero[i][j] = tableroObjetivo[i][j];
            }
        }
        desordenar(tablero);
        return tablero;
    }
    private static void desordenar(int[][] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = array[i].length - 1; j > 0; j--) {
                int indiceFila = rand.nextInt(i + 1);
                int indiceColumna = rand.nextInt(j + 1);

                // Se intercambian los elementos
                int temp = array[indiceFila][indiceColumna];
                array[indiceFila][indiceColumna] = array[i][j];
                array[i][j] = temp;
            }
        }
    }
    // Método público para imprimir el tablero
        public void imprimirTablero(boolean esObjetivo) {
        int n = tableroObjetivo.length;
        int[][] tablero = esObjetivo ? tableroObjetivo : tableroJuego;
        
        for (int i = 0; i < n; i++) {
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                System.out.print("---");
            }
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(" |" + tablero[i][j] + "|");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 3; // Tamaño del tablero
        PuzzleDeslizante puzzle = new PuzzleDeslizante(n);
        
        System.out.println("Tablero Objetivo:");
        puzzle.imprimirTablero(true);
        
        System.out.println("\nTablero de Juego:");
        puzzle.imprimirTablero(false);
    }
}
    