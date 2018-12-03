package school.lemon.java1009.threads;

class JThread extends Thread {
    JThread(String name) {
        super(name);
    }

    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}

public class Program2 {

    public static void main(String[] args) {
        System.out.println("Main thread started...");
        joinThreads();
        System.out.println("Main thread finished...");
    }

    public static void oneThread() {
        JThread jt =   new JThread("JThread");
        jt.start();
    }

    public static void manyThreads() {
        for (int i = 1; i < 6; i++)
            new JThread("JThread " + i).start();
    }

    public static void joinThreads(){
        JThread t= new JThread("JThread ");
        t.start();
        try{
            t.join();
        }
        catch(InterruptedException e){

            System.out.printf("%s has been interrupted", t.getName());
        }
    }
}
