package UD07;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();

        rectangle1.setLength(50.5f);
        System.out.println(rectangle1);
        rectangle1.setWidth(40.05f);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getArea());
        

    }
}
