package Fruits;

public class Apple extends Fruit<AppleType> {
    private AppleType name;

    public Apple(AppleType name) {
        this.name = name;
        System.out.println(name);
    }

    public AppleType getName() {
        return name;
    }

}
