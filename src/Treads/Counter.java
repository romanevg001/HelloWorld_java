package Treads;

public class Counter {
    private  static int count = 0;

    public static synchronized void addCount() {
        count += 1;
    }

    public static synchronized int getCount() {
        return count;
    }
}
