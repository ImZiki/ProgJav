package UD06.Actividades1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pwdUno = "";
        String pwdDos = "";
        boolean correcto = true;
        while(correcto){
            System.out.println("Introduce contraseña");
        pwdUno = sc.nextLine();
        
        System.out.println("Introduce de nuevo la contraseña");
        pwdDos = sc.nextLine();
        if(pwdUno.equals(pwdDos))
            correcto = false;
            System.out.println("Contraseña correcta");
        }
    }
}
