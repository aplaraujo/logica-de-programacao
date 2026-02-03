public class PersonService {
    public PersonResult displayPerson(String name, String gender) {
        return new PersonResult(name, gender);
    }
}
