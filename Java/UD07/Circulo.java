package UD07;

public class Circulo {
    private double radio;
    private String color;

    
    //constructores
    public Circulo() {
        this(1.0, "rojo");
    }
    
    public Circulo(double radio){
        this(radio, "rojo");
    }

    
    public Circulo(double unRadio, String unColor) {
        radio = unRadio;
        color = unColor;
    }

    public Circulo(Circulo unCirculo){
        this(unCirculo.getRadio(), unCirculo.getColor());
    }

    //Getters
    public String getColor() {
        return color;
    }
    public double getRadio() {
        return radio;
    }
    public double getArea(){
        return Math.PI *radio*radio;
    }

    //Setters
    public void setRadio(int unRadio) {
        radio = unRadio;
    }
    public void setColor(String unColor) {
        color = unColor;
    }
    
    @Override
    public String toString() {
        return "Circulo(" + "radio=" + radio + ", color=" +color + ")";
    }

}
