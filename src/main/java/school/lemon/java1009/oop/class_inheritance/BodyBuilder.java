package school.lemon.java1009.oop.class_inheritance;

public class BodyBuilder extends HeavyAthlete {
    public BodyBuilder(String name) {
        super(name);
        System.out.println(this.getClass().getName());
    }
}
