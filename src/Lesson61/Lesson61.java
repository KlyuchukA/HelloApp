package Lesson61;

import java.util.ArrayList;
import java.util.*;

public class Lesson61 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "Apple");
        list.add(1, "Banan");
        list.add(2, "Lime");
        list.add(3, "Grape");
        list.add(4, "Orange");

        list.add("Dragan fruit");
        list.remove(4);
        list.remove("Banan");
        list.get(0);
        list.clear();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(list.size());
    }
}
