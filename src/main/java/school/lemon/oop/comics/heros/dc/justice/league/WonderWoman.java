package school.lemon.oop.comics.heros.dc.justice.league;

import school.lemon.oop.comics.heros.Hero;
import school.lemon.oop.comics.powers.InBorn;
import school.lemon.oop.comics.powers.Skills;
import school.lemon.oop.comics.powers.Suit;

public class WonderWoman extends Hero implements InBorn, Skills, Suit {

    static {
        System.out.println("I am Amazon");
    }

    {
        System.out.println("I am Diana");
    }

    {
        System.out.println("I am daughter of Ares");
    }

    public WonderWoman() {
        System.out.println("WonderWoman constructor");
        System.out.println("I am Wonder Woman");
    }

    @Override
    public void rescue() {

    }

    @Override
    public void sayInBorn() {

    }

    @Override
    public void mySuitIs() {

    }

    @Override
    public void useSuit() {

    }

    @Override
    public void mySkillsIs() {

    }
}
