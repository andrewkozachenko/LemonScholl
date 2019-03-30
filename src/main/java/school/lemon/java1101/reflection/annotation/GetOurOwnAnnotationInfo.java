package school.lemon.java1101.reflection.annotation;

import java.lang.reflect.Field;

public class GetOurOwnAnnotationInfo {
    public static void main(String[] args) throws NoSuchFieldException {
        Field field = Test.class.getDeclaredField("goods");
        Description description = field.getAnnotation(Description.class);
        System.out.println(description.title() +  " : " + description.number());
    }
}
