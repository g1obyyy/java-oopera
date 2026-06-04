package people;

import java.util.Objects;

public class Actor extends Person {
    private final int height;

    /* CONSTRUCTORS */

    public Actor(String newName, String newSurname, Gender newGender, int newHeight) {
        super(newName, newSurname, newGender);
        height = newHeight;
    }

    /* GETTERS and SETTERS */

    public int getHeight() {
        return height;
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

        Actor other = (Actor) target;

        return height == other.height
                && Objects.equals(getName(), other.getName())
                && Objects.equals(getSurname(), other.getSurname());
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
