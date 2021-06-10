package Fruits;

public abstract class Fruit<T> implements IFruit<T> {
    T name;

    public void print() {
        System.out.println(name);
    }
}
