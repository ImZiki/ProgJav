package actTeoria.act10;

abstract public class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;

    }

    public Shape(){
        this("red", true);
    }
    public boolean isFilled(){
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();


    @Override
    public String toString() {
        return "Shape [color=" + color + ", filled=" + filled + "]";
    }
    
}
