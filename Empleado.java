package ud06

public class Empleado {

    private int id;
    private String nombre;
    private String apellido;
    private int salario;

    public Empleado(int id, String nombre, String apellido, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalarioAnual() {
        return salario * 12;
    }

    public int aumentarSalario(int porcentaje) {
        salario = salario + (salario * porcentaje) / 100;
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", Nombre='" + nombre + " " + apellido +
                ", salario=" + salario +
                '}';
    }
}
