package Caffee;

public abstract class BeverageDecorator extends Beverage {

    public String getDescription(Beverage beverage) {
        return beverage.getDescription() + ',' + getDescription();
    }

    public double price(Beverage beverage) {
        return beverage.price() + price();
    }
    
}
