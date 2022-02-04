package Streams;
import java.util.*;
import java.util.stream.*;

public class StrTest {
    //----------------------------------
    Stream<Integer> stream = Stream.of(1, 2, 3, 4);
    //----------------------------------
    String[] array = {"A", "B", "C"};
    Stream<String> stream1 = Arrays.stream(array);
    Stream<String> anotherStream = Stream.of(array);

    //----------------------------------
    IntStream intStream = IntStream.of(1, 2, 3, 4);
    IntStream intStream2 = IntStream.range(1,  4);
    LongStream longStream = LongStream.of(1L, 2L, 3L, 4L);
    IntStream rangedIntStream = IntStream.rangeClosed(1, 100);

    int intStreamSum = stream.mapToInt(n -> n).sum();

    //----------------------------------
    static class Person {
        enum Position {
        ENGINEER, DIRECTOR, MANAGER;
        }
        private String name; private int age;
        private Position position;
        public Person(String name, int age, Position position) { this.name = name;
        this.age = age;
        this.position = position;
        } 
    }

    public void testm() {
        intStream.forEach(System.out::println);
    }

    public void gPerson() {
        List<Person> persons = new ArrayList<>(Arrays.asList(
            new Person("Bob1", 35, Person.Position.MANAGER),
            new Person("Bob2", 44, Person.Position.DIRECTOR),
            new Person("Bob3", 25, Person.Position.ENGINEER),
            new Person("Bob4", 42, Person.Position.ENGINEER),
            new Person("Bob5", 55, Person.Position.MANAGER),
            new Person("Bob6", 19, Person.Position.MANAGER),
            new Person("Bob7", 33, Person.Position.ENGINEER),
            new Person("Bob8", 37, Person.Position.MANAGER)
        ));

        List<String> engineersNames = persons.stream()
        .filter(person -> person.position == Person.Position.ENGINEER)
        .sorted((o1, o2) -> o1.age - o2.age)
        .map(person -> person.name)
        .collect(Collectors.toList());

        System.out.println(engineersNames);

    }


    public static void main(String[] args) {
        StrTest t = new StrTest();
        t.testm();
        t.gPerson();
   
    }
}
