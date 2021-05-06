package Animals;

import Animals.Animal;

public class Cat extends Animal {


    public Cat(String name, String color, double age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    void voice() {
        System.out.println( "meow");
    }


}
