import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.val;

@Getter
@Setter
@Accessors(fluent = true)
public class Person {
    private String name;
    private int age;

    void example() {
        val person = new Person();

        person.age(9001);
        person.name("Guralonidaprundalis");

        val age = person.age();
        val name = person.name();
    }
}
