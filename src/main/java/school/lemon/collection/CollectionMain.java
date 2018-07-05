package school.lemon.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionMain {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);

        Set set2 = new HashSet();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("First print");
        printSet(set);
        printSet(set2);
        set.removeAll(set2);

        System.out.println("\nSecond print");
        printSet(set);

    }

    public static void printSet(Set set){
        Iterator it = set.iterator();
        System.out.println(set);
        while (it.hasNext())
            System.out.println(it.next());
    }
}
