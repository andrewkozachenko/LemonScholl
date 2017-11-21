package school.lemon.recursion;

import java.util.Date;

public class Recursion {

    static void sayHello(int count){
        int a = 0;
        for (int i = 0; i < count;  i++){
//            System.out.println("****Hello Lemon school from FOR ***");
            a+=i;
        }
        System.out.println(a);
    }

    static void sayHelloRecursion(int count){
//        System.out.println("***Hello Lemon from RECURSION ***");
        int a = 0;
        if(count > 0) {
            count--;
            a+=count;
            sayHelloRecursion(count);
        }
        System.out.println(a);
    }

    static void test (int count){
        Date start = new Date();
        Date end;
        long totalFor, totalRecursion;
        sayHello(count);
        totalFor = new Date().getTime() - start.getTime();
        start = new Date();
        sayHelloRecursion(count);
        totalRecursion = new Date().getTime() - start.getTime();

        System.out.println("For Time " + totalFor);
        System.out.println("Recursion Time " + totalRecursion);
    }

    public static void main(String[] args) {

      test(100000);

    }
}
