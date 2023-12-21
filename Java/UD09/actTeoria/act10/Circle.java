package actTeoria.act10;

public class Circle extends Shape {
    protected double radius;
    
    public Circle(){
        this(1.0);
    }
    
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        
        return "Un circulo con radio " + radius + "que es subclase de " + super.toString();
    }
}