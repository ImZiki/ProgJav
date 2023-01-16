package UD06;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce frase");
        String frase = sc.nextLine();
        boolean esPalindromo = true;

        frase = frase.replaceAll(" ", "");
        frase = frase.toLowerCase();

        for(int i = 0; i< frase.length()/2; i++){
            if(frase.charAt(i) != frase.charAt(frase.length() -1 -i)){
                esPalindromo = false;
                break;
            }
        }

        if(esPalindromo)
            System.out.println("PALINDROMO");
        else
            System.out.println("NO PALINDROMO");
    }
}
