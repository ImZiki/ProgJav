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
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        double area = this.length*this.width;
        return area;
    }
    public double getPerimeter(){
        double perimeter = (this.length*2) + (this.width*2);
        return perimeter;
    }
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
