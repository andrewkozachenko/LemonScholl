package school.lemon.java1101.collections;

import school.lemon.java1101.collections.entity.EntityForSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SimpleSet {

    private HashSet hashSet;
    private TreeSet treeSet;

    public static void main(String[] args) {
        initMap();
       // initSet();
    }


    private static void initMap(){
        Map<String, EntityForSet> map = new HashMap();
        map.put("1",new EntityForSet("Kolbasa"));
        map.put("2",new EntityForSet("Cyr"));
        map.put("3",new EntityForSet("Avocado"));
        map.put("4",new EntityForSet("Beer"));
        System.out.println(map);

        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    private static void initSet() {
        TreeSet<EntityForSet> hashSet = new TreeSet<EntityForSet>();
        hashSet.add(new EntityForSet("Kolbasa"));
        hashSet.add(new EntityForSet("Cyr"));
        hashSet.add(new EntityForSet("Avocado"));
        hashSet.add(new EntityForSet("Beer"));

        System.out.println(hashSet.size());

        for (EntityForSet entity : hashSet){
            System.out.println(entity.getText());
        }


        System.out.println(Arrays.toString(hashSet.toArray()));
    }
}
