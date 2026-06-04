package people;

import java.util.Objects;

public class Director extends Person {
    private final int numberOfShows;

    /* CONSTRUCTORS */

    public Director(String newName, String newSurname, Gender newGender, int numberOfShows) {
        super(newName, newSurname, newGender);
        this.numberOfShows = numberOfShows;
    }

    /* GETTERS and SETTERS */

    public int getNumberOfShows() {
        return numberOfShows;
    }
}
