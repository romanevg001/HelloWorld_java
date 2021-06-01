package Animals;

import Animals.AnimalType;

public class Zoo<T> {

    public Zoo() {


        String [] catsName = {"Барсик","Уксус","Сода"};
        String [] dogsName = {"Майло","Иван","Мухтар"};

        CreateAnimal<Cat> cat = new CreateAnimal<>(new Cat("Соня"));
        CreateAnimal<Dog> dog = new CreateAnimal<>(new Dog("Соня"));

        cat.getAnimal().run(200);
        System.out.println(cat.isEqual(dog));

        Cat[] cats = (Cat[]) this.generateAnimals(catsName, AnimalType.Cat);
        Dog[] dogs = (Dog[]) this.generateAnimals(dogsName, AnimalType.Dog);


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
