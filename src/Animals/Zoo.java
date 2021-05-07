package Animals;
import Animals.AnimalType;
import Animals.Cat;
import Animals.Dog;

public class Zoo<T> {

    public Zoo() {
        String [] catsName = {"Барсик","Уксус","Сода"};
        String [] dogsName = {"Майло","Иван","Мухтар"};

        Cat[] cats = (Cat[]) this.generateAnimals(catsName, AnimalType.Cat);
        Dog[] dogs = (Dog[]) this.generateAnimals(dogsName, AnimalType.Dog);

        for (int i = 0; i < cats.length; i++) {
            cats[i].run((int) Math.random() * 1000);
            cats[i].swim((int) Math.random() * 100);
        }
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].run((int) Math.random() * 1000);
            dogs[i].swim((int) Math.random() * 100);
        }

    }

    private Object[] generateAnimals(String [] animalsName, AnimalType type) {
        Object[] animals = new Object[0];
        if (type == AnimalType.Cat) {
            animals = new Cat[animalsName.length];
        }
        if (type == AnimalType.Dog) {
            animals = new Dog[animalsName.length];
        }

        for (int i = 0; i < animalsName.length; i++) {
            animals[i] = this.createAnimal(animalsName[i], type);
//            animals[i].run((int) Math.random() * 1000);
//            animals[i].swim((int) Math.random() * 100);
        }
        return animals;
    }

    private Object createAnimal(String animalsName, AnimalType type) {
        if (type == AnimalType.Cat) {
            return new Cat(animalsName);
        }
        if (type == AnimalType.Dog) {
            return new Dog(animalsName);
        }
        return null;
    }


    }
