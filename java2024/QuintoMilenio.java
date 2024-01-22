import java.util.Scanner;

public class QuintoMilenio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroCasos = Integer.parseInt(entrada.nextLine());
        
        String texto1, texto2;
        Boolean iguales;
        
        for (int i = 0; i < numeroCasos; i++) { 
        texto1 = entrada.nextLine().toLowerCase().replace(" ", ""); 
        texto2 = entrada.nextLine().toLowerCase().replace(" ", "");
        iguales = false;
        
        int contador = 0;
        
        for (int j = 0; j < texto1.length(); j++) {
          if (texto1.charAt(j) == texto2.charAt(contador)) {
            contador ++;
          
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