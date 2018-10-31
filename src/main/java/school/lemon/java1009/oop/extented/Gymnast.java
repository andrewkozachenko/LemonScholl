package school.lemon.java1009.oop.extented;

public abstract class Gymnast extends Human implements EasyAthlete {
    @Override
    public void pushUp(int set, int amount) {
        System.out.println("I made pushUps " + set + " sets" + " x " + amount + " amount");
    }

    @Override
    public void pullUp(int set, int amount) {
        System.out.println("I made pullUps " + set + " sets" + " x " + amount + " amount");
    }

    @Override
    public void run(int distance) {
        System.out.println("I ran " + distance + " kilometers");
    }

    @Override
    public void parallelBarsPushUp(int set, int amount) {
        System.out.println("I made parallelBarsPushUps " + set + " sets" + " x " + amount + " amount");
    }

    @Override
    public void makePhysicalExercise() {
        System.out.println("Start exercise");
        pushUp(4, 25);
        pullUp(4, 15);
        parallelBarsPushUp(4,20);
        run(3);
    }

    abstract void makeHorizon();

    abstract void swallow();
}
