package UD05;
import java.util.Scanner;

public class LetraEntero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce letra");
        char letra = sc.next().charAt(0);
        System.out.println("Introduce numero");
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            System.out.println(letra);
        }
    }
}
