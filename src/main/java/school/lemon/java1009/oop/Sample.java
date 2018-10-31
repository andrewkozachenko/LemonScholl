package school.lemon.java1009.oop;

class Phone{}

class CDMAPhone extends Phone{}
class GSMPhone extends Phone{}

class iPhone extends GSMPhone{}
class SamsungGalaxy extends GSMPhone{}
class SamsungGalaxyS9 extends SamsungGalaxy{}


public class Sample {

    String string;

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.string = "New";

        System.out.println(sample.string);
        Car car = new Car();
        car.setColor("red");
    }
}
