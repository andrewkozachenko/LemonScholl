package school.lemon.java1009.entitySample;

public class InHuman {

    private double weight;
    private double g;
    private double mass;

    public InHuman() {
    }

    public InHuman(double weight, double g) {
        this.g = g;
        this.weight = weight;
        if (g != 0) {
            this.mass = weight / g;
        }else {
            this.mass = weight;
        }
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }
}
