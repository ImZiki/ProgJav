package ud06.juegos;


public class Partida {
    public static void main(String[] args) {
        // Crear dos manos por defecto
        Mano mano1 = new Mano();
        Mano mano2 = new Mano();
        mano1.mostrarMano();

        mano2.pedirMano();
        mano2.mostrarMano();
        mano1.mostrarGanadora(mano2);
    }
}