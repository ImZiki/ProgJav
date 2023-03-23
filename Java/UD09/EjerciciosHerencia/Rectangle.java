package EjerciciosHerencia;

abstract public class Rectangle extends Shape {
    protected double length;
    protected double width;

    public Rectangle(){
        this(1.0, 1.0);
    }
    public Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    /** 
     * @return double
     */
    public double getlength() {
        return length;
    }
    
    /** 
     * @param length
     */
    public void setlength(double length) {
        this.length = length;
    }
    
    /** 
     * @return double
     */
    public double getWidth() {
        return width;
    }
    
    /** 
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    
    /** 
     * @return double
     */
    @Override
     public double getArea(){
        double area = this.length*this.width;
        return area;
    }
    
    /** 
     * @return double
     */
    @Override
    public double getPerimeter(){
        double perimeter = (this.length*2) + (this.width*2);
        return perimeter;
    }
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + super.toString() + "]";
    }
}
