package ud06;

public class Circulo {
    double radio;
    String color;

    public Circulo() {
        this(1.0, "rojo");
    }

    public Circulo (double unRadio) {
        this(unRadio, "rojo");
    }

    public Circulo(double unRadio, String unColor) {
        radio = unRadio;
        color = unColor;
    }

    public Circulo(Circulo unCirculo) {
        this(unCirculo.getRadio(), unCirculo.getColor());
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() { 
        return color;
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{"+"radio=" + radio + ", color="+color+ "}";
    }
}
    
    