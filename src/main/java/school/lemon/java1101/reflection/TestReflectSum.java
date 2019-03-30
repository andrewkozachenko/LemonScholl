package school.lemon.java1101.reflection;


public class TestReflectSum {
    public static void main(String[] args) {
        CalcInRef leon = new CalcInRef(30,7);
        System.out.println(leon.getSum());
    }
}
