package people;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private Gender gender;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    /* OVERRIDE FUNCTIONS */

    @Override
    public boolean equals(Object target) {
        if (this == target) {
            return true;
        }

        if (target == null || getClass() != target.getClass()) {
            return false;
        }

        Person other = (Person) target;

        return Objects.equals(name, other.name)
                && Objects.equals(surname, other.surname)
                && (gender == other.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
