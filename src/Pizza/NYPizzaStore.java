package Pizza;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.Cheese)) {
            return new NYCheesePizza();
        } else if (type.equals(PizzaType.Veggie)) {
            return new NYVeggiePizza();
        } else return null;
    }
}
