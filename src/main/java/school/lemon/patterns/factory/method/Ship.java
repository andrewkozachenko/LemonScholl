package school.lemon.patterns.factory.method;

public class Ship implements Transport {
    @Override
    public void delivery() {
        System.out.println("Delivery by sea");
    }
}
