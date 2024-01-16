package UD05;

import java.util.Scanner;

public class TreceCatorce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroCasos = sc.nextInt();
        sc.nextLine();
        String entrada;
        int calibre1;
        int calibre2;
        int menor;
        boolean valido;

        for (int i = 0; i < numeroCasos; i++) {
            valido = false;
            entrada = sc.nextLine();
            int guion = entrada.indexOf("-");
            calibre1 =  Integer.parseInt(entrada.substring(0,guion));
            calibre2 = Integer.parseInt(entrada.substring(3));

            menor = calibre2;
            if(calibre1 < calibre2)
                menor = calibre1;
            if(menor % 2 == 0)
                valido = true;
            if(valido)
                System.out.println("SI");
            else
                System.out.println("NO");
        } 
    }
}