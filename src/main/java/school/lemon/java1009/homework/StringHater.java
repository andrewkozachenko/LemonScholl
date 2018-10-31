package school.lemon.java1009.homework;

public class StringHater {

    private String hated = "Our government";

    public static void main(String[] args) {

            new StringHater().hate();

    }


    public  void hate(){
        String our = "Our";
        hated = "Govno " +
                hated.substring(hated.indexOf(our)+our.length()+1,
                hated.length());
        System.out.println(hated);
    }

}
