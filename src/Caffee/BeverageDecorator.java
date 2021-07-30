package Caffee;

public abstract class BeverageDecorator extends Beverage {
    Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription() + ',' + super.getDescription();
    }

    @Override
    public double price() {
        return beverage.price() + super.price();
    }
    
}
