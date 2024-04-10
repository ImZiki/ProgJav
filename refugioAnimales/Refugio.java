import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Refugio {

    private List<Animal> refugio;
    public Refugio(){
        this.refugio = new ArrayList<Animal>();
    }
    public void Entra(Animal animal) {
        refugio.add(animal);
    }

    public Animal Adopta() {
        Animal animal = MasAntiguo();
        animal.setFechaAdopcion(LocalDateTime.now());
        refugio.remove(animal);
        return animal;
    }

    public Perro AdoptaPerro() {
        Perro perro = MasAntiguoPerro();
        perro.setFechaAdopcion(LocalDateTime.now());
        refugio.remove(perro);
        return perro;
    }

    public Gato AdoptaGato() {
        Gato gato = MasAntiguoGato();
        gato.setFechaAdopcion(LocalDateTime.now());
        refugio.remove(gato);
        return gato;
    }


    public Animal MasAntiguo() {
        Collections.sort(refugio);
        return refugio.get(0);
    }

    public Perro MasAntiguoPerro() {
        List<Perro> perrosAntiguos = new ArrayList<Perro>();
        for (Animal a : refugio) {
            if (a instanceof Perro) {
                perrosAntiguos.add((Perro) a);
            }
        }
        Collections.sort(perrosAntiguos);
        return perrosAntiguos.get(0);
    }

    public Gato MasAntiguoGato() {
        List<Gato> gatosAntiguos = new ArrayList<Gato>();
        for (Animal a : refugio) {
            if (a instanceof Gato) {
                gatosAntiguos.add((Gato) a);
            }
        }
        Collections.sort(gatosAntiguos);
        return gatosAntiguos.get(0);
    }
    public void administrarVacuna(Vacuna vacuna, Animal a){
        if(a instanceof Gato){
            vacuna = (VacunaGato) vacuna;
            a.addVacuna(vacuna);
        }else if(a instanceof Perro){
            vacuna = (VacunaPerro) vacuna;
            a.addVacuna(vacuna);
        }
    }
}
