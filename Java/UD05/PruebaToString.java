package UD05;

import javax.sound.sampled.SourceDataLine;

public class PruebaToString {
    public static void main(String[] args) {
        long numLong=1;
    String cad1=Long.toString(numLong);
    
    int numInt=2;
    String cad2=Integer.toString(numInt);

    short numShort=3;
    String cad3=Short.toString(numShort);

    byte numByte=4;
    String cad4=Byte.toString(numByte);

    double numDouble=5;
    String cad5=Double.toString(numDouble);

    float numFloat=6;
    String cad6=Float.toString(numFloat);

    System.out.println(cad1+cad2+cad3+cad4+cad5+cad6);
    }
}
