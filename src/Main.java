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
	      for (Person person : people) {
	          showPerson(person);
        }
    }
}
