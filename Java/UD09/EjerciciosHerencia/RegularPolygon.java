package EjerciciosHerencia;

public class RegularPolygon extends Polygon{
    protected int numSides;
    protected double side;

    public RegularPolygon(String color, boolean filled, int numSides, double apothem, double side){
        super(color, filled, apothem);
        this.numSides = numSides;
        side = 2 * getApothem() * Math.tan(Math.PI/numSides);
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }
    public double getArea(){
        return getPerimeter()*getApothem()/2;
    }
    public double getPerimeter(){
        return numSides * side;
    }
}