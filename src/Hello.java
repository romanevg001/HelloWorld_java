
import Animals.Zoo;
import Family.FamilyFactory;
import Fruits.Market;

public class Hello {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo<String>();

        Market.run();
        FamilyFactory.run();
        // write your code here
    }
}
