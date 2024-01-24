package ud06.ejercicios;

public class Moto {
    private String matricula;
    private int potencia;
    private int velocidad;
    
    public Moto(String matricula, int potencia, int velocidad) {
        
        this.potencia = potencia;
        this.velocidad = velocidad;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }



    public void mostrarMatricula(){
        System.out.println(this.matricula);
    }



    public String getMatricula() {
        return matricula;
    }



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
