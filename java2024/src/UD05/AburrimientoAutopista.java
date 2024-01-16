package java2024;

import java.util.Scanner;

public class AburrimientoAutopista {
    public static void main(String[] args) {
        String[] matriculas;
        int mayores = 0;
        int menores = 0;
        String matriculaEdu;
        String letrasEdu;
        Scanner sc = new Scanner(System.in);
        int numeroCasos = sc.nextInt();
        sc.nextLine();
//Usando matriculaCoche = sc.next() if matriculaCoche = "0" break.

        for (int i = 0; i < numeroCasos; i++) {
            matriculas = sc.nextLine().split(" ");
            matriculaEdu = matriculas[0];
            letrasEdu = matriculaEdu.substring(5);
            if(letrasEdu.compareToIgnoreCase(matriculas[i].substring(5)) > 0)
                mayores ++;
            else
                menores ++;
        }
        
    }
}
