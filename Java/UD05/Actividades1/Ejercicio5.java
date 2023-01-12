package UD05.Actividades1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        String palabraSumada = "";
        for(int i=0;i<num;i++){
            if(i%2==0)
                System.out.println(str.toLowerCase());
            else
                System.out.println(str.toUpperCase());
            
            
        }
    }
}
