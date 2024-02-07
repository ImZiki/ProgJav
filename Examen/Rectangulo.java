public class Rectangulo {
    private int alto;
    private int ancho;
    private Punto esquinaIzq;

    public Rectangulo(Punto esquinaIzq, int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
        this.esquinaIzq = esquinaIzq;
    }

    public Rectangulo(int x1, int y1, int ancho, int alto){
        this(new Punto(x1, y1), ancho, alto);        
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public Punto getEsquinaIzq() {
        return esquinaIzq;
    }

    @Override
    public String toString() {
        return "[(" + esquinaIzq + ")" + " ancho =" + ancho + ", alto=" + alto + "]";
    }


    public boolean contiene(int x1, int y1){
        boolean estaContenido = false;
        if(x1 < this.alto && y1 > this.ancho);
            estaContenido = true;
        return estaContenido;
    }


    public boolean contiene(Punto unPunto){
        boolean estaContenido = false;
        if(unPunto.getX() < this.alto && unPunto.getY() > this.ancho);
            estaContenido = true;
        return estaContenido;
    }

    public static boolean contiene(Rectangulo r1, Rectangulo r2){
        boolean estaContenido = false;
        if (r1.getEsquinaIzq().getX() > r2.getEsquinaIzq().getX() && r1.getEsquinaIzq().getY() > r2.getEsquinaIzq().getY())
            estaContenido = true;
        return estaContenido;
    }
}
