package ud05;

import java.util.Scanner;

public class Dalton {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroCasos;
        boolean esDalton = true;
        while (true){
           numeroCasos = sc.nextInt();
           sc.nextLine();
           if(numeroCasos == 0)
                break;
           String[] alturas = sc.nextLine().split(" ");
           int[] alturasEntero = new int[alturas.length];
           for (int i = 0; i < alturas.length; i++) {
                alturasEntero[i] = Integer.parseInt(alturas[i]);
            }
            for (int i = 0; i < alturasEntero.length -1; i++) {
                if(alturasEntero[i] >= alturasEntero[i+1])
                    esDalton = false;
            }
            if(esDalton)
                System.out.println("DALTON");
            else
                System.out.println("DESCONOCIDO");
        }
    }
}
