package Treads;
import java.util.concurrent.*;

public class PoolTreadsSubscribe {
    PoolTreadsSubscribe () {
        ExecutorService execService = Executors.newFixedThreadPool(4);

        Future<String> stringFuture = execService.submit(new Callable<String>() {
            public String call() throws Exception { 
                Thread.sleep(2000);
                return "Java";

            } 
        });
        try {
            String res = stringFuture.get();
            System.out.println(res);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        execService.shutdown();
    }
}
