package Animals;

import Animals.Animal;

public class Cat extends Animal {
    int maxRunDistance = 200;
    int maxSwimDistance = 0;

    public Cat(String name) {
        this.name = name;
    }
    @Override
    void swim(int distance) {
        System.out.println(this.name +" не умеет плавать ");
    }

}
