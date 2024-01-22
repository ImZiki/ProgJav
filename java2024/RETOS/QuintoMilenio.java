import java.util.Scanner;

public class QuintoMilenio {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde la consola
        Scanner entrada = new Scanner(System.in);
        // Leer el número de casos de prueba desde la entrada
        int numeroCasos = Integer.parseInt(entrada.nextLine());
        
        String texto1, texto2; // Declarar variables para almacenar cadenas de entrada
        Boolean iguales; // Declarar una variable para almacenar el resultado de la comparación
        
        for (int i = 0; i < numeroCasos; i++) { // Recorrer cada caso de prueba
            // Leer y procesar la primera cadena de entrada
            texto1 = entrada.nextLine().toLowerCase().replace(" ", ""); 
            // Leer y procesar la segunda cadena de entrada
            texto2 = entrada.nextLine().toLowerCase().replace(" ", "");
            iguales = false; // Inicializar el resultado de la comparación a falso
            
            int contador = 0; // Inicializar una variable de contador
            
            // Recorrer cada carácter de la primera cadena de entrada
            for (int j = 0; j < texto1.length(); j++) {
                // Comprobar si el carácter actual de la primera cadena coincide con el carácter actual de la segunda cadena
                if (texto1.charAt(j) == texto2.charAt(contador)) {
                    contador ++; 
                    
                    // Comprobar si se ha emparejado toda la segunda cadena
                    if (contador == texto2.length()) {
                        iguales = true; 
                        break; 
                    }
                }
            }
            

            System.out.println(iguales ? "SI" : "NO");
        }
    }
}