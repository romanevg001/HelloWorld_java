package Pizza;
import java.util.*;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();
    
    void prepare() {
        System.out.println("preparing");
    }

    void bake() {
        System.out.println("baking");
    }

    void cut() {
        System.out.println("cutting");
    }

    void box() {
        System.out.println("boxing");
    }

    public String getName() {
        return name;
    }
}
