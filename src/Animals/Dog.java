package Animals;


public class Dog extends Animal {
    int maxRunDistance = 500;
    int maxSwimDistance = 10;
    String color;
    double age;

    public Dog(String name) {
        this.name = name;
    }
    public Dog(String name, String color, double age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    void run(int distance) {
        super.run(distance, this.maxRunDistance);
    }

    void swim(int distance) {
        super.swim(distance, this.maxSwimDistance);
    }

}
