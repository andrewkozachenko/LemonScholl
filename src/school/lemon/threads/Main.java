package school.lemon.threads;

public class Main {
    public static void main(String[] args) {
        final long before = System.currentTimeMillis();

        final long after = System.currentTimeMillis();
        System.out.println("Time delta  : %d " + (after-before)/1000);
    }
}
