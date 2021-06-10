package Fruits;

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


    }
}
