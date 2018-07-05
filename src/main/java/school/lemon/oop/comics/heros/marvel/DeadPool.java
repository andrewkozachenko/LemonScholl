package school.lemon.oop.comics.heros.marvel;

import school.lemon.oop.comics.herosI.Hero;
import school.lemon.oop.comics.powers.Acquired;
import school.lemon.oop.comics.powers.Mutant;
import school.lemon.oop.comics.powers.Skills;
import school.lemon.oop.comics.powers.Suit;
import school.lemon.oop.comics.villians.Villain;

public class DeadPool<T1 extends school.lemon.oop.comics.heros.Hero, T2> implements Hero, Villain, Acquired, Suit, Skills, Mutant {

    private T1 hero;

    private T2 villian;

    public DeadPool() {
    }

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


            singASonng();


    }

    private void singASonng() {
        System.out.println("Lalalalla");
    }

    @Override
    public void rescue() {

            singASonng();

    }

    @Override
    public void makeBadThings() {
        if (hero == null) {
            System.out.println("Make bad and funny things");
        } else {
            singASonng();
        }
    }

    @Override
    public void sayImMutant() {

    }

    public <T1> void FFF(T1 t1){
        System.out.println(t1.getClass());
    }
}
