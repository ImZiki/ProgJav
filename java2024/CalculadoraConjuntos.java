import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CalculadoraConjuntos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de conjuntos.");
        System.out.println("Ingrese la operación en el formato [conjunto1] operador [conjunto2]:");
        String input = entrada.nextLine().trim();

        int indiceOperador = -1;
        char operador = '\0';

        // Encontrar el índice del operador
        for (int i = 0; i < input.length(); i++) {
            char caracter = input.charAt(i);
            if (caracter == '+' || caracter == '*' || caracter == '-') {
                indiceOperador = i;
                operador = caracter;
                break;
            }
        }

        if (indiceOperador != -1 && indiceOperador > 0 && indiceOperador < input.length() - 1) {
            String conjunto1Str = input.substring(1, indiceOperador).trim();
            String conjunto2Str = input.substring(indiceOperador + 1, input.length() - 1).trim();

            Set<Integer> conjunto1 = parsearConjunto(conjunto1Str);
            Set<Integer> conjunto2 = parsearConjunto(conjunto2Str);

            Set<Integer> resultado = new TreeSet<>();
            switch (operador) {
                case '+':
                    resultado.addAll(conjunto1);
                    resultado.addAll(conjunto2);
                    break;
                case '*':
                    resultado.addAll(conjunto1);
                    resultado.retainAll(conjunto2);
                    break;
                case '-':
                    resultado.addAll(conjunto1);
                    resultado.removeAll(conjunto2);
                    break;
                default:
                    System.out.println("Operador no válido.");
                    return;
            }

            System.out.println("El resultado de la operación es: " + resultado);
        } else {
            System.out.println("Entrada no válida. Por favor, sigue el formato [conjunto1] operador [conjunto2].");
        }
    }

    public static Set<Integer> parsearConjunto(String input) {
        Set<Integer> conjunto = new TreeSet<>();
        String[] elementos = input.split(",");
        for (String elemento : elementos) {
            conjunto.add(Integer.parseInt(elemento.trim()));
        }
        return conjunto;
    }
}