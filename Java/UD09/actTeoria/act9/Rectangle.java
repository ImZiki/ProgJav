package UD09.actTeoria.act9;

public class Rectangle extends Shape {
    double heigth;
    double width;

    public Rectangle(){
        this(1.0, 1.0);
    }
    public Rectangle(double heigth, double width){
        super();
        this.heigth = heigth;
        this.width = width;
    }

    public Rectangle(double width, double heigth, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.heigth = heigth;
    }
    
    /** 
     * @return double
     */
    public double getHeigth() {
        return heigth;
    }
    
    /** 
     * @param heigth
     */
    public void setHeigth(double heigth) {
        this.heigth = heigth;
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
        double area = this.heigth*this.width;
        return area;
    }
    
    /** 
     * @return double
     */
    public double getPerimeter(){
        double perimeter = (this.heigth*2) + (this.width*2);
        return perimeter;
    }
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Rectangle [heigth=" + heigth + ", width=" + width + super.toString() + "]";
    }
}
