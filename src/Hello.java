import Animals.Cat;
import Animals.Dog;
import Animals.TailType;

public class Hello {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик","Рыжий",2);
        cats[1] = new Cat("Уксус","Сиамский",1);
        cats[2] = new Cat("Сода","Сиамский",0.2);
        cats[0].setAge(3);

        Dog dog1 = new Dog("Майло","Рыжий",2);
        Dog dog2 = new Dog("Иван","черно-белый",1, TailType.Bun);
        dog1.info();
        dog1.voice();
        dog2.info();
        for(int i=0;i < cats.length; i++) {
            cats[i].info();
            cats[i].voice();
        }

        // write your code here
    }
}
