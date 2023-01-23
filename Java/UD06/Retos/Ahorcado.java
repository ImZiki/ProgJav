package UD06.Retos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Codigo proporcionado
public class Ahorcado {

    static private final String[] palabras_secretas = {"reingenieria", "cubeta","tunelizacion", "protocolo",
    "puertos", "conexion", "broadcasting", "direccion","internet", "router", "switch", "wifi", "estandar", 
    "socket", "transporte","enlace", "capas", "arquitectura", "cliente", "servidor", "proxy", "firewall","redes", 
    "LAN", "WAN", "MAN", "hub", "concentrador", "datagrama", "puente","fibra", "TCP", "UDP", "mascara", "gateway", 
    "servidor", "DNS", "cliente","conmutacion", "circuito", "satelite", "coaxial", "microondas", "seÃ±al","ingrarrojos", 
    "token", "anillo", "bus", "control", "flujo", "congestion","enrutamiento", "aplicacion", "correo", "peertopeer"};

    public static String damePalabraAleatoria(){
        List<String> palabras = Arrays.asList(palabras_secretas);
        Collections.shuffle(palabras);
        return palabras.get(0);
    }

    public static void main(String[] args) {

        String pSecreta=Ahorcado.damePalabraAleatoria();



    //mi codigo
        String palabraProgreso = "";
        for (int i = 0; i < pSecreta.length(); i++) {
            palabraProgreso += "-";
        }

        int intentos = 0;
        Scanner scanner = new Scanner(System.in);

        while (!palabraProgreso.equals(pSecreta) && intentos < 10) {
            System.out.print("Adivina una letra o una palabra: ");
            String pAdivinar = scanner.nextLine();

            // Verifica el tipo de entrada
            if(pAdivinar.length() == 1){
                //La entrada es una letra
                char letra = pAdivinar.charAt(0);
                boolean acierto = false;
                for (int i = 0; i < pSecreta.length(); i++) {
                    if (pSecreta.charAt(i) == letra) {
                        palabraProgreso = palabraProgreso.substring(0, i) + letra + palabraProgreso.substring(i + 1);
                        acierto = true;
                    }
                }

                if (!acierto)
                    intentos++;
                System.out.println("Intento "+ intentos + ": "+ palabraProgreso);

            }else{
                //La entrada es una palabra
                if (!pSecreta.equals(pAdivinar)) {
                    intentos++;
                }
                else {
                    palabraProgreso = pSecreta;
                }
            }
                if (pSecreta.equals(pAdivinar))
                    System.out.println("¡Ganaste! Lo adivinaste en "+intentos+" intentos");


        }
    }
}
