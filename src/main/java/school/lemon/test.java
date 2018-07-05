package school.lemon;

import java.util.*;

public class test {
    public static void main(String[] args) {
        TreeSet<Integer> it = new TreeSet<>();
        it.add(120);
        it.add(5);

        it.add(24);

        System.out.println("Roma");
        Iterator<Integer> iter = it.iterator();
        while (iter.hasNext()){
            Integer i =iter.next();
            System.out.println(i);
        }


    }
}
