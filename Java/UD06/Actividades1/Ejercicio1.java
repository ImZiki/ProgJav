package UD06.Actividades1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace(" ", "\n");
        System.out.println(str);
    }
}