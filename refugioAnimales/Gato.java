package ud09.refugioAnimales;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

class Gato extends Animal{
    private String nombre;
    private LocalDateTime fechaAdopcion;
    private List<Dosis> dosis;
    
    public Gato(String nombre, char sexo, LocalDateTime fechaEntrada, int identificador) {
        super(sexo, fechaEntrada, identificador);
        this.nombre = nombre;
        this.dosis = new LinkedList<>();
    }

    
    public LocalDateTime getFechaEntrada() {
        return this.fechaEntrada;
    }

    public String getNombre() {
        return nombre;
    }


    public void setFechaAdopcion(LocalDateTime fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }
    public LocalDateTime getFechaAdopcion() {
        return fechaAdopcion;
    }
    
    public char getSexo() {
        return this.sexo;
    }

    public int getIdentificador() {
        return this.identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    @Override
    public String nombre() {
        return "Gato: " + this.nombre;
    }
    @Override
    public String toString(){
        return nombre();
    }

    public void addDosis(Dosis a) {
        dosis.add(a);
    }

    public List<Dosis> getDosis() {
        return dosis;
    }


    @Override
    protected void addVacuna(Vacuna vacuna) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addVacuna'");
    }
}