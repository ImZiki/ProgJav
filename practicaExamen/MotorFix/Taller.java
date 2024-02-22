package ud08.practicaExamen.MotorFix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Taller {
    private String nombre;
    Set<Coche> coches;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Taller(String nombre){
        this.nombre = nombre;
        coches = new TreeSet<>();
    }
    public boolean aniadeCoche(Coche c){
        return coches.add(c);

    }
    public Coche buscaCoche(String matricula){
        Iterator<Coche> it = coches.iterator();
        Coche cocheBuscado = null;
        while (it.hasNext()) {
            Coche coche = it.next();
            if(coche.getMatricula().equalsIgnoreCase(matricula)){
                cocheBuscado = coche;
                break;
            }
                
        }
        return cocheBuscado;
    }
    public List<Coche> listaPorMatricula(){
        List<Coche> listaMatriculasCoches = new ArrayList<>(coches);
        Collections.sort(listaMatriculasCoches);
        return listaMatriculasCoches;
    }
    public List<Coche> listaPorDirección(){
        List<Coche> listaDireccionCoches = new ArrayList<>(coches);
        Collections.sort(listaDireccionCoches, (coche1, coche2) -> coche1.getDireccion().compareToIgnoreCase(coche2.getDireccion()));
        return listaDireccionCoches;
    }
    @Override
    public String toString() {
        return "Taller [nombre=" + nombre + ", coches=" + coches + "]";
    }
    
}
