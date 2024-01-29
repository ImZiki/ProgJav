package ud06;

public class Rectangulo {

    private double longitud;
    private double ancho;

    public Rectangulo(){
        this(1.0, 1.0);
    }
    
    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public double calcularÁrea() {
        return longitud * ancho;
    }

    public double calcularPerímetro() {
        return 2 * (longitud + ancho);
    }

    @Override
    public String toString() {
    return String.format("Rectángulo: Longitud:%.2f, Ancho:%.2f", longitud, ancho);
    }
}

