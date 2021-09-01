package Remote;

public class Light implements IReceiver {
    public void on() {
        System.out.println("Light on");
    }
    public void off() {
        System.out.println("Light off");
    }
}
