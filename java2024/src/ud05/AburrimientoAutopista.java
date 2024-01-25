package ud05;

import java.util.Scanner;

public class AburrimientoAutopista {
    public static void main(String[] args) {
        String matriculaCoche;
        int viejos;
        int nuevos;
        String numerosMatriculaEdu;
        String matriculaEdu;
        String letrasEdu;
        String numeroCoche;
        String letrasCoche;
        Scanner sc = new Scanner(System.in);
        int numeroCasos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numeroCasos; i++) {
            viejos = 0;
            nuevos = 0;
            matriculaEdu = sc.next();
            letrasEdu = matriculaEdu.substring(4);
            numerosMatriculaEdu = matriculaEdu.substring(0,4);

            while (true) {
                matriculaCoche = sc.next();
                if(matriculaCoche.equals("0"))
                    break;
                numeroCoche = matriculaCoche.substring(0,4);
                letrasCoche = matriculaCoche.substring(4);

                if(letrasEdu.equals(letrasCoche)){
                    if(numeroCoche.compareTo(numerosMatriculaEdu) < 0)
                        viejos++;
                    else
                        nuevos++;
                }else{
                    if(letrasEdu.compareTo(letrasCoche) > 0)
                        nuevos++;
                    else
                        viejos++;
                }
            }
            System.out.println(viejos + " " +  nuevos);
        }
        
    }
}
