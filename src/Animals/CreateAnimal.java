package Animals;
import Animals.AnimalType;
import Animals.Animal;

public class CreateAnimal<T> {
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

}
