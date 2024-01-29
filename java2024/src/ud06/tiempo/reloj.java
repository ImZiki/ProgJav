package ud06.tiempo;

import java.util.Scanner;

public class reloj {
    public static void main(String[] args) {
        Hora hora = new Hora(24, 20, 30);


        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 6) {
            System.out.println("Reloj");
            System.out.println("------");
            System.out.println("1. Mostrar hora 12");
            System.out.println("2. Mostrar hora 24");
            System.out.println("3. Modificar horas");
            System.out.println("4. Modificar minutos");
            System.out.println("5. Modificar segundos");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    hora.mostrarhora12();
                    break;
                case 2:
                    hora.mostrarhora24();
                    break;
                case 3:
                    System.out.println("Introduzca las horas: ");
                    hora.setHoras(sc.nextInt());
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("Introduzca los minutos: ");
                    hora.setMinutos(sc.nextInt());
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("Introduzca los segundos: ");
                    hora.setSegundos(sc.nextInt());
                    sc.nextLine();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}
