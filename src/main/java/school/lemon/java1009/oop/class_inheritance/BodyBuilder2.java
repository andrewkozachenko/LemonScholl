package school.lemon.java1009.oop.class_inheritance;

public class BodyBuilder2 extends HeavyAthlete2 {
    static {
        System.out.println("BodyBuilder2 static block 1");
    }
    public BodyBuilder2(String name) {
        super(name);
        System.out.println("this is " + getClass().getName() + " " + name);
    }
}
