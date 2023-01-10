package UD05;
import java.util.Scanner;

public class Dalton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personas;
        do{
            boolean dalton = true;
            int alturaAnterior = 0;
            personas = sc.nextInt();
            for(int i = 0; i<personas && dalton; i++){
                int alturas = sc.nextInt();
                if(alturaAnterior > alturas){
                    dalton = false;
                    sc.nextLine();
                }
                alturaAnterior = alturas;
            
            }
            if(personas !=0){
                if(dalton){
                    System.out.println("DALTON");
                }else{
                    System.out.println("DESCONOCIDO");
                }
            }
        }
        while(personas != 0);
    }
}
