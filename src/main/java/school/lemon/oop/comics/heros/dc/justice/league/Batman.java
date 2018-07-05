package school.lemon.oop.comics.heros.dc.justice.league;

import school.lemon.oop.comics.heros.Hero;
import school.lemon.oop.comics.powers.Skills;
import school.lemon.oop.comics.powers.Suit;

public class Batman extends Hero implements Skills, Suit{

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
        useSuit();
    }

    @Override
    public void mySuitIs() {
        System.out.println("Bat suit");

    }

    @Override
    public void useSuit() {
        System.out.println("batsuit and batmobil");
    }

    @Override
    public void mySkillsIs() {
        System.out.println("Martial Arts and Money");
    }
}
