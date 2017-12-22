package school.lemon.oop.comics;

import school.lemon.oop.comics.heros.marvel.DeadPool;
import school.lemon.oop.comics.herosI.Hero;
import school.lemon.oop.comics.villians.Villian;

public class UseDeadPool {
    public static void main(String[] args) {
        DeadPool deadPool = new DeadPool(new Hero() {
            @Override
            public void rescue() {
                System.out.println("rescue All");
            }
        }, new Villian() {
            @Override
            public void makeBadThings() {
                System.out.println("Kill everyone to Music ");
            }
        });


        DeadPool goodDeadPool = new DeadPool(new Hero() {
            @Override
            public void rescue() {
                System.out.println("rescue All");
            }
        }, null);


        DeadPool badAssDeadPool = new DeadPool(null, new Villian() {
            @Override
            public void makeBadThings() {
                System.out.println("Kill everyone to Music ");
            }
        });

        goodDeadPool.rescue();
        goodDeadPool.useSuit();
        badAssDeadPool.rescue();
        deadPool.useSuit();
    }

}
