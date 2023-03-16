package UD09.actTeoria.act9;

public class Square extends Rectangle{
    
    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    @Override
    public void setHeigth(double heigth){
        setSide(heigth);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }

    public double getSide(double side){
        return getHeigth();
    }
    public void setSide(double side){
        super.setHeigth(side);
        super.setWidth(side);
    }
}
