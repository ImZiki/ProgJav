public class Triangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;
    private static final int EQUILATERO = 0;
    private static final int ISOSCELES = 1;
    private static final int ESCALENO = 2;

    public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new Punto(x1, y1);
        v2 = new Punto(x2, y2);
        v3 = new Punto(x3, y3);
    }
    public Triangulo(Punto puntoUno, Punto puntoDos, Punto puntoTres){
        v1 = puntoUno;
        v2 = puntoDos;
        v3 = puntoTres;
    }
    public Punto getV1() {
        return v1;
    }
    public Punto getV2() {
        return v2;
    }
    public Punto getV3() {
        return v3;
    }
    public static int getEquilatero() {
        return EQUILATERO;
    }
    public static int getIsosceles() {
        return ISOSCELES;
    }
    public static int getEscaleno() {
        return ESCALENO;
    }
    
    @Override
    public String toString() {
        return "[(" + v1 + "), (" + v2 + "), (" + v3 + ")]";
    }
    public double perimetro(){
        return v1.distancia(v2) + v2.distancia(v3) + v3.distancia(v1);
    }

    public boolean semejante(Triangulo unTriangulo){
        boolean esSemejante = false;
        if(v2.distancia(v3) / unTriangulo.getV2().distancia(unTriangulo.getV3()) == v3.distancia(v1) / unTriangulo.getV3().distancia(unTriangulo.getV1()) && v3.distancia(v1) / unTriangulo.getV3().distancia(unTriangulo.getV1()) == v1.distancia(v2) / unTriangulo.getV1().distancia(unTriangulo.getV2()))
            esSemejante = true;
        return esSemejante;
    }

    public static boolean semejante(Triangulo t1, Triangulo t2){
        boolean esSemejante = false;
        Punto t1V1 = t1.getV1();
        Punto t1V2 = t1.getV2();
        Punto t1V3 = t1.getV3();
        Punto t2V1 = t2.getV1();
        Punto t2V2 = t2.getV2();
        Punto t2V3 = t2.getV3();
        if(t1V2.distancia(t1V3) / t2V2.distancia(t2V3) == t1V3.distancia(t1V1) / t2V3.distancia(t2V1) && t1V3.distancia(t1V1) / t2V3.distancia(t2V1) == t1V1.distancia(t2V2) / t2V1.distancia(t2V2))
            esSemejante = true;
        return esSemejante;
    }

    public int tipo(){
        int tipo = ESCALENO;
        if(this.v1.distancia(this.v2) == this.v2.distancia(this.v3) && this.v3.distancia(this.v1) == this.v1.distancia(this.v2))
            tipo = EQUILATERO;
        else if(this.v1.distancia(this.v2) == this.v2.distancia(this.v3) || this.v3.distancia(this.v2) == this.v3.distancia(this.v1))
            tipo = ISOSCELES;
        return tipo;
    }
}
