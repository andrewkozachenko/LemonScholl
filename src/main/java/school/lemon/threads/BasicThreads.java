package school.lemon.threads;

public class BasicThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("waiting for LiftOff!");
    }
}