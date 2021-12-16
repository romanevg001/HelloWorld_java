package ModernFamily;

public class ModernFamily {

    public static void main(String[] args) {
        Husband husband = new Husband();
        Wife wife = new Wife();
        Dog dog = new Dog();
        Parrot parrot= new Parrot();

        System.out.println("husband.calls(wife), the response is: "+husband.calls(wife));
        System.out.println("wife.calls(husband), the response is: "+wife.calls(husband));
        System.out.println("dog.calls(husband), the response is: "+dog.calls(husband));
        System.out.println("husband.calls(dog), the response is: "+husband.calls(dog));
        System.out.println("wife.calls(dog), the response is: "+wife.calls(dog));
        System.out.println("dog.calls(wife), the response is: "+dog.calls(wife));
        System.out.println("parrot.calls(dog), the response is: "+parrot.calls(dog));
        System.out.println("dog.calls(parrot), the response is: "+dog.calls(parrot));
    }
}
