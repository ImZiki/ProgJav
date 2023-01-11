package UD05;

import java.util.Random;

public class SimuladorDado {
    public static void main(String[] args) {
        Random rd = new Random();
        int dado = rd.nextInt(6)+1;
        System.out.println(dado);
    }
}
