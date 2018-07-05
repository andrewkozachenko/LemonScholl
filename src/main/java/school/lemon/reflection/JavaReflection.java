package school.lemon.reflection;

import java.lang.reflect.Field;

public class JavaReflection {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String hello = "hello!";


        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        value.set(hello, "Chiter !");

        System.out.println(hello);
    }
}
