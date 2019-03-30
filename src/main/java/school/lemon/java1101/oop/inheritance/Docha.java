package school.lemon.java1101.oop.inheritance;

public class Docha extends Babka {

    static {
        System.out.println("Hello this is static from Docha");
    }

    {
        System.out.println("Hello this is non-static 1 from Docha");
    }

    {
        System.out.println("Hello this is non-static 2  from Docha");
    }

    public Docha() {
        System.out.println("This is Docha constructor");
    }


    public void preaparingVareniki(){
        System.out.println("Gotovlu luchschie vareniki");
    }


    @Override
    public void swearing() {
        System.out.println("I boyus' Babky");
    }
}
