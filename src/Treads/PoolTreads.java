package Treads;
import java.util.concurrent.*;

public class PoolTreads {
    PoolTreads () {
        ExecutorService execService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++) {
            final int w = i;
            execService.execute(new Runnable() {
                public void run() { 
                    System.out.println(w + " -  Begin ");
                    try {
                        Thread.sleep(1000 + (int) (2000 * Math.random()) );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(w + " -  End ");

                } 
            });
        }
        execService.shutdown();
    }
}
