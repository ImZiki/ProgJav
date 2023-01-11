package UD05;

import java.util.Random;
import java.util.Scanner;

public class actividad4 {
    public static void main(String[] args) {
        boolean acertado = false;
        Random rd= new Random();
        Scanner sc = new Scanner(System.in);
        int primerNum = rd.nextInt(10)+1;
        int segundoNum = rd.nextInt(10)+1;
        int suma = primerNum + segundoNum;
        int resta = primerNum - segundoNum;
        int mult = primerNum * segundoNum;
        double div = (double) primerNum / segundoNum;
        double roundedDiv = (double) Math.round(div * 100) / 100;
        System.out.println(div);
        while (!acertado){
            System.out.println("Responde las siguientes a operaciones");
            System.out.println(primerNum + " + "+segundoNum+" =?");
            System.out.println(primerNum + " - "+segundoNum+" =?");
            System.out.println(primerNum + " * "+segundoNum+" =?");
            System.out.println(primerNum + " / "+segundoNum+" =?");
            int entradaSuma = sc.nextInt();
            int entradaResta = sc.nextInt();
            int entradaMult = sc.nextInt();
            double entradaDiv = sc.nextDouble();
            if (entradaSuma == suma && entradaResta == resta && entradaMult == mult && entradaDiv == div){
                System.out.println("Correcto");
                acertado = true;
            }
            else{
                System.out.println("Respuesta incorrecta");
            }
            
        }
    }
}
