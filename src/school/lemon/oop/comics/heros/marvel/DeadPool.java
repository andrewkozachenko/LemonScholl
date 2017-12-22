package school.lemon.oop.comics.heros.marvel;

import school.lemon.oop.comics.herosI.Hero;
import school.lemon.oop.comics.powers.Acquired;
import school.lemon.oop.comics.powers.Skills;
import school.lemon.oop.comics.powers.Suit;
import school.lemon.oop.comics.villians.Villian;

public class DeadPool<T1 extends Hero, T2 extends Villian> implements Hero, Villian, Acquired, Suit, Skills {

    private T1 hero;

    private T2 villian;


    public DeadPool(T1 hero, T2 villian) {
        this.hero = hero;
        this.villian = villian;
        if (this.hero != null && this.villian == null){
            System.out.println("I am a Hero");
        } else if (this.villian!= null && this.hero == null){
            System.out.println("I am BadAss");
        }else {
            singASonng();
        }

    }

    @Override
    public void sayAcquired() {

    }

    @Override
    public void mySkillsIs() {

    }

    @Override
    public void mySuitIs() {
        System.out.println("Awesome red and black and two swords");
    }

    @Override
    public void useSuit() {

        if (hero != null && villian == null) {
            hero.rescue();
        } else if (villian != null && hero == null) {
            villian.makeBadThings();
        } else {
            singASonng();
        }

    }

    private void singASonng() {
        System.out.println("Lalalalla");
    }

    @Override
    public void rescue() {
        if (villian == null) {
            System.out.println("Rescue people");
        } else {
            singASonng();
        }
    }

    @Override
    public void makeBadThings() {
        if (hero == null) {
            System.out.println("Make bad and funny things");
        } else {
            singASonng();
        }
    }
}
