package Remote;

public class RemoteControl {
    private ICommand[] onCmds;
    private ICommand[] offCmds;

    public RemoteControl() {
        onCmds = new ICommand [7];
        offCmds = new ICommand [7];
    }

    public void setCommand(int slot, ICommand onCmd, ICommand offCmd) {
        onCmds[slot] = onCmd;
        offCmds[slot] = offCmd;
    }

    public void onBtn(int slot) {
        onCmds[slot].execute();
    }
    public void offBtn(int slot) {
        offCmds[slot].execute();
    }
    
}
