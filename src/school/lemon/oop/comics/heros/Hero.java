package school.lemon.oop.comics.heros;

public abstract class Hero {

    public abstract void rescue();

//    static {
//        System.out.println("Hero static block");
//    }
//
//    {
//        System.out.println("Hero dynamic block");
//    }

    public Hero() {
        System.out.println("Hero constructor");
    }


    public void fightWithVillain(){

        System.out.println("Hero should kill the villain");
    }
}
