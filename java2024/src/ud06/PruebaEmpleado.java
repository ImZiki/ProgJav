package ud06;

public class PruebaEmpleado {

    public static void main(String[] args) {

        Empleado empleado = new Empleado(1, "John", "Doe", 50000);
        
        System.out.println("Información del empleado:");
        System.out.println(empleado);


        System.out.println("Salario Anual: " + empleado.getSalarioAnual());


        int porcentajeAumento = 10;
        empleado.aumentarSalario(porcentajeAumento);
        System.out.println("Salario después de un aumento del " + porcentajeAumento + "%: " + empleado.getSalario());
    }
}
