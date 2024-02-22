package ud08.practicaExamen.MotorFix;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class Coche implements Comparable<Coche>{
    private String matricula;
    private String direccion;
    private LinkedList<Reparacion> reparaciones;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Coche(String matricula, String direccion){
        this.matricula = matricula;
        this.direccion = direccion;
        this.reparaciones = new LinkedList<>();
    }
    public Coche(String matricula){
        this(matricula, "C/Soprano");
    }
    public boolean aniadeReparacion(Reparacion r){
        return reparaciones.add(r);
    }
    public Reparacion ultimaReparacion(){
        
        return reparaciones.size() == 0 ? reparaciones.getLast() : null;
    }
    public List<Reparacion> buscaReparaciones(String palabra){
        List<Reparacion> reparacionesFiltradas = new ArrayList<>();
        for (Reparacion reparacion : reparacionesFiltradas) {
            if(reparacion.getDescripcion().equalsIgnoreCase(palabra))
                reparacionesFiltradas.add(reparacion);
        }
        return reparacionesFiltradas;
    }

    @Override
    public int compareTo(Coche c){
        return this.matricula.compareTo(c.matricula);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coche other = (Coche) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Coche [matricula=" + matricula + ", direccion=" + direccion + "]";
    }

    
    
}
