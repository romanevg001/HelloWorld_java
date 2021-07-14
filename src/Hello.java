
import Animals.Zoo;
import Duck.DuckRunner;
import Family.FamilyFactory;
import Fruits.Market;

public class Hello {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo<String>();

        Market.run();
        FamilyFactory.run();
        DuckRunner.run();
        // write your code here
    }
}
