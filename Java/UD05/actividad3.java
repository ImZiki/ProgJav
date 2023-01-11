package UD05;

import java.util.Random;
public class actividad3 {
    public static void main(String[] args) {
        int max = 99;
        int min = 200;
        int suma = 0;
        Random rd = new Random();
        System.out.println("Lista de numeros");
        System.out.println("-------------------");
        for (int i = 0; i < 10; i++) {
            int num = rd.nextInt(100)+100;
            suma += num;
            System.out.println(num);
            if(num>max){
                max=num;
            }
            if(num<min){
                min = num;
            }
        }
        System.out.println("------------");
        System.out.println("Media "+suma/10);
        System.out.println("Maximo "+max);
        System.out.println("Minimo "+min); 
        
    }
}
