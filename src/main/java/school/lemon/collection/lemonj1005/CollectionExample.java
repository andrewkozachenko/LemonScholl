package school.lemon.collection.lemonj1005;

import java.util.*;

public class CollectionExample {





    public static void main(String[] args) {
        List arrayList = new ArrayList();
        Set hashSet = new HashSet();
        Map hashMap = new HashMap();
//        Student s = new Student("David");
//        Student d = new Student("David");
//        long start = System.nanoTime();
//        boolean b = s.equals(d);
//        long end = System.nanoTime();
//        long result = end - start;
//        System.out.println("Result  equals " + result);
//
//         start = System.nanoTime();
//         b = s.hashCode() ==d.hashCode();
//         end = System.nanoTime();
//         result = end - start;
//        System.out.println("Result  hashCode " + result);

        fillArrayList(arrayList);
        fillSet(hashSet);
        fillMap(hashMap);
        System.out.println(arrayList.size());
        System.out.println(hashSet.size());
        System.out.println(hashMap.size());

        System.out.println("Map number 1 " + hashMap.get(1));
    }



    public static void fillArrayList(List arrayList){
        arrayList.add(new Student("Nikita"));
        arrayList.add(new Student("Nikita"));
        arrayList.add(new Student("Nikita"));

    }

    public static void fillSet(Set set){
        set.add(new Student("Nikita"));
        set.add(new Student("Nikita"));
        set.add(new Student("Vadym"));
        set.add(new Student("Dima"));
        set.add(new Student("Max"));
        set.add(new Student("Max"));
        set.add(new Student("Duc"));


    }

    public static void fillMap(Map map){
        map.put(1, new Student("Nik"));
        map.put(1, new Student("uyuyu"));
        map.put(2, new Student("Nik"));
        map.put(3, new Student("Olga"));

    }
}
