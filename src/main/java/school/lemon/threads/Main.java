package school.lemon.threads;

class LemonRun implements Runnable{
    public void run(){
        System.out.println("Lemon run!!");
    }
}

class LemonRunThread extends Thread{
    private volatile String threadName;
    public LemonRunThread(String threadName){
        this.threadName = threadName;
    }
    
    public void run(){
        System.out.println(threadName);
    }
    
}

public class Main {
    public static void main(String[] args) {
      final long before = System.currentTimeMillis();
      LemonRun lemonRun = new LemonRun();
      Thread thread = new Thread(lemonRun);
        thread.start();
      final long after = System.currentTimeMillis();
      System.out.println("Time delta  : %d " + (after-before));
    }
}
