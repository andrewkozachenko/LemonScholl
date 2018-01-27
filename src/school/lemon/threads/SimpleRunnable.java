package school.lemon.threads;

public class SimpleRunnable implements Runnable {
    private static int threadCount = 0;
    private int countDown = 5, threadNum = ++threadCount;
    public SimpleRunnable() {
        System.out.println("Making " + threadNum);
    }
    public void run() {
        while(true) {
            System.out.println("Thread " +         threadNum + "(" + countDown + ")");
            if(--countDown == 0) return;
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
            new Thread(new SimpleRunnable()).start();
        System.out.println("All Threads Started");
        System.out.println("All Threads Done");
    }
}
