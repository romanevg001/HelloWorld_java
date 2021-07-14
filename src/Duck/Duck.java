package Duck;

public abstract class Duck {
    private IFly flying;
    private IQauck quacking;

    public void performFly() {
        flying.fly();
    }

    public void performQuack() {
        quacking.quack();
    }
}
