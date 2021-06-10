package Animals;

import Animals.AnimalType;

import java.util.Arrays;
import java.util.*;

public class Zoo<T> {

    public Zoo() {


        String [] catsName = {"Барсик","Барсик","Уксус","Сода","Барсик"};
        String [] dogsName = {"Майло","Иван","Бобик","Мухтар","Шарик"};

        List<String> catsNameList = new ArrayList<>(Arrays.asList(catsName));
        List<String> dogsNameList = new LinkedList<>(Arrays.asList(dogsName));
        
        catsNameList.contains("Уксус");

        while(catsNameList.remove("Барсик"));
        //System.out.println(catsNameList.remove("Барсик1"));
//        catsNameList.sort((a,b)->{
//            return a.indexOf("с") - b.indexOf("с");
//        });
        dogsNameList.remove("Мухтар");
        Collections.sort(dogsNameList);
        System.out.println(catsNameList);
        System.out.println(dogsNameList);

        CreateAnimal<Cat> cat = new CreateAnimal<>(new Cat("Соня"));
        CreateAnimal<Dog> dog = new CreateAnimal<>(new Dog("Соня"));

        cat.getAnimal().run(200);
        System.out.println(cat.isEqual(dog));

        Cat[] cats = (Cat[]) this.generateAnimals(catsName, AnimalType.Cat);
        Dog[] dogs = (Dog[]) this.generateAnimals(dogsName, AnimalType.Dog);

        System.out.println("compareTo: " + dogs[0].getMaxRunDistance());
        System.out.println("compareTo: " + cats[0].compareTo(dogs[0]));

        for (int i = 0; i < cats.length; i++) {
            System.out.println("-------------------" + AnimalType.Cat +"------------------");

            cats[i].run((int) Math.round(Math.random() * 200));
            cats[i].swim((int) Math.round(Math.random() * 10));

            cats[i].downloadSVG("./print.svg");
        }
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("-------------------" + AnimalType.Dog +"------------------");
            dogs[i].run((int) Math.round(Math.random() * 1000));
            dogs[i].swim((int) Math.round(Math.random() * 100));
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

    private <T extends Animal> T createAnimal(String animalName, AnimalType type) {
        if (type == AnimalType.Cat) {
            return (T) new Cat(animalName);
        }
        if (type == AnimalType.Dog) {
            return (T) new Dog(animalName);
        }
        return null;
    }


    }
