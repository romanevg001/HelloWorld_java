package Animals;

public abstract class Animal {
    String name;
    int maxRunDistance;
    int maxSwimDistance;

    void run(int distance) {
        System.out.println(this.maxRunDistance);
        if (distance <= this.maxRunDistance) {
            System.out.println(this.name +" пробежал "+ distance + " м ");
        } else {
            System.out.println(this.name +" не пробежал "+ distance + " м ");
        }
    }

    void swim(int distance) {
        if (distance <= this.maxSwimDistance) {
            System.out.println(this.name +" проплыл "+ distance + " м ");
        } else {
            System.out.println(this.name +" не проплыл "+ distance + " м ");
        }
    }
}
