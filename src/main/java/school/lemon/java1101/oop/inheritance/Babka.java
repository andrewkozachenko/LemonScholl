package school.lemon.java1101.oop.inheritance;

public class Babka {
    static {
        System.out.println("Hello this is static from Babka");
    }

    {
        System.out.println("Hello this is non-static 1 from Babka");
    }

    {
        System.out.println("Hello this is non-static 2  from Babka");
    }

    public Babka() {
        System.out.println("This is Babka constructor");
    }

    static {
        System.out.println("Hello this is static2 from Babka");
    }

    {
        System.out.println("Hello this is non-static 3  from Babka");
    }

    public void preparingBorsch(){
        System.out.println("Gotovlu luchshiy borsch");
    }

    public void swearing(){
        System.out.println(" I rugaus' kak babka");
    }
}
