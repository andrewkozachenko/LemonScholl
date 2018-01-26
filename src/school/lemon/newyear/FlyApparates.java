package school.lemon.newyear;

public enum FlyApparates {

    AIRSHIP(2), PLANE, HELICOPTER(4);


    private int i;
    private String s;

    FlyApparates() {
    }

    FlyApparates(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
