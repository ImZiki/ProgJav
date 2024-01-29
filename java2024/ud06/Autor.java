package ud06;

public class Autor {
    private String nombre;
    private String email;
    private char genero;
    
    public Autor(String nombre, String email, char genero) {
        this.nombre = nombre;
        this.email = email;
        if(genero == 'm' || genero == 'f')
            this.genero = genero;
        else
            this.genero = 'f';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Autor [nombre=" + nombre + ", email=" + email + ", genero=" + genero + "]";
    }
    
}
