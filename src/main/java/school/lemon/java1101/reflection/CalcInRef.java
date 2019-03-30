package school.lemon.java1101.reflection;

import java.lang.reflect.Field;
import java.util.Random;

public class CalcInRef {
    private Integer term1;
    private Integer term2;
    private Integer sum;

    public CalcInRef(Integer term1, Integer term2) {
        this.term1 = term1;
        this.term2 = term2;
    }

    private Integer setRandomValue(Integer val){
        try {
            Field value = Integer.class.getDeclaredField("value");
            value.setAccessible(true);
            Random random = new Random();
            int randomInt = random.nextInt(100);
            value.set(val, randomInt);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        return val;
    }

    public Integer getSum(){
        sum = term1 + term2;
        return setRandomValue(sum);
    }

}
