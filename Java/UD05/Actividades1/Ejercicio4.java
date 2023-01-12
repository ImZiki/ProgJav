package UD05.Actividades1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.next();
        String primerApellido = sc.next();
        String segundoApellido = sc.next();
        String usuario = "";
        
        nombre = nombre.substring(0,1);
        primerApellido = primerApellido.substring(0,3);
        segundoApellido = segundoApellido.substring(0,3);
        usuario = nombre+primerApellido+segundoApellido;
        System.out.println(usuario.toUpperCase());
    }
}
