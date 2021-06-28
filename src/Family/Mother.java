package Family;

import java.util.ArrayList;
import java.util.List;

public class Mother<T> implements IHuman {
    String name;
    private List<T> canCallList =  new ArrayList<T>();


    public Mother(String name) {
        this.name = name;
    }

    public void call(IMember member) {
        //member;
    }

    public void response() {

    }
}
