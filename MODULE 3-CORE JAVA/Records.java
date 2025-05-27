import java.util.*;
import java.util.stream.Collectors;

// Define a record named Person
record Person(String name, int age) {}

public class Records  {
    public static void main(String[] args) {
        // Create a list of Person instances
        List<Person> people = List.of(
            new Person("Alice", 25),
            new Person("Bob", 17),
            new Person("Charlie", 30),
            new Person("David", 15)
        );

        // Print all people
        System.out.println("All people:");
        people.forEach(System.out::println);

        // Filter people with age >= 18
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        // Print adults
        System.out.println("\nAdults (age >= 18):");
        adults.forEach(System.out::println);
    }
}

