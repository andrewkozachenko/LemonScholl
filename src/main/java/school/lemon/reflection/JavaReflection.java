package school.lemon.reflection;

import java.lang.reflect.Field;

public class JavaReflection {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        String hello = "hello!";
//        System.out.println("Before Reflection API " + hello);
//
//
        Integer watermelon = 6;

        Field value = Integer.class.getDeclaredField("value");
        value.setAccessible(true);

//        Object vv = value.get(watermelon);
//        System.out.println(vv);
        value.set(watermelon, 7);
        int result = watermelon * 7;

        System.out.println("Result "+result);
    }
}
