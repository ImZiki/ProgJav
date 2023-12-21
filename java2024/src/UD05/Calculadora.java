package UD05;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija 2 numeros");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        System.out.println("Calculadora V.1.1");
        System.out.println("------------------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        
        

        System.out.println("Ingrese un número para elegir el menú");
        
        while (true) {
            int numMenu = sc.nextInt();
            int resultado = 0;
            if(numMenu == 1) {
                resultado = numero1 + numero2;
                System.out.println("La suma de los números es:" + resultado);
                continue;
            }

            else if (numMenu == 2) {
                resultado = numero1 - numero2;
                System.out.println("La resta de los números es:"+ resultado);
                continue;
            }

            else if (numMenu == 3) {
                resultado = numero1 * numero2;
                System.out.println("La multiplicación de los números es:" + resultado);
                continue;
            }

            else if (numMenu == 4) {
                    resultado = numero1 / numero2;
                    if (numero1 == 0 && numero2 == 0){
                        System.out.println("Es una indeterminación");
                        continue;
                    }else
                        System.out.println("La división de los números es:" + resultado);
                        continue;
            }else{
                break;
            }
        }
        sc.close();
    }
}
