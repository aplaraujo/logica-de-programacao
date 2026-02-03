import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    PersonService service = new PersonService();

    @Test
    public void shouldDisplayNameAndGenderCorrectly() {
        // Given
        String name = "Márcia Heloisa Luzia da Rocha";
        String gender = "Feminino";

        // When
        PersonResult result = service.displayPerson(name, gender);

        // Then
        assertEquals(name, result.getName());
        assertEquals(gender, result.getGender());
    }
}