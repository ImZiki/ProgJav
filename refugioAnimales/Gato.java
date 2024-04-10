import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

class Gato extends Animal{
    private String nombre;
    private LocalDateTime fechaAdopcion;
    private List<VacunaGato> vacunas;
    
    public Gato(String nombre, char sexo, LocalDateTime fechaEntrada, int identificador) {
        super(sexo, fechaEntrada, identificador);
        this.nombre = nombre;
        this.vacunas = new LinkedList<VacunaGato>();
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

    public void addVacuna(Vacuna vacuna) {
        vacunas.add((VacunaGato) vacuna);
    }

    public List<VacunaGato> getVacunas() {
        return vacunas;
    }
}