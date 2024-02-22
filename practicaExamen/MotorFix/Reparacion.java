package ud08.practicaExamen.MotorFix;

public class Reparacion {
    private String descripcion;
    private int kms;

    public Reparacion(String descripcion, int kms){
        this.descripcion = descripcion;
        this.kms = kms;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    @Override
    public String toString() {
        return "Reparacion [descripcion=" + descripcion + ", kms=" + kms + "]";
    }
    
}
