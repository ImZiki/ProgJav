package UD06.Actividades1;
import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int longitud1 = str1.length();
        int longitud2 = str2.length();
        int diferencia = 0;

        if(longitud1>longitud2){
            diferencia = longitud1 - longitud2;
            System.out.println(str1 + " es mas larga con "+ diferencia + " caracteres de mas");}
        else if(longitud2>longitud1){
            diferencia = longitud2 - longitud1;
            System.out.println(str2 + " es mas larga con "+ diferencia + " caracteres de mas");}
        else 
            System.out.println("Ambas cadenas tienen la misma longitud");
    }
}