package ud06.estaticos;

import java.util.Random;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private String nombre;

    private static int numeroCuentas;

    public Cuenta(int numeroCuenta, String nombre, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombre = nombre;
        ++numeroCuentas;
    }
    
    public Cuenta(int numeroCuenta, String nombre){
        this(numeroCuenta, nombre, 0.0);
    }

    public Cuenta(Cuenta unaCuenta){
        this(unaCuenta.getNumeroCuenta(),unaCuenta.getNombre(), unaCuenta.getSaldo());
    }

    public Cuenta(){
        this(101,"John Doe", 0.0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getNumeroCuentas() {
        return numeroCuentas;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void credit(double dinero){
        this.saldo += dinero;
    }

    public boolean debit(double dinero){
        boolean control = false;
        if(this.saldo >= dinero){
            this.saldo -= dinero;
            control = true;
        }   
        return control;
            

    }

    public void cerrar(){
        --numeroCuentas;
        this.nombre = nombre + " CERRADA";
        this.saldo = 0;
    }

    public static Cuenta consolidarCuenta(Cuenta cuenta1, Cuenta cuenta2){
        Cuenta cuentaNueva = null;
        Random rd = new Random(Integer.MIN_VALUE);
        int numeroAleatorio = rd.nextInt();
        if(cuenta1.getNombre().equals(cuenta2.getNombre()) && cuenta1.getNumeroCuenta() != cuenta2.getNumeroCuenta()){
            double sumaSaldo = cuenta1.getSaldo() + cuenta2.getSaldo();
            if(numeroAleatorio != cuenta1.getNumeroCuenta() && numeroAleatorio != cuenta2.getNumeroCuenta()){
                cuentaNueva = new Cuenta(numeroAleatorio, cuenta1.getNombre(), sumaSaldo);
                cuenta1.cerrar();
                cuenta2.cerrar();
            }
        }
        return cuentaNueva;
    }

    public boolean transfer(Cuenta cuenta, double cantidad){
        boolean valido = false;
        if(debit(cantidad)){
            cuenta.credit(cantidad);
            valido = true;
        }
        return valido;

    }

    public static boolean transfer(Cuenta cuenta1, Cuenta cuenta2, double cantidad){
        return cuenta1.transfer(cuenta2, cantidad);
    }
    
    @Override
    public String toString() {
        return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", nombre=" + nombre + "]";
    }
}

