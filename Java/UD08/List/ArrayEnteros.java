package UD08.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayEnteros {
    public static void main(String[] args) {
        List <Integer> numList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numero = sc.nextInt();

        while(numero != 0){
            numList.add(numero);
            numero = sc.nextInt();
            suma += numero;
        }
       
        

        
        if(numList.isEmpty())
            System.out.println("Lista vacía");
        else{
            System.out.println(numList);
            System.out.println("Suma: " + suma);
            System.out.println("Media: " + suma/numList.size());
        }
        
    sc.close();
    }
}