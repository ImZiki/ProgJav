package ud06.tiempo;

import java.util.Scanner;

public class Dia {
    private int tempMaxima;
    private int tempMinima;
    private char estadoDia;

    public Dia(){
        this(0,0,'s');
    }

    public Dia(int tempMaxima, int tempMinima, char estadoDia) {
        this.tempMaxima = tempMaxima;
        this.tempMinima = tempMinima;
        this.estadoDia = estadoDia;
    }
    public Dia(Dia dia){
        this(dia.getTempMaxima(), dia.getTempMinima(), dia.getEstadoDia());
    }

    public int getTempMaxima() {
        return tempMaxima;
    }

    protected void setTempMaxima(int tempMaxima) {
        this.tempMaxima = tempMaxima;
    }

    public int getTempMinima() {
        return tempMinima;
    }

    protected void setTempMinima(int tempMinima) {
        this.tempMinima = tempMinima;
    }

    public char getEstadoDia() {
        return estadoDia;
    }


    protected void setEstadoDia(char estadoDia) {
        Scanner sc = new Scanner(System.in);
        while (estadoDia != 's' && estadoDia != 'n' && estadoDia != 'l') {
            System.out.println("Introduce el estado del dia (s, n, l): ");
            estadoDia = sc.next().charAt(0);
        }
        this.estadoDia = estadoDia;
    }


    public void mostrarPrediccion() {
        String estado;
        switch (estadoDia) {
            case 's':
                estado = "soleado";
                break;
            case 'n':
                estado = "nublado";
                break;
            case 'l':
                estado = "lluvioso";
                break;
            default:
                estado = "desconocido";
                break;
        }
        System.out.println("Se espera un día " + estado + " con temperaturas máximas de " + tempMaxima +
                " y mínimas de " + tempMinima);
    }

    public void temperaturaActual() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura actual: ");
        int temperaturaActual = sc.nextInt();
        if (temperaturaActual > tempMaxima) {
            this.setTempMaxima(temperaturaActual);
        }
        if (temperaturaActual < tempMinima) {
            this.setTempMinima(temperaturaActual);
        }
    }
    @Override
    public String toString() {
        return "Dia [tempMaxima=" + tempMaxima + ", tempMinima=" + tempMinima + ", estadoDia=" + estadoDia + "]";
    }
}
