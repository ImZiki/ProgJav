package ud06;

public class Hora {
    private int segundos;
    private int minutos;
    private int horas;
    public Hora(int segundos, int minutos, int horas) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas,minutos,segundos);
    }

    public Hora nextSecond(){
        segundos ++;
        if(segundos == 60){
            segundos = 0;
            minutos ++;
            if(minutos == 60){
                minutos = 0;
                horas ++;
                if(horas == 24)
                    horas = 0;
            }
        
        }
    return this;
    }
}