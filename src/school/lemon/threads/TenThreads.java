package school.lemon.threads;

class MyLemonThread extends Thread{
    @Override
    public void run() {
        System.out.println("My name" + this.getName());
    }
}

class MyLemonRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("My name " + Thread.currentThread().getName());
    }
}

public class TenThreads {
    public static void main(String[] args) {
//        for (int i =0; i < 10; i++){
//            new MyLemonThread().start();
//        }

        for (int i = 0; i < 10; i++) {
            new Thread(new MyLemonRunnable()).start();
        }
    }
}
