package ud05;

import java.util.Scanner;

public class PedirTalla{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TALLAMAX = 54;
        final int TALLAMIN = 36;

        System.out.println("Ingrese su talla: ");
        int talla = sc.nextInt();
        
        if (talla < TALLAMIN || talla > TALLAMAX)
            System.out.println("Esa talla no existe");
        else
            System.out.println("La talla está en nuestro almacén");
        sc.close();
    }
}