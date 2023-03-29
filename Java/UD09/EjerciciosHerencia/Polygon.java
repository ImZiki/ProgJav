package EjerciciosHerencia;

public abstract class Polygon extends Shape {
    protected double apothem;

    public Polygon(double apothem){
        super();
        this.apothem = 1;
    }

    public Polygon(String color, boolean filled, double apothem){
        super(color, filled);
        this.apothem = apothem;
    }

    public double getApothem() {
        return apothem;
    }

    public void setApothem(double apothem) {
        this.apothem = apothem;
    }

    @Override
    public abstract  double getArea();
    @Override 
    public abstract  double getPerimeter();
}
