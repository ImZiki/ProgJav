package UD05;
import java.util.Scanner;

public class NumerosEnteros {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce numero");
        int num= sc.nextInt();
        System.out.println();
        int contador=0;
        while(contador<=num){
            System.out.println(contador);
            contador++;
        }
    }
}
