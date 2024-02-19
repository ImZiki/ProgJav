

import java.util.Random;

public class Tablero {
    /* Atributos */
    private int[][] tableroObjetivo;
    private int[][] tableroJuego;

    /* Constructores */
    public Tablero(int n) {
        this.tableroJuego = generarTableroJuego(n);
        this.tableroObjetivo = generarTableroObjetivo(n);
    }

    /* Metodos */
    private int[][] generarTableroObjetivo(int n) {
        int[] numeros = Tablero.generarNumeros(n);

        int[][] tablero = Tablero.introducirValores(numeros, n);

        return tablero;
    }

    private int[][] generarTableroJuego(int n) {
        int[] numeros = Tablero.generarNumeros(n);

        numeros = Tablero.desordenar(numeros);

        int[][] tablero = Tablero.introducirValores(numeros, n);

        return tablero;
    }

    public void imprimirTablero(boolean objetivo) {
        int[][] tablero;
        if (objetivo) // Detecta que tablero tiene que imprimir
            tablero = tableroObjetivo;
        else
            tablero = tableroJuego;
        
            String caracter = "-";
            System.out.println(caracter.repeat(tablero.length * 5 + 1));
            for (int[] fila : tablero) {
                System.out.print("|");
                for (int columna : fila) {
                    if (columna == 0)
                        System.out.printf("%3s |", " ");
                    else
                        System.out.printf("%3d |", columna);
                }
                System.out.println(); // Pasa de fila
                System.out.println(caracter.repeat(tablero.length * 5 + 1));
            }
        
    }   

    private static int[][] introducirValores(int[] numeros, int cantidad) { // Se encarga de introducir los valores en el tablero
        int[][] tablero = new int[cantidad][cantidad];

        int acumulador = 0;
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                tablero[fila][columna] = numeros[acumulador];
                acumulador++;
            }
        }
        
        return tablero;
    }

    private static int[] generarNumeros(int cantidad) { // Se encarga de la generacion de los numeros para los tableros
        int[] numeros = new int[cantidad*cantidad];

        for (int i = 1; i < numeros.length; i++) {
            numeros[i - 1] = i;
        }
        // El ultimo 0 lo ha inicializado Java al declarar la matriz
        return numeros;
    }

    private static int[] desordenar(int[] numeros) {
        Random rand = new Random();
        for (int i = numeros.length - 1; i > 0; i--) {
            int indice = rand.nextInt(i + 1); // Busca que indice va a cambiar

            // Se sustituyen las posiciones
            int numero = numeros[indice];
            numeros[indice] = numeros[i];
            numeros[i] = numero;
        }

        return numeros;
    }
}