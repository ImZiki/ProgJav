package UD08.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List <String> aList = new ArrayList<>();
        aList.add("Steve");
        aList.add("Tim");
        aList.add("Lucy");
        aList.add("Pat");
        aList.add("Angela");
        aList.add("Tom");


        System.out.println(aList);
        System.out.println(aList.size());
        aList.remove("Steve");
        aList.remove("Angela");

        System.out.println(aList);
        System.out.println(aList.size());
        aList.remove(2);
        System.out.println(aList);
        System.out.println(aList.size());

        aList.forEach(null);
    }
}
