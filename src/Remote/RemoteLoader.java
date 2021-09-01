package Remote;

public class RemoteLoader {
    public static void run() {
        RemoteControl rc = new RemoteControl();
        Light l1 = new Light();
        rc.setCommand(0, new LightOnCmd(l1), new LightOffCmd(l1));
        rc.onBtn(0);
        rc.offBtn(0);
    }
    
}
