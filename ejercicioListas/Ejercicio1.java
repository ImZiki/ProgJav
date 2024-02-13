import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejercicio1 {
    public static void mostrarLista(List<Integer> numeros){
        for(Integer numero : numeros)
            System.out.print(numero + " ");
        System.out.println("");
    }

    public static void mostrarMayorMenorMedia(List<Integer> numeros){
        int mayor = obtenerMayor(numeros);
        int menor = obtenerMenor(numeros);
        double media = obtenerMedia(numeros);
        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);
        System.out.println("La media es " + media);
    }
    private static int obtenerMayor(List<Integer> numeros){
        int mayor = numeros.get(0);
        for(Integer e : numeros){
            if(e > mayor)
                mayor = e;
        }
        return mayor;
    }
    private static int obtenerMenor(List<Integer> numeros){
        int menor = numeros.get(0);
        for(Integer e : numeros){
            if(e < menor)
                menor = e;
        }
        return menor;
    }
    private static double obtenerMedia(List<Integer> numeros){
        int suma = 0;
        for(Integer e : numeros)
            suma += e;
        double media = suma / numeros.size();
        return media;
    }
    public static void borrarPorPosicion(List<Integer> numeros){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la posición del elemento que desea borrar:");
        int posicion = entrada.nextInt();
        numeros.remove(posicion);
        System.out.println("Elemento borrado");
    }

    public static void borrarPorValor(List<Integer> numeros){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el valor del elemento que desea borrar:");
        int valor = entrada.nextInt();
        numeros.remove((Integer)valor);
        System.out.println("Elemento borrado");
    }

    public static void añadirElementoAlFinal(List<Integer> numeros){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduzca un número:");
    int nuevoNumero = entrada.nextInt();
    numeros.add(nuevoNumero);
    }


    
    private static void borrarTodosElementos(List<Integer> numeros) {
        numeros.clear();
    }


    private static void cambiarValorPorPosicion(List<Integer> numeros) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la posicion del elemento que desea cambiar");
        int posicion = entrada.nextInt();
        System.out.println("Introduzca el nuevo valor del elemento");
        int nuevoValor = entrada.nextInt();
        numeros.set(posicion, nuevoValor);
}



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantos números va a introducir?");
        List<Integer> numeros = new ArrayList<Integer>();
        int n = entrada.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Introduzca un número:");
            numeros.add(entrada.nextInt());
            System.out.println("¿Desea introducir otro número?");
            if(entrada.next().equals("no"))
                break;
        }
        System.out.println("Opción 1: Mostrar lista");
        System.out.println("Opción 2: Mostrar mayor, menor y media");
        System.out.println("Opción 3: Borrar un elemento de una posición concreta");
        System.out.println("Opción 4: Borrar un elemento de un valor concreto");
        System.out.println("Opción 5: Añadir un elemento al final");
        System.out.println("Opción 6: Cambiar valor de un elemento por su posición");
        System.out.println("Opción 7: Cambiar valor de un elemento por su valor");
        System.out.println("Opción 8: Borrar todos los elementos");
        System.out.println("Introduzca la opción:");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1: mostrarLista(numeros);
                break;
            case 2:mostrarMayorMenorMedia(numeros);
                break;
            case 3: borrarPorPosicion(numeros);
                break;
            case 4: borrarPorValor(numeros);
                break;
            case 5: añadirElementoAlFinal(numeros);
                break;
            case 6: cambiarValorPorPosicion(numeros);
                break;
            case 7: borrarTodosElementos(numeros);
                break;
            default: System.out.println("Opción no válida");
        }
    }
}
