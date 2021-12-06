package Treads;
import java.util.concurrent.*;

public class PoolTreadsFactory {
    PoolTreadsFactory () {
        ExecutorService execService = Executors.newFixedThreadPool(4, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setPriority(10);
                t.setName("ABC");
                System.out.println("created");
                return t;
            }
        });
        try {
            execService.execute(() -> System.out.println(1));
            Thread.sleep(2000);
            execService.execute(() -> System.out.println(2));
            Thread.sleep(2000);
            execService.execute(() -> System.out.println(3));
            Thread.sleep(2000);
            execService.execute(() -> System.out.println(4));
            Thread.sleep(2000);
            execService.execute(() -> System.out.println(5));
            Thread.sleep(2000);
            execService.execute(() -> System.out.println(6));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            execService.shutdown();

        }


        ScheduledExecutorService execService1 = Executors.newSingleThreadScheduledExecutor();
        execService1.schedule(new Runnable() { // new Callable () { // will return answer
            @Override
            public void run() { 
              System.out.println("runs every hour");
            }
            
        }, 1, TimeUnit.HOURS);
    }
}
