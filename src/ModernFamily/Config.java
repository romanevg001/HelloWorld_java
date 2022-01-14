package ModernFamily;

import java.util.ArrayList;

public class Config {
    public static ArrayList<Relation> relationship = new ArrayList<Relation>();
    public static ArrayList<Member> members = new ArrayList<Member>();
    static {
       

        relationship.add(new Relation(Family.Wife,true, Family.Husband));
        relationship.add(new Relation(Family.Dog,true, Family.Husband));
        relationship.add(new Relation(Family.Cat,true, Family.Wife));
        relationship.add(new Relation(Family.Parrot,true, Family.Dog));
        relationship.add(new Relation(Family.Dog,true, Family.Parrot));
    }
    public static String defaultResponse = "Mmmm?";

    public Config(ArrayList<Relation> relationship) {

    }

    public boolean addRelation(String who, boolean likes, String whom) {
        Family whoIn = Family.valueOf(who);
        Family whomIn = Family.valueOf(whom);
        if ( whoIn == null || whomIn == null) {
            return false;
        }
        relationship.add(new Relation(whoIn,likes, whomIn));
        return true;
    }
}
