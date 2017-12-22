package school.lemon.oop.comics.herosI.dc.justice.league;

import school.lemon.oop.comics.herosI.Hero;
import school.lemon.oop.comics.powers.InBorn;
import school.lemon.oop.comics.powers.Skills;
import school.lemon.oop.comics.powers.Suit;

public class WonderWoman  implements Hero, InBorn, Skills, Suit {

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
        System.out.println("I am a Princes and I am a Woman");
    }

    @Override
    public void mySuitIs() {
        System.out.println("Gods artifacts");
    }

    @Override
    public void useSuit() {

    }

    @Override
    public void mySkillsIs() {
        System.out.println("fight skills");
    }
}
