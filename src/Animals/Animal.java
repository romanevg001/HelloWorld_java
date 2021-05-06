package Animals;

public abstract class Animal {
    protected String name;
    protected String color;
    protected double age;

    void info () {
        System.out.println(name+" - "+color+" - "+age);
    }

    void setAge(double age) {
        this.age = age;
    }

    double getAge() {
        return age;
    }

    String getColor() {
        return color;
    }

    String getName() {
        return name;
    }

    abstract void voice();
}
