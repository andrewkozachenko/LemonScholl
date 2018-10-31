package school.lemon.java1009.oop.extented;

public class MomyWorkouter extends Workouter {


    public MomyWorkouter() {
        this.setAge(17);
        this.setHeight(178);
        this.setWeight(50);
        this.setSex(Sex.MALE);
    }

    @Override
    void flag() {
        System.out.println("Made flag");
    }

    @Override
    void towel() {
        System.out.println("Made towel");
    }

    @Override
    void makeHorizon() {
        System.out.println("Made horizon");
    }

    @Override
    void swallow() {
        System.out.println("Made swallow");
    }

    @Override
    public String makeDiet() {
        return "go to grandma and eat punk cake ";
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        System.out.println("Run -- Da nu nafig");
    }

    @Override
    public void training(){
        makePhysicalExercise();
        flag();
        towel();
        makeHorizon();
        swallow();
        makeDiet();
    }
}
