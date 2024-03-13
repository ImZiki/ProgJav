package ud08.examen.Trim2ev;
//(genero-> m=mujer h=hombre o=otro)

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Usuario implements Comparable<Usuario>{

    //Atributos 
    private String nombreUsuario;
    private String nombreCompleto;
    private LocalDate fechaRegistro;
    private char genero;
    private Set<Usuario> amigos;
    private Set<Grupo> grupos;
    
    //Constructores
    public Usuario(String nombreUsuario, String nombreCompleto){
        this(nombreUsuario, nombreCompleto, 'o', LocalDate.of(2004, 2, 4));
        amigos = new HashSet<>();
        grupos = new HashSet<>();
    }

    public Usuario(String nombreUsuario, String nombreCompleto, char genero, LocalDate fechaRegistro){
        this.nombreCompleto = nombreCompleto;
        this.nombreUsuario = nombreUsuario;
        this.genero = 'o';
        this.fechaRegistro = fechaRegistro;
        amigos = new HashSet<>();
        grupos = new HashSet<>();
    }
    //Metodos
    public boolean agregarAmigo(Usuario u){
        return amigos.add(u);
    }
    public boolean agregarGrupo(Grupo g){
        return grupos.add(g);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Set<Usuario> getAmigos() {
        return amigos;
    }

    public Set<Grupo> getGrupos() {
        return grupos;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Set<Usuario> amigosDeGenero(char genero){
        Set<Usuario> amigosGenero = new HashSet<>();
        for (Usuario usuario : amigos) {
            if(usuario.getGenero() == genero)
                amigosGenero.add(usuario);
        }
        return amigosGenero;
    }

    public boolean esAmigo(Usuario unUsuario){
        return amigos.contains(unUsuario); 
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombreUsuario == null) ? 0 : nombreUsuario.hashCode());
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
        Usuario other = (Usuario) obj;
        if (nombreUsuario == null) {
            if (other.nombreUsuario != null)
                return false;
        } else if (!nombreUsuario.equals(other.nombreUsuario))
            return false;
        return true;
    }
    @Override
    public int compareTo(Usuario u){
        return this.nombreCompleto.compareToIgnoreCase(u.nombreCompleto);
    }

    @Override
    public String toString() {
        return nombreUsuario + "(" + nombreCompleto +" - " + genero + ")";
    }
    
    
}
