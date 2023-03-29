package Enumeracion;

import java.util.Scanner;

public class TestPhone{
    public static void main(String[] args) {
        int budget;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu presupuesto");
        budget = sc.nextInt();
        boolean notEnough = false;
        System.out.println("Options with your budget:");
        for (PhoneModel model : PhoneModel.values()) {
            if(model.getPrice() <= budget)
                System.out.println(model + "\t" + "price " + model.getPrice());
            else
                notEnough = true;
        }
        if(notEnough)
            System.out.println("None, you can't afford any!");
    }
}