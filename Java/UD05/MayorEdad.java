package UD05;
import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad= sc.nextInt();
        if(edad>=18){
            System.out.println("Eres mayor de edad, puedes votar");
        }else{
            System.out.println("No eres mayor de edad, no puedes votar");
        }
    }
}
