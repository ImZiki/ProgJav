package ud06;

public class Fecha {
   private int anio;
    private int mes;
    private int dia;
    
    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setFecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, anio);
    }
}
