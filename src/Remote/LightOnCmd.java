package Remote;

public class LightOnCmd implements ICommand {
    Light light;
    public LightOnCmd(Light light) {
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}
