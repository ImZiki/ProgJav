package ud05;

import java.util.Scanner;

public class CalculadoraMod{
    public static void main(String[] args) {
        int resultado = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa dos números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Calculadora V.1.1");
        System.out.println("------------------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        System.out.println("Ingrese un número para elegir el menú");

        int numMenu = sc.nextInt();
        switch (numMenu) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                 resultado = num1 - num2;
                 break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado  = num1 / num2;
                break;
            default:
                break;
        }
        System.out.println(resultado);
        sc.close();
    }
}