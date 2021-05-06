package Animals;

import Animals.Cat;
import Animals.Dog;
import Animals.TailType;

public class Zoo {

    public Zoo() {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", "Рыжий", 2);
        cats[1] = new Cat("Уксус", "Сиамский", 1);
        cats[2] = new Cat("Сода", "Сиамский", 0.2);

        cats[0].setAge(3);

        Dog[] dogs = {
            new Dog("Майло", "Рыжий", 2),
            new Dog("Иван", "черно-белый", 1, TailType.Bun)
        };

        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
            cats[i].voice();
        }

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].info();
            dogs[i].voice();
        }
    }

}
