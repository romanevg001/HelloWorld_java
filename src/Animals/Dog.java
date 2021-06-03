package Animals;


public class Dog extends Animal implements Comparable<Animal> {
    private int maxRunDistance = 500;
    private int maxSwimDistance = 10;
    private String color;
    private double age;

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

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public int compareTo(Animal o) {
        return this.maxRunDistance - o.getMaxRunDistance();
    };

}
