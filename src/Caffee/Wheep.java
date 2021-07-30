package Caffee;

public class Wheep extends BeverageDecorator {
    public Wheep(Beverage b) {
        beverage = b;

        description = "Wheep";
        setPrice(0.5);
    }
}
