package school.lemon.java1101;

import java.util.ArrayList;
import java.util.List;

public class TestPerformance {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        long start = System.currentTimeMillis();

         for(int i =0; i< 100000; i++){
             list.add(i);
         }

        long end = System.currentTimeMillis();
        long result = end-start;
        System.out.println("Time for adding 1 million integer elements " + result);
    }

    //Time for adding 1 million integer elements 205
    //Time for adding 1 million integer elements 30


}
