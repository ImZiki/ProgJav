package UD06.Retos;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class CodigoBarras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        boolean impar = true;
        boolean entrar = true;
        int numeroControl = 0;
        int calculo = 0;
        while(entrar){
            String entrada = sc.nextLine();
            int longitud = entrada.length();
            if(entrada.equals("0")){
                entrar = false;    
                break;
            }

            if(entrada.length() <= 8){
                for (int i = longitud-2; i >=0 ; i--) {
                    String codigo = ""+entrada.charAt(i);
                    int numero = Integer.parseInt(codigo);
                    
                    if(impar){
                        calculo += numero *3;
                        impar = false;
                    }else{
                        calculo += numero;
                        impar = true;
                        
                    }
                    String numeroFinal = entrada.substring(7);
                    numeroControl = calculo + Integer.parseInt(numeroFinal); 
                }
                
            }
            if(numeroControl %10 == 0)
                System.out.println("SI");
            else
                System.out.println("NO");
            
        }

        


    }
}
