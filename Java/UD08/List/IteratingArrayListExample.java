package UD08.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratingArrayListExample {
    public static void main(String[] args) {
        List <String> aList = new ArrayList<>();
        aList.add("Steve");
        aList.add("Tim");
        aList.add("Lucy");
        aList.add("Pat");
        aList.add("Angela");
        aList.add("Tom");
        
        System.out.println("FOR");
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }
        
        System.out.println();
        System.out.println("FOREACH");
        for (String name : aList)
            System.out.println(name);
        
        System.out.println();
        System.out.println("ITERATOR");
        Iterator<String> it = aList.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        
        System.out.println();
        System.out.println("WHILE");
        int i=0;
        while (aList.size() > i) {
            System.out.println(aList.get(i));
            i++;
        
        System.out.println();
        System.out.println("FOREACH(METODO)");
        aList.forEach(name -> System.out.println(name));
        }
    }
}
