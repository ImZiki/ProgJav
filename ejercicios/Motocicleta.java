package ud06.ejercicios;

public class Motocicleta {
    private String letrasMatricula;
    private String numerosMatricula;
    private int potencia;
    private int velocidad;
    
    public Motocicleta(String letrasMatricula, String numerosMatricula, int potencia, int velocidad) {
        this.letrasMatricula = letrasMatricula;
        this.numerosMatricula = numerosMatricula;
        this.potencia = potencia;
        this.velocidad = velocidad;
    }

    public String getLetrasMatricula() {
        return letrasMatricula;
    }

    public void setLetrasMatricula(String letrasMatricula) {
        this.letrasMatricula = letrasMatricula;
    }

    public String getNumerosMatricula() {
        return numerosMatricula;
    }

    public void setNumerosMatricula(String numerosMatricula) {
        this.numerosMatricula = numerosMatricula;
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

    public String matricula(String numerosMatricula, String letrasMatricula){
        return numerosMatricula + letrasMatricula;
    }

    public void mostrarMatricula(){
        System.out.println(matricula(numerosMatricula, letrasMatricula));
    }
}
