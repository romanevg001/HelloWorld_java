package Animals;

import Animals.Animal;

public class CreateAnimal<T extends Animal> {
    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public CreateAnimal(T animal) {
        this.animal = animal;
    }


    public boolean isEqual (CreateAnimal<?> anotherAnimal) {
        return this.animal.getClass().getName() == anotherAnimal.animal.getClass().getName();
    }

}
