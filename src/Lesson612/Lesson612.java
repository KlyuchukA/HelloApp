package Lesson612;

import java.util.*;

public class Lesson612 {
    public static void main(String[] args) {
        List<Integer> test = new LinkedList<Integer>();
        test.add(0, 1);
        test.add(1, 13);
        test.add(2, 13);
        test.add(3, 15);
        test.add(4, 17);
        test.add(5, 19);

        test.add(99);
        test.remove(4);
        test.remove((Integer) 1);
        test.get(0);
        test.clear();

        ListIterator<Integer> listIter = test.listIterator();
        while (listIter.hasNext()) {
            System.out.println(listIter.next());
        }
        System.out.println(test.size());
    }
}
