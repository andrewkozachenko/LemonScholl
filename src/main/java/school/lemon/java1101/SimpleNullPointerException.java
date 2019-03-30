package school.lemon.java1101;


import school.lemon.java1101.oop.Simple;

public class SimpleNullPointerException {
    public static void main(String[] args) {
        Simple simple = null;
        simple.sayHello();
        simple.getInt();
    }

}
