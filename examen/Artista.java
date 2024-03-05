package ud08.examen;

public class Artista implements Comparable <Artista>{
    private String nombre;
    private String apellido;

    public Artista(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Artista(String nombre){
        this(nombre, null);
    }
    public String nombreCompleto(){
        String nombreCompleto = "";
        if(apellido != null)
            nombreCompleto =  this.nombre + " "  + this.apellido;
        else
            nombreCompleto = this.nombre;
        return nombreCompleto;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Artista other = (Artista) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombreCompleto().equals(other.nombreCompleto()))
            return false;
        return true;
    }
    @Override
    public int compareTo(Artista a){
        return this.nombreCompleto().compareToIgnoreCase(a.nombreCompleto());
    }
    @Override
    public String toString() {
        return nombreCompleto();
    }
    
}
