package UD07;

public class TestDate {
    public static void main(String[] args) {
        Date dateOne = new Date(1995, 2, 14);
        System.out.println(dateOne);

        dateOne.setDay(1);
        dateOne.setMonth(5);
        dateOne.setYear(2024);
        System.out.println(dateOne);


        dateOne.setDate(5555, 5, 5);
        System.out.println(dateOne);
    }
}
