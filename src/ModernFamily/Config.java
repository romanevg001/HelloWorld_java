package ModernFamily;

import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class Config {
    public static ArrayList<Relation> relationship = new ArrayList<Relation>();
    
   /*  static {
       
        relationship.add(new Relation(Family.Wife,true, Family.Husband));
        relationship.add(new Relation(Family.Dog,true, Family.Husband));
        relationship.add(new Relation(Family.Cat,true, Family.Wife));
        relationship.add(new Relation(Family.Parrot,true, Family.Dog));
        relationship.add(new Relation(Family.Dog,true, Family.Parrot)); 
    } */
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
