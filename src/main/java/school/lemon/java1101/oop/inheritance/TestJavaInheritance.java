package school.lemon.java1101.oop.inheritance;

public class TestJavaInheritance {


    public static void main(String[] args) {
        Babka object = new Vnuchka();
        System.out.println("Who are you?");
        System.out.println("I am " + object.getClass().getSimpleName());

        object.swearing();
    }
}
