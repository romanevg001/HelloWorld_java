package Duck;

public abstract class Duck {
    IFly flying;
    IQauck quacking;

    public Duck(){
        
    }

    public void performFly() {
        flying.fly();
    }

    public void performQuack() {
        quacking.quack();
    }
}
