package people;

import java.util.Objects;

public class Director extends Person {
    private int numberOfShows;

    /* CONSTRUCTORS */

    public Director() {
        super();
        numberOfShows = 0;
    }

    public Director(String newName, String newSurname, Gender newGender, int numberOfShows) {
        super(newName, newSurname, newGender);
        this.numberOfShows = numberOfShows;
    }

    /* GETTERS and SETTERS */

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    /* OVERRIDE FUNCTIONS */

    @Override
    public boolean equals(Object target) {
        if (!super.equals(target)) {
            return false;
        }

        Director other = (Director) target;

        return numberOfShows == other.numberOfShows;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfShows);
    }
}
