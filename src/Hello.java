
//import Animals.Zoo;
//import Pizza.PizzaRunner;
//import Remote.RemoteLoader;
//import Treads.TestTreads;
import Enum.AppleRunner;

public class Hello {
    public static void main(String[] args) {

      byte b = 50;
      b = (byte) (b * 2);
      boolean bf = false;
      Boolean.valueOf(bf);
      Byte.valueOf(b);
      System.out.println(Boolean.valueOf(bf).booleanValue()+" - "+ Byte.valueOf(b).byteValue() );


      //  RemoteLoader.run();
      //  PizzaRunner.run();
       /*  Zoo zoo1 = new Zoo<String>();

        Market.run();
        FamilyFactory.run(); */
        //DuckRunner.run();
       // Caffee.run();
      // TestTreads.run();
      AppleRunner.run();
    }
}
