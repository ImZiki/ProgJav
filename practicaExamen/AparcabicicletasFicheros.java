public class Aparcabicicletas implements Comparable<Aparcabicicletas> {
    private double x;
    private double y;
    private int id;
    private String barrio;
    private int aros;
    private boolean instalado;
    
    
    
    public Aparcabicicletas(double x, double y, int id, String barrio, int aros, boolean instalado) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.barrio = barrio;
        this.aros = aros;
        this.instalado = instalado;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getAros() {
        return aros;
    }

    public void setAros(int aros) {
        this.aros = aros;
    }

    public boolean isInstalado() {
        return instalado;
    }

    public void setInstalado(boolean instalado) {
        this.instalado = instalado;
    }






    

    @Override
    public String toString() {
        return "Aparcabicicletas [x=" + x + ", y=" + y + ", id=" + id + ", barrio=" + barrio + ", aros=" + aros
                + ", instalado=" + instalado + "]";
    }

    @Override
    public int compareTo(Aparcabicicletas o) {
        return Integer.compare(this.id, o.id);
    }

    

}