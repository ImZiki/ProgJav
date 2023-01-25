package UD07;

public class TestTime {
    public static void main(String[] args) {
        Time hour1 = new Time(59, 59, 23);
        System.out.println(hour1);
        hour1.nextSecond();
        System.out.println(hour1);
    }
}
