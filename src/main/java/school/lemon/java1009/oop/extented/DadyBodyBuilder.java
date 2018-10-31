package school.lemon.java1009.oop.extented;

public class DadyBodyBuilder extends Bodybuilder {
    @Override
    public void deadlift(int set, int amount) {
        System.out.println("I made deadlift " + set + " set " + " x " + amount + " amount");
    }

    @Override
    public void squat(int set, int amount) {
        System.out.println("I made squat " + set + " set " + " x " + amount + " amount");
    }

    @Override
    public void benchPress(int set, int amount) {
        System.out.println("I made benchPress " + set + " set " + " x " + amount + " amount");
    }

    @Override
    public String makeDiet() {
        return "More Protein";
    }

    @Override
    public void drinkProtein() {
        System.out.println("Protein! Drink Protein");

    }

    @Override
    public void makePhysicalExercise() {
        drinkProtein();
        deadlift(4,10);
        drinkProtein();
        squat(4,10);
        drinkProtein();
        benchPress(4,10);
        makeDiet();
    }

    public void makeDadyHappy(){
        makePhysicalExercise();
        makePhysicalExercise();
        makePhysicalExercise();
        tookPartMisterOlimpia();
    }

}
