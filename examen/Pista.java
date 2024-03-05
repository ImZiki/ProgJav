package ud08.examen;

public class Pista implements Comparable<Pista>{
    private Artista artista;
    private String nombreCancion;
    private int duracion;
    private int reproducciones;
    public static int numeroPistas = 0;

    public Pista(String nombreCancion, Artista artista,  int duracion){
        this.artista = artista;
        this.nombreCancion = nombreCancion;
        this.duracion = duracion;
        reproducciones = 0;
        numeroPistas++;
    }

    public Artista getArtista() {
        return artista;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getReproducciones() {
        return reproducciones;
    }
    public static int numPistas(){
        return numeroPistas;
    }
    public void play(){
        this.reproducciones++;
    }

    @Override
    public String toString() {
        return nombreCancion + "|" + artista + "|" + duracion + "sg.";
    }

    public int compareTo(Pista p){
        if (this.reproducciones > p.reproducciones)
            return -1;
        else if(this.reproducciones < p.reproducciones)
            return 1;
        else if(this.reproducciones == p.reproducciones){
            if(this.artista.compareTo(p.artista) == -1)
                return -1;
            else if(this.artista.compareTo(p.artista) == 1)
                return 1;
            else if (this.artista.compareTo(p.artista) == 0){
                if (this.nombreCancion.compareToIgnoreCase(p.nombreCancion) == -1)
                    return -1;
                else if (this.nombreCancion.compareToIgnoreCase(nombreCancion) == 1)
                    return 1;
            }
                
        }
        return 0;
    }
    
}