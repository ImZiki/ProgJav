public class Recta {
    private Punto unPunto;
    private Punto otroPunto;
    
    
    public Recta(Punto unPunto, Punto otroPunto) {
        this.unPunto = unPunto;
        this.otroPunto = otroPunto;
    }
    public Recta(int x1, int y1, int x2, int y2){
        this.unPunto = new Punto(x1, y1);
        this.otroPunto = new Punto(x2, y2);
    }
    public Punto getUnPunto() {
        return unPunto;
    }
    public Punto getOtroPunto() {
        return otroPunto;
    }
    @Override
    public String toString() {
        return "[("+ unPunto + "), (" + otroPunto + ")]";
    }
    
    public double pendiente(){
        return unPunto.pendiente(otroPunto);
    }

    public boolean esColineal(Punto unPunto){
        boolean esColineal = false;
        if(unPunto.pendiente(this.unPunto) == unPunto.pendiente(this.otroPunto))
            esColineal = true;
        return esColineal;
    }
}
