package Family;

import java.util.ArrayList;
import java.util.List;

public abstract class Pet {
    String name;
    private List<IHuman> responsibleMembers = new ArrayList<IHuman>();

    public Pet(String name) {
        this.name = name;
    }
}
