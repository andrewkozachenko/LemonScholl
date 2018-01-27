package school.lemon.threads;

class LemonRun implements Runnable{
    public void run(){
        System.out.println("Lemon run!!");
    }
}

class LemonRunThread extends Thread{
    private String threadName;
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
        for(int i =0; i < 5; i++){
            (new LemonRunThread("LemonThread" + i)).start();
        }
        final long after = System.currentTimeMillis();
        System.out.println("Time delta  : %d " + (after-before)/1000);
    }
}
