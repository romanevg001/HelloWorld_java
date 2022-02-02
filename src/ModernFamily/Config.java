package ModernFamily;

import java.util.ArrayList;


public class Config {
    public static ArrayList<Relation> relationship = new ArrayList<Relation>();

    public static String defaultResponse = "Mmmm?";


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
