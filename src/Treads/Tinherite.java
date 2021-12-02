package Treads;

public class Tinherite extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100); 
                System.out.println("new Tinherite thread: " + i);
            } catch (InterruptedException e) { 
                e.printStackTrace();
            } 
        }
    } 
}
