package school.lemon.java1009.oop.class_inheritance;

public class HeavyAthlete2 extends Athlete2 {
    private static String name;
    static {
        System.out.println("HeavyAthlete2 static block 1 "+name);
    }



    public HeavyAthlete2(String name) {
        System.out.println("This is HeavyAthlete2");
    }
    {
        System.out.println("HeavyAthlete2 non static block 1");
    }
    static {
        System.out.println("HeavyAthlete2 static block 2");
    }
}
