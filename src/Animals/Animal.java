package Animals;

public abstract class Animal implements IAnimal  {
    String name;

    void run(int distance, int maxRunDistance) {
        if (distance <= maxRunDistance) {
            System.out.println(this.name +" пробежал "+ distance + " м ");
        } else {
            System.out.println(this.name +" не пробежал "+ distance + " м ");
        }
    }

    void swim(int distance, int maxSwimDistance) {
        if (distance <= maxSwimDistance) {
            System.out.println(this.name +" проплыл "+ distance + " м ");
        } else {
            System.out.println(this.name +" не проплыл "+ distance + " м ");
        }
    }






}
