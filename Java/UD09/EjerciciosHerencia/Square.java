package EjerciciosHerencia;

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
    public void setlength(double length){
        setSide(length);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }

    public double getSide(double side){
        return getlength();
    }
    public void setSide(double side){
        super.setlength(side);
        super.setWidth(side);
    }
}
