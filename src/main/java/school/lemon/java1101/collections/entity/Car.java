package school.lemon.java1101.collections.entity;

import java.util.Objects;

public class Car {
    private String vendor;
    private String mark;
    private String model;

    public Car() {
    }

    public Car(String vendor, String mark, String model) {
        this.vendor = vendor;
        this.mark = mark;
        this.model = model;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return  Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return this.mark.hashCode()+this.model.hashCode();
    }

    @Override
    public String toString() {
        return "Car {" + this.vendor + "=>" +
                this.mark + "," +
                this.model + "}";
    }
}
