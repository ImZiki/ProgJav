package ud06.tiempo;

public class Hora {
    private int segundos;
    private int minutos;
    private int horas;

    public Hora(){
        this(0,0,0);
    }

    public Hora(int horas, int minutos, int segundos) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        if (segundos < 0 || segundos > 59)
            this.segundos = segundos;
        else{
            this.segundos = segundos-60;
            setMinutos(getMinutos() + 1);
        }
    }
    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos > 59)
            this.minutos = minutos;
        else{
            this.minutos = minutos-60;
            setHoras(getHoras() + 1);
        }
    }
    public void setHoras(int horas) {
        if (horas < 0 || horas > 23)
            this.horas = horas;
        else{
            this.horas = horas-24;
        }
    }
            

    
    public int getMinutos() {
        return minutos;
    }

    public int getHoras() {
        return horas;
    }


    /*private int cambioHora(int horas){
        if(horas > 12){
            switch (horas) {
                case 13:
                    horas = 1;
                    break;
                case 14:
                    horas = 2;
                    break;
                case 15:
                    horas = 3;
                    break;
                case 16:
                    horas = 4;
                    break;
                case 17:
                    horas = 5;
                    break;
                case 18:
                    horas = 6;
                    break;
                case 19:
                    horas = 7;
                    break;
                case 20:
                    horas = 8;
                    break;
                case 21:
                    horas = 9;
                    break;
                case 22:
                    horas = 10;
                    break;
                case 23:
                    horas = 11;
                    break;
                case 0:
                    horas = 12;
                    break;
                default:
                    break;
                }
        }
        return horas;
    } */
    public void mostrarhora24(){
        System.out.printf("Son las %02d horas %2d minutos y %2d segundos",horas,minutos,segundos);
    }

    public void mostrarhora12(){
            if(horas < 12){
                System.out.printf("Son las %02d horas %2d minutos y %2d segundos de la mañana",horas,minutos,segundos);
            }else{
                System.out.printf("Son las %02d horas %2d minutos y %2d segundos de la tarde",horas-12,minutos,segundos);
            }
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