package school.lemon.java1101;

public class GetCosinus {

    public static void main(String[] args) {
        System.out.println(getGoodCosine(90));
        System.out.println(new Double(getCosine(90)).intValue());
    }

    public static int getGoodCosine(double angleCosine){
        return Math.round((float)getCosine(angleCosine));

    }

    public static double getCosine(double angle ){
        return Math.cos(Math.toRadians(angle));
    }
}
