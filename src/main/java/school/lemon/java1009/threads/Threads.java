package school.lemon.java1009.threads;

import java.util.concurrent.*;

public class Threads {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println("Start Main");
        //executoreRunnable(executorService);
        try {
            executorcallable(executorService);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("End Main");
    }

    private static void executorcallable(ExecutorService executorService) throws InterruptedException, java.util.concurrent.ExecutionException {
        Future future = executorService.submit(new Callable(){
            public Object call() throws Exception {
                System.out.println("Another thread was executed");
                return "result";
            }
        });

        System.out.println("Result: " + future.get());
        executorService.shutdown();
    }

    private static void executoreRunnable(ExecutorService executorService) {

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Another thread was executed");
            }
        });
        executorService.shutdown();
    }
}

