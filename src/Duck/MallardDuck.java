package Duck;

public class MallardDuck extends Duck {
    private IFly flying;
    private IQauck quacking;

    MallardDuck() {
        flying = new Fly();
        quacking = new Qauck();
    }
}
