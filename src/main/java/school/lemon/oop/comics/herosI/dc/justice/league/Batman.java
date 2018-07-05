package school.lemon.oop.comics.herosI.dc.justice.league;


import school.lemon.oop.comics.herosI.Hero;
import school.lemon.oop.comics.powers.Skills;
import school.lemon.oop.comics.powers.Suit;

public class Batman implements Hero, Skills, Suit{

    static {
        System.out.println("I am a human");
    }

    {
        System.out.println("I am a Bruce Wayne");
    }

    public Batman() {
        System.out.println("Constructor Batman");
        System.out.println("I am a Batman");
    }

    @Override
    public void rescue() {
        System.out.println("I am rescue Gotham");
    }

    @Override
    public void mySuitIs() {
        System.out.println("Bat suit");

    }

    @Override
    public void useSuit() {

    }

    @Override
    public void mySkillsIs() {
        System.out.println("Martial Arts and Money");
    }
}
