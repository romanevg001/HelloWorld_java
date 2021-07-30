package Caffee;

public class Caffee {
    public static void run() {
      Beverage es = new Espresso();
      System.out.println(es.getDescription() + ": $" + es.price());
       
      es = new Wheep(es);
      es = new Wheep(es);
      System.out.println(es.getDescription() + ": $" + es.price());

    /*/   es.setSize(500);
       System.out.println("$" + es.price());
       System.out.println(es.getDescription()); */
       
    }
    
}
