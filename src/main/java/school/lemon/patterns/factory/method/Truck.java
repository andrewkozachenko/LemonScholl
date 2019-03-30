package school.lemon.patterns.factory.method;

public class Truck implements Transport {
    @Override
    public void delivery() {
        System.out.println("Delivery by road");
    }
}
