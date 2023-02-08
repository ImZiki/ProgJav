package UD06.arrays;

import java.util.Arrays;
import java.util.Random;


public class Vector {
    private int[] vector;
    private int tamanio;
    private Random aleatorio;

    //Constructor por defecto.

    public Vector(){
        this(50);
    }
    //Constructor por parametros

    public Vector(int tamanio){
        this.tamanio = tamanio;
        vector = new int[tamanio];
        aleatorio = new Random();
        for (int i = 0; i < tamanio; i++)
            vector[i] = aleatorio.nextInt(100);
    }

    @Override
    public String toString() {
        return "Vector [vector=" + Arrays.toString(vector) + ", tamanio=" + tamanio + ", aleatorio=" + aleatorio + "]";
    }

    //Metodos del menú

    //opcion 1

    public void mostrarVector() {
        System.out.print("Vector: [ ");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("]");
    }
    //opcion 2

    public void mostrarVectorInverso() {
        System.out.print("Vector inverso: [ ");
        for (int i = tamanio - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("]");
    }
    //opcion 3

    public int buscarMenor() {
        int menor = vector[0];
        for (int i = 1; i < tamanio; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }
        return menor;
    }

    //opcion 4

    public int buscarMayor() {
        int mayor = vector[0];
        for (int i = 1; i < tamanio; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }
        return mayor;
    }

    //opcion 5

    public boolean existeNumero(int numero) {
        for (int i = 0; i < tamanio; i++)
            if (vector[i] == numero)
                return true;
        return false;
    }

    //opcion 6

    public void cambiarValor(int posicion, int nuevoValor) {
        vector[posicion] = nuevoValor;
    }

    //opcion 7

    public void sustituirNumero(int numAntiguo, int numNuevo) {
        for (int i = 0; i < tamanio; i++) {
            if (vector[i] == numAntiguo) {
                vector[i] = numNuevo;
            }
        }
    }
    //opcion 8

    public void intercambiarValores(int pos1, int pos2){
        int temporal = vector[pos1];
        vector[pos1] = vector[pos2];
        vector[pos2] = temporal;
    }

    //opcion 9

    public void ordenarVector(){
        Arrays.sort(vector);
    }


}