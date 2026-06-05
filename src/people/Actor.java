package people;

import java.util.Objects;

public class Actor extends Person {
    private final int height;

    /* CONSTRUCTORS */

    public Actor(String newName, String newSurname, Gender newGender, int newHeight) {
        super(newName, newSurname, newGender);
        height = newHeight;
    }

    /* GETTERS */

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object target) {
        if (this == target) {
            return true;
        }

        if (target == null || getClass() != target.getClass()) {
            return false;
        }

        Actor other = (Actor) target;

        return Objects.equals(getName(), other.getName())
                && Objects.equals(getSurname(), other.getSurname())
                && height == other.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }

    @Override
    public String toString() {
        return super.toString() + " (" + height + ")";
    }
}
