package school.lemon.classes;


import school.lemon.arrays.Figure;

interface Lexus{

}

class RX350 implements Lexus {
    static Double volumeEngine = 2.5;
    public static String color = "Red";
    private String driver;

    @Override
    public String toString() {
        return "RX350 volumeEngine " + volumeEngine + ", " + " color " + color +  "\n"
                + "Driver => " + getDriver();
    }

    public void setDriver(String driver){
        this.driver = driver;
    }

    public String getDriver(){
        return driver;
    }
}

class Triangle extends Figure {

    private int a;
    private int b;
    private int c;


    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    protected int perimetr() {
        return a + b + c;
    }

    @Override
    public double square() {
        return Math.sqrt(
                getHalfPerimetr() *
                        ( getHalfPerimetr() - a) *
                        ( getHalfPerimetr() - b) *
                        ( getHalfPerimetr() - c)
        ) ;
    }

    protected double getHalfPerimetr(){
        double half = perimetr() / 2.0;
        return half;
    }

    @Override
    public void whoIam() {
        System.out.println("Java Lemon Triangle");
    }

    public void whoIam(String s){
        System.out.println(s);
    }

    public static void whoIAm(){
        System.out.println(Triangle.class.getName());
    }
}


public class JavaLemon {

    public static void main(String[] args) {

//        String string = "string";
//
//        RX350 one = new RX350();
//
//        one.color="Black";
//        System.out.println(one);
//        System.out.println("RX350.volumeEngine" + RX350.volumeEngine);
//
//        RX350 two = new RX350();
//        RX350.volumeEngine = 3.5;
//        System.out.println("RX350.volumeEngine" + RX350.volumeEngine);
//        System.out.println(two);
//
//        System.out.println("RX350.color" + RX350.color);
//            Triangle.whoIAm();
//            school.lemon.trigonometria.Figure f = new school.lemon.trigonometria.Figure();
//            f.say();
//        school.lemon.trigonometria.Figure.iAmBatman();


        RX350 littlePonny = new RX350();
        littlePonny.color = "Green";
        String driver = "Pavel";
        littlePonny.setDriver(driver);
        System.out.println(littlePonny);
        RX350 blackPonny = new RX350();
        System.out.println("BlackPony");
        System.out.println(blackPonny);
    }
}
