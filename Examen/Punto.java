public class Punto{
    private int x;
    private int y;
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this(0,0);
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distancia(int x1, int y1){
        return Math.sqrt(Math.pow((x1 - this.x), 2) + Math.pow((y1 - this.y), 2));

    }

    public double distancia(Punto unPunto){
        return Math.sqrt(Math.pow((unPunto.getX() - this.x), 2) + Math.pow((unPunto.getY() - this.y), 2));
    }

    public double distancia(){
        return Math.sqrt(Math.pow((0 - this.x), 2) + Math.pow((0 - this.y), 2));
    }

    public void voltear(){
        int auxiliar = this.x;
        this.x = -getY();
        this.y = -auxiliar;
    }

    public double distanciaManhattan(Punto uPunto){
        return Math.abs(this.x - uPunto.getX()) + Math.abs((this.y - uPunto.getY()));
    }

    public boolean esVertical(Punto otroPunto){
        boolean esVertical = false;
        if(this.x == otroPunto.getX())
            esVertical = true;
        return esVertical;
    }

    public double pendiente(Punto otroPunto) throws IllegalStateException{
        if(otroPunto.getX() == this.x)
            throw new IllegalStateException("/ by zero");
        
        return (otroPunto.getY() - this.y) / (otroPunto.getX() - this.x);
            
    }

    public static boolean esColineal(Punto p1, Punto p2){
        boolean esColineal = false;
        if (p1.pendiente(p2) == p2.pendiente(p1))
            esColineal = true;
        return esColineal;
    }

}