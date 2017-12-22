package school.lemon.oop.comics.heros.dc.justice.league;

import school.lemon.oop.comics.heros.Hero;
import school.lemon.oop.comics.powers.Alien;
import school.lemon.oop.comics.powers.InBorn;
import school.lemon.oop.comics.powers.Suit;
import school.lemon.oop.comics.powers.SuperPower;

public class Superman extends Hero implements Alien, SuperPower, InBorn, Suit {

    static {
        System.out.println("I am Kal El from Crypton");
    }

    {
        System.out.println("I am Klark Kent");
    }

    public Superman() {
        System.out.println("Superman constructor");
        System.out.println("I am Superman");
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
    public void sayWhatYourSuperPower() {

    }
}
