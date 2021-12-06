package Treads;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TreadReadWriteLock {
    TreadReadWriteLock () {
        final ReentrantReadWriteLock treadLock = new ReentrantReadWriteLock();
        new Thread(() -> {
            System.out.println("before readLock1");
            treadLock.readLock().lock();
            System.out.println("start readLock1");
            try {
                Thread.sleep(8000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("end readLock1");

                treadLock.readLock().unlock();
            }
        }).start();

        new Thread(() -> {
            System.out.println("before writeLock");
            treadLock.writeLock().lock();
            System.out.println("start writeLock");
            try {
                Thread.sleep(8000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("end writeLock");

                treadLock.writeLock().unlock();
            }
        }).start();

        new Thread(() -> {
            System.out.println("before readLock2");
            treadLock.readLock().lock();
            System.out.println("start readLock2");
            try {
                Thread.sleep(8000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("end readLock2");

                treadLock.readLock().unlock();
            }
        }).start();

    }
}
