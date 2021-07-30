package Caffee;

public class Caramel extends BeverageDecorator {
    public Caramel(Beverage b) {
        beverage = b;

        description = "Caramel";
        setPrice(0.3);
    }
}
