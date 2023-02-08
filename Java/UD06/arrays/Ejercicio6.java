package UD06.arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numbers = {16, 17, 4, 3, 5, 2};

        System.out.println("Los líderes en el vector son: ");
        for (int i = 0; i < numbers.length; i++) {
            boolean esLider = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    esLider = false;
                    break;
                }
            }
            if (esLider)
                System.out.println(numbers[i]);

        }
    }
}
