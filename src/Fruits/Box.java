package Fruits;
import java.util.*;

public class Box<T>  {
    private List<T> fructsList =  new ArrayList<T>();
    private Double weight = 0.0;

    public Box(Double weight) {
        this.weight = weight;
    }

    void addFruct(T fruct) {
        fructsList.add(fruct);
    }

    double getWeight() {
        return fructsList.size() * weight;
    }

    boolean compareBoxes(Box box) {
       return this.getWeight() == box.getWeight();
    }

    void moveContentTo(Box<T> box) {
        for (T fruct: fructsList) {
            box.addFruct(fruct);
        }
        fructsList.clear();
    }
}
