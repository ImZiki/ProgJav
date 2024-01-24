package ud06

public class PruebaEmpleado {

    public static void main(String[] args) {
        // Crear una instancia de Empleado
        Empleado empleado = new Empleado(1, "John", "Doe", 50000);

        // Imprimir información del empleado
        System.out.println("Información del empleado:");
        System.out.println(empleado);

        // Obtener e imprimir salario anual
        System.out.println("Salario Anual: " + empleado.getSalarioAnual());

        // Aumentar el salario en un 10%
        int porcentajeAumento = 10;
        empleado.aumentarSalario(porcentajeAumento);
        System.out.println("Salario después de un aumento del " + porcentajeAumento + "%: " + empleado.getSalario());
    }
}
