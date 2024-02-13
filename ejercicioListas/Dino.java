public class Dino {
    private String nombre;
    private double peso;
    private int millonesDeAnios;

    public Dino(String nombre, double peso, int millonesDeAnios) {
        this.nombre = nombre;
        this.peso = peso;
        this.millonesDeAnios = millonesDeAnios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getMillonesDeAnios() {
        return millonesDeAnios;
    }

    public void setMillonesDeAnios(int millonesDeAnios) {
        this.millonesDeAnios = millonesDeAnios;
    }

    @Override
    public String toString() {
        return "Dino [nombre=" + nombre + ", peso=" + peso + ", millonesDeAnios=" + millonesDeAnios + "]";
    }

    
}