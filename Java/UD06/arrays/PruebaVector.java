package UD06.arrays;

import java.util.Scanner;

public class PruebaVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        Vector vector1 = new Vector();
        //Vector vector2 = new Vector(10);

        while(opcion != 0){
            System.out.println("""
                    \nMenú de opciones
                    1- Mostrar vector
                    2- Mostrar vector inverso
                    3- Buscar numero menor
                    4- Buscar numero mayor
                    5- Comprobar si existe en el vector
                    6- Cambiar el valor de una posicion
                    7- Sustituir todas las apariciones de un numero en el vector
                    8- Intercambiar valores de 2 posiciones
                    9- Ordenar el vector
                    0- Salir
                    """);
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    vector1.mostrarVector();
                    break;
                case 2:
                    vector1.mostrarVectorInverso();
                    break;
                case 3:
                    System.out.println("El numero menor es " + vector1.buscarMenor());
                    break;
                case 4:
                    System.out.println("El numero mayor es: " + vector1.buscarMayor());
                    break;
                case 5:
                    System.out.println("Introduce el numero para buscarlo: ");
                    int numero = sc.nextInt();
                    if(vector1.existeNumero(numero))
                        System.out.println("El numero existe.");
                    else
                        System.out.println("El numero no existe");
                    break;
                case 6:
                    System.out.println("Introduce posicion a cambiar: ");
                    int posicion = sc.nextInt();
                    System.out.println("Introduce el nuevo valor: ");
                    int nuevoValor = sc.nextInt();
                    vector1.cambiarValor(posicion, nuevoValor);
                    break;
                case 7:
                    System.out.println("Introduce numero a cambiar: ");
                    int num1 = sc.nextInt();
                    System.out.println("Introduce el nuevo numero: ");
                    int num2 = sc.nextInt();
                    vector1.sustituirNumero(num1, num2);
                    break;
                case 8:
                    System.out.println("Introduce posicion 1: ");
                    int pos1 = sc.nextInt();
                    System.out.println("Introduce posicion 2: ");
                    int pos2 = sc.nextInt();
                    vector1.intercambiarValores(pos1, pos2);
                    break;
                case 9:
                    vector1.ordenarVector();
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
