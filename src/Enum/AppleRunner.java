package Enum;

public class AppleRunner {    
    public static void run() {
        System.out.println(AppleType.Богатырь.getPrice());
        System.out.println( AppleType.Богатырь.ordinal());
        System.out.println( AppleType.Малинка.compareTo(AppleType.Фуджи));
        System.out.println( AppleType.Фуджи.equals(AppleType.Фуджи));
        
    }
}
