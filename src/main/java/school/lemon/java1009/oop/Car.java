package school.lemon.java1009.oop;

public class Car {
    private String mark;
    private String model;
    private String color;
    private double engineVolume;

    public Car() {
    }

    public Car(String mark, String model, String color, double engineVolume) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public void fillCarSettings(String mark, String model, String color, double engineVolume){
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
