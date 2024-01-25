package retos;

import java.util.Scanner;

public class CodigoBarras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String codigo = sc.next();

        while (!codigo.equals("0")) {
            int valor = 0;
            int len = codigo.length();
            // Calcular el valor basado en la cadena de entrada
            for (int i = 0; i < len - 1; ++i) {
                int digit = codigo.charAt(len - 2 - i) - 48;
                valor += (i % 2 == 0) ? 3 * digit : digit;
            }
            // Verificar si el valor calculado es correcto
            boolean correcto = (valor + (codigo.charAt(len - 1) - 48)) % 10 == 0;

            System.out.print(correcto ? "SI" : "NO");
            // Agregar información adicional si la cadena de entrada es más larga que 8 caracteres y el valor es correcto
            if (codigo.length() > 8 && correcto) {
                if (codigo.length() < 13) {
                    // Imprimir el código del país para cadenas de entrada más cortas
                    System.out.print(" EEUU");
                } else {
                    String pais = "Desconocido";
                    if (codigo.startsWith("0")) { 
                        pais =  "EEUU";
                    } else if (codigo.startsWith("380")) {
                        pais =  "Bulgaria";
                    } else if (codigo.startsWith("50")) {
                        pais =  "Inglaterra";
                    } else if (codigo.startsWith("539")) {
                        pais =  "Irlanda";
                    } else if (codigo.startsWith("560")) {
                        pais =  "Portugal";
                    } else if (codigo.startsWith("70")) {
                        pais =  "Noruega";
                    } else if (codigo.startsWith("759")) {
                        pais =  "Venezuela";
                    } else if (codigo.startsWith("850")) {
                        pais =  "Cuba";
                    } else if (codigo.startsWith("890")) {
                        pais =  "India";
                    }
                    System.out.print(pais != "Desconocido" ? " " + pais : " Desconocido");
                }
            }
            System.out.println();
            codigo = sc.next();
        }
    }
}
