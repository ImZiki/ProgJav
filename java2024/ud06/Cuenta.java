package ud06;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    
    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public Cuenta(int numeroCuenta){
        this(numeroCuenta, 0.0);
    }

    public Cuenta(Cuenta unaCuenta){
        this(unaCuenta.getNumeroCuenta(), unaCuenta.getSaldo());
    }

    public Cuenta(){
        this(101, 0.0);
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

    @Override
    public String toString() {
        return "Numero de cuenta: " + numeroCuenta + "\nSaldo: " + String.format("%.2f", saldo) + "€ ";
    }
   

    
}
