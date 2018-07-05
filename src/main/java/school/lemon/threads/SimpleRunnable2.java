package school.lemon.threads;

public class SimpleRunnable2 implements Runnable {
    private static int threadCount = 0;
    private int countDown = 5, threadNum = ++threadCount;
    public SimpleRunnable2() {
        System.out.println("Making " + threadNum);
    }
    public void run() {
        while(true) {
            System.out.println("Thread " +         threadNum + "(" + countDown + ")");
            if(--countDown == 0) return;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread arr []  = new Thread[5];

        for(int i = 0; i < 5; i++)
            (arr[i] =  new Thread(new SimpleRunnable2())).start();


        System.out.println("All Threads Started");
        for(int i = 0; i < 5; i++)
            arr[i].join();
        System.out.println("All Threads Done");
    }
}
