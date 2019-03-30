package school.lemon.java1101.collections;

import school.lemon.java1101.collections.entity.Car;

public class SimpleEqualsAndHashCode {

    public static void main(String[] args) {
        Car lanos = new Car("ZAZ","Deo", "Lanos");
        Car lada = new Car("VAZ", "Lada", "Vesta");

        System.out.println("Hash code Lanos\t\t\t" + lanos.hashCode());
        System.out.println("Hash code Lada\t\t\t" + lada.hashCode());

        System.out.println("Is lada equals Lanos\t" + lada.equals(lanos));
    }
}
