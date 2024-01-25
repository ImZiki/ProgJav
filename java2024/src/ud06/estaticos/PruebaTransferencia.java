package ud06.estaticos;

import java.util.Scanner;

public class PruebaTransferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Cuenta cuenta1 = new Cuenta(1, "John Doe", 100);
        Cuenta cuenta2 = new Cuenta(2, "Jane Doe", 100);
        int op = -1;
        while (op != 3) {
            System.out.println("1 - Transferir de cuenta 1 a cuenta 2");
            System.out.println("2- Transferir de cuenta 2 a cuenta 1");
            System.out.println("3- Salir");
            op = sc.nextInt();
            sc.nextLine();

            if(op == 1)
                cuenta1.transfer(cuenta2, 200);
            else if (op == 2)
                cuenta2.transfer(cuenta1, 200);

            System.out.println(cuenta1);
            System.out.println(cuenta2);
            
            
           
        }*/
        Cuenta cuenta3 = new Cuenta(3, "Johnny", 100);
        Cuenta cuenta4 = new Cuenta(4, "Poppy", 100);
        System.out.println(cuenta3);
        System.out.println(cuenta4);
        Cuenta.transfer(cuenta3, cuenta4, 30);
        System.out.println(cuenta3);
        System.out.println(cuenta4);
    }
}
