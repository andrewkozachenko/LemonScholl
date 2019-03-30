package school.lemon.patterns.factory.method;

public abstract class Logistics {

    public void planDelivery(){
        Transport a = createTransport();
        a.delivery();
    }
    public abstract Transport createTransport();

}
