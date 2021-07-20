package Duck;

public class DuckRunner {
    public static void run () {

        Duck mallard = new MallardDuck();
        System.out.println("mallard: ");
        mallard.performFly();
        mallard.performQuack();
        mallard.setFlyBehavoir(new FlyNo());
        mallard.performFly();


        Duck rubber = new RubberDuck();
        System.out.println("rubber: ");
        rubber.performFly();
        rubber.performQuack();


    }

/*     public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    } */
}
