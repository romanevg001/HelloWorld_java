package Fruits;
import java.util.*;

public class Market {
    public static void run() {

        Box<Apple> appleBox = new Box<>(FruitsWeight.Apple.getWeight());
        appleBox.addFruct(new Apple(AppleType.Ренет_Симиренко));
        appleBox.addFruct(new Apple(AppleType.Гала));
        appleBox.addFruct(new Apple(AppleType.Голден));

        Box<Apple> appleBox2 = new Box<>(FruitsWeight.Apple.getWeight());
        appleBox.moveContentTo(appleBox2);
        System.out.println("appleBox: " + appleBox.getWeight());
        System.out.println("appleBox2: " + appleBox2.getWeight());

        Box<Orange> orangeBox = new Box<>(FruitsWeight.Orange.getWeight());
        orangeBox.addFruct(new Orange(OrangeType.Hamlin));
        orangeBox.addFruct(new Orange(OrangeType.Navel));
        orangeBox.addFruct(new Orange(OrangeType.Verna));

        // appleBox.moveContentTo(orangeBox);


        System.out.println(appleBox.compareBoxes(orangeBox));

        Map<String, String> map1 = new TreeMap<>();//LinkedHashMap<>();//HashMap<>();
        map1.put("d", "Cd");
        map1.put("a2", "C");
        map1.put("c", "C");
        map1.put("a1", "B");
        for (Map.Entry<String, String> item: map1.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }

        System.out.println(map1.getOrDefault("z", "Q"));

        Set<String> set1 = new HashSet<>();
        set1.add("a");
        set1.add("a");
        set1.add("c");
        set1.add("a");

        System.out.println(set1);

        List<String> list1 = new ArrayList<>(Arrays.asList("a","v","a","v","a","v","v","v"));
//        Iterator<String> list1It = list1.iterator();
//        while(list1It.hasNext()) {
//            String o = list1It.next();
//            if (o.equals("a")) {
//                list1It.remove();
//            }
//        }
//        System.out.println(list1);

        Set<String> set2 = (new HashSet<>(list1));
        list1 = new ArrayList<>(set2);
        System.out.println(list1);

    }
}
