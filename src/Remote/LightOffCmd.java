package Remote;

public class LightOffCmd implements ICommand {
    Light light;
    public LightOffCmd(Light light) {
        this.light = light;
    }
    public void execute() {
        light.off();
    }
    
}
