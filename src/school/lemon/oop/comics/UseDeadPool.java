package school.lemon.oop.comics;

import school.lemon.oop.comics.heros.Hero;
import school.lemon.oop.comics.heros.dc.justice.league.Batman;
import school.lemon.oop.comics.heros.dc.justice.league.Superman;
import school.lemon.oop.comics.heros.dc.justice.league.WonderWoman;
import school.lemon.oop.comics.heros.marvel.DeadPool;
import school.lemon.oop.comics.heros.marvel.xmen.Wolverine;
import school.lemon.oop.comics.villians.Loki;

public class UseDeadPool {
    public static void main(String[] args) {
        Superman superman = new Superman();
        Batman batman = new Batman();

        String s = "dfs";
        Integer i = 123;
       WonderWoman Diana = new WonderWoman();

        DeadPool<Hero, Batman> deadPoolHeroDC = new DeadPool<Hero, Batman>(superman, batman);

        DeadPool<WonderWoman, Batman> deadPoolDiana = new DeadPool<WonderWoman, Batman>(Diana, batman);


        String d = "erer";
        d = s;


//        deadPoolDiana = deadPoolHeroDC;

        DeadPool rawDeadPool = new DeadPool();

        rawDeadPool = deadPoolDiana;
        rawDeadPool = deadPoolHeroDC;


        rawDeadPool.<Superman>FFF(superman);

    }

}
