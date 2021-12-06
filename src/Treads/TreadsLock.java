package Treads;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TreadsLock {
    TreadsLock () {
        final Lock treadLock = new ReentrantLock();

        new Thread(() -> {
            System.out.println("Thread before lock");
            treadLock.lock();
            // treadLock.lockInterruptibly();
            System.out.println("Thread after lock");
            try {
                Thread.sleep(8000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Thread unlock");

                treadLock.unlock();
            }
        }).start();

        new Thread(() -> {
            System.out.println("Thread before lock1");
            try {

            if (treadLock.tryLock(1L, TimeUnit.HOURS)) {
                try {

                    System.out.println("Thread after lock1");
                    Thread.sleep(8000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Thread unlock1");

                    treadLock.unlock();
                }
            } else {
                System.out.println("did not catch");
            }
            
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
    
}
