package ud06;

public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta(991);
        Cuenta c3 = new Cuenta(221, 100);
        Cuenta c4 = new Cuenta(c1);


        c1.credit(5.5);

        
        
        if(!(c1.debit(6)))
           System.out.println("La cantidad a descontar es superior al saldo");
        else
            System.out.println(c1);
    }

}