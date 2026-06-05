package people;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final Gender gender;

    /* CONSTRUCTORS */

    public Person(String newName, String newSurname, Gender newGender) {
        name = newName;
        surname = newSurname;
        gender = newGender;
    }

    /* GETTERS */

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object target) {
        if (this == target) {
            return true;
        }

        if (target == null || getClass() != target.getClass()) {
            return false;
        }

        Person other = (Person ) target;

        return Objects.equals(name, other.name)
                && Objects.equals(surname, other.surname)
                && gender == other.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name , surname, gender);
    }
}
