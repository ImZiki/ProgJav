import java.time.LocalDateTime;
import java.util.List;
public abstract class Animal implements Comparable<Animal> {
    protected char sexo;
    protected LocalDateTime fechaEntrada;
    protected int identificador;
    protected LocalDateTime fechaAdopcion;


    public Animal(char sexo, LocalDateTime fechaEntrada, int identificador) {
        this.sexo = sexo;
        this.fechaEntrada = fechaEntrada;
        this.identificador = identificador;
    }
    public abstract String nombre();
    
    public void setFechaAdopcion(LocalDateTime fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }
    public LocalDateTime getFechaAdopcion() {
        return fechaAdopcion;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fechaEntrada == null) ? 0 : fechaEntrada.hashCode());
        return result;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }
    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (fechaEntrada == null) {
            if (other.fechaEntrada != null)
                return false;
        } else if (!fechaEntrada.equals(other.fechaEntrada))
            return false;
        return true;
    }
//no sé si funciona esto correctamente
    @Override
    public int compareTo(Animal otroAnimal) {
        // Comparación por especie
        if (this.getClass().equals(otroAnimal.getClass())) {
            // Comparación por sexo
            if (this.getSexo() == otroAnimal.getSexo()) {
                // Comparación por fecha de entrada
                if (this.getFechaEntrada().isBefore(otroAnimal.getFechaEntrada())) {
                    return -1;
                } else if (this.getFechaEntrada().isAfter(otroAnimal.getFechaEntrada())) {
                    return 1;
                } else {
                    // Comparación por fecha de adopción
                    if (this.getFechaAdopcion() == null && otroAnimal.getFechaAdopcion() == null) {
                        return 0;
                    } else if (this.getFechaAdopcion() == null) {
                        return -1;
                    } else if (otroAnimal.getFechaAdopcion() == null) {
                        return 1;
                    } else {
                        return this.getFechaAdopcion().compareTo(otroAnimal.getFechaAdopcion());
                    }
                }
            } else {
                return this.getSexo() - otroAnimal.getSexo();
            }
        } else if (this instanceof Gato) {
            return -1;
        } else {
            return 1;
        }
    }
    @Override
    public String toString() {
        return "Animal";
    }
    protected abstract void addVacuna(Vacuna vacuna);
}




