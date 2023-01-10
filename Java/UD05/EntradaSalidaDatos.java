package UD05;
/** 
 * 
 * @author Daniel
*/

import java.util.Scanner;


public class EntradaSalidaDatos{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero");
        int num=sc.nextInt();
        
        sc.nextLine();
        System.out.println("Dime un nombre");
        String nombre = sc.nextLine();

        System.out.println("El numero es: "+num);
        System.out.println("El nombre es: "+nombre);

        

    }
}