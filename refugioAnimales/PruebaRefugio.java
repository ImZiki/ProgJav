import java.time.LocalDateTime;

public class PruebaRefugio {
    public static void main(String[] args) {
        Refugio refugio = new Refugio();
    
        refugio.Entra(new Gato("Juana", 'F', LocalDateTime.now().minusDays(5), 1));
        refugio.Entra(new Perro("Marco", 'M', LocalDateTime.now().minusDays(3), 2));
        refugio.Entra(new Perro("Lassie", 'F', LocalDateTime.now().minusDays(2), 3));
        refugio.Entra(new Gato("Carlos", 'M', LocalDateTime.now().minusDays(1), 4));
        refugio.Entra(new Gato("Lola", 'F', LocalDateTime.now().minusDays(4), 5));
        refugio.Entra(new Perro("Canela", 'F', LocalDateTime.now().minusDays(6), 6));
        refugio.Entra(new Perro("Snoopy", 'M', LocalDateTime.now().minusDays(2), 7));
        refugio.Entra(new Gato("Felix", 'M', LocalDateTime.now().minusDays(3), 8));
    
        Animal gatoAdoptado1 = refugio.AdoptaGato();
        System.out.println("Nombre del gato adoptado: " + gatoAdoptado1.nombre());
    
        Animal gatoAdoptado2 = refugio.AdoptaGato();
        System.out.println("Nombre del gato adoptado: " + gatoAdoptado2.nombre());
    
        Animal gatoAdoptado3 = refugio.AdoptaGato();
        System.out.println("Nombre del gato adoptado: " + gatoAdoptado3.nombre());
    
        Animal perroAdoptado = refugio.AdoptaPerro();
        System.out.println("Nombre del perro adoptado: " + perroAdoptado.nombre());
    
        refugio.Entra(new Perro("Pluto", 'M', LocalDateTime.now(), 9));
        refugio.Entra(new Gato("Garfield", 'M', LocalDateTime.now(), 10));
    
        System.out.println("Animal más antiguo: " + refugio.MasAntiguo());
        
    }
}
