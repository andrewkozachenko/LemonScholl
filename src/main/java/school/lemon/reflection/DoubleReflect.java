package school.lemon.reflection;

public class DoubleReflect {

    public static void main(String[] args) {
        double d = 3.4;
        Class clazz =  double.class;
        Class stringClass = String.class;
        System.out.println(clazz.getName());
        System.out.println(clazz.isPrimitive());
        System.out.println(stringClass.getName());
        System.out.println(stringClass.isPrimitive());
    }
}
