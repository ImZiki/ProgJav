package ud06;

public class PruebaHora {
    public static void main(String[] args) throws InterruptedException {
        Hora tiempo = new Hora(0, 0, 0);
        while(true){
            tiempo.nextSecond();
            System.out.println(tiempo);
            Thread.sleep(500);
        }
    }
}
