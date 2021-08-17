package Pizza;

public class PizzaRunner {
    public static void run() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza(PizzaType.Veggie);
    }
}
