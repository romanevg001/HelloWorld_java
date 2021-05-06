package Animals;
import Animals.Animal;
import Animals.TailType;


public class Dog extends Animal {
    TailType tailType;
    public Dog(String name, String color, double age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public Dog(String name, String color, double age, TailType tailType) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.tailType = tailType;
    }

    @Override
    void voice() {
        System.out.println( "gav-gav");
    }

    @Override
    void info () {
        System.out.println(
            name+" - "+color+" - "+age +
            ( this.tailType instanceof TailType ? " - " + tailType : "")
        );
    }
}
