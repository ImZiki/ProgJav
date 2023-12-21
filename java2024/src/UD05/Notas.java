package UD05;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        if ( 0<= nota && nota < 5){
            System.out.println("Estás suspenso");
        }

        else if(5<= nota && nota < 6) {
            System.out.println("Aprobado");

        }else if(6<= nota && nota< 7){
            System.out.println("Bien");

        }else if(7<= nota && nota < 9){
            System.out.println("Notable");

        }else if(9<= nota && nota < 10){
            System.out.println("Sobresaliente");
            
        }else{
            System.out.println("Matrícula de honor");
        }
        sc.close();
    }    
}
