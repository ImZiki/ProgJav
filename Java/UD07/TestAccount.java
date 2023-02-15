package UD07;
import java.util.Scanner;

import UD05.actividad3;
public class TestAccount {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Act1
        Account account;
        
        
        System.out.println("How many accounts would you like to create?");
        
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            account = new Account(100, "Name" +i);
            System.out.println("\nCreated account "+account);
            System.out.println("Now there are " + Account.getNumAccounts() + " accounts");
        }
        */
        /* Act2
            Account acc1 = new Account(100, "Pepe", 1000);
            acc1.close();
            System.out.println(acc1)
         */
        /* Act3
        Account acc1 = new Account(100, "Pepe", 200);
        Account acc2 = new Account(101, "Pepe", 500);
        Account acc3 = Account.consolidate(acc1, acc2);
        System.out.println(acc1+"\n"+ acc2 + "\n" + acc3);
        */
        //Act4
        /*System.out.println("Introduce primer nombre");
        String name1 = sc.nextLine();
        System.out.println("Introduce segundo nombre");
        String name2 = sc.nextLine();
        System.out.println("Introduce tercer nombre");
        String name3 = sc.nextLine();

        Account acc1 = new Account(1, name1, 100);
        Account acc2 = new Account(2, name2, 100);
        Account acc3 = new Account(3, name3, 100);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        acc1.close();
        Account acc4 = new Account(0, null, 0.0);
        acc4 = Account.consolidate(acc2, acc3);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(acc4);
        */
        /* 
        //Act5
        Account acc1 = new Account(1, "Pepe", 20000);
        Account acc2 = new Account(2, "Mari", 50000);

        acc1.transfer(acc2, 5000);
        System.out.println(acc1+"\n"+acc2);*/
        //Act6
        
    }
}