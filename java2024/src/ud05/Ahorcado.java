package ud05;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ahorcado {
    static private final String[] palabras_secretas = {"reingenieria", "cubeta","tunelizacion", "protocolo",
    "puertos", "conexion", "broadcasting", "direccion","internet", "router", "switch", "wifi", "estandar", 
    "socket", "transporte","enlace", "capas", "arquitectura", "cliente", "servidor", "proxy", "firewall","redes", 
    "LAN", "WAN", "MAN", "hub", "concentrador", "datagrama", "puente","fibra", "TCP", "UDP", "mascara", "gateway", 
    "servidor", "DNS", "cliente","conmutacion", "circuito", "satelite", "coaxial", "microondas", "seÃ±al","infrarrojos", 
    "token", "anillo", "bus", "control", "flujo", "congestion","enrutamiento", "aplicacion", "correo", "peertopeer"};

    public static String damePalabraAleatoria(){
        List<String> palabras = Arrays.asList(palabras_secretas);
        Collections.shuffle(palabras);
        return palabras.get(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraSecreta = damePalabraAleatoria().toLowerCase();
        String entrada;
        StringBuilder palabraProgreso = new StringBuilder("-".repeat(palabraSecreta.length()));
        int intentos = 0;
        char letra, comparar;
        boolean ganador = false;
        
        while (!ganador) {
            System.out.print("Ingresa una letra o la palabra a adivinar: ");
            entrada = sc.next();
            if(entrada.length() > 1){
                if(entrada.equalsIgnoreCase(palabraSecreta)){
                    ganador = true;
                    intentos++;
                }else{
                    intentos++;
                    System.out.println("La palabra no es la secreta. Intento " + intentos + ": " + palabraProgreso);
                }
            }else{
                letra = entrada.charAt(0);
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    comparar = palabraSecreta.charAt(i);
                    if(comparar == letra)
                        palabraProgreso.setCharAt(i, letra); 
                }
                intentos++;
                if(palabraProgreso.toString().equalsIgnoreCase(palabraSecreta))
                    ganador = true;
                System.out.println("Intento "+ intentos +": " + palabraProgreso);
                
            }
        }
        System.out.println("Enhorabuena, adivinaste en " + intentos + " intentos");
    }
}