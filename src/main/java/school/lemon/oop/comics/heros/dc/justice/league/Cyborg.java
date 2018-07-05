package school.lemon.oop.comics.heros.dc.justice.league;

import school.lemon.oop.comics.heros.Hero;
import school.lemon.oop.comics.powers.Acquired;

public class Cyborg extends Hero implements Acquired {

    static {
        System.out.println("I am a human");
    }

    {
        System.out.println("I am Victor Stone");
    }

    public Cyborg() {
        System.out.println("Cyborg constructor");
        System.out.println("I am a Monster ");
    }

    @Override
    public void rescue() {
        System.out.println("Rescue people");
    }

    @Override
    public void sayAcquired() {
        System.out.println("My Abilities are  acquired ");
    }
}
