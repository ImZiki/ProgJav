package ud05;

import java.util.Scanner;


public class EsPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       boolean repetir = true;
       while (repetir){
            System.out.println("Introduce numero positivo");
            int num = sc.nextInt();
            if(num != 1){
                double raiz =  Math.sqrt((double)num);
                boolean primo = true;
                
                for(int i = 2; i<=raiz;i++)
                    if (num % i == 0)
                        primo = false;
                if(!primo)
                    System.out.println("No es primo");       
                else
                    System.out.println("Es primo");
                
                System.out.println("Quieres probar otro numero?(s/n)");
                String respuesta = sc.next();
                if(respuesta.equals("n"))
                    repetir = false;
            }
       }   
    }
}