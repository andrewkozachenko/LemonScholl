package school.lemon.collection.lemonj1005;

public class HomeHashCode {
    public static int getMyHash(String name){
        char value [] = name.toCharArray();
        int h = 0;
        for (int i = 0; i < value.length; i++) {
            h = 31 * h + value[i];
        }
        return h;
    }

    public static void main(String[] args) {
        System.out.println(getMyHash("Козаченко Андрей Владимирович"));
    }
}
