import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
public class Ejercicio8 {
    public static void main(String[] args) {
        List<Dino> listaDinos = new LinkedList<>();


        listaDinos.addAll(Arrays.asList(
                new Dino("Tyrannosaurus", 8000, 68),
                new Dino("Velociraptor", 150, 75),
                new Dino("Triceratops", 9000, 68),
                new Dino("Stegosaurus", 6000, 155),
                new Dino("Brachiosaurus", 50000, 154)
        ));

        // Mostrar contenido
        System.out.println("Contenido inicial:");
        for (Dino dino : listaDinos) {
            System.out.println(dino);
        }

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce los datos del nuevo dinosaurio:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Peso: ");
            double peso = Double.parseDouble(scanner.nextLine());
            System.out.print("Millones de años: ");
            int millonesDeAnios = Integer.parseInt(scanner.nextLine());

            listaDinos.addFirst(new Dino(nombre, peso, millonesDeAnios));
        }

        // Mostrar contenido
        System.out.println("\nContenido después de añadir por el principio:");
        for (Dino dino : listaDinos) {
            System.out.println(dino);
        }

        // Eliminar los 3 últimos objetos de la lista
        for (int i = 0; i < 3; i++) {
            listaDinos.removeLast();
        }

        // Mostrar contenido
        System.out.println("\nContenido después de eliminar los últimos 3 elementos:");
        for (Dino dino : listaDinos) {
            System.out.println(dino);
        }
    }
}
}
