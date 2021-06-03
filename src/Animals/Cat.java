package Animals;

import Animals.Animal;
import java.io.FileOutputStream;
import java.io.IOException;

public class Cat extends Animal implements Comparable<Animal> {
    private int maxRunDistance = 200;
    private int maxSwimDistance = 0;

    public Cat(String name) {
        this.name = name;
    }

    void run(int distance) {
        super.run(distance, this.maxRunDistance);
    }

    void swim(int distance) {
        System.out.println(this.name +" не умеет плавать ");
    }

    public void downloadSVG(String svg) {
        try(FileOutputStream file = new FileOutputStream(svg)) {
            System.out.println( file);
        } catch (IOException e) {

        }

    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public int compareTo(Animal o) {
        System.out.println(o.name +" - "+ o.getMaxRunDistance());
        return this.maxRunDistance - o.getMaxRunDistance();
    };
}
