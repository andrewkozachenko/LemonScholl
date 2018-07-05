package school.lemon.oop;

import school.lemon.oop.comics.heros.Hero;
import school.lemon.oop.comics.heros.dc.justice.league.SuperGirl;
import school.lemon.oop.comics.heros.dc.justice.league.Superman;

public class UseJusticeLeague {
    public static void main(String[] args) {
//        Superman supermanPrime = new Superman();

        System.out.println();
//        supermanPrime.fightWithVillain();

        SuperGirl girlFromCrypton = new SuperGirl();
        Superman superChika = new Superman();
//        SuperGirl powerGirl = (SuperGirl) superChika;
        System.out.println();

        superChika.fightWithVillain();
//        girlFromCrypton.fightWithVillain();
//        superChika.fightWithVillain();

    }
}
