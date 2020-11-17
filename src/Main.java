import java.util.Arrays;
import java.util.List;

public class Main {

    private static void showPerson(Person person) {
        System.out.println(person);
    }

    private static List<Person> people = Arrays.asList(
        new Person("Jane", "Smith", 31),
        new Person("Bob", "Jones", 55),
        new Person("George", "Washington", 50),
        new Person("Alan", "Jones", 45),
        new Person("John", "Doe", 32),
        new Person("Bob", "Jones", 18)
    );

    public static void main(String[] args) {
        System.out.println("Traditional: ");
	      for (Person person : people) {
	          showPerson(person);
        }

        System.out.println("\nLambda 1: ");
	      people.forEach(
            (Person p) -> {
                System.out.println(p);
            }
        );

        System.out.println("\nLambda 2: ");
        people.forEach(
            p
                -> System.out.println(p)
        );

        System.out.println("\nLambda 3: ");
        people.forEach(p -> System.out.println(p));

        // :: two colons are called a method reference operator
        System.out.println("\nLambda 4: ");
        people.forEach(System.out::println);
    }
}
