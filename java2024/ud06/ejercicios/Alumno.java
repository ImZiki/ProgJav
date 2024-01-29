package ud06.ejercicios;

public class Alumno {
    private String dni;
    private int edad;
    private int trimestre1, trimestre2, trimestre3;
    
    public Alumno(String dni, int edad) {
        this.edad = edad;
        this.dni = dni;
        trimestre1 = -1;
        trimestre2 = -1;
        trimestre3 = -1;
    }

    public Alumno(String dni){
        this(dni, 0);
        trimestre1 = -1;
        trimestre2 = -1;
        trimestre3 = -1;
    }

    public String getDni() {
        return dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTrimestre1() {
        return trimestre1;
    }
    public void setTrimestre1(int trimestre1) {
        this.trimestre1 = trimestre1;
    }
    public int getTrimestre2() {
        return trimestre2;
    }
    public void setTrimestre2(int trimestre2) {
        this.trimestre2 = trimestre2;
    }
    public int getTrimestre3() {
        return trimestre3;
    }
    public void setTrimestre3(int trimestre3) {
        this.trimestre3 = trimestre3;
    }
    public double notaFinal(){
        double notaFinal = 0.0;
        if(trimestre1 == -1 && trimestre2 == -1 && trimestre3 == -1)
            notaFinal = -1;
        else
            notaFinal = (trimestre1 + trimestre2 + trimestre3)/3;
        return notaFinal;
    }

    public void informeAlumno(){
        System.out.printf("DNI: %s, edad: %d \nTrimestre 1: %.2f \nTrimestre 2: %.2f \nTrimestre 3: %.2f", dni, edad, trimestre1, trimestre2, trimestre3);
    }
    @Override
    public String toString() {
        return "Alumno [dni=" + dni + ", edad=" + edad + ", trimestre1=" + trimestre1 + ", trimestre2=" + trimestre2
                + ", trimestre3=" + trimestre3 + "]";
    }
    public static void main(String[] args) {
        // Crear primer alumno con dni y luego actualizar la edad con el setter
        Alumno alumno1 = new Alumno("12345678A");
        System.out.println("Información del primer alumno antes de actualizar la edad:");
        alumno1.informeAlumno();
        
        alumno1.setEdad(18); // Actualizar la edad del primer alumno
        
        System.out.println("\nInformación del primer alumno después de actualizar la edad:");
        alumno1.informeAlumno();
        
        // Crear segundo alumno con dni y edad
        Alumno alumno2 = new Alumno("98765432B", 16);
        System.out.println("\nInformación del segundo alumno:");
        alumno2.informeAlumno();
    }
}
