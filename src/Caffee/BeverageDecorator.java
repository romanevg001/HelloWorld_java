package Caffee;

public abstract class BeverageDecorator extends Beverage {
    Beverage beverage;
    private double percentMLOfBeverage = 0.3;
    private double oneDrink = 100 * percentMLOfBeverage;

    @Override
    public String getDescription() {
        return beverage.getDescription() + ',' + super.getDescription();
    }

    @Override
    public double price() {
        return beverage.price() + super.price() * countSize();
    }

    private double countSize() {
        return Math.round(beverage.getSize() * percentMLOfBeverage) / oneDrink;
    }

    
}
