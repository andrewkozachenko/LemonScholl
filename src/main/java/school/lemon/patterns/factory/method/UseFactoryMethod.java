package school.lemon.patterns.factory.method;

public class UseFactoryMethod {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();
    }
}
