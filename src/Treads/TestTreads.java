package Treads;

public class TestTreads {
    Object monitor = new Object();

    public static void run(String[] args) {

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
       Threadtest2.run();
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