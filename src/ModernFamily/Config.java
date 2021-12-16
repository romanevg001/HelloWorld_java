package ModernFamily;

import java.util.ArrayList;

public final class Config {
    public static ArrayList<Relation> relationship = new ArrayList<Relation>();
    static {
        relationship.add(new Relation(Family.Husband,true, Family.Wife));
        relationship.add(new Relation(Family.Wife,true, Family.Husband));
        relationship.add(new Relation(Family.Dog,true, Family.Husband));
        relationship.add(new Relation(Family.Cat,true, Family.Wife));
        relationship.add(new Relation(Family.Parrot,true, Family.Dog));
        relationship.add(new Relation(Family.Dog,true, Family.Parrot));
    }
    public static String defaultResponse = "Mmmm?";
}
