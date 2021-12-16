package Treads;
//import java.util.*;
public class TestTreads {
    Object monitor = new Object();

    public static void run()  {
  
       // new PoolTreads();
     //  new PoolTreadsSubscribe();
      // new PoolTreadsFactory();
      // new TreadsLock();
     // new TreadReadWriteLock();
      /*   Thread trunnable  = new Thread(new Trunnable());
        Thread tinherite = new Tinherite();

        trunnable.start();
        trunnable.setPriority(9);

        tinherite.start();
        try {
            trunnable.join();
            tinherite.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
 */
/*         TestTreads t = new TestTreads();

       Thread t1 = new Thread(() -> t.method1("t1 join"));
       t1.start();
       t1.setPriority(2);
       try {
        t1.join();
       } catch (Exception e) {
        e.printStackTrace();
       }

       Thread t2 = new Thread(() -> t.method1("t2 interrupt"));
       t2.start();
       t2.setPriority(5);
       t2.interrupt();

       new Thread(() -> t.method1("")).start();
       new Thread(() -> t.method2()).start();
       new Thread(() -> t.method2()).start();
       new Thread(() -> methodStatic("methodStatic")).start();
       new Thread(() -> TestTreads.methodStatic("methodStatic2")).start();


 */
     //  Threadtest2.run();
     
      
    }

    private void counter() {
 
        long counter = Math.round(Math.random()*100);
        float[] arr1 = new float[Threadtest2.size];

        System.out.println("counte Threads >> " + counter);

        while(counter > 0) {
            System.out.println("counter >> " + counter);

            new Thread(() -> {
                System.out.println("Thread START >>> " + Counter.getCount());
                
                Threadtest2.calc(arr1);
                try {
                    long sleepTime = Math.round(Math.random()*100);
                    System.out.println(" Thread # >> " + Counter.getCount() + " sleepTime: "+ sleepTime);

                    Thread.sleep(sleepTime);
                    Counter.addCount();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread END >>> " + Counter.getCount());

            }).start();

            --counter;
        }

    }
    
    public synchronized void method1(String message) {
        System.out.println("method1 START >>> " + message);
        for (int i = 0; i < 10; i++) {
            if(Thread.currentThread().isInterrupted()) {
                break;
            }
            System.out.println("method1 " +i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("method1 END >>> " + message);
    }

    public void method2() {
        synchronized (monitor) {
            System.out.println("method2 START");
            for (int i = 0; i < 10; i++) {
                System.out.println("method2 " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("method2 END");
        }
    }


    public synchronized static void methodStatic(String message) { // синхронизация по классу 
        System.out.println("method3 START >> " + message);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("method3: " + message);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace(); 
            } 
        }
        System.out.println("method3 END >> " + message);

    }
}
