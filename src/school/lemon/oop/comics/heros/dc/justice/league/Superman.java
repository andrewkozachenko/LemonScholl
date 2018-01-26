package school.lemon.oop.comics.heros.dc.justice.league;

import school.lemon.oop.comics.heros.Hero;
import school.lemon.oop.comics.powers.Alien;
import school.lemon.oop.comics.powers.InBorn;
import school.lemon.oop.comics.powers.Suit;
import school.lemon.oop.comics.powers.SuperPower;

public class Superman extends Hero implements Alien, SuperPower, InBorn, Suit {

//    static {
//        System.out.println("I am Kal El from Crypton");
//    }
//
//    {
//        System.out.println("I am Klark Kent");
//        //sayWhatYourSuperPower();
//        fly(100);
//    }

    public Superman() {
        System.out.println("Superman constructor");
    }
//
//    {
//        System.out.println("I save the World!");
//    }

    @Override
    public void rescue() {
        System.out.println("Rescue people");
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
        System.out.println("\n" +
                "Special For Roman Merkury\n" +
                "Rengen\n" +
                "Hitvision\n" +
                "Fly away\n" +
                "super strength\n" +
                "super speed\n" +
                "");

    }

    public void fly(int height){
        System.out.println("I flew up " + height + " kilometers");
    }

    @Override
    public void fightWithVillain() {
//        super.fightWithVillain();
//        System.out.println(" Nooooooo ooo ooo ooooooo");
        if(false)
            System.out.println("After If");
        else if(true)
            System.out.println("Sran'");
        else;
            System.out.println("Vse");

        rescue();
        System.out.println("Villain is human too");
    }
}
