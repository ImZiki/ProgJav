package UD06.Actividades1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();

        if(num<str.length())
            System.out.println(str.substring(num,num+1));
        else
            System.out.println("Error");
        
    }
}
