package Animals;

public abstract class Animal {
    protected String name;
    protected String color;
    protected double age;

    public void info () {
        System.out.println(name+" - "+color+" - "+age);
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public abstract void voice();
}
