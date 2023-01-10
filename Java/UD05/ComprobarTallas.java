package UD05;
import java.util.Scanner;

public class ComprobarTallas {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        final int MENOR = 36;
        final int MAYOR = 54;
        System.out.println("Introduce una talla");
        int talla = sc.nextInt();
        if(talla>=MENOR && talla <=MAYOR){
            System.out.println("La talla existe");
        }else{
            System.out.println("La talla no existe");
        }

    }

}
