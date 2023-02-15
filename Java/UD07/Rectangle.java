package UD07;

public class Rectangle {
    float length;
    float width;

    public Rectangle(){
        this(0.0f, 0.0f);
    }
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    
    /** 
     * @return float
     */
    public float getLength() {
        return length;
    }
    
    /** 
     * @param length
     */
    public void setLength(float length) {
        this.length = length;
    }
    
    /** 
     * @return float
     */
    public float getWidth() {
        return width;
    }
    
    /** 
     * @param width
     */
    public void setWidth(float width) {
        this.width = width;
    }

    
    /** 
     * @return double
     */
    public double getArea(){
        double area = this.length*this.width;
        return area;
    }
    
    /** 
     * @return double
     */
    public double getPerimeter(){
        double perimeter = (this.length*2) + (this.width*2);
        return perimeter;
    }
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
