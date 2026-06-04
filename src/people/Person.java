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

    /* GETTERS and SETTERS */

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }


    /* OVERRIDE FUNCTIONS */

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
