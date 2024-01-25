package ud05;

import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la edad:");
        int edad = sc.nextInt();
        
        if (edad >= 18){
            char genero = sc.next().charAt(0);

            if(genero == 'H' || genero == 'h'){
                System.out.println("Sr puedes ejercer tu derecho a voto");
            }else{
                System.out.println("Sra puedes ejercer tu derecho a voto");
            }
        }else{
            System.out.println("No puedes ejercer tu derecho a voto.");
        }
        sc.close();
    }   
}