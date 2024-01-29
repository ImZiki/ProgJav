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

    public static void main(String[] args) {

        Moto moto1 = new Moto(null, 0, 0);
        moto1.setMatricula("1234ABC");
        moto1.setPotencia(150);
        moto1.setVelocidad(120);

        
        Moto moto2 = new Moto("5678XYZ", 200, 180);

        System.out.println("Datos de la primera motocicleta:");
        System.out.println("Matrícula: " + moto1.getMatricula());
        System.out.println("Potencia: " + moto1.getPotencia());
        System.out.println("Velocidad: " + moto1.getVelocidad());
        System.out.println("Mostrar Matrícula:");
        moto1.mostrarMatricula();

        System.out.println("\nDatos de la segunda motocicleta:");
        System.out.println("Matrícula: " + moto2.getMatricula());
        System.out.println("Potencia: " + moto2.getPotencia());
        System.out.println("Velocidad: " + moto2.getVelocidad());
        System.out.println("Mostrar Matrícula:");
        moto2.mostrarMatricula();
    }
}