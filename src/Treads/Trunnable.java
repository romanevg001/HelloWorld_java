package Treads;

public class Trunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
                System.out.println("new thread: " + i);
            } catch (InterruptedException e) { 
                e.printStackTrace();
            } 
        }
    }
}
