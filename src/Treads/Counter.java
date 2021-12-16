package Treads;

public class Counter {
    private  String name;
    private static int count = 0;
    
    public static void main(String[] args) {
        Counter c1 = new Counter("Counter 1");
        Counter c2 = new Counter("Counter 2");
        c1.addCount();
        c2.addCount();

        System.out.println(c1.getName() + ":" + c1.getCount());
        System.out.println(c2.getName() + ":" + c2.getCount());
    }

    Counter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void addCount() {
        count += 1;
    }

    public synchronized int getCount() {
        return count;
    }
}
