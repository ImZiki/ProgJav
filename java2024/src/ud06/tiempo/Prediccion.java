package ud06.tiempo;

import java.util.Scanner;

public class Prediccion {
    private Dia dia1;
    private Dia dia2;
    private Dia dia3;
    
    public Prediccion(){
        this.dia1 = new Dia();
        this.dia2 = new Dia();
        this.dia3 = new Dia();
    }

    public void mostrarDia(int dia){
        if (dia == 1)
            dia1.mostrarPrediccion();
        else if (dia == 2)
            dia2.mostrarPrediccion();
        else if (dia == 3)
            dia3.mostrarPrediccion();
        else
            System.out.println("Dia incorrecto");
    }

    public void modificarPrevisionDia(int dia){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca una nueva temperatura minima para el dia");
        int minima = sc.nextInt();
        
        System.out.println("Introduzca una nueva temperatura maxima para el dia");
        int maxima = sc.nextInt();

        System.out.println("Introduzca el estado del dia");
        char estado = sc.next().charAt(0);

        if (dia == 1){
            dia1.setTempMinima(minima);
            dia1.setTempMaxima(maxima);
            dia1.setEstadoDia(estado);
        }else if (dia == 2){
            dia2.setTempMinima(minima);
            dia2.setTempMaxima(maxima);
            dia2.setEstadoDia(estado);
        }else if (dia == 3){
            dia3.setTempMinima(minima);
            dia3.setTempMaxima(maxima);
            dia3.setEstadoDia(estado);
        }else
            System.out.println("Dia incorrecto");
    }

    @Override
    public String toString() {
        return "Prediccion [dia1=" + dia1 + ", dia2=" + dia2 + ", dia3=" + dia3 + "]";
    }

    
}

        