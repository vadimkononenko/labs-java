import lab2.Person;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

public class Lab2Test {
    @Test
    public void equalsTestForPerson() {
        EqualsVerifier.simple().forClass(Person.class).verify();
    }
}
