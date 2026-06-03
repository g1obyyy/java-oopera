package people;

import java.util.Objects;

public class Actor extends Person {
    private int height;

    /* CONSTRUCTORS */

    public Actor(String newName, String newSurname, Gender newGender, int newHeight) {
        super(newName, newSurname, newGender);
        height = newHeight;
    }

    /* GETTERS and SETTERS */

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /* OVERRIDE FUNCTIONS */

    @Override
    public boolean equals(Object target) {
        if (!super.equals(target)) {
            return false;
        }

        Actor other = (Actor) target;

        return height == other.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return super.toString() + " (" + height + ")";
    }
}
