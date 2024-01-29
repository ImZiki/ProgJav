package ud06.estaticos;

public class PruebaCuenta {


    public static void main(String[] args) {


        Cuenta cuenta1 = new Cuenta(1, "John Doe", 100);
        Cuenta cuenta2 = new Cuenta(2, "John Doe", 100);
        Cuenta cuenta3 = new Cuenta(3, "John Doe", 100);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        
        cuenta1.cerrar();
        Cuenta cuenta4 = Cuenta.consolidarCuenta(cuenta2, cuenta3);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        System.out.println(cuenta4 != null ? cuenta4:"No se puede consolidar las cuentas");
    }
}
