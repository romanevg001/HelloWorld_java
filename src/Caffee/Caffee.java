package Caffee;

public class Caffee {
    public static void run() {
       Beverage es = new Espresso();
      es = new Wheep(es);
    //   es.setSize(500);
       System.out.println("$" + es.price());
       System.out.println("$" + es.getDescription());
       
    }
    
}
