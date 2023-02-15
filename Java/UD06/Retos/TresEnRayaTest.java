package UD06.Retos;

import java.util.Scanner;

public class TresEnRayaTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TresEnRaya ter = new TresEnRaya();
 
        int fila, columna;
        boolean posValida, correcto;

        while (!ter.finPartida()) {
            do {
                ter.mostrarTurnoActual();
                ter.mostrarTablero();

                correcto = false;
                System.out.println("Dame la fila");
                fila = sc.nextInt();
                System.out.println("Dame la columna");
                columna = sc.nextInt();

                posValida = ter.validarPosicion(fila, columna);
 
                if (posValida) {
                    if (!ter.hayValorPosicion(fila, columna))
                        correcto = true;
                     else 
                        System.out.println("Ya hay una marca en esa posicion");
                    
                }else 
                    System.out.println("La posicion no es valida");
                
            } while (!correcto);
 
            ter.insertarEn(fila, columna);
            ter.cambiaTurno();
        }
        ter.mostrarTablero();
        ter.mostrarGanador();
        sc.close();
    }
}