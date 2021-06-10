package Fruits;

public class Orange extends Fruit<OrangeType> {
    private OrangeType name;

    public Orange(OrangeType name) {
        this.name = name;
        System.out.println(name);
    }

    public OrangeType getName() {
        System.out.println(name);
        return name;
    }
}
