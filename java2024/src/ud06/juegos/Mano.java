package ud06.juegos;

public class Mano {
    private final int TAMANIO = 3;
    private Carta carta1;
    private Carta carta2;
    private Carta carta3;

    public Mano() {
        this.carta1 = new Carta();
        this.carta2 = new Carta();
        this.carta3 = new Carta();
    }

    public int getTamaño() {
        return TAMANIO;
    }

    public void mostrarCarta(int numero) {
    if (numero >= 0 && numero < TAMANIO) {
        switch (numero) {
            case 0:
                System.out.println("Carta 1: " + carta1);
                break;
            case 1:
                System.out.println("Carta 2: " + carta2);
                break;
            case 2:
                System.out.println("Carta 3: " + carta3);
                break;
        }
    } else {
        System.out.println("Número de carta inválido");
    }
}

public void setCarta(int numero) {
    if (numero >= 0 && numero < TAMANIO) {
        switch (numero) {
            case 0:
                carta1.pedirCarta();
                break;
            case 1:
                carta2.pedirCarta();
                break;
            case 2:
                carta3.pedirCarta();
                break;
        }
    } else {
        System.out.println("Índice de carta inválido");
    }
}

public String toString() {
    String manoString = "";
    for (int i = 0; i < TAMANIO; i++) {
        switch (i) {
            case 0:
                manoString += "Carta 1: " + carta1 + "\n";
                break;
            case 1:
                manoString += "Carta 2: " + carta2 + "\n";
                break;
            case 2:
                manoString += "Carta 3: " + carta3 + "\n";
                break;
        }
    }
    return manoString;
}

public void pedirMano() {
    carta1.pedirCarta();
    carta2.pedirCarta();
    carta3.pedirCarta();
}

public void mostrarMano() {
    System.out.println("Carta 1: " + carta1);
    System.out.println("Carta 2: " + carta2);
    System.out.println("Carta 3: " + carta3);
}

private int comparar(Mano mano) {
    int suma = 0;
    int sumaMano = 0;
    int cartasRojas = 0;
    int cartasRojasOtra = 0;

    suma += carta1.getNumero();
    suma += carta2.getNumero();
    suma += carta3.getNumero();

    sumaOtraMano += mano.carta1.getNumero();
    sumaOtraMano += mano.carta2.getNumero();
    sumaOtraMano += mano.carta3.getNumero();

    if (carta1.getPalo() == 'r' || carta1.getPalo() == 't') {
        cartasRojas++;
    }
    if (carta2.getPalo() == 'r' || carta2.getPalo() == 't') {
        cartasRojas++;
    }
    if (carta3.getPalo() == 'r' || carta3.getPalo() == 't') {
        cartasRojass++;
    }

    if (mano.carta1.getPalo() == 'r' || mano.carta1.getPalo() == 't') {
        cartasRojasOtraMano++;
    }
    if (mano.carta2.getPalo() == 'r' || mano.carta2.getPalo() == 't') {
        cartasRojasOtraMano++;
    }
    if (mano.carta3.getPalo() == 'r' || mano.carta3.getPalo() == 't') {
        cartasRojasOtraMano++;
    }

    if (sumaThis > sumaMano) {
        return -1;
    } else if (sumaThis < sumaMano) {
        return 1;
    } else {
        if (cartasRojas > cartasRojasOtraMano) {
            return -1;
        } else if (cartasRojas < cartasRojasOtraMano) {
            return 1;
        } else {
            return 0;
        }
    }
}

public void mostrarGanadora(Mano mano) {
    int resultado = comparar(mano);

    if (resultado == -1) {
        System.out.println("Ha ganado esta mano:");
        System.out.println(this);
    } else if (resultado == 1) {
        System.out.println("Ha ganado la siguiente mano:");
        System.out.println(mano);
    } else {
        System.out.println("Hay un empate entre las dos manos.");
    }
}
}

