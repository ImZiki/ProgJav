package UD05;

public class Decremento {
    public static void main(String[] args) {
        int num1, num2 = 5, num3 = 5;
        System.out.println("num2= " + num2 + " num3= " + num3);

        num1 = num2--;
        System.out.println("num1= " + num1 + " num2= " + num2);

        num1 = --num3;
        System.out.println("num1= " + num1 + " num3= " + num3);
    }
}
