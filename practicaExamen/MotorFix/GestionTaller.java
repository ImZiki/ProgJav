package ud08.practicaExamen.MotorFix;

import java.util.List;
import java.util.Scanner;

public class GestionTaller {
    private static final String ERROR_KILOMETRAJE = "Error en el kilometraje";
    private static final String NO_EXISTE_COCHE = "Coche introducido no existe";
    private static final String NO_EXISTEN_REPARACIONES = "No existen reparaciones para el coche";
    private static final String NO_HAY_COCHES = "No existe ningun coche en el sistema";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String matricula;
        String error;
        Coche coche;
        List<Coche> coches;
        Taller taller = new Taller("Talleres MotorFix");
        do {
            System.out.println("\nMenú Gestion " + taller.getNombre());
            System.out.println("--------------------------------");
            System.out.println("1- Añadir reparacion");
            System.out.println("2- Buscar ultima reparacion");
            System.out.println("3- Buscar reparacion");
            System.out.println("4- Añadir coche");
            System.out.println("5- Listar coches por matricula");
            System.out.println("6- Listar coches por dirección");
            System.out.println("7- SALIR");
            System.out.println("--------------------------------");
            System.out.println("\nSelecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce la matricula del coche:");
                    matricula = sc.nextLine();
                    coche = taller.buscaCoche(matricula);
                    if(coche != null){
                        System.out.println("Introduce la descripcion de la reparacion:º");
                        String descripcion = sc.nextLine();
                        System.out.println("Introduce el kilometraje");
                        int kms = sc.nextInt();
                        Reparacion ultimaReparacion = coche.ultimaReparacion();
                        Reparacion reparacion = new Reparacion(descripcion, kms);

                        if(ultimaReparacion == null)
                            coche.aniadeReparacion(reparacion);
                        else{
                            if(ultimaReparacion.getKms() < kms)
                                coche.aniadeReparacion(reparacion);
                            else
                                System.out.println(ERROR_KILOMETRAJE);;
                            }
                        }else
                            System.out.println(NO_EXISTE_COCHE);
                    break;
                case 2:
                    System.out.println("Introduce la matricula del coche:");
                    matricula = sc.nextLine();
                    coche = taller.buscaCoche(matricula);
                    if(coche != null){
                        Reparacion reparacion = coche.ultimaReparacion();
                        if(reparacion != null)
                            System.out.println(reparacion);
                        else
                            System.out.println(NO_EXISTEN_REPARACIONES);
                    }else
                        System.out.println(NO_EXISTE_COCHE);
                    break;
                case 3:
                    System.out.println("Introduce la matricula y la palabra clave:");
                    matricula = sc.next();
                    String palabraClave = sc.nextLine();
                    coche = taller.buscaCoche(matricula);
                    if(coche != null){
                        List<Reparacion> listaRep = coche.buscaReparaciones(palabraClave);
                        if(listaRep != null)
                            for (Reparacion reparacion : listaRep)
                                System.out.println(reparacion);
                        else
                            System.out.println(NO_EXISTEN_REPARACIONES);
                    }else
                        error = NO_EXISTE_COCHE;
                    break;
                case 4:
                    System.out.println("Introduce la matricula y direccion del dueño del coche:");
                    matricula = sc.nextLine();
                    String direccion = sc.nextLine();
                    coche = new Coche(matricula, direccion);
                    if(taller.aniadeCoche(coche))
                        System.out.println("Coche añadido");
                    else
                        System.out.println(NO_EXISTE_COCHE);
                    break;
                case 5:
                    coches = taller.listaPorMatricula();
                    if (coches != null){
                        for (Coche coche1 : coches)
                            System.out.println(coche1);
                    }else
                       System.out.println(NO_HAY_COCHES);
                    break;
                case 6:
                coches = taller.listaPorDirección();
                if (coches != null){
                    for (Coche coche1 : coches)
                        System.out.println(coche1);
                }else
                    System.out.println(NO_HAY_COCHES);
                    break;
                case 7: System.out.println("Saliendo del gestor"); break;
            }
           
        } while (opcion != 7);
    }
}
